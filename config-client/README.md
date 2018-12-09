### 获取 config-server 的配置
```
之前一直是写在 application.yml 里配置了 uri 去获取配置，但实际上并未获取到,打印的日志如下:

Fetching config from server at: http://localhost:8888
Could not locate PropertySource: I/O error on GET request for "http://localhost:8888/config-client/dev/master"

才发现默认是从 8888 端口获取，也就是配置在 application.yml 中配置内容没生效

将其修改为 bootstrap.yml 提交配置文件的级别，这才正常取到

Fetching config from server at: http://localhost:7001/
Located environment: name=config-client, profiles=[dev], label=master, version=ba2120e1a4488f74a7f9c7a250436183e6490c38, state=null
Located property source: CompositePropertySource [name='configService', propertySources=[MapPropertySource {name='configClient'}, MapPropertySource {name='https://github.com/dengyifan/springCloud/config-repo/config-client-dev.yml'}]]
```