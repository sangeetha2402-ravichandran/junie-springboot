# 🚀 Spring Boot 3 + OpenAI Integration Demo

A production-ready **Spring Boot 3 (Java 17)** application that integrates with the latest **OpenAI Responses API** using `WebClient` and exposes a clean REST endpoint.

This project demonstrates real-world AI service integration within a scalable backend architecture — ideal for interviews, portfolio showcase, and enterprise discussions.

---

## 📌 Project Overview

This application:

- Accepts a prompt via REST API  
- Calls OpenAI's latest `/v1/responses` endpoint  
- Returns structured AI-generated output  
- Follows clean layered architecture principles  

It showcases secure API handling, reactive programming, and modern backend design.

---

## 🛠 Tech Stack

- Java 17  
- Spring Boot 3  
- Spring WebFlux (WebClient)  
- Maven  
- Lombok  
- Docker (Optional)

---

## ⚙️ Features

✔ REST API endpoint: `POST /api/ai/ask`  
✔ OpenAI Responses API integration  
✔ Reactive WebClient configuration  
✔ Clean DTO structure  
✔ Externalized configuration  
✔ Error handling & response mapping  
✔ Docker-ready  

## Project Structure
<img width="853" height="381" alt="image" src="https://github.com/user-attachments/assets/7a05e969-ee4a-4ece-9f8f-71c3a699d721" />


## Prerequisites
- Java 17
- Maven 3+
- Junie/OpenAI API Key

## Setup

### 1. Clone the Repo
```
git clone https://github.com/YOUR_USERNAME/junie-springboot-demo.git
cd junie-springboot-demo
```

### 2. Add Your API Key
Edit:
`src/main/resources/application.properties`

```
junie.api.url=https://api.openai.com/v1/chat/completions
junie.api.key=YOUR_API_KEY_HERE
server.port=8080
```

## Run the App

### Using Maven
```
mvn spring-boot:run
```

### Using IntelliJ/Eclipse
Run the class:
```
JunieDemoApplication
```

## Test the API (Postman)

POST http://localhost:8080/api/junie/ask

### Request Body
```json
{
  "prompt": "Explain microservices in a simple way."
}
```

### Response Example
```json
{
  "result": "Microservices are small, independent services that..."
}
```

## API Documentation

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/junie/ask | Sends prompt to Junie |

## 🧠 What This Project Demonstrates

AI API Integration in Enterprise Java

Reactive HTTP Client usage

Secure configuration handling

Clean layered architecture

RESTful API design best practices


