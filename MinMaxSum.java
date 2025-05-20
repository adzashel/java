import java.util.List;

public class MinMaxSum {
    public static  void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6};
        int minSum =0;
        int maxSum =0;

        for(int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
        }

        for(int i = 1; i < arr.length; i++) {
            maxSum += arr[i];
        }


        System.out.println(List.of(minSum , maxSum));
    }
}
