import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String args[]){
        //You are given 9 pool balls. They all appear exactly the same in color and size. There
        //are no distinguishing characteristics between each ball, however - 1 of the 9 balls 
        //is heavier than all the rest. You have at your disposal a 2 sided scale to determine
        //which ball is heavier
        
        //Your task? Find the heavy ball with the least amount of measurements
      
        ArrayList<Ball> ballList = new ArrayList<>();
        for(int i=0; i<9; i++){
            ballList.add(createBall(i, i != 2?1:2));
        }
        ballList.forEach((b) -> System.out.println(b.toString()));

        List<Ball> list1 = ballList.subList(0, 3);
        List<Ball> list2 = ballList.subList(3, 6);
        List<Ball> list3 = ballList.subList(6, 9);
        
        ScalesOfJustice scales = new ScalesOfJustice();
        List<Ball> heavyList = scales.measureBallList(list1, list2);
        if(heavyList == null){
            //this means these lists dont have a heavy ball. We have one list left, list3!
            findHeavyBall(scales, list3);
            System.out.println("This operation took " + scales.getMeasurements() + " measurements!");
            System.exit(0);
        }
        else{
            findHeavyBall(scales, heavyList);
            System.out.println("This operation took " + scales.getMeasurements() + " measurements!");
            System.exit(0);
        }
      }

      private static void findHeavyBall(ScalesOfJustice scales, List<Ball> heavyList){
        Ball heavyBall = scales.measureBalls(heavyList.get(0), heavyList.get(1));
        if(heavyBall == null){
            heavyBall = heavyList.get(2);
            System.out.println("The heavy ball is ID: " + heavyBall.getId() + ". This ball weighs " + heavyBall.getWeight());
            
        }
        else{
            System.out.println("The heavy ball is ID: " + heavyBall.getId() + ". This ball weighs " + heavyBall.getWeight());
        }
            
      }

      private static Ball createBall(int id, int weight){
        Ball ball = new Ball(id, weight);
        return ball;
      }

      
}
