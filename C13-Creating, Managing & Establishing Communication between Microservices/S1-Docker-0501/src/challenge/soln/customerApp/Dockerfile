FROM openjdk
WORKDIR src/lib
ADD ./target/product-0.0.1-SNAPSHOT.jar /src/lib/product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "product-0.0.1-SNAPSHOT.jar"]