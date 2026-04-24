# 🍽️ JJ Cafeteria System

A simple and efficient **Canteen Management System** built using **Spring Boot, MySQL, HTML, CSS, and JavaScript**.
This application allows students to order food easily and admins to manage items and track order status in real-time.

---

## 🚀 Features

### 👨‍🎓 Student

* View food categories (Foods, Snacks, Juices, Stationery)
* Browse items under each category
* Place orders quickly
* View order status:

  * 🟡 ORDERED
  * 🟢 READY
* Pickup notification within 10 minutes

### 👨‍💼 Admin

* Add new food items
* Manage categories and prices
* View all student orders
* Mark orders as **READY**
* Real-time status update on student dashboard

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot (Java)
* **Frontend:** HTML, CSS, JavaScript
* **Database:** MySQL
* **Tools:** GitHub, GitHub Desktop

---

## 📁 Project Structure

```
src/main/resources/
com.jjcanteen/
│
├── controller/
├── service/
├── repository/
├── model/
│
├── static/
│     ├── css/
│     ├── js/
│
├── templates/
│     ├── index.html
│     ├── student.html
│     ├── admin.html
│

```

## 🌐 Usage

* Open browser:

  ```
  http://localhost:8080/
  ```
* Choose:

  * Student → Place order
  * Admin → Manage food & update status

---

## 🎯 Key Highlights

* Real-time order tracking (ORDERED → READY)
* Clean UI with color-coded status
* Category-based filtering
* Full CRUD operations implemented


## 👨‍💻 Author

**Praveen Kumar**
Computer Science Engineering Student

---

## 📌 Future Enhancements

* User authentication (login system)
* Payment integration
* Mobile app (Flutter)
* Live notifications (WebSocket)

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
