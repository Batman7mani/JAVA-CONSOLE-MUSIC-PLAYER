# JAVA-CONSOLE-MUSIC-PLAYER

This is a Java-based console music player developed using the `javax.sound.sampled` API.  
It supports playback of multiple `.wav` audio files and provides basic controls such as play, pause, resume, stop, restart, and loop.  
The project is menu-driven and operates entirely within the terminal.

---

## 1. Project Overview

This application allows the user to:
- Select a song from a predefined list
- Control playback through text-based commands
- Handle invalid inputs gracefully
- Manage audio playback in real time

This project serves as an initial step towards a larger goal — the development of a Java-based RPG game incorporating dynamic sound effects and background music.

---

## 2. Technologies and Concepts Used

- **Java (Core Java 8+)**
- **Java Sound API (`javax.sound.sampled`)** for audio playback
- **Switch-case control structures** for user command handling
- **Exception handling** for error management:
  - `UnsupportedAudioFileException` — when the file format is unsupported
  - `IOException` — for file reading errors
  - `LineUnavailableException` — when audio resources are not available
- **Scanner class** for reading console input
- **File handling** for accessing audio files
- **Finally block** to ensure clean program termination

---

## 3. How the Application Works

1. The user is presented with a numbered menu of available songs.
2. Upon selection, the application opens the chosen `.wav` file using `AudioInputStream` and `Clip`.
3. The user can then enter commands:
   - `PLAY` – Starts playback from the beginning
   - `PAUSE` – Pauses playback
   - `RESUME` – Resumes playback from the paused position
   - `STOP` – Stops playback and resets to the beginning
   - `RESTART` – Restarts playback from the beginning
   - `LOOP` – Plays the track continuously
   - `EXIT` – Stops playback and closes the program
4. The program terminates after the user issues the `EXIT` command.

---

## 4. Project Structure


MusicPlayer/
├── src/
│ ├── Main.java
│ ├── dan_da_dan.wav
│ ├── demon_slayer.wav
│ ├── naruto_sama.wav
│ └── one_piece_ringtone.wav
└── README.md

---

## 5. Challenges Faced

- **Audio format restrictions**: Discovered that `Clip` supports `.wav` files natively but not `.mp3`.  
  Resolved by converting all tracks to `.wav`.
- **Multiple Scanner instances**: Initially, creating a new `Scanner` in each loop caused issues.  
  Resolved by reusing a single instance.
- **Loop playback**: Learned that `clip.start()` must be explicitly called after setting loop mode to begin playback.
- **File path errors**: Faced inconsistent behavior on different systems.  
  Resolved by using consistent relative paths.

---

## 6. Lessons Learned

- Practical usage of the Java Sound API for media playback.
- The importance of structured exception handling to ensure a user-friendly experience.
- Efficient resource management using `finally` blocks.
- Designing a clear and logical menu-driven program.
- Debugging and resolving real-world file handling issues.

---

## 7. Future Improvements

- Add playlist functionality to queue and play multiple songs.
- Implement MP3 file support through external libraries (e.g., JLayer).
- Add volume control via console commands.
- Enable returning to the main song selection menu without restarting the application.
- Develop a graphical version using JavaFX or Swing.

---

## 8. Conclusion

This project demonstrates my understanding of Java fundamentals, the Java Sound API, and exception handling.  
It also reflects my ability to debug and resolve real-world issues in file handling and resource management.  
The application serves as a foundational project and an important step towards building more complex, interactive Java applications such as my planned RPG game.

---

