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
        int longestRed = 0;
        for(int i=0;i<4;i++){
            int bluePuck = bluePucks.get(i);
            if (longestBlue<bluePuck && bluePuck > SHORTFOULLINE && longestBlue < LONGFOULLINE){
                longestBlue = bluePuck;
            }
            int redPuck = redPucks.get(i);
            if(longestRed<redPuck && redPuck > SHORTFOULLINE && longestBlue < LONGFOULLINE){
                longestRed = redPuck;
            }
        }
        //System.out.println("Longest blue: " + longestBlue + " Longest red: " + longestRed);
        if(longestBlue>longestRed){
            this.color = "blue";
            for(int puck : bluePucks){
                if(puck > longestRed && puck < LONGFOULLINE){
                    if(puck < SHORTFOULLINE){
                        score++;
                    }
                    if(puck > TWOPOINTLINE){
                        score++;
                    }
                    if(puck > THREEPOINTLINE){
                        score++;
                    }
                }
            }
        } else if (longestBlue == longestRed) {
            this.color = "";
        } else {
            this.color = "";
            for(int puck : bluePucks){
                if(puck > longestRed && puck < LONGFOULLINE){
                    if(puck < SHORTFOULLINE){
                        score++;
                    }
                    if(puck > TWOPOINTLINE){
                        score++;
                    }
                    if(puck > THREEPOINTLINE){
                        score++;
                    }
                }
            }
        }
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
