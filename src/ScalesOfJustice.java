import java.util.List;

public class ScalesOfJustice {

    public int measurements = 0;

    public ScalesOfJustice(Ball b1, Ball b2){

    }

    public ScalesOfJustice(List<Ball> b1, List<Ball> b2){
        
    }

    public ScalesOfJustice() {
    }

    Ball measureBalls(Ball b1, Ball b2){
        measurements++;
        if(b1.getWeight() == b2.getWeight()){
            //balls weight same, no heavy ball
            return null;
        }
        if (b1.getWeight() > b2.getWeight()){
            return b1;
        }
        return b2;
    }

    List<Ball> measureBallList(List<Ball> b1, List<Ball> b2){
        measurements++;
        int list1TotalWeight = 0;
        int list2TotalWeight = 0;

        list1TotalWeight = getTotalWeight(b1);
        list2TotalWeight = getTotalWeight(b2);
        
        if(list1TotalWeight == list2TotalWeight){
            return null;
        }
        if(list1TotalWeight > list2TotalWeight){
            return b1;
        }
        return b2;
    }

    private static int getTotalWeight(List<Ball> ballList){
        //this is one measurement
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
