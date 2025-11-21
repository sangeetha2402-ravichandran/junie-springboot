# Junie Spring Boot Demo

A simple Spring Boot application that connects to Junie (OpenAI) using WebClient and exposes a REST API.  
This project is ideal for interviews, portfolio projects, GitHub showcase, or learning API integration.

## Features
- Spring Boot 3 (Java 17)
- REST API endpoint: POST /api/junie/ask
- Calls Junie/OpenAI using WebClient
- Clean DTO structure
- Easy to configure using application.properties
- Ready for deployment + Docker support

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

## Tech Used
- Spring Boot 3  
- Java 17  
- WebClient  
- Lombok  
- Maven  

## Future Enhancements
- JWT Authentication  
- MySQL chat history  
- Swagger UI  
- React Frontend  
- Exception Handling & Logging  

## License
MIT License
