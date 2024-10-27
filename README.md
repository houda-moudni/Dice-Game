# Dice Game Project

## Overview

This project is a simple dice game developed using Java EE with Tomcat. The game allows users to roll three dice in a defined order and score based on the results. The application provides a user-friendly interface to interact with the game and maintains user data without using a database.

## Game Rules

1. Players can roll three dice (numbered 1, 2, and 3) one at a time, indicated via an interface.
2. Users input the die number to roll and click the "Roll Die" button.
3. A die cannot be rolled more than once during a game session. If a player rolls the same die twice, the game ends and the player receives a score of -1.
4. The scoring rules are as follows:
   - If the result of die 1 < result of die 2 < result of die 3, the player receives a score equal to the sum of the three dice.
   - Otherwise, the player scores 0.
   - If a die result is guaranteed to make the scoring condition fail (e.g., if die 1 rolls a 6), the game ends early.
5. At the end of the game, the application displays the current game score and the best score recorded.

## Features

- User account creation
- User data storage (name, surname, login, password, best score)
- User functionalities:
  - Login and logout
  - Play the game
  - View best score
  - View best scores of other players

## Technologies Used

- Java EE
- Apache Tomcat
- HTML/CSS for frontend
- Java Servlets for backend logic



