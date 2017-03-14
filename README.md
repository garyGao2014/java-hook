# java-hook

* 1.简介：java-hook使用spring-boot启动，监听github webhook的请求事件，再做一系列自定义操作。
* 2.代码结构：
        1.hook-api作为系统的接口
        2.hook-core核心代码内部有controller，用于接收wehbook的请求。controller接收后启动线程，线程内再执行具体的业务。目前只实现了ping 和 push 的事件。
        3.hook-example是例子。系统启动也在这里，开发者需扩展handler类的方法。并相应执行具体业务逻辑。本例子中，接收到push事件后，执行了sh脚本。
* 3.代码maven编译后,解压tar文件，执行bin/startup.sh脚本。
* 4.仅Linux上使用
