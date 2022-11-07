import static org.junit.Assert.*;

public class Test { // main class
    read reader = new read(); // create a reader object
    track track = reader.tracker; //create a tracker object

    @org.junit.Test
    public void Getchars() {
        String lines="hi this is for test one\nfinally i did it\n this is for last\nstop"; //store each line
        reader.get_results(lines); //call get_results method from reader class
        assertEquals(44,track.GetChars());// expected result for characters to be confirmed when running the test
    }
    @org.junit.Test
    public void GetLine() {
        String lines="In June, Diane visited her friends who live in San Francisco, California\n This was Diane’s first time in the city, and she enjoyed her opportunities to walk around and explore.\nOn the first day of her trip, Diane visited the Golden Gate Bridge\nstop"; //store each line
        reader.get_results(lines); //call get_results method from reader class
        assertEquals(3,track.GetLines()); //expected result for lines to be confirmed when running the test
    }

    @org.junit.Test
    public  void isstop(){
        String lines="hi this is for test one\nfinally i did it\n this is for last\nstop"; //store each line
        reader.get_results(lines);
        assertEquals(true,track.isStop());
    }
}