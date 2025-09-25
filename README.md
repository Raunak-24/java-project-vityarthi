# 🎓 Campus Course Records Manager (CCRM)

A **console-based Java application** for managing students, courses, enrollments, grades, and transcripts.  
Implements **OOP concepts**, **design patterns**, and **file utilities** as per academic requirements.  

---

## ✨ Features
- 👩‍🎓 Add/List/Manage **Students**
- 📚 Add/List/Manage **Courses**
- 📝 **Enroll/Unenroll** students in courses
- 📊 Record **Grades** and generate **Transcripts**
- 📂 **Import/Export** CSV & text files
- 💾 File **Backup/Archive** utilities
- 🖥️ Menu-driven **CLI Interface**

---

## 🛠️ Tech Stack
- **Language**: Java 11+  
- **Paradigm**: Object-Oriented Programming (OOP)  
- **Patterns**: Singleton, Builder  
- **Modules**: Domain, Service, IO, CLI, Util, Config  

---

## 📂 Project Structure
src/
└── edu/ccrm/
├── cli/ # CLI menu classes
├── domain/ # Models (Student, Course, Grade, Transcript)
├── service/ # Core logic & processing
├── io/ # File handling (import/export)
├── util/ # Helpers, utilities
└── config/ # Configuration & design patterns

---

## 🚀 Setup & Run

### 1️⃣ Prerequisites
- Install **Java JDK 11+**
- Verify installation:
  ```bash
  java -version
  
2️⃣ Compile
javac -d bin src/edu/ccrm/**/*.java

3️⃣ Run
java -cp bin edu.ccrm.cli.Main

📸 Screenshot
<img width="688" height="436" alt="CCRM CLI Screenshot" src="https://github.com/user-attachments/assets/4b772523-fd9c-4ea7-ae84-c7d43031af11" />

👨‍💻 Author

Developed with ❤️ by Yash Rajput
