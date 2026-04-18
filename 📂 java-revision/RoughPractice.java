import java.util.*;

public class Myclass {
    public static void main(String[] args){
        // System.out.println("Hello");
        int[] arr = {23, 6, 87, 10};
        System.out.println(Arrays.toString(arr));
        changeMe(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeMe(int[] arr){
        arr[0] = 3;
    }   /// That is why arrays are mutable in Java as you can chnage it after is created.

    // Now lets see 2D Arrays:
    int[][] arr = new int[][]; // so here is [][] defined by 2d arrays and most important is 
}
