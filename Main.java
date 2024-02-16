import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        ArrayList<Integer> bluePucks = new ArrayList<>(Arrays.asList(4,7,8,9));
        ArrayList<Integer> redPucks = new ArrayList<>(Arrays.asList(8,10,13,17));
        System.out.println(new Score(bluePucks, redPucks));
    }
}
