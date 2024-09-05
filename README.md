
# Cantine Management System

This project is a Spring Boot CRUD application for managing `Menu` and `Plat` entities using Thymeleaf for the frontend.

## Prerequisites

Before running the application, ensure you have the following installed on your machine:

1. **Java Version 17**: Install [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. **MySQL Database**: Install MySQL and create a database named `cantine_db`.

## Database Setup

After installing MySQL, create the `cantine_db` database by running the following SQL command:

```sql
CREATE DATABASE cantine_db;
```

## Application Configuration

In the `src/main/resources/application.properties` file, add your MySQL connection details:

```properties
spring.datasource.url=your_db_link
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Replace `your_db_link`, `your_username`, and `your_password` with your actual database connection details.

## Features

The application provides the following endpoints for managing `Menu` and `Plat` entities.

### Menu Endpoints

- **POST**: `/menus/add` - Add a new `Menu`.
- **GET**: `/menus/{id}` - Get a `Menu` by its ID.
- **DELETE**: `/menus/delete/{id}` - Delete a `Menu` by its ID.

### Plat Endpoints

- **POST**: `/plats/add` - Add a new `Plat`.
- **GET**: `/plats/{id}` - Get a `Plat` by its ID.
- **DELETE**: `/plats/delete/{id}` - Delete a `Plat` by its ID.

## How to Run the Application

1. Clone the repository:
    ```bash
    git clone https://your-repository-link.git
    ```

2. Navigate into the project directory:
    ```bash
    cd GestCantineADA
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

5. Open your browser and access the application endpoints.

## Technologies Used

- **Spring Boot**
- **Thymeleaf**
- **MySQL**
- **Java 17**

## Contributing

Feel free to open issues or create pull requests to contribute to this project.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
