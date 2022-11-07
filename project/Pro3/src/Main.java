import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String line ; //store each line in this variable
        String[] Words; //store words
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //class method that helps read the lines
        track tr = new track(); // create tracker object
        while (true){
            line = br.readLine(); //read lines
            if (!line.equals("stop")) { //check if written "stop"
                tr.WordCounter(line); //count words
                tr.LineCounter(); //count lines
                tr.CharCounter(line); //count characters
                tr.LongestWord(line); //check longest word
            }
            else if (line.equals("stop")){ //read line until read "stop"
                break;
            }

        }
        System.out.println("" + tr.GetLine() + " lines, " + tr.GetChar() + " chars, " + tr.GetWords()+ " words, longest word is " + tr.GetLongestWord());
    } // print out results
}
