import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main (String args[]){
        
      
        Random rand = new Random();
        int randomInt = rand.nextInt(9);

        //Create list of balls
        //Randomly pick one of them to have a larger weight
        ArrayList<Ball> ballList = new ArrayList<>();
        for(int i=0; i<9; i++){
            ballList.add(createBall(i, i != randomInt?1:1000));
        }
        //Print out the list of balls
        ballList.forEach((b) -> System.out.println(b.toString()));

        ScalesOfJustice scales = new ScalesOfJustice();
        Ball heavyBall = new Ball(); // hint: this should be set to the result of the findHeavyBall() method below

        //Implement me!
         
        System.out.println("The heavy ball is ID: " + heavyBall.getId() + ". This ball weighs " + heavyBall.getWeight());
      }

      /*
       * Takes a list of balls as a param
       * Calls measureBalls to determine which ball is the heavy ball and returns it
       */
      private static Ball findHeavyBall(ScalesOfJustice scales, List<Ball> heavyList){
        Ball heavyBall = scales.measureBalls(heavyList.get(0), heavyList.get(1));
        
        //Implement me!

        return heavyBall;
      }

      private static Ball createBall(int id, int weight){
        Ball ball = new Ball(id, weight);
        return ball;
      }
      
}
