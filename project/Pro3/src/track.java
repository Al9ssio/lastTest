import java.util.Arrays;
import java.util.Comparator;

class track{ //tracker class
    private int LineCount =0; //count lines with this variable, initially set to 0
    private int CharCount = 0; //count characters with this variable, initially set to 0
    private String LongestWord=""; //read the longest word
    private int WordCount =0; //count words with this variable, initially set to 0
    boolean Check(String line) {
        return !line.equals("stop"); //return result until read "stop"

    }
    void CharCounter(String line){CharCount +=line.length();} //increase number of characters with length of line
    void LineCounter(){LineCount += 1;} //increase number of lines
    void LongestWord(String s){
        String[] word = s.split("\\s+");
        String _Longest= "";
        for(int i = 0; i < word.length; i++){
            if(word[i].length() >= _Longest.length()){
                _Longest = word[i];
            }
        }
        if (_Longest.length()>LongestWord.length()){LongestWord=_Longest;} //read and compare the words one by one, the longest will be shown
    }
    void WordCounter(String line){
        WordCount += line.split("\\s+").length;
    } //count words from each line and add them together
    int GetChar(){
        return CharCount;
    } //return result of counting characters
    int GetLine(){
        return LineCount;
    } //return result of counting lines
    String GetLongestWord(){
        return LongestWord;
    } //return result of the longest word
    int GetWords(){
        return WordCount;
    } //return result of counting words
    boolean isStop(){
        return stop;
    }
    void setStop(){
        stop=true;
    }
    private boolean stop = false;


}
