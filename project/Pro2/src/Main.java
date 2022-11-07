import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String line ; //store each line in this variable
        String[] Words; //store words
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //class that helps to read the lines in a character based input, helps read the data line by line
        track tr = new track();
        while (true){
            line = br.readLine(); //read a line
            if (!line.equals("stop")) { //check if written stop
                tr.LineCounter(); //count lines
                tr.CharCounter(line); //count characters
            }
            else if (line.equals("stop")){
                break; //read line until read stop
            }

        }
        System.out.println("" + tr.GetLines() + " lines, " + tr.GetChars() + " chars"); //print out the results, number of lines and number of characters
    }
}