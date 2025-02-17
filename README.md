# Expensify

## 📌 Overview
The **Expensify** app is a powerful tool designed to help users efficiently track and manage their daily expenses. With an intuitive user interface and robust data management, users can effortlessly record transactions, analyze spending patterns, and maintain better financial discipline. Built using modern Android development frameworks, this app ensures smooth performance and scalability.

## 🚀 Features

### 📝 Add Expense
- Quickly record expenses with essential details like **amount, category, date, and types**.
- Categorize transactions (e.g., **Rent, Travel, Shopping, Bills**).
- Customize categories to suit individual tracking needs.

### 📅 Track Expenses
- View a **chronological list** of all recorded expenses.
- **Filter and search** expenses by category, date, or keywords.
- Edit or delete existing expense records.

### 📊 Analyze with Stats & Charts
- **Visualize spending patterns** using bar charts and pie charts.
- Monitor **category-wise expenditure** to identify spending trends.
- View **monthly, weekly, and daily reports** for detailed financial insights.

### 🔐 Secure Data Storage
- Uses **Room Database** for **offline access** to all expense records.
- Automatic data backup ensures the safety of financial records.

### 🌙 Dark Mode Support
- Seamless **light and dark theme** options for better user experience and readability.

### 🎯 User-Friendly Interface
- Built with **Jetpack Compose**, providing a **modern and responsive UI**.
- **Minimalistic and clean design** for a distraction-free experience.

## Screenshots

### Main Screen     --      Choose Income or expnese    --     Add Expense
![Splash Screen](https://github.com/Saurav321134/Expensify/blob/cdd8017e7adec096a0176ee896feab6c88f8585c/ss_1st.png)
![SignInScreen](https://github.com/Saurav321134/Expensify/blob/cdd8017e7adec096a0176ee896feab6c88f8585c/ss_2nd.png)
![ChartScreen](https://github.com/Saurav321134/Expensify/blob/cdd8017e7adec096a0176ee896feab6c88f8585c/ss_3rd.png)
### Select Type -- Filter Transaction -- Detail Screen
![Add/Update](https://github.com/Saurav321134/Expensify/blob/cdd8017e7adec096a0176ee896feab6c88f8585c/ss_4th.png)
![DetailScreen](https://github.com/Saurav321134/Expensify/blob/cdd8017e7adec096a0176ee896feab6c88f8585c/ss_5th.png)
![InputScreem](https://github.com/Saurav321134/Expensify/blob/cdd8017e7adec096a0176ee896feab6c88f8585c/ss_6th.png)


## 🛠 Technologies Used

### 🖌 Jetpack Compose (UI)
- **Declarative UI Toolkit** for building dynamic layouts.
- Uses **Composable functions** for modular and reusable UI components.
- Optimized for **performance** with built-in animations.

### 🗄 Room Database (Data Storage)
- Provides robust **data persistence** with an abstraction over SQLite.
- Uses **Kotlin Coroutines** for efficient, asynchronous database operations.
- Supports **LiveData & Flow**, enabling real-time UI updates.

### 💉 Dagger Hilt (Dependency Injection)
- Simplifies dependency injection, making the app **modular and maintainable**.
- Automatically manages object dependencies, reducing boilerplate code.

### 🏗 MVVM Architecture (Scalability & Maintainability)
- Separates concerns into **Model (data), View (UI), and ViewModel (logic)**.
- Ensures better **code structure**, testability, and reusability.
- Works efficiently with **LiveData, StateFlow, and Coroutines**.

### 🚀 Kotlin Coroutines (Asynchronous Operations)
- Manages background tasks efficiently (e.g., **database queries and network calls**).
- Uses **suspend functions** to keep the UI thread unblocked.

### 🗺 Navigation Component (Seamless Navigation)
- Manages navigation between screens using **Navigation Compose**.
- Provides **type-safe argument passing** between destinations.
- Supports **deep linking** to access specific app sections directly.

### 📊 MPAndroidChart (Data Visualization)
- Provides **interactive charts** for financial insights.
- Supports **Pie, Bar, and Line charts** for a detailed spending breakdown.
- Includes smooth animations to enhance the user experience.

### 🔥 LiveData & Flow (Reactive Programming)
- Ensures real-time UI updates when data changes.
- Uses **StateFlow** for effective state management in Jetpack Compose.

## 📲 Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/Saurav321134/Expensify.git
   ```
2. Open the project in **Android Studio**.
3. Sync the Gradle files and ensure all dependencies are installed.
4. Connect an **Android device** or use an **emulator**.
5. Run the application.


## 🙌 Contributing
Contributions are welcome! Feel free to open **issues** or submit **pull requests** to improve the app.

## 📧 Contact
For any inquiries or suggestions, feel free to reach out at **sraj29sraj@gmail.com**.

