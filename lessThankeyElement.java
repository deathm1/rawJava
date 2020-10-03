import java.util.*;
import java.io.*;
import java.io.*;

public class lessThankeyElement {
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] para = br.readLine().trim().split(" ");
        String[] inputArray = br.readLine().split(" ");

        int[] arr = new int[inputArray.length];

        int c = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < Integer.parseInt(para[1]) ){
                c++;
            }
        }
        System.out.println(c);

    }
}
