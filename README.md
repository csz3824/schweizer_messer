# schweizer_messer
> schweizer messer意为瑞士军刀，代表这个项目所包含的工具类功能强悍、种类丰富。

本项目使用Spring Boot + mybatis,运行该项目之前请在本地新建test数据库，执行test.sql中的建表语句。test.sql中的sql主要是用来做心跳检测的，为方便起见，可以自己再linux上面写个crontab定时任务，每秒去curl这个探活地址，防止服务挂掉。

* ps：所有的工具类都要有对用的test方法，并且检查好工具类里面不包好各位开发者公司的一些私密数据。
