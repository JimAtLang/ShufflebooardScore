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
        int longestBlue = 0;
        for(int puck:bluePucks){
            if (puck > longestBlue){
                longestBlue = puck;
            }
        }
        int longestRed = 0;
        for(int puck:redPucks){
            if (puck > longestRed){
                longestRed = puck;
            }
        }
        if(longestBlue>longestRed){
            this.color = "blue";
            for(int puck:bluePucks){
                this.score+=scorePuck(puck);
            }
        } else if (longestRed>longestBlue) {
            this.color = "red";
            for(int puck:redPucks){
                this.score+=scorePuck(puck);
            }
        }
    }
    public int scorePuck(int puck){
        if (puck < SHORTFOULLINE){
            return 0;
        }
        if(puck < TWOPOINTLINE){
            return 1;
        }
        if(puck<THREEPOINTLINE){
            return 2;
        }
        if(puck<LONGFOULLINE){
            return 3;
        }
        return 0;
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
        return "Score: " + this.score + " Color " + this.color;
    }
}
