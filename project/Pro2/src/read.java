
public class read { //reader class
    track tracker = new track(); // create tracker object
    void get_results(String text) {
        String[] lines = text.split("\n"); // store each line, lines split by "\n"

        for(int i = 0; i < lines.length; i++) {
            String selectedline= lines[i].replace(" ",""); //space is replaced, not counted
            if (selectedline.equals("stop")){
                tracker.setStop();
                break;
            }
            tracker.CharCounter(selectedline); //count characters
            tracker.LineCounter(); //count lines
        }
    }
}
