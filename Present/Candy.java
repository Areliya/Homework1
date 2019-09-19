package Present;

public class Candy extends Sweet {

    public Candy() {
        idCounter++;
        this.id = idCounter;
        this.name = "Candy" + this.id;
        this.weight = 0.01 + Math.random();
        this.price = 0.01 + Math.random();
    }

}
