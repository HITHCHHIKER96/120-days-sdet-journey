import java.util.*;

public class Myclass {
    public static void main(String[] args){
        // System.out.println("Hello");
        int[] arr = {23, 6, 87, 10};
        System.out.println(Arrays.toString(arr));
        changeMe(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeMe{
        arr[0] = 3;
    }
}
