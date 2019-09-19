package Present;

public class Chocolate extends Sweet {
    public Chocolate() {
        idCounter++;
        this.id = idCounter;
        this.name = "Chocolate" + this.id;
        this.weight = 0.01 + Math.random();
        this.price = 0.01 + Math.random();
    }
}
