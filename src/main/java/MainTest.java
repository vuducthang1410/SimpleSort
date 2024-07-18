import sort.BubbleSort;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int[] arr ={1,4,2,6,8,9,7,5,3};
        Arrays.stream(bubbleSort.sortAscending(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(bubbleSort.sortAscending2(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(bubbleSort.sortDescending(arr)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(bubbleSort.sortDescending2(arr)).forEach(System.out::print);
    }
}
