## Word Frequency Analyzer
The Word Frequency Analyzer is a Java program that reads a text file, processes its content, and reports the most frequently occurring words. It is designed to handle punctuation, ignore case sensitivity, and efficiently process large files.
As a bonus, it can also generate a bar chart visualization of the top words.

## Features
- Read from File: Accepts a path to a .txt file.
- Case & Punctuation Handling: Ignores case and removes punctuation for accurate counting.
- Top N Words: Displays the top N (N=10) most frequent words with their counts.
- Visualization (Bonus): Generates a simple bar chart of the top words.

## Folder Structure
```bash
word-frequency-analyzer/
│
├── src/
│   ├── WordFrequencyAnalyzer/
│   │   ├── Main.java
│   ├── Services/
│   │   ├── Bar_Chart.java
│   │   ├── Text_Cleaner.java
│   │   ├── Text_Reader.java
│   │   ├── Word_Counter.java
│
├── Resources/
│   ├── Text.txt   # Sample text file for testing
│
└── README.md
```

## How to Run the Program
1. **Clone the Repository**
 ```bash
 git clone https://github.com/yourusername/Word-Frequency-Analyzer.git
 ```
2. **Check Main Class**
```bash
├── src/
│   ├── WordFrequencyAnalyzer/
│   │   ├── Main.java
```
3. **Add Your Input File**  - Place your .txt file inside or use the existing one 
```bash
├── Resources/
│   ├── Text.txt
```
4. **Update the file path in Main.java** or name the file with Text.txt
```Java
String file_path = "src\\Resources\\Text";
```
5. **Change the N as you like** - (ex. N = 10)
```Java
 freq = word_counter.get_highest_N_freq(map, 10);
```
6. **Run the Program**
```text
 Expected output: The top 10 most frequent words will appear in the console as a bar chart
```
## Usage Example
Input 
filepath: "src\\Resources\\Text"
 ```text
Once upon a time, in a land far, far away, there was a small village. The village was peaceful—very peaceful indeed. People in the village loved stories. Stories about heroes, stories about adventures, and stories about everyday life.
One hero, named Alex, was especially famous. Alex would tell stories at night, under the bright stars. The children loved Alex’s stories! They laughed, they gasped, and they dreamed. Stories, after all, connected the people.
Stories gave them hope. Stories brought them together, even in the hardest times. Far away in the city, life was different. But in the village, stories remained the heartbeat of the community.
 ```
Processing:
```Java
   // Step 1: Read the file content
   try {
       text = String.valueOf(text_reader.readFile(file_path));
   } catch (IOException e) {
       e.printStackTrace(); // Print error if file reading fails
   }

   // Step 2: Clean the text (remove punctuation, lowercase, etc.)
   text = text_cleaner.clean(text);

   // Step 3: Count the frequency of each word
   map = word_counter.count_word(text);

   // Step 4: Get the top 10 most frequent words
   freq = word_counter.get_highest_N_freq(map, 10);

   // Step 5: Display the results as a Word bar chart
   bar_chart.printWordChart(freq);
```
Output
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
  
