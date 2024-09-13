如果是单体化的项目，只需要本地的方法调用即可
如果是分布式、微服务的项目，则需要使用网络通信来实现服务间的通信

- 可以使用RPC框架
- HTTP、HTTPS

spring cloud alibaba

- nacos 服务发现、服务注册
- openfeign 服务调用
- sentinel 熔断降级、限流
- seata 分布式事务
- gateway、loadbalancer API网关

@EnableFeignClients 启动类中启动OpenFeign
@FeignClient("服务名词")

security＋gateway
https://zhuanlan.zhihu.com/p/521588666