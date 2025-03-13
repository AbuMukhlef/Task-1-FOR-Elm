# Employee Management System V1

## Overview
The **Employee Management System V1** is a simple Java-based web application built using **Servlets**, allowing CRUD operations (Create, Read, Update, Delete) on employee data. The project provides a RESTful API that handles employee details such as name, gender, date of birth, phone number, and hobbies.

## Features
- Retrieve all employees or a specific employee by ID.
- Add a new employee.
- Update an existing employee's details.
- Delete an employee.

## Requirements
### To run the project, ensure you have the following installed:
- **Java 8+**
- **Apache Tomcat 9+**

## Libraries Used
The project uses the following libraries:
- **Jackson** (`com.fasterxml.jackson.core:jackson-databind`) - for JSON parsing
- **Servlet API** (`javax.servlet-api`) - for handling HTTP requests and responses

## Installation & Setup
1. Clone the repository
2. Open the project in an IDE (such as IntelliJ IDEA or Eclipse).
3. Ensure the required dependencies are installed.
4. Deploy the project on Apache Tomcat.
5. Access the API via:
   - Get all employees: `GET http://localhost:8080/api/v1/employees`
   - Get an employee by ID: `GET http://localhost:8080/api/v1/employees/{id}`
   - Add a new employee: `POST http://localhost:8080/api/v1/employees`
   - Update an employee: `PUT http://localhost:8080/api/v1/employees`
   - Delete an employee: `DELETE http://localhost:8080/api/v1/employees/{id}`

## Testing with Postman
You can test the API using **Postman** by following these steps:
1. Open Postman and create a new request.
2. Use the appropriate HTTP method (GET, POST, PUT, DELETE).
3. Set the request URL, e.g., `http://localhost:8080/api/v1/employees`.
4. For **POST** and **PUT** requests:
   - Go to the **Body** tab.
   - Select **raw** and set the format to **JSON**.
   - Enter employee details, e.g.,
     ```json
     {
       "id": 2,
       "name": "Ali",
       "gender": "M",
       "dob": "01/01/1990",
       "phoneNumber": "0501234567",
       "hobbies": ["Reading", "Football"]
     }
     ```
5. Click **Send** and check the response.