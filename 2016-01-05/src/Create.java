import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of class: ");
        String str = sc.next();

        try {
            Class cl = Class.forName(str);
            Object o = cl.newInstance();
            System.out.println(o);

        } catch (Exception ex) {
        }

    }
}

class A {
    @Override
    public String toString(){
        return "I am an " + getClass().getName();
    }
}