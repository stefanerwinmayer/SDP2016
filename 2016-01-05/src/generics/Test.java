package generics;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<generics.Lion> enclosure = new ArrayList<>();
//        enclosure.add(new generics.Lion(12));
//        enclosure.add(new generics.Lion(18));
//        sort(enclosure);
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion(23));
        zoo.add(new Zebra(10));
        sort(zoo);
    }

    public static <A extends Comparable< ? super A>>
    void sort(List<A> list){
        throw new NotImplementedException();
    }
}



class Animal implements Comparable<Animal>{

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}

class Lion extends Animal { //implements Comparable<generics.Lion> {
    private Integer age;

    public Lion(int age){
        this.age = age;
    }

//    @Override
//    public int compareTo(generics.Lion other) {
//        return age.compareTo(other.age);
//    }
}

class Zebra extends Animal { //implements Comparable<generics.Zebra>{
    private Integer age;

    public Zebra(int age){
        this.age = age;
    }

//    @Override
//    public int compareTo(generics.Zebra other) {
//        return age.compareTo(other.age);
//    }
}

