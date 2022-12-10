import java.io.*;
import java.util.*;


public class Scores {
    static int highest;
    static int last;

    public static void ScoreReader() throws FileNotFoundException {
        Scanner input = new Scanner(new File("Score.txt"));
        highest = input.nextInt();
        last = input.nextInt();
    }
    public static void ScoreUpdate() {
        
    }

    public static int HighScore() {
        return highest;
    }
    public static int LastScore() {
        return last;
    }
    
}
