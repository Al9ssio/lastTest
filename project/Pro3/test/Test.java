import static org.junit.Assert.*;

public class Test { //main class

    read reader = new read(); // create a reader object
    track track = reader.tracker; // create a tracker object

    @org.junit.Test
    public void GetChar() {
        String lines = "hi this is for test one\nfinally i did it\nthis is for last\nstop"; //store each line
        reader.get_results(lines); //call get_results method from reader class
        assertEquals(44, track.GetChar()); //expected number of characters to be confirmed by running the test

    }

    @org.junit.Test
    public void GetLine() {
        String lines = "In June, Diane visited her friends who live in San Francisco, California\nThis was Diane’s first time in the city, and she enjoyed her opportunities to walk around and explore.\nOn the first day of her trip, Diane visited the Golden Gate Bridge\nstop";
        reader.get_results(lines); //call get_results method from reader class
        assertEquals(3, track.GetLine()); //expected number of lines to be confirmed by running the test

    }

    @org.junit.Test
    public void GetWord() {
        String lines = "Recursive Algorithm A recursive algorithm is based on recursion . In this case, a problem is broken into several sub-parts and called the same function again and again.\nBrute Force Algorithm It is the simplest approach for a problem. A brute force algorithm is the first approach that comes to finding when we see a problem.\nHashing Algorithm Hashing algorithms work similarly to the searching algorithm. But they contain an index with a key ID. In hashing, a key is assigned to specific data.\nGreedy Algorithm In this type of algorithm the solution is built part by part. The solution of the next part is built based on the immediate benefit of the next part.\nstop";
        reader.get_results(lines); //call get_results method from reader class
        assertEquals(115, track.GetWords()); //expected number of words to be confirmed by running the test


    }

    @org.junit.Test
    public void GetLongestWord() {
        String lines = "In June, Diane visited her friends who live in San Francisco, California\nThis was Diane’s first time in the city, and she enjoyed her opportunities to walk around and explore.\nOn the first day of her trip, Diane visited the Golden Gate Bridge\nstop";
        reader.get_results(lines); //call get_results method from reader class
        assertEquals("opportunities", track.GetLongestWord()); //expected longest word to be confirmed by running the test

    }


}