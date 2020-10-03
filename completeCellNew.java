import java.io.*;
import java.util.*;


import java.lang.*;

public class completeCellNew {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().trim().split(" ");
        int[] arr1 = new int[inputArray.length+2]; 
        arr1[0] = 0;
        arr1[arr1.length-1]=0;
        int noOfDays = Integer.parseInt(br.readLine());

        for(int i=1; i<arr1.length-1; i++){
            arr1[i] = Integer.parseInt(inputArray[i-1]);
        }
        int[] out = new int[arr1.length-2];
        while(noOfDays-- > 0){
            int[] saveState = arr1;

            for(int i=1; i<saveState.length-1; i++){
                if(saveState[i-1] == saveState[i+1]){
                    out[i-1] = 0;
                }
                else{
                    out[i-1] = 1;
                }
            }


            for(int i=1; i<saveState.length-1; i++){
                saveState[i] = out[i-1];
            }
        }

        System.out.println(Arrays.toString(out).replace(",", "").replace("[", "").replace("]", ""));

    }
}
