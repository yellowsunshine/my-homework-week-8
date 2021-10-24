package homework;

public class Q17Carpet {
    double cost;

    Q17Carpet (double cost){
        if (cost <0){
            this.cost = cost = 0;
        }
        this.cost=cost;
    }

    public double getCost(){
        return this.cost;
    }
}
