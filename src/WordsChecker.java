import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    Set<String> searchText = new HashSet<>();
    protected String word;
    public WordsChecker(String originText){
        originText = originText.toLowerCase();
        String[] s = originText.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < s.length; i++){
            searchText.add(s[i]);
        }

    }


    public boolean hasWord (String word) {
        this.word = word.toLowerCase();
        if (searchText.contains(word) == true) {
            return true;
        }
        return false;
    }
}
