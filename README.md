## Word Frequency Analyzer
The Word Frequency Analyzer is a Java program that reads a text file, processes its content, and reports the most frequently occurring words. It is designed to handle punctuation, ignore case sensitivity, and efficiently process large files.
As a bonus, it can also generate a bar chart visualization of the top words.

## Features
Read from File: Accepts a path to a .txt file.
Case & Punctuation Handling: Ignores case and removes punctuation for accurate counting.
Top N Words: Displays the top N (N=10) most frequent words with their counts.
Visualization (Bonus): Generates a simple bar chart of the top words.

## Usage Example
Input file
 ```text
Once upon a time, in a land far, far away, there was a small village.
The village was peaceful—very peaceful indeed.
People in the village loved stories. Stories about heroes, stories about adventures, and stories about everyday life.

One hero, named Alex, was especially famous.
Alex would tell stories at night, under the bright stars.
The children loved Alex’s stories! They laughed, they gasped, and they dreamed.

Stories, after all, connected the people.
Stories gave them hope.
Stories brought them together, even in the hardest times.

Far away in the city, life was different.
But in the village, stories remained the heartbeat of the community.
 ```
```java

```

Output File
```text
Word Frequency Chart:
stories    | ########## (10)
the        | ########## (10)
in         | ##### (5)
village    | #### (4)
was        | #### (4)
about      | ### (3)
far        | ### (3)
they       | ### (3)
alex       | ### (3)
a          | ### (3)
```
  
