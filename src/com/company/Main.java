package com.company;

public class Main {

    public static void main(String[] args) {
	Pet henry = new Pet("Henry", 2, "Buford", "Dog");
    henry.setLocation("United States");

    System.out.printf("name: %s/n", henry.getName());
    System.out.printf("age: %d/n", henry.getAge());
    System.out.printf("type: %s/n", henry.getType());


    Guitar myGuitar = new Guitar(6, "Fender", "Maple");
    System.out.println(myGuitar.strums(6));
    }
}
