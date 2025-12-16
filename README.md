## Task 1
## 🚀 JDBC Oracle Connection (Java)
A simple Java program to test Oracle Database connection using JDBC.

## 🔧 Requirements

Java (JDK 8+)
Oracle Database (XE)
Oracle JDBC Driver → ojdbc17.jar

## 🔗 Update Your DB Details
String url = "jdbc:oracle:thin:@localhost:1521:XE";
String user = "system";
String pass = "YourPassword";

## ▶️ How to Run
javac DBconnection.java
java com.connection.DBconnection

## ⚠️ Common Errors
Driver not found → Add ojdbc.jar to classpath
No suitable driver → Wrong URL or missing jar
Invalid username/password → Fix credentials


## Task 2
## 🚀 Display All Students (Java)
A simple Java program that retrieves records from an Oracle database using JDBC PreparedStatement and a SELECT query.
## 🔧 Requirements

Java (JDK 8+)
Oracle Database (XE)
Oracle JDBC Driver → ojdbc17.jar

## 🔗 Update Your DB Details
String url = "jdbc:oracle:thin:@localhost:1521:XE";
String user = "system";
String pass = "YourPassword";

## ▶️ How to Run
javac DBconnection.java
java com.connection.DBconnection

## ⚠️ Common Errors
Driver not found → Add ojdbc.jar to classpath
No suitable driver → Wrong URL or missing jar
Invalid column name → Match table column names
Invalid username/password → Fix credentials

## ✅ Highlights

Uses PreparedStatement (secure & efficient)
Prevents SQL Injection
Supports dynamic query parameters
Recommended over Statement
