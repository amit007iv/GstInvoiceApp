FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/GstInvoiceApp-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar", "com.shanInfotech.gstInvoiceApp.App"]