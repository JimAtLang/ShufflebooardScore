import java.util.ArrayList;
public class Score {
    public static final int SHORTFOULLINE = 6;
    public static final int TWOPOINTLINE = 10;
    public static final int THREEPOINTLINE = 14;
    public static final int LONGFOULLINE = 16;
        private int score;
    private String color;
    public Score(int score, String color) {
        this.score = score;
        this.color = color;
    }
    public Score(ArrayList<Integer> bluePucks, ArrayList<Integer> redPucks){
        this.score = 0;
        this.color = "";
        //write code to find score here
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Score: " + this.score + " Color: " + this.color;
    }
}
