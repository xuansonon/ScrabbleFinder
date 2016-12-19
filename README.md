# ScrabbleFinder
ScrabbleFinder or WordFinder is a Java-based console application that takes in a random string input from the user and a word to search for. The function will returns messages either if the application can find the word in the random string input or not. It works like scrabble - you have an x number of characters and you try to find a word with in that list of characters.
<br />
<br />
**How to start WordFinder/ScrabbleFinder**
```
java wordFinder
```
You will be asked to following:
```
Enter any scrabble pattern string:
Enter a word to find:
```
Once the scrabble pattern string and word is entered, the program will breakdown each of the input into single characters. The scrabble pattern string will be added into an Array List. It will then search the array list of it contains any of the word input characters. If it does it will begin the next character, if not, it will end the function with a message stating that the word cannot be found.
<br />
<br />
**Exmaple Input and Outputs**
```
Enter any scrabble pattern string: lidaymu
Enter a word to find: daily

Enter any scrabble pattern string: orppgma
Enter a word to find: program
```
The following above will result in:
```
Daily can be found in lidaymu.
Program could not be found in orppgma.
```
