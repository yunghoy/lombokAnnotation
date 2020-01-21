import Model.*;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        print(System.out);
    }

    public static void print(PrintStream out) {
        out.println("Hello, World!");

        Dog dog = Dog.builder()
                .numOfLegs(4)
                .name("dog1")
                .build();
        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Dog Number of Legs: " + dog.getNumOfLegs());

        Cat cat = Cat.builder()
                .animal(Animal.builder()
                        .numOfLegs(3)
                        .name("cat1")
                        .build())
                .tag("catTag")
                .build();
        System.out.println("Cat Name: " + cat.getName());
        System.out.println("Cat Number of Legs: " + cat.getNumOfLegs());


        Tree tree = Oak.builder()
                .age(13)
                .name("treeName")
                .type("OakType")
                .build();
        System.out.println("Oak Name: " + tree.getName());
        System.out.println("Oak Age: " + tree.getAge());

        Girl girl = Girl.builder()
                .arms(2)
                .legs(2)
                .fingers(10)
                .build();
        System.out.println("Girl Arms: " + girl.getArms());
        System.out.println("Girl Legs: " + girl.getLegs());
        System.out.println("Girl Finger: " + girl.getFingers());

        Human human = Girl.builder()
                .arms(2)
                .legs(2)
                .fingers(10)
                .build();
        System.out.println("Girl Arms: " + human.getArms());
        System.out.println("Girl Legs: " + human.getLegs());
        System.out.println("Girl Finger: " + human.getFingers());

        Bmw bmw = Bmw.builder()
                .name("Peter")
                .wheels(4)
                .build();
        System.out.println("Bmw Name: " + bmw.getName());
        System.out.println("Bmw Wheels: " + bmw.getWheels());

        Vehicle vehicle = bmw;
        bmw.setName("test");
        System.out.println("Vehicle Bmw Name: " + vehicle.getName());
        System.out.println("Vehicle Bmw Wheels: " + vehicle.getWheels());
    }
}
