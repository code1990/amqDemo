**es的存储结构**

Elasticsearch是面向文档型数据库，一条数据在这里就是一个文档，用JSON作为文档序列化的格式

**es的如何解析doc pdf**

安装一个插件，对文档文件进行文本抽取，并将抽取后得到的文本内容和相关元数据加入原始入库文档

**es如何分页**

# from + size 浅分页

就是查询前20条数据，然后截断前10条，只返回10-20的数据。

# scroll 深分页

scroll 类似于sql中的cursor，使用scroll，每次只能获取一页的内容，然后会返回一个scroll_id

# search_after 深分页

search_after 分页的方式是根据上一页的最后一条数据来确定下一页的位置

