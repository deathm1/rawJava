import java.util.*;
import java.io.*;
import java.io.*;
public class printPrimeNumber {

    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        for(int i=2; i<=n; i++){
            int flag = 0;
            for(int j=2; i<=i/2; j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }


            if(flag == 0){
                System.out.print(i + " ");
            }
        }
    }
}
