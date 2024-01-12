<!-- omit in toc -->
# Create Microservices by Using Spring Boot - 09/01

<!-- omit in toc -->
## Content


Microservices
--------------------------------


application1 -----> mongodb  -----> registeruser, add movie, delete movie        ----->UserMovieService
application2-----> mysql database-----> register the user, login and generating the token    --------------> UserAuthenticationSevice



we are going to create 3 springboot application from spring initializer

1. StreamingApplication parentapplication of userauthentication and MovieService
2. UserAuthentication  mysql
3. UserMovieService   mongo



1. open streaming application into intellij
2. delete the src folder
3. copy Usermovieservice and userauthenticationservice into the root of the Streamingapplication
4. In the Parent pom define the modules tag under the project tag
  
<modules>
		<module>UserAuthenticationService</module>      // UserAuthenticationService is the artifcatId defined in the child pom
		<module>UserMovieService</module>
	</modules>

5. define the packaging as pom in the parent pom file under the project tag
     <packaging>pom</packaging>
6. if is there any common dependency remove it from the child pom and keep it inside the Parent pom only
7. add the surefire plugin in the parent pom under the plugins tag

<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<configuration>
					<useSystemClassLoader>false</useSystemClassLoader>
				</configuration>
			</plugin>

8. create a parent-child relationship among the services


   copy the artifactid and groupid, version from the parent pom and replace it inside the child pom under the parent tag. 




