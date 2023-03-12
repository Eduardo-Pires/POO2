import java.util.Arrays;
import java.util.HashMap;

public class EX02 {
    public static HashMap<Character, Integer> charCount(String str) {
        HashMap<Character, Integer> counter = new HashMap<>();
        char[] strTemp = str.toCharArray();
        int k;
        Arrays.sort(strTemp);

        for (int i = 0; i < strTemp.length; i++) {
            k = 1;
            while (i < strTemp.length - 1 && strTemp[i] == strTemp[i + 1]) {
                k++;
                i++;
            }
            counter.put(strTemp[i], k);
        }
        return counter;
    }
}
