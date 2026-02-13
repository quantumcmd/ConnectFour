# Connecta-4 (Java OOP Project)

A fully playable, console-based Connect-4 game written in Java. This project was developed with a strong focus on clean Object-Oriented Programming (OOP) principles and a strict Git version control workflow.

## How to Run

1. Ensure you have Java installed on your system.
2. Open your terminal and navigate to the project folder.
3. Compile the code: `javac *.java`
4. Run the game: `java Main`

- **`Main.java`**: The entry point of the program.
- **`UserInterface.java`**: Handles the game loop, taking input from the `Scanner`, and printing responses. It connects the players to the board.
- **`Board.java`**: Manages the state of the 2D array (`char[][]`). It encapsulates the array (keeping it private) and handles the "gravity" logic when dropping a token.
- **`Player.java`**: A simple data class that holds the player's name and symbol ('T' or 'J').
- **The Strategy Pattern (Win Conditions)**: To keep the `Board` class clean, the victory logic was separated using an interface `WinConditionStrategy`.
  - `HorizontalWinCondition`
  - `VerticalWinCondition`
  - `DiagonalWinCondition`
    This makes the code easy to debug.
