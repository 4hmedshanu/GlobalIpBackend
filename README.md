#Global IP Intelligence Platform

# 📌 Spring Boot Backend Setup Guide (Eclipse + PostgreSQL)

This README helps you set up the backend & database environment for the project using **Eclipse IDE**, **Spring Boot**, and **PostgreSQL**.

---

## 📥 Step 1: Download the GitHub Project

1. Open **GitHub Repository**
2. Click **Code → Download ZIP**
3. Extract the ZIP file (your project folder will appear)

---

## ☕ Step 2: Install JDK

Install **JDK 21** or **JDK 24**

### ✔️ Verify Installation

Open **CMD** and run:

```
java -version
```

Make sure **JAVA_HOME** is properly set.

---

## 🖥️ Step 3: Install Eclipse IDE

Download **Eclipse IDE for Java Developers**

> ⚠️ Note: "Eclipse Installer" version is **Eclipse IDE for Enterprise Java and Web**

Install & open Eclipse.

---

## 🔧 Step 4: Install Spring Tools (STS) Plugin in Eclipse

1. In Eclipse: **Help → Eclipse Marketplace...**
2. Search **Spring Tools 4**
3. Install → Restart Eclipse

This adds:

* Run As → Spring Boot App
* Spring Boot Dashboard
* Better Spring project support

---

## 📂 Step 5: Import the Spring Boot Project

1. Open Eclipse → **File → Import**
2. Select **Existing Maven Project**
3. Browse & select your extracted project folder
4. Click **Finish**

---

## 🔧 Step 6: Resolve Maven Dependencies

1. Right‑click project → **Maven → Update Project (Alt+F5)**
2. Keep internet ON to download all dependencies

---

## ⚙️ Step 7: Run the Spring Boot Application

1. Go to **src/main/java**
2. Find the class with `@SpringBootApplication`
3. Right‑click → **Run As → Spring Boot App**

---

## 🛢️ Step 8: Install PostgreSQL + pgAdmin

Download & install:

* **PostgreSQL Database Server**
* **pgAdmin** (GUI to manage DB)

Configure your DB credentials in `application.properties` or `application.yml`:

```
server.port=8080 // change accoding to you 

spring.datasource.url=jdbc:postgresql://localhost:5431/ipintelligence_db  // change accoding to you 
spring.datasource.username=postgres
spring.datasource.password=shanu03  // change accoding to you 

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

---

## 6. Design Diagrams

Here is the ER Diagram for the database structure:



## 🚀 DONE! Your Backend Environment Is Ready 🎉

You can now begin development, testing, and API integration.

---

## 📎 Additional Commands

### Clean & Build Project

```
mvn clean install
```

### Run Spring Boot via terminal

```
mvn spring-boot:run
```

---

## 🤝 Contributing

1. Fork the repo
2. Create a feature branch
3. Commit your changes
4. Push & create a Pull Request

---

## 📬 Contact

If you face any issue, feel free to raise an **Issue** in the GitHub repo.
