package classes;

public class Dice {
    private int count;
    private int sides;
    public Dice(int count, int sides) {
        this.count = count;
        this.sides = sides;
    }
    @Override
    public String toString() {
        return count + "d" + sides;
    }
    //gettery itp
}
