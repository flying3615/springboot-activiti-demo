# springboot-activiti-demo
##this project is inspired by [activiti springboot integration doc example](http://activiti.org/userguide/index.html#springSpringBoot)

simple test steps:  
```curl -u admin:admin -H "Content-Type: application/json" -d '{"name":"John Doe", "email": "john.doe@alfresco.com", "phoneNumber":"123456789"}' http://localhost:8080/start-hire-process```  
```curl -u admin:admin -H "Content-Type: application/json" http://localhost:8080/runtime/tasks```
