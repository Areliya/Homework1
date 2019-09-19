package Present;

public class Jellybean extends Sweet {
    public Jellybean() {
        idCounter++;
        this.id = idCounter;
        this.name = "Jellybean" + this.id;
        this.weight = 0.01 + Math.random();
        this.price = 0.01 + Math.random();
    }
}
