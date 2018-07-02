package course1;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
/**
 * Hello World
 * 连接win7本地环境的amq 实现消息的生产
 */
public class TestProducer {

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
            //自动确认消息的发送
            Session session=conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //创建一个消息生产者，并且配置发送消息的地址
            MessageProducer producer=session.createProducer(destination);
            //创建一个map类型的消息
            MapMessage message=session.createMapMessage();
            message.setString("userId", "123456");
            message.setString("userName", "李四");
            message.setInt("age", 18);
            //发送
            producer.send(message);
            //关闭
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
