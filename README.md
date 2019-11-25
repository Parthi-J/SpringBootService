# Spring Boot Service

## Application Configuration
Save the configuration as *.yml

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
  output:
    ansi:
      enabled: DETECT
  jpa.hibernate.ddl-auto: update
  datasource:
    url: jdbc:mysql://${MYSQL_HOST:localhost}:3306/spring_boot
    username: root
    password: parthi@123
    

logging:
  file:
#    name: spring_boot_service.log
    path: /var/tmp
    max-size: 25MB 
    max-history: 3
  level:
    root: info
    org: 
      springframework:
        web: debug

```

## Execute JAR    
### Using Command Line  
```
$ java -jar target/*.jar --spring.config.location=file:///<<YAML_CONFIG_PATH>>/*.yml  
```

### Using Environment Variable  
```
$ export SPRING_CONFIG_LOCATION=file:///<<YAML_CONFIG_PATH>>/*.yml  
$ java -jar target/*.jar  
```
