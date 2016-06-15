# springboot-activiti-demo  
![Activiti logo](images/activiti-logo.png)  

this project is inspired by [activiti springboot integration doc example](http://activiti.org/userguide/index.html#springSpringBoot)
and this [git repo](https://github.com/jbarrez/spring-boot-with-activiti-example) could be helpful, pls find more in it.  

##Simple test steps:  
After sprint boot running, exec  
```curl -H "Content-Type: application/json" -d '{"assignee" : "jbarrez"}' http://localhost:8080/process```   
```curl http://localhost:8080/tasks?assignee=1```  
which could return ```[{"id":"12505","name":"my task"}]```
