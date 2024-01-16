# E-Commerce Application

## Overview

Welcome to our E-Commerce application, a simple application developed with Spring Boot and MongoDB. This application empowers users to manage products, handle orders efficiently, and provides secure user registration and login functionalities.


## Features

- CRUD operations for Products and Orders
- Order management
- Product management
- User registration and login

## Prerequisites


1. **Java Development Kit (JDK):**
   - Download and install the latest version of the JDK.
2. **Apache Maven:**
   - Download and install Maven.
3. **MongoDB Database:**
   - Install MongoDB on your machine and ensure MongoDB is running on the default port (`27017`) 

4. **Integrated Development Environment (IDE):**
   - Choose a Java-friendly IDE, such as [IntelliJ IDEA] or [Eclipse].
5. **Postman (Optional):**
   - For testing API endpoints, you can use [Postman]
## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/gowtham20402/ecommerce.git

2. Configure MongoDB:

    Make sure MongoDB is running.
    Update MongoDB configuration in src/main/resources/application.properties if necessary.

3. Build and run the application:

        The application will be accessible at http://localhost:8080.

## API Endpoints

### Users

| Method | Endpoint                    | Description                      |
|--------|-----------------------------|----------------------------------|
| POST   | `/api/users/register`       | Register a new user              |
| POST   | `/api/users/login`          | Login as a user                  |

### Products

| Method | Endpoint                    | Description             |
|--------|-----------------------------|-------------------------|
| GET    | `/products`                 | Get all products        |
| GET    | `/products/{productId}`     | Get product by ID       |
| POST   | `/products`                 | Create a new product    |
| PUT    | `/products/{productId}`     | Update a product        |
| DELETE | `/products/{productId}`     | Delete a product        |

### Orders

| Method | Endpoint                    | Description             |
|--------|-----------------------------|-------------------------|
| GET    | `/orders`                   | Get all orders          |
| POST   | `/orders`                   | Create a new order      |
| GET    | `/orders/user/{userId}`     | Get orders for a user   |



## Testing

Use tools like Postman to test the API endpoints. Import provided Postman collections for testing.  
