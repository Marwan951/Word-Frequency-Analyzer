package Services;
import java.util.Map;
import java.util.List;

public class Bar_Chart {
    public void printAsciiChart(List<Map.Entry<String, Integer>> topWords) {
        int maxCount = topWords.get(0).getValue();
        System.out.println("\nWord Frequency Chart:");
        for (Map.Entry<String, Integer> entry : topWords) {
            String bar = "#".repeat(entry.getValue());
            System.out.printf("%-10s | %s (%d)%n", entry.getKey(), bar, entry.getValue());
        }
    }
}
