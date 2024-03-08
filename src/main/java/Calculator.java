public class Calculator {
    int howManyPals;

    public void addPals(int howManyPals) {
        this.howManyPals = howManyPals;
    }

    public Double split(Double total, int pals) {
        return total / pals;
    }

    public int returnPals() {
        return howManyPals;
    }
}
