# Introduction

Working example of a spring-cloud-based configuration system.

Start the server with ```ServerMain```. Afterwards, start the client with ```ClientMain```.

Use curl to access the demo endpoint, e.g 

    curl http://localhost:8080/
    
Change the value of key in spring-cloud-server/config-repository/client.properties and call

    curl -X POST http://localhost:8080/refresh
    
All beans which were annotated with ```@RefreshScope```, e.g. our DemoService, are automatically reinitialized. 
On the next call of
  
    curl http://localhost:8080/
    
your updated value will be visible in the client.    


