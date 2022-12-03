public class Ball {

    int weight;
    int id;

    public Ball(){

    }

    public Ball(int id, int weight){
        this.id = id;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "ID is: " + this.getId() + ". Weight is: " + this.getWeight() + ".";
    }
    
}
