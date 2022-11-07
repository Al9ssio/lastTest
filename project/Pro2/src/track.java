
public class track{ //tracker class
    private int LineCount = 0; //count lines with this variable, initially set to 0
    private int CharCount = 0; //count characters with this variable, initially set to 0
    private boolean stop = false;
    void CharCounter(String line){CharCount +=line.length();} //increase number of characters with length of line
    void LineCounter(){LineCount += 1;} //increase number of lines
    void setStop(){
        stop=true;
    }
    int GetChars() {//return number of chars
        return CharCount;
    } //return result of counting characters
    int GetLines() {//return number of lines
        return LineCount;
    } //return result of counting lines
    boolean isStop(){
        return stop;
    }
}
