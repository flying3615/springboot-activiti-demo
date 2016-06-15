# springboot-activiti-demo  
![Activiti logo](images/activiti-logo.png)  

this project is inspired by [activiti springboot integration doc example](http://activiti.org/userguide/index.html#springSpringBoot)
and this [git repo](https://github.com/jbarrez/spring-boot-with-activiti-example) could be helpful, pls find more in it.  

##Simple test steps:  
After sprint boot running, exec  
```curl -u admin:admin -H "Content-Type: application/json" -d '{"name":"John Doe", "email": "john.doe@alfresco.com", "phoneNumber":"123456789"}' http://localhost:8080/start-hire-process```  
```curl -u admin:admin -H "Content-Type: application/json" http://localhost:8080/runtime/tasks```
