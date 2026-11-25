# fitness-tracker
A Java console app for tracking number of steps taken by the user
Users can enter steps which can be broken down into thousands, hundreds and tens or enter a distance in kilometres and convert it to steps.

## Features
- Enter step stats (thousands, hundreds, tens) and display them using the correct grammar - including proper pluralization, commas, "and" before the last unit and omission of zero units
- Convert distance walked in km to steps using 1 km = 1312 steps rounded to the nearest step
- Break step totals into thousands, hundreds and tens using integer division and modulo
- Proper input validation to detect non-numeric and negative values
- Menu-driven interface with options to pretty-print stats, convert distance or exit the program

## Technologies
Java, object-oriented design (3 classes), Scanner, integer divison and modulo, Math.round(), input validation loops

## How to run
1. Compile all files `javac *.java`
2. Run: `java UserInterfaceMain`

## Design
The program follows the single-responsibility principle:
- `Stepstats` - stores step data (thousands, hundreds, tens) and formats the output
- `Distance` - converts kilometres to steps and breaks the total into units
- `UserInterfaceMain` - handles the menu, user input and program flow

## AI Disclosure
Developed with AI assistance; code reviewed, tested, debugged and adapted by me.
