import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Lion> enclosure = new ArrayList<>();
//        enclosure.add(new Lion(12));
//        enclosure.add(new Lion(18));
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

}

class Lion extends Animal { //implements Comparable<Lion> {
    private Integer age;

    public Lion(int age){
        this.age = age;
    }

//    @Override
//    public int compareTo(Lion other) {
//        return age.compareTo(other.age);
//    }
}

class Zebra extends Animal { //implements Comparable<Zebra>{
    private Integer age;

    public Zebra(int age){
        this.age = age;
    }

//    @Override
//    public int compareTo(Zebra other) {
//        return age.compareTo(other.age);
//    }
}

