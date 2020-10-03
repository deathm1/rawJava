import java.util.*;

import java.io.*;
import java.lang.*;

public class completeCell{

    //for first and last cell consider 0] 1 0 1 1 1 1 [0

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().trim().split(" ");
        int[] arr = new int[inputArray.length+2]; 

        arr[0] = 0;
        arr[arr.length-1] = 0;

        for(int i=1 ; i<inputArray.length; i++){
            arr[i] = Integer.parseInt(inputArray[i-1]);
        }
        int numberOfDays = Integer.parseInt(br.readLine()); 

        int[] save = new int[arr.length-2];

        while(numberOfDays-- > 0){
            for(int j=1; j<arr.length-1; j++){
                if(arr[j-1] == arr[j+1]){
                    save[j-1] = 0;
                }
                else {
                    save[j-1] = 1;
                }
            }
        }
        for(int i=0; i<save.length; i++){
            System.out.print(save[i] +" ");
        }

        arr = save;
    }
}