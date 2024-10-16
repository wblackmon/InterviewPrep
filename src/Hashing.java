import java.util.HashSet;
import java.util.Set;

public class Hashing {
    public static boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<Character>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            letters.add(c);
        }
        return letters.size() == 26;
    }
}
