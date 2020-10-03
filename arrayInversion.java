import java.util.*;
import java.io.*;
import java.lang.*;
public class arrayInversion {
    

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());
        while(testCases-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" "); 
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            int answer = mergeSortAndCount(arr, 0, n-1);
            System.out.println(answer);
        }
    } 

    public static int mergeSortAndCount(int[] arr, int l, int r){
        int count = 0; 
        if(l < r){
            int m = (l+r)/2;
            // Left subarray count
            //0 to the mid point 
            count += mergeSortAndCount(arr, l, m); 

            // Right subarray count
            //from mid point to end 
            count += mergeSortAndCount(arr, m + 1, r); 
            // Merge count
            //takes indexes from 0 to midpoint to end 
            count += mergeAndCount(arr, l, m, r); 
        }
        return count;
    }
    


    public static int mergeAndCount(int[] arr, int l, int m, int r){


        // Left subarray 
        int[] left = Arrays.copyOfRange(arr, l, m + 1); 

        // Right subarray 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 


        int i = 0, j = 0, k = l, swaps = 0; 

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else { 
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }


        }



        // Fill from the rest of the left subarray 
        while (i < left.length){
            arr[k++] = left[i++];
        }  
  
        // Fill from the rest of the right subarray 
        while (j < right.length){
            arr[k++] = right[j++];
        }



        return swaps;
    }

}
