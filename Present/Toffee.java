package Present;

public class Toffee extends Sweet {
    public Toffee() {
        idCounter++;
        this.id = idCounter;
        this.name = "Toffee" + this.id;
        this.weight = 0.01 + Math.random();
        this.price = 0.01 + Math.random();
    }
}
