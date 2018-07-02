package course1;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MapMessage;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
/**
 * Hello World
 * 连接win7本地环境的amq 实现消息的消费
 */
public class TestConsumer {

    //根据F:\sdk\apache-activemq-5.12.1\conf下面的activemq文件
    // <transportConnector name="openwire" uri="tcp://localhost:61616"/>
    private static final String tcpUrl = "tcp://localhost:61616";
    private static final String producerName = "firstQueue";

    public static void main(String[] args) {
        //连接broker，就是我们刚刚防火墙里面打开的那个端口
        ConnectionFactory cf=  new ActiveMQConnectionFactory(tcpUrl);
        //创建了一个队列名称为 "firstQueue"
        Destination  destination=new ActiveMQQueue(producerName);
        Connection conn=null;


        try {
            //从连接工程里面获取一个新连接
            conn=cf.createConnection();
            //自动确认消息的接受
            Session session=conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //创建一个消费者
            MessageConsumer consumer=session.createConsumer(destination);
            conn.start();
            //同步阻塞等待接受消息
            MapMessage message=(MapMessage)consumer.receive();


            System.out.println(message.getInt("age") +" "+ message.getString("userId")+" "+message.getString("userName"));
            session.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (Exception e2) {
                    // TODO: handle exception
                }
            }
        }

    }
}
