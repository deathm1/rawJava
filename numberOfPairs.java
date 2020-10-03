import java.util.*;
import java.lang.*;
import java.io.*;

public class numberOfPairs {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine().trim());

        while(testCases-- > 0){
            String[] inputLine  = br.readLine().trim().split(" ");
            int m = Integer.parseInt(inputLine[0]);
            int n = Integer.parseInt(inputLine[1]);

            int[] X = new int[m];
            int[] Y = new int[n];

            inputLine = br.readLine().trim().split(" ");

            for(int i=0; i<m; i++){
                X[i] = Integer.parseInt(inputLine[i]);
            }


            inputLine = br.readLine().trim().split(" ");

            for(int i=0; i<m; i++){
                Y[i] = Integer.parseInt(inputLine[i]);
            }



            int ans = new Solution().countPairs(X,Y,m,n);
            System.out.println(ans);
        }
    }
    
}   


class Solution{

    static int count(int x, int Y[], int n, int NoOfY[]) 
    { 
        // If x is 0, then there cannot be any value in Y such that 
        // x^Y[i] > Y[i]^x 
        if (x == 0) return 0; 
       
        // If x is 1, then the number of pais is equal to number of 
        // zeroes in Y[] 
        if (x == 1) return NoOfY[0]; 
       
        // Find number of elements in Y[] with values greater than x 
        // getting upperbound of x with binary search 
        int idx = Arrays.binarySearch(Y, x); 
        int ans; 
        if(idx < 0){ 
            idx = Math.abs(idx+1); 
            ans = Y.length - idx; 
        } 
        else{ 
            while (idx<n && Y[idx]==x) { 
                idx++; 
            } 
            ans = Y.length - idx; 
        } 
       
        // If we have reached here, then x must be greater than 1, 
        // increase number of pairs for y=0 and y=1 
        ans += (NoOfY[0] + NoOfY[1]); 
       
        // Decrease number of pairs for x=2 and (y=4 or y=3) 
        if (x == 2)  ans -= (NoOfY[3] + NoOfY[4]); 
       
        // Increase number of pairs for x=3 and y=2 
        if (x == 3)  ans += NoOfY[2]; 
       
        return ans; 
    } 



    // Function to return count of pairs (x, y) such that 
    // x belongs to X[], y belongs to Y[] and x^y > y^x 

    int countPairs(int[] X, int[] Y, int m, int n){
        int out = 0;

        // System.out.println(Arrays.toString(X));
        // System.out.println(Arrays.toString(Y));
        // System.out.println(m);
        // System.out.println(n);


        

        int[] NoOfY = new int[m+n]; 

        for (int i = 0; i < n; i++){
            if (Y[i] < 5){
                NoOfY[Y[i]]++; 
            } 
        }

        Arrays.sort(Y);

        // Take every element of X and count pairs with it 
        for (int i=0; i<m; i++) {
            out += count(X[i], Y, n, NoOfY); 
        }



        return out;
    }
}
