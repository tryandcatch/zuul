# zuul
结合SpringMVC中的核心DispatchServlet来分析Zuul 1.x网关处理请求的过程。

博客文章：[结合DispatchServlet分析Zuul网关请求过程](http://www.huangxiutao.cn/2020/02/24/analysis-zuul-with-dispatcherservlet.html)
# 组成
 
- eureka-server 注册中心服务端
- gateway zuul网关
- serviceA 普通的服务

# 运行项目
分别启动：
- `eureka-server`的`EurekaServerApplication` 
- `serviceA`的`Application`
- `gateway`的`GatewayApplication`

> 注意通过网关访问`serviceA`的路径为 `http://localhost:9001/servicea`