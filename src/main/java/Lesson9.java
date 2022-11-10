import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson9 {
    public static void main(String[] args) {
        String str = "tea, coffee, tea, cappuccino";
        stringToSet(str);
    }

    public static void stringToSet(String str) {
        String[] words = str.split(", ");
        Set<String> setList = new HashSet<>(Arrays.asList(words));
        for (String word : setList) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(word);
        }
    }
}
