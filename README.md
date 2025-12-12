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
