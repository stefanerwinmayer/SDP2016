package strategy;

import java.util.Random;

public class Demo {

    private Sorter mSorter;

    public Demo(Sorter s) {
        mSorter = s;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        MergeSort ms = new MergeSort();
        //BubbleSort bs = new BubbleSort();

        Demo d = new Demo(ms);

        // Setup data
        int[] array = new int[30000];
        Random r = new Random();
        for (int i = 0; i < 30000; i++) array[i] = r.nextInt();

        // Sort!
        System.out.println("Starting...");
        int[] result = d.go(array);
        System.out.println("Done");
    }

    public int[] go(int[] array) {
        mSorter.Sort(array);
        return array;
    }

}
