# CAS_learn
cas学习工程记录<br/>
本实例实现了cas的单点登录功能，同时实现了退出的接口，免登录功能<br/>
cas client工具的使用注意事项如下：<br/>
（1）工具仅仅适用于Springboot工程。<br/>
（2）在使用工具的时候需要在配置文件application.properties中添加相应的cas配置信息，如下：<br/>
#cas config<br/>
spring.cas.sign-out-filters=/logout<br/>
spring.cas.auth-filters=/*<br/>
spring.cas.validate-filters=/*<br/>
spring.cas.request-wrapper-filters=/*<br/>
spring.cas.assertion-filters=/*<br/>
spring.cas.redirect-after-validation=true<br/>
spring.cas.use-session=true<br/><br/>

#the dev of cas config<br/>
spring.cas.cas-server-login-url=http://localhost:8080/login<br/>
spring.cas.cas-server-url-prefix=http://localhost:8080<br/>
spring.cas.server-name=http://localhost:8011<br/>
（3）使用此工具的时候需要让工程能够自动扫描到工具包。<br/>


