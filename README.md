# EmployeeRecords
Basic Web Application to add employees and list, add, update, and delete them, all in a user-friendly interface.

Overview
This project is a simple User Management System built using Java and JSP with a MySQL database backend. The system allows you to view, add, update, and delete users. It showcases the use of Java Servlets, JSP, and JDBC for dynamic web development. The project is ideal for those looking to understand how to perform CRUD (Create, Read, Update, Delete) operations in a Java web application.

Features
List Users: View all users in a table format.
Add User: Add new users with a username and email.
Update User: Update existing users' information.
Delete User: Remove users from the database.
Responsive Design: The project includes a simple responsive design for ease of use.

Technologies Used:
- Java (JDK 8+)
- JSP (JavaServer Pages)
- Servlets
- JDBC (Java Database Connectivity)
- MySQL for database management
- Apache Tomcat as the web server
- Maven for project management and dependency handling

Prerequisites:
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK 8 or higher)
- Apache Tomcat 9.0 or higher
- MySQL Server
- Maven
- MySQL connectitivy driver (JDBC driver)
  
Setup Instructions:
Clone the Repository-
bash
Copy code
git clone https://github.com/yourusername/user-management-system.git
cd user-management-system

Configure the Database:
Create a MySQL database called user_management.
Execute the SQL script schema.sql found in the /src/main/resources directory to set up the database schema.
Update the database connection details in src/main/resources/db.properties with your MySQL credentials.

Build the Project:
bash
Copy code
mvn clean install
  
Deploy to Apache Tomcat:
Copy the generated WAR file from the target/ directory to the webapps directory of your Apache Tomcat server.
Start the Tomcat server.
  
Access the Application:
Open your web browser and go to http://localhost:8080/EmployeeRecords

Usage:
Listing Users: Click on "List Users" to view all users in the system.
Adding a User: Click on "Add User" and fill in the details and then click submit.
Updating a User: Click the "Update" link next to any user to modify their details.
Deleting a User: Click the "Delete" link next to any user to remove them from the system.

Note: In order to successfully connect to your own MySQL server, make sure to replace the code in DatabaseConfig.java with your own MySQL Database URL, Username, and Password.


Contact
For any inquiries or issues, please contact umarkazi54@gmail.com.


