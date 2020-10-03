import java.util.*;
import java.io.*;
import java.lang.*;

public class alternateArrayArrangement {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        int testCases = Integer.parseInt(br.readLine());

        for(int i=0; i<testCases; i++){
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[x];
            for(int j=0; j<x; j++){
                arr[j] = Integer.parseInt(input[j]);
            }
            String ans = computer(arr, x);
            System.out.println(ans);
        }
    }



    private static String computer(int[] arr, int n){

        int end = n - 1;
        int start = 0;
        boolean flag = false;

        int[] farr = new int[n];

        for(int i=0; i<n; i++){
            if(!flag){
                farr[i] = arr[end--];
            }
            else if(flag){
                farr[i] = arr[start++];
            }
            flag = !flag;
        }

        String o = Arrays.toString(farr).replace("[", "");
        String ou = o.replace("]", "");
        String outt = ou.replace(",", "");
        return outt;
    }
}
