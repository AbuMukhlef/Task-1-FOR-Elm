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

---

# نظام إدارة الموظفين V1

## نظرة عامة
**نظام إدارة الموظفين V1** هو تطبيق ويب بسيط بلغة **Java** يعتمد على **Servlets**، يتيح تنفيذ العمليات الأساسية (CRUD) لإدارة بيانات الموظفين، حيث يمكن استرجاع البيانات، الإضافة، التعديل، والحذف.

## المميزات
- استرجاع قائمة الموظفين أو بيانات موظف معين.
- إضافة موظف جديد.
- تحديث بيانات موظف موجود.
- حذف موظف.

## المتطلبات
### لتشغيل المشروع، تأكد من تثبيت:
- **Java 8+**
- **Apache Tomcat 9+**

## المكتبات المستخدمة
المشروع يعتمد على المكتبات التالية:
- **Jackson** (`com.fasterxml.jackson.core:jackson-databind`) - لمعالجة JSON
- **Servlet API** (`javax.servlet-api`) - للتعامل مع الطلبات والاستجابات HTTP

## التثبيت والإعداد
1. استنساخ المشروع
2. فتح المشروع في بيئة تطوير مثل **IntelliJ IDEA** أو **Eclipse**.
3. التأكد من تثبيت جميع المكتبات المطلوبة.
4. نشر المشروع على **Apache Tomcat**.
5. الوصول إلى API عبر:
   - استرجاع جميع الموظفين: `GET http://localhost:8080/api/v1/employees`
   - استرجاع موظف حسب المعرف: `GET http://localhost:8080/api/v1/employees/{id}`
   - إضافة موظف جديد: `POST http://localhost:8080/api/v1/employees`
   - تحديث بيانات موظف: `PUT http://localhost:8080/api/v1/employees`
   - حذف موظف: `DELETE http://localhost:8080/api/v1/employees/{id}`

## تجربة المشروع في Postman
يمكنك اختبار الـ API باستخدام **Postman** باتباع الخطوات التالية:
1. افتح Postman وأنشئ طلبًا جديدًا.
2. استخدم الطريقة المناسبة (GET، POST، PUT، DELETE).
3. ضع عنوان الطلب، مثل: `http://localhost:8080/api/v1/employees`.
4. لطلبات **POST** و **PUT**:
   - انتقل إلى تبويب **Body**.
   - اختر **raw** واضبط التنسيق إلى **JSON**.
   - أدخل بيانات الموظف، مثل:
     ```json
     {
       "id": 2,
       "name": "علي",
       "gender": "M",
       "dob": "01/01/1990",
       "phoneNumber": "0501234567",
       "hobbies": ["القراءة", "كرة القدم"]
     }
     ```
5. اضغط **Send** وتحقق من الاستجابة.

