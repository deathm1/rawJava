import java.io.*;
import java.lang.*;

public class getMissing {
    

    public static void main(String[] args) throws IOException{



        //Using this method increases the efficiency of the program
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        for(int i=0; i<testCases; i++){

            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");

            int sum = 0;

            int naturalSum = ((n*(n+1)))/2;

            for(int j = 0; j<str.length; j++){
                sum += Integer.parseInt(str[j]);
            }
            System.out.println(naturalSum-sum);
        }

    }
}
