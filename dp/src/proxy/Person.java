package proxy;

public class Person implements PersonInterface {

    private String mName;
    private float mWeight;

    public Person(String name, float weight) {
        mName = name;
        mWeight = weight;
    }

    @Override
    public float getWeight() {
        // Assume we weigh ourselves here
        return mWeight;
    }

    @Override
    public String getName() {
        return mName;
    }

}
