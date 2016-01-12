public class TestReflection {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        MyClass my = new MyClass();
//        System.out.println(my);


//        try {
//            Class c = Class.forName("MyClass");
//            Object o = c.newInstance();
//            System.out.println(o);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Class c = my.getClass();
        Object o = c.newInstance();
        System.out.println(o);


    }
}

class MyClass {
    @Override
    public String toString() {
        return "I am a " + this.getClass().getName();
    }
}