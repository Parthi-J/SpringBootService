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

** JAR Execute command**  
#####Using Command Line  
```
$ java -jar target/*.jar --spring.config.location=file:///<<YAML_CONFIG_PATH>>/*.yml  
```

#####Using Environment Variable  
```
$ export SPRING_CONFIG_LOCATION=file:///<<YAML_CONFIG_PATH>>/*.yml  
$ java -jar target/*.jar  
```
