package Present;

public class Waffle extends Sweet {
    public Waffle() {
        idCounter++;
        this.id = idCounter;
        this.name = "Waffle" + this.id;
        this.weight = 0.01 + Math.random();
        this.price = 0.01 + Math.random();
    }
}
