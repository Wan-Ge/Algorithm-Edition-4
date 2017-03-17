import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by WanGe on 2017/3/17.
 */
public class Client extends Sort{

    public static void unitTest() {
        //Just for test and draw one array
        DrawTrack t = new DrawTrack(){};
        int N = 40;
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(2.0, 50.0);
        MergeSort(a);                 //Modify the sort method that you want to see
        assert isSorted(a);
        show(a);
    }

    public static void comparisonTest() {
        SortCompare t = new SortCompare();
        double t1 = t.timeRandomInput("ShellSort", 100, 100000);
        System.out.println("ShellSort: " + t1);

        double t2 = t.timeRandomInput("MergeSort", 100, 100000);
        System.out.println("MergeSort: " + t2);

        System.out.printf("%.1f times faster than ShellSort\n", t2/t1);
    }

    public static void main(String[] args) {
        unitTest();
        //comparisonTest();
    }
}
