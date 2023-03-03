import java.util.*;

public class WordsChecker {
    private String text;
    public WordsChecker(String text){
        this.text = text;
    }
    public boolean hasWord(String searchWord){
        Set<String> set = new HashSet<>();
        String[] textArray = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, textArray);
        if(set.contains(searchWord)){
            return true;
        }else{
            return false;
        }
    }
}
