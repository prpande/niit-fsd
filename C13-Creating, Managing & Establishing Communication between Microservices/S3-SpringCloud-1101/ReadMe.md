<!-- omit in toc -->
# Single-Entry Point to Route the Request Coming for Different Microservices Using Spring Cloud - 11/01

<!-- omit in toc -->
## Content


1. create one spring boot application from spring initializer and add gateway dependency

<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-gateway</artifactId>
		</dependency>

2. generate the application nad unzip it.
3. copy and paste the apigateway into your streamingapplication
4. add api gateway as a module of streamingapplication

		<module>apigatewayservice</module>
5. create  a parent-child relationship b/w apigateway and streamingapplication

  copy the artifcatid,groupid,version from the parent pom and copy it inside the child pom under the parent tag.
6. if is there any dependency that is already avilable in parent pom please remove it from the child pom like sping-boot-starter test

7.in apigateway application define one class in package like config 
   ---> annotate the class with @Configuration and define the bean for the routes

@Configuration
public class APIGatewayConfiguration {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder){

        return builder.routes()
                .route(p->p
                        .path("/api/v2/**")
                        .uri("http://localhost:8084/"))

                .route(p->p
                        .path("/api/v1/**")
                .uri("http://localhost:8083/"))
                .build();
    }
}


8. in the application.properties file define the portno, application as reactive and application name

server.port=9000
spring.application.name=apigateway
spring.main.web-application-type=reactive


9. run api gateway , run authentication, run movieservice

10 test the application from postman


1. register the user into mongodb database   http://localhost:9000/api/v1/register
2. register the user into mysql database  http://localhost:9000/api/v2/user
3. login the user and generate the token  http://localhost:9000/api/v2/login
4. make a request for any protected resource