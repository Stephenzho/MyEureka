# 基于spring Cloud eurcka服务器。
  用于提供集群服务。
    
只需将你的spring boot项目的配置文件添加如下配置，即刻注册成功。（当然，eureka注册中心必须是运行中）
* yaml
>eureka:
>>client:
>>>service-url:
>>>>defaultZone: http://localhost:${server.port}/eureka/

* propertiy
>eureka.client.serviceUrl.defaultZone = http://localhost:${server.port}/eureka/
