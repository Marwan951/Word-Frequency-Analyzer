package Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Word_Counter {

    public Map<String, Integer> count_word (String text){
        Map<String,Integer> frequency = new HashMap<>();
        Text_Cleaner text_cleaner = new Text_Cleaner();
        text = text_cleaner.clean(text);
        String []words = text.split("\\s+");
        for (String s: words) {
            frequency.put(s,frequency.getOrDefault(s,0)+1);
        }
        return frequency;
    }
    public static List<Map.Entry<String,Integer>> get_highest_N_freq(Map<String,Integer> map, int n){
        List<Map.Entry<String,Integer>> top_n= map.entrySet().stream()
                .sorted((freq1, freq2 ) -> freq2.getValue().compareTo(freq1.getValue()))
                .limit(n)
                .collect(Collectors.toList());
        return top_n;
    }
}
