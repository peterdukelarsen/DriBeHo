# dribeho-backend

Drip Below Houston strives to catalogue the best coffee at the coolest coffee shops in Manhattan. This is the backend.

## Getting the backend running

I've run into some issues with local dev on my mac:

1. Graal for building and running a native executable
2. Getting docker running
3. Running a database

### Graal

Make sure you have graal installed and set as your java home.

On my laptop:

```
echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.1/Contents/Home
```

### Docker

On my laptop I have docker installed, but I also need to run this to get stuff working:

```
export DOCKER_HOST=unix:///Users/$(whoami)/Library/Containers/com.docker.docker/Data/docker.raw.sock
```

I got that from this https://stackoverflow.com/questions/44084846/cannot-connect-to-the-docker-daemon-on-macos

### Running a database

I'm going with MariaDB as a first go! To get it running I spun it up in Docker.

```
docker pull mariadb:10.4.28
docker run -d --name mariadbtest -e MYSQL_ROOT_PASSWORD=mypass -p 3306:3306 mariadb:10.4.28

mysql -h 0.0.0.0 -u root -p
type in "mypass"
mysql> CREATE DATABASE dribeho;
```

## Quarkus things

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/dribeho-backend-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

