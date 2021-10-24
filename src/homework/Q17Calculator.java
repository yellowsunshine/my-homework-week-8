package homework;

public class Q17Calculator {
    Q17Floor floor;
    Q17Carpet carpet;

    Q17Calculator(Q17Floor floor, Q17Carpet carpet){
        this.floor = floor;
        this.carpet=carpet;

    }

    public double getTotalCost(){
        double totalCost;
        totalCost = floor.getArea()* carpet.getCost();
        return totalCost;
    }

}
