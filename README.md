# Random Jokes API
This is a simple Java application built with Spring Boot and Maven that provides two API endpoints for posting and getting jokes. 
The application uses an ArrayList to store the jokes.

## Prerequisites
Make sure you have the following installed before running the application:

- Java Development Kit (JDK) 17 or higher
- Apache Maven
## Getting Started
- Clone the repository to your local machine:
```java 
git clone https://github.com/Madhurpatari/RandomJokesAPI.git
```
- Navigate to the project directory:
 ```java 
cd random-jokes-application
```
 Build the application using Maven:
```java 
mvn clean install
```
- Run the application:
 ```java 
mvn spring-boot:run
```

The application will start on the default port 8080.

##  API Endpoints
The application exposes the following API endpoints:

* POST /jokes : Adds a new joke to the collection.
* GET /jokes : Retrieves a random joke from the collection.
##  Technologies Used
- Java
- Spring Boot
- Maven
## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.
