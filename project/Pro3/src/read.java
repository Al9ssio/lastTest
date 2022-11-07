import javax.sound.midi.Track;

public class read { //create reader class
    track tracker = new track(); // create tracker object
    void get_results(String text) {
        String[] lines = text.split("\n"); // store each line, lines split by "\n"
        for(int i = 0; i < lines.length; i++) {
            if (lines[i].equals("stop")){
                tracker.setStop();
                break;
            }
            tracker.WordCounter(lines[i]); //count words
            String selectedline= lines[i].replace(" ",""); //space is replaced, not counted
            tracker.CharCounter(selectedline); //count characters in selected line
            tracker.LineCounter(); //count lines
            tracker.LongestWord(lines[i]); //read the longest word
            }
        }
    }

