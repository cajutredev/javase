# Curso Java SE

Java SE project using the standard Maven directory layout. The project targets
Java 17.

## Requirements

- JDK 17 or newer
- Internet access on the first wrapper run to download Maven 3.9.9

## Build and test

On Windows:

```shell
.\mvnw.cmd test
.\mvnw.cmd package
```

On macOS or Linux:

```shell
./mvnw test
./mvnw package
```

## Run

```shell
java -cp target/classes mx.org.banxico.App
```
