package Present;

public class Box implements WhatCanWeDo{
    private double weightOfBox = 0.0;
    private double priceOfBox = 0.0;
    private Sweet[] list = new Sweet[10];
    int size = 0;

    @Override
    public void addSweet(Sweet sweet) {
        if (size < list.length){
            list[size] = sweet;
            weightOfBox += sweet.getWeight();
            priceOfBox += sweet.getPrice();
            size++;
        }
        else {
            System.out.println("Too many sweets!");
        }
    }

    @Override
    public void deleteSweet(int id) {
        if (id < size) {
            weightOfBox -= list[id].getWeight();
            priceOfBox -= list[id].getPrice();
            size--;
            for (int i = id; i < size; i++) {
                list[i] = list[i+1];
            }
        }
        else {
            System.out.println("The box doesn't have so many sweets!");
        }
    }

    @Override
    public void deleteSweet() {
        if (size>0){
            size--;
            weightOfBox -= list[size].getWeight();
            priceOfBox -= list[size].getPrice();
        }
        else {
            System.out.println("The box is empty!!!");
        }
    }

    @Override
    public void myWeightIs() {
        System.out.format("The weight of the box is %.3f%n", weightOfBox);
    }

    @Override
    public void myPriceIs() {
        System.out.format("The price of the box is %.2f%n", priceOfBox);
    }

    @Override
    public void myContainIs() {
        if (size > 0){
            System.out.println("The box contains:");
            for (int i = 0; i < size; i++) {
                System.out.println(list[i].getName());
            }
        }
        else {
            System.out.println("The box doesn't contain anything.");
        }
    }

    void reduceWeight(double weight){
        if ((weight > 0) && (size > 0)) {
            while ((weight < weightOfBox)&&(size>0)) {
                int lessWeight = 0;
                for (int i = 1; i < size; i++) {
                    if (list[i].getWeight() < list[lessWeight].getWeight()) {
                        lessWeight = i;
                    }
                }
                deleteSweet(lessWeight);
            }
        } else {
            System.out.println("Life without sweets is meaningless. Cannot be done.");
        }
    }
    void reducePrice(double price){
        if ((price > 0) && (size > 0)) {
            while ((price < priceOfBox)&&(size>0)) {
                int lessPrice = 0;
                for (int i = 1; i < size; i++) {
                    if (list[i].getPrice() < list[lessPrice].getPrice()) {
                        lessPrice = i;
                    }
                }
                deleteSweet(lessPrice);
            }
        } else {
            System.out.println("Life without sweets is senseless. Cannot be done.");
        }
    }

}
