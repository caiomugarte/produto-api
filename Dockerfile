#Defino qual JDK vou utilizar
FROM openjdk:17-jdk-slim

#Definir o diretório dentro do container
WORKDIR /app

#Copiar o JAR para dentro do container
COPY target/produto-api-0.0.1-SNAPSHOT.jar app.jar

#Expor a porta que a aplicação vai rodar
EXPOSE 8080

#Executar a aplicação
ENTRYPOINT [ "java", "-jar", "app.jar" ]