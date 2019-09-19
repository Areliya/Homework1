package Present;

public class Present {
    public static void main(String[] args) {
        Box box = new Box();
        int size = 7 + ((int)(5*Math.random()));
        for (int i = 0; i < size; i++) {
            int whichSweet = (int)(5*Math.random());
            switch (whichSweet){
                case 0:
                    box.addSweet(new Candy());
                break;
                case 1:
                    box.addSweet(new Chocolate());
                    break;
                case 2:
                    box.addSweet(new Jellybean());
                    break;
                case 3:
                    box.addSweet(new Toffee());
                    break;
                default:
                    box.addSweet(new Waffle());
                    break;
            }
        }
        box.myContainIs();
        box.myWeightIs();
        box.myPriceIs();
        box.reducePrice(3.55);
        box.myContainIs();
        box.myWeightIs();
        box.myPriceIs();
        box.reduceWeight(3.555);
        box.myContainIs();
        box.myWeightIs();
        box.myPriceIs();

    }
}
