# Spring Boot Service

### Application Configuration
** Save the configuration as *.yml **

```yml
server:
  address: 127.0.0.1
  port: 8000

spring:
    devtools:
    restart:
      enabled: true
  main:
    lazy-initialization: false
    
logging:
  level:
    root: info
    org:
      springframework:
        web: debug
```