import java.io.*;
import java.lang.*;
import java.util.*;

public class mergeSort {
    

    //constructor

    public void mergeSort(){
        System.out.println("Merge Sort");
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while(testCases-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] inputStringArray = br.readLine().split(" ");
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = Integer.parseInt(inputStringArray[i]);
            }

            sort(arr, 0, size - 1);

            printArray(arr);

        }
    }

    static void sort(int[] arr, int s, int e) {
        if(s<e){
            // Find the middle point 
            int m = (s + e) / 2; 
  
            // Sort first and second halves 
            sort(arr, s, m); 
            sort(arr, m + 1, e); 


            // Merge the sorted halves 
            merge(arr, s, m, e); 


            // System.out.println("s: "+s + "  m: "+m + "  e: "+e);


        }
    }


    static void merge(int[] ar, int s, int m, int e){

        // Find sizes of two subarrays to be merged 
        int n1 = m - s + 1; 
        int n2 = e - m; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2];
        
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i){
            L[i] = ar[s + i]; 
        } 
        for (int j = 0; j < n2; ++j){
            R[j] = ar[m + 1 + j]; 
        }

        int i = 0, j = 0, k= s; 

        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                ar[k] = L[i]; 
                i++; 
            } 
            else { 
                ar[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            ar[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            ar[k] = R[j]; 
            j++; 
            k++; 
        } 
        
    
    }


    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 



}
