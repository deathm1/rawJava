import java.util.*;

public class kdanesAlgorithm{
    static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        launcher(testCases);
    }


    private static void launcher(int n){
        if(n>0){
            int x = Integer.parseInt(sc.nextLine());
            String[] a = sc.nextLine().split(" ");
            int[] arr = new int[x];
            for(int i=0; i<x; i++){
                arr[i] = Integer.parseInt(a[i]);
            }
            int out = checkKadense(arr, x);
            System.out.println(out);

            n = n - 1;
            launcher(n);
        }
    }



    private static int checkKadense(int[] arr, int n){
        int out = 0;
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;


        for(int i=0; i<n; i++){

            System.out.print(localMax + " ");
            System.out.println(globalMax);


            localMax = Math.max(arr[i], arr[i] + localMax);
            if(localMax > globalMax){
                globalMax = localMax;

                System.out.print(localMax+ " ");
                System.out.println(globalMax);

                System.out.println("");
            }
        }


        out = globalMax;
        return out;
    }
}