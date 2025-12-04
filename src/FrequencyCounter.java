import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 2, 2, 5};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies: " + freq);
    }
}
