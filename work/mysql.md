**1、一张表，里面有 ID 自增主键，当 insert17条,删除3条,重启Mysql，再insert1条**
(1)如果表的类型是 MyISAM，那么是 18
因为 MyISAM 表会把自增主键的最大 ID 记录到数据文件里，重启 MySQL ID 也不会丢失
(2)如果表的类型是 InnoDB，那么是 15
InnoDB 表只是把自增主键的最大ID记录到内存中，所以重启数据库会导致最大 ID 丢失

**2、Mysql 的技术特点是什么？**Mysql 数据库软件是一个客户端或服务器系统

**3、Heap 表是什么？**HEAP 表存在于内存中，用于临时高速存储。

**4、Mysql 服务器默认端口是什么？**默认端口是 3306。

**5、与 Oracle 相比，Mysql 有什么优势？**开源免费

**6、如何区分 FLOAT 和 DOUBLE？**FLOAT: 8 位精度,有四个字节。DOUBLE: 18 位精度，有八个字节。

**7、区分 CHAR_LENGTH 和 LENGTH？**CHAR_LENGTH 是字符数，而 LENGTH 是字节数。

**8、请简洁描述 Mysql 中 InnoDB 支持的四种事务隔离级别名称，以及逐级之间的区别？**
read uncommited ：读到未提交数据
read committed：脏读，不可重复读
repeatable read：可重读
serializable ：串行事物

**9、在 Mysql 中 ENUM 的用法是什么？**ENUM 是用于指定一组预定义的值，并可在创建表时使用。

**10、如何定义 REGEXP？**REGEXP 是模式匹配，其中匹配模式在搜索值的任何位置。

**11、CHAR 和 VARCHAR 的区别？**

CHAR 列长度固定为创建表时声明的长度，长度值范围是 1 到 255
当 CHAR 值被存储时，它们被用空格填充到特定长度，检索 CHAR 值时需删除尾随空格。

**12、列的字符串类型可以是什么？**字符串类型是：SET,BLOB,ENUM,CHAR,TEXT,VARCHAR

**13、如何获取当前的 Mysql 版本？**SELECT VERSION();

**14、Mysql 中使用什么存储引擎？**

**15、Mysql 驱动程序是什么？**JDBC/ODBC

**16、TIMESTAMP 在 UPDATE CURRENT_TIMESTAMP 数据类型上做什么？**将时间戳字段更新为当前时间。

**17、主键和候选键有什么区别？**
表格的每一行都由主键唯一标识,一个表只有一个主键。
候选键可以被指定为主键，并且可以用于任何外键引用。

**18、如何使用 Unix shell 登录 Mysql？**/bin/mysql -h hostname -u

**19、 myisamchk 是用来做什么的？**用来压缩 MyISAM 表，这减少了磁盘或内存使用。

**20、MYSQL 数据库服务器性能分析的方法命令有哪些?**

**21、如何控制 HEAP 表的最大尺寸？**通过称为 max_heap_table_size 的 Mysql 配置变量来控制。

**22、MyISAM Static 和 MyISAM Dynamic 有什么区别？**
在 MyISAMStatic 上的所有字段有固定宽度。
动态 MyISAM 表将具有像 TEXT，BLOB 等字段，以适应不同长度的数据类型。

**23、federated 表是什么？**federated 表，允许访问位于其他服务器数据库上的表。

**24、如果一个表有一列定义为 TIMESTAMP，将发生什么？**
每当行被更改时，时间戳字段将获取当前时间戳。

**25、列设置为 AUTO INCREMENT 时，如果在表中达到最大值，会发生什么情况？**
它会停止递增，任何进一步的插入都将产生错误

**26、怎样才能找出最后一次插入时分配了哪个自动增量？**
LAST_INSERT_ID 将返回由 Auto_increment 分配的最后一个值

**27、你怎么看到为表格定义的所有索引？**SHOW INDEX FROM TableName

**28.、LIKE 声明中的％和_是什么意思？**％对应于 0 个或更多字符，_对应于一个字符。

**29、如何在 Unix 和 Mysql 时间戳之间进行转换？**UNIX_TIMESTAMP/FROM_UNIXTIME

**30、列对比运算符是什么？**=，<>，<=，<，> =，>，<<，>>，<=>，AND，OR 或 LIKE 运算符。

**31、我们如何得到受查询影响的行数？**SELECT COUNT(user_id)FROM users;

**32、Mysql 查询是否区分大小写？**不区分大小写

**33.、LIKE 和 REGEXP 操作有什么区别？**LIKE 和 REGEXP 运算符用于表示^和％。

**34.、BLOB 和 TEXT 有什么区别？**
BLOB 是一个二进制对象，可以容纳可变数量的数据,排序和比较时区分大小。
TEXT 是一个不区分大小写的 BLOB。四种 TEXT 类型

**35、mysql_fetch_array 和 mysql_fetch_object 的区别是什么？**
mysql_fetch_array() - 将结果行作为数组返回。
mysql_fetch_object - 将结果行作为对象返回。

**36、我们如何在 mysql 中运行批处理模式？**

**37、MyISAM 表格将在哪里存储，并且还提供其存储格式？**

**38.、Mysql 中有哪些不同的表格？**
共有 5 种类型的表格：MyISAM/Heap/Merge/INNODB/ISAM
MyISAM 是 Mysql 的默认存储引擎。

**39、ISAM 是什么？**ISAM 简称为索引顺序访问方法，用于在磁带等辅助存储系统上存储和检索数据。

**40、InnoDB 是什么？**lnnoDB 是一个由 Oracle 公司开发的**事务安全存储引擎**。

**41、Mysql 如何优化 DISTINCT？**DISTINCT 在所有列上转换为 GROUP BY，并与 ORDER BY 子句结合使用。

**42、如何输入字符为十六进制数字？**用(Ox)前缀输入十六进制数字。

**43、如何显示前 50 行？**SELECT*FROM LIMIT 0,50;

**44、可以使用多少列创建索引？**任何标准表最多可以创建 16 个索引列。

**45、NOW()和 CURRENT_DATE()有什么区别？**NOW()年月日时分秒。CURRENT_DATE()年月日。

**46、什么样的对象可以使用 CREATE 语句创建？**
DATABASE、EVENT、FUNCTION、INDEX、PROCEDURE、TABLE、TRIGGER、USER、VIEW

**47、Mysql 表中允许有多少个 TRIGGERS？**插入更新删除 3种行为每种前后2个

**48、什么是非标准字符串类型？**TINYTEXT、TEXT、MEDIUMTEXT、LONGTEXT

**49、什么是通用 SQL 函数？**
CONCAT(A, B) - 连接两个字符串值
FORMAT(X, D)- 格式化数字 X 到 D 有效数字。
CURRDATE(), CURRTIME()- 返回当前日期或时间。
NOW() - 将当前日期和时间作为一个值返回。

**50、解释访问控制列表**ACL(访问控制列表)是与对象关联的权限列表。

**51、MYSQL 支持事务吗？**
在缺省模式下，MYSQL 是 autocommit 模式的， 是不支持事务的。
但是如果你的 MYSQL 表类型是使用 InnoDB Tables，必须使用 COMMIT 来提交你的更改，或者用 ROLLBACK 来回滚你的更改。

**52、mysql 里记录货币用什么字段类型好?**
DECIMAL 和 NUMERIC 值作为字符串存储，而不是作为二进制浮点数，以便保存那些值的小数精度。

**53、MYSQL 数据表在什么情况下容易损坏？**
服务器突然断电,强制关机，没有先关闭 mysql 服务等。

**54、mysql 有关权限的表都有哪几个？**权限表分别 user，db，table_priv，columns_priv 和host。

**55、Mysql 中有哪几种锁？**
MyISAM 支持表锁，InnoDB 支持表锁和行锁，默认为行锁
表级锁：开销小，加锁快，不会出现死锁。锁定粒度大，并发量最低
行级锁：开销大，加锁慢，会出现死锁。锁力度小，并发度最高

----------------

**1.数据库三范式是什么?**

1. 第一范式（1NF）：字段具有原子性,不可再分。
2. 第二范式（2NF）:求数据库表中的每个实例或行必须可以被惟一地区分。
3. 第三范式（3NF）:要求一个数据库表中不包含已在其它表中已包含的非主关键字信息。

**2.有哪些数据库优化方面的经验?**

1. 用 PreparedStatement比 Statement 性能高
2. 有外键约束会影响插入和删除性能
3. 表中允许适当冗余
4. UNION ALL 要比 UNION 快很多，UNION ALL 只是简单的将两个结果合并后就返回。

**3.请简述常用的索引有哪些种类?**

1. 普通索引: 即针对数据库表创建索引
2. 唯一索引: 索引列的值必须唯一，但允许有空值
3. 主键索引: 特殊的唯一索引，不允许有空值。
4. 组合索引: 即将数据库表中的多个字段联合起来作为一个组合索引。

**4.数据库中索引的工作机制是什么？**
索引是一个排序的数据结构，以协助快速查询
索引的实现通常使用 B 树及其变种 B+树

**5.MySQL 的基础操作命令**:show databases/show tables/describe table_name

**6.mysql 的复制原理以及流程**。
将 Mysql 的某一台主机的数据复制到其它主机（slaves）上

1. 把更新记录到二进制日志文件中。 
2. 把主服务器的二进制日志拷贝到自己的中继日志中。 
3. 执行中继日志，把更新应用到自己的数据库上。

**7.mysql 支持的复制类型?**

1. 基于语句的复制： 在从服务器上执行同样的语句。
2. 基于行的复制：把改变的内容复制过去
3. 混合类型的复制: 默认采用基于语句的复制，若无法精确的复制时，就会采用基于行的复制。

**8.mysql 中 myisam 与 innodb 的区别？**

1. InnoDB：提供事务支持事务，MyISAM：不提供事务支持，

2. InnoDB 支持行级锁，而 MyISAM 支持表级锁.

3. InnoDB 支持 MVCC, 而 MyISAM 不支持

4. InnoDB 支持外键，而 MyISAM 不支持

5. InnoDB：如果没有设定主键，就会自动生成一个的主键
   MyISAM：允许没有任何索引和主键的表存在
   
6. InnoDB 不支持全文索引，而 MyISAM 支持。

7. InnoDB：备份binlog，或者用 mysqldump
   MyISAM：数据是以文件的形式存储
   
8. InnoDB 表的大小只受限于操作系统文件的大小，一般为 2GB。
	MyISAM：每个 MyISAM 在磁盘上存储成三个文件。

**9.mysql 中 varchar 与 char 的区别以及 varchar(50)中的 50 代表的涵义？**
1.char 是一种固定长度的类型，varchar 则是一种可变长度的类型.
2.varchar(50)中 50 的涵义 : 最多存放 50 个字节
3.int（20）中 20 的涵义: 最大显示宽度20

**10.MySQL 中 InnoDB 支持的四种事务隔离级别名称，以及逐级之间的区别？**

1. Read Uncommitted（读取未提交内容） >> 所有事务都可以看到其他未提交事务的执行结果
2. Read Committed（读取提交内容） >> 一个事务只能看见已经提交事务所做的改变
3. Repeatable Read（可重读） >> 确保同一事务的多个实例在并发读取数据时，会看到同样的数据行
4. Serializable（可串行化） >> 在每个读的数据行上加上共享锁

**11.表中有大字段 X（例如：text 类型），且字段 X 不会经常更新，以读为为主，将该字段拆成子表好处是什么？**
MYSQL 数据库的记录存储是按行存储的，数据块大小又是固定的（16K），每条记录越小，相同的块存储的记录就越多。此时应该把大字段拆走，这样应付大部分小字段的查询时，就能提高效率。

**12.MySQL 中 InnoDB 引擎的行锁是通过加在什么上完成（或称实现）的？**
InnoDB 行锁是通过给索引上的索引项加锁来实现的
Oracle是通过在数据块中对相应数据行加锁来实现的。

**13.MySQL 中控制内存分配的全局参数，有哪些？**
1.keybuffersize 指定索引缓冲区的大小，
2.innodbbufferpool_size 表示缓冲池字节大小
3.querycachesize > 是查询缓存大小
4.readbuffersize >是 MySQL 读入缓冲区大小。

**15.[SELECT *] 和[SELECT 全部字段]的 2 种写法有何优缺点?**
1.前者要解析数据字典，后者不需要
2.结果输出顺序，前者与建表列顺序相同，后者按指定字段顺序。
3.表字段改名，前者不需要修改，后者需要改
4.后者可以建立索引进行优化，前者无法优化
5.后者的可读性比前者要高

**16.HAVNG 子句 和 WHERE 的异同点?**

1. 语法上：where 用表中列名，having 用 select 结果别名
2. 影响结果范围：where 从表读出数据的行数，having 返回客户端的行数
3. 索引：where 可以使用索引，having 不能使用索引，只能在临时结果集操作
4. where 后面不能使用聚集函数，having 是专门使用聚集函数的。

**17.MySQL 当记录不存在时 insert,当记录存在时 update，语句怎么写？**

**18.MySQL 的 insert 和 update 的 select 语句语法**

-----------------------------------------






