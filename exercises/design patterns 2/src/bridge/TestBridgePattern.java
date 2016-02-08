package bridge;

public class TestBridgePattern {
    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        System.out.println();
        car = new Motoren(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}

/*
Producing Central Locking System
Modifying product Central Locking System according to BigWheel xz model
Assembling Central Locking System for BigWheel xz model
Car: BigWheel xz model, Product:Central Locking System
Producing Gear Locking System
Modifying product Gear Locking System according to BigWheel xz model
Assembling Gear Locking System for BigWheel xz model
Car: BigWheel xz model, Product:Gear Locking System
Producing Central Locking System
Modifying product Central Locking System according to Motoren lm model
Assembling Central Locking System for Motoren lm model
Car: Motoren lm model, Product:Central Locking System
Producing Gear Locking System
Modifying product Gear Locking System according to Motoren lm model
Assembling Gear Locking System for Motoren lm model
Car: Motoren lm model, Product:Gear Locking System
 */