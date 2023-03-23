public class WordsChecker {
    protected String[] searchText;

    public WordsChecker(String originText){
        originText = originText.toLowerCase();
        this.searchText = originText.split("\\P{IsAlphabetic}+");
    }


    public boolean hasWord (String word) {
        for (int i = 0; i < searchText.length; i++) {
            if(searchText[i].equals(word.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public void info() {
        for(int i = 0; i < searchText.length; i++) {
            System.out.println("|" + searchText[i] + "|");
        }
    }
}
