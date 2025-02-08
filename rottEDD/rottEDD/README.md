# 📌 RottED

## 📖 Description

RottED is a Kotlin-based Android application that fetches and plays videos from a backend using a hidden URL. In a world where digital content consumption is at its peak, RottED bridges the gap between entertainment and accessibility by enabling seamless video playback through AI-driven automation. Utilizing ExoPlayer, the app ensures smooth playback with automatic pausing of non-visible videos, creating a dynamic and engaging user experience.

## 📂 Project Contents

- *📌 Backend*: Handles secure video streaming through a hidden URL.
  - *API Handling*: Securely fetches video links without direct exposure.
  - *Main Script*: Manages video URLs and content streaming.
- *📱 Frontend*: A Jetpack Compose-based UI for intuitive video scrolling.
  - *UI Components*: VideoPlayer.kt, ReelsScreen.kt.
  - *Assets*: Resources for UI elements and branding.

## 🎯 Objectives

✔ Fetch secure video URLs from a hidden backend endpoint.
✔ Ensure seamless playback using ExoPlayer.
✔ Auto-pause non-visible videos to optimize resource usage.
✔ Deliver a smooth reels-style scrolling experience.
✔ Enhance accessibility with structured content delivery.

## 🛠 Tools and Libraries

The project utilizes the following technologies:

### 🖥 Backend:

- *🌍 Hidden API* (for secure video access)
- *🌐 Retrofit* (for seamless data fetching)

### 📱 Frontend:

- *📱 Kotlin (Jetpack Compose)* (for UI development)
- *🎞 ExoPlayer* (for high-performance video playback)

## ⚙ How to Use

### 📌 Prerequisites

Ensure you have **Android Studio** installed and sync Gradle dependencies:

```sh
git clone https://github.com/your-repo/rottEDD.git
cd rottEDD
```

### 🚀 Running the Backend

1. Ensure your backend server is running with video streaming capabilities.
2. Modify the API request in your app to match the backend URL:
   ```kotlin
   val backendUrl = "https://hidden-backend.com/api/videos"
   ```
3. Run the Android app using an emulator or real device.

## 📊 Results

The project enables:

- Secure video streaming via a hidden backend.
- Smooth, high-quality playback with ExoPlayer.
- Optimized resource management through auto-pausing.
- A user-friendly reels-style interface for video browsing.

## 📁 File Structure

RottED/
├── backend/
│ ├── api/ # Secure video URL handling
│ ├── logic/ # Core backend logic
│ ├── server.py # Backend execution file
├── frontend/
│ ├── app/src/main/java/com/example/rottEDD/
│ │ ├── ui/components/ # Video player components
│ │ ├── ui/screens/ # Reels scrolling interface
│ ├── assets/ # UI elements and branding
├── .gitignore # Git ignore file
├── README.md # This file

## 🔮 Future Enhancements

- **Enhanced UI/UX**: Improve design and navigation.
- **Multi-server support**: Enable wider backend scalability.
- **Personalized content**: User-authenticated video suggestions.
- **Cloud-based deployment**: Deploy on AWS, Google Cloud, or Firebase.

## 👥 Contributors

Sagar Patel - Kunal Pandya - Devarsh Joshi - Tanish Singla

## 🤝 Contributions

Contributions are welcome! Feel free to fork this repository, improve the project, and submit a pull request.

## 📜 License

This project is licensed under the MIT License - see the LICENSE file for details.

