#  WhatsApp Chatbot Backend (Spring Boot)

## 🚀 Overview
This project is a simple backend simulation of a WhatsApp chatbot built using **Java and Spring Boot**.  
It demonstrates how messages can be received via a REST API and responded to with predefined replies.

---

## 🎯 Features
- REST API endpoint: `/webhook`
- Accepts JSON input simulating WhatsApp messages
- Returns predefined responses:
  - "Hi" → "Hello 👋"
  - "Bye" → "Goodbye 👋"
- Default response for unknown messages
- Logs all incoming messages
- Handles null and empty inputs
- Case-insensitive message handling

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Maven
- Postman (for testing)

---

## 📂 Project Structure

src/main/java/com/example/whatsappchatbot
│
├── controller # Handles API requests
├── dto # Request and Response classes
├── service # Business logic
└── WhatsappChatbotApplication.java # Main class


---

## 🔗 API Endpoint

### ➤ POST `/webhook`

### 📥 Request Body:

{
  "message": "Hi"
}
📤 Response:
{
  "reply": "Hello 👋",
  "timestamp": "2026-04-03T19:40:00"
}
🧠 How It Works
Client sends a POST request with a message
Controller receives the request
Service processes the message
Response is returned with reply
All messages are logged in the console
▶️ How to Run
Clone the repository:
git clone https://github.com/your-username/your-repo-name.git
Navigate to the project:
cd whatsapp-chatbot
Run the application:
mvn spring-boot:run
Test using Postman:
POST http://localhost:8080/webhook
🎥 Demo Video

Loom Video Link:
https://www.loom.com/share/your-video-link

💡 Future Improvements
Integration with WhatsApp Cloud API
NLP-based chatbot responses
Database for chat history
🙋‍♂️ Author

Dipesh Padole
B tech Student YCCE Nagpur 
