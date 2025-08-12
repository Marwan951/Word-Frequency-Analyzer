package WordFrequencyAnalyzer;

import Services.Bar_Chart;
import Services.Text_Cleaner;
import Services.Text_Reader;
import Services.Word_Counter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
    String file_path = "src\\Resources\\Text";
    Text_Reader text_reader = new Text_Reader();
    Text_Cleaner text_cleaner = new Text_Cleaner();
    Word_Counter word_counter = new Word_Counter();
    Map<String,Integer> map = new HashMap<>();
    List<Map.Entry<String,Integer>> freq = new ArrayList<>();
    Bar_Chart bar_chart = new Bar_Chart();
        String text = null;
        try {
            text = String.valueOf(text_reader.readFile(file_path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = text_cleaner.clean(text);
        map = word_counter.count_word(text);
        freq = word_counter.get_highest_N_freq(map,10);
        bar_chart.printAsciiChart(freq);
    }
}
