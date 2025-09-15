public class brokenWords {
    public static void main(String[] args) {
        String word = "Hello World";
        String BrokenWord = "ad";
        System.out.println(found(word, BrokenWord));
        
    }


    static int found(String words , String BrokenWord){
        int foundWord=0;
        boolean flag = true;
        
        char[]BrokenLetters = BrokenWord.toCharArray();
        for (int i = 0; i < words.length(); i++) {
            char wordsArr[]= new char[words.length()];
            for(int j =0; j<wordsArr.length; j++){
                wordsArr[j] = words[i]; 
            }
        }
        
        return foundWord;
    }
}
