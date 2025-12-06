# The Last of Us - Legacy

A turn-based survival game made with Java and JavaFX. Fight zombies, collect vaccines, and try to stay alive.

![Intro Screen](https://github.com/user-attachments/assets/b84d50d0-d503-4f1c-9422-e0aa28f25fd6)
## What is this?

This is a grid-based strategy game inspired by The Last of Us. You pick a hero, move around a 15x15 map, fight zombies, and collect vaccines. The goal is simple: get all the vaccines without dying.

## How to play

Pick your hero from the selection screen:

![Character Selection](https://github.com/user-attachments/assets/cdd0dc8b-0522-46f7-910a-b8e715e5741a)

Each hero has different stats and a special ability:
- **Fighters** (Joel, David) - deal extra damage when using special
- **Medics** (Ellie, Bill, Henry) - heal other heroes to full HP
- **Explorers** (Tess, Riley, Tommy) - reveal the entire map

### Controls

- Arrow keys to move
- A to attack
- C to cure zombies (costs a vaccine)
- S to use special ability (costs a supply)
- R or click to select a target
- E to end your turn

### AI Player Mode

Want to watch the computer play? The game includes an intelligent AI mode!

On the character selection screen, click the **"Let Computer Play"** button to activate AI mode. The computer will:

- Automatically control your selected hero (and any additional heroes)
- Make strategic decisions about movement, combat, and resource usage
- Prioritize collecting vaccines and supplies
- Use special abilities intelligently based on character type
- Manage multiple heroes effectively
- Avoid traps and optimize positioning

The AI uses advanced algorithms to evaluate moves, assess combat risks, and plan several turns ahead. It's great for:
- Learning optimal strategies by watching
- Enjoying the game as a spectacle  
- Testing different hero builds automatically

## Gameplay

![Main Gameplay](https://github.com/user-attachments/assets/e1942b69-49d3-48c8-be05-3befcc60d37a)

The game works like this:
- You can see a small area around your hero (fog of war)
- Move around to collect supplies and vaccines
- Fight zombies that spawn and chase you
- Each hero has limited actions per turn
- Zombies get their turn after you end yours

![Fog of War](https://github.com/user-attachments/assets/6093177c-88ba-4ca3-a26a-6f60cd4b8e28)

Watch out for traps! They'll damage you when you step on them.

## Winning

Collect all the vaccines to win:

![Victory Screen](https://github.com/user-attachments/assets/527eb4b5-7502-4143-941c-30cbb445fd09)

If all your heroes die, game over.

## Installation

You'll need:
- Java JDK 8 or higher
- JavaFX (comes with JDK 8, download separately for newer versions)

To run:
1. Clone this repo
2. Open in Eclipse or your IDE
3. Run `src/views/Main.java`

If you're using JDK 11+, add these VM arguments:
```
--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
```

## Project Structure

```
src/
├── engine/       - game logic
├── model/        - characters, items, map cells
├── views/        - UI and scenes
├── exceptions/   - custom errors
└── ai/           - intelligent AI player system

Heros.csv         - hero stats
```

## Note

This was a semester project for learning OOP and JavaFX. The code isn't perfect but it works. Feel free to use it as reference.
