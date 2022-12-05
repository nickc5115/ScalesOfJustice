import java.util.List;

public class ScalesOfJustice {

    public int measurements = 0;

    public ScalesOfJustice(Ball b1, Ball b2){

    }

    public ScalesOfJustice(List<Ball> b1, List<Ball> b2){
        
    }

    public ScalesOfJustice() {
    }

    /*
     * This counts as 1 measurement each time this method is called
     */
    Ball measureBalls(Ball b1, Ball b2){
        measurements++;

        //Implement me!

        return null;
    }

    /*
     * This counts as 1 measurement each time this method is called
     */
    List<Ball> measureBallList(List<Ball> b1, List<Ball> b2){
        measurements++;
                
        //Implement me!
    
        return null;
    }

    //Helper method to total up the weight of a list of Balls
    private static int getTotalWeight(List<Ball> ballList){
        int total = 0;
        for(Ball b : ballList){
            total += b.getWeight();
        }

        return total;
      }

    public int getMeasurements(){
        return this.measurements;
    }
    
}
