import java.util.*;
import java.io.*;
import java.io.*;

public class removeVowels {


    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] charArray = input.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i] != 'a' &&
            charArray[i] != 'e' &&
            charArray[i] != 'i' &&
            charArray[i] != 'o' &&
            charArray[i] != 'u' &&
            charArray[i] != 'A' &&
            charArray[i] != 'E' &&
            charArray[i] != 'I' &&
            charArray[i] != 'O' &&
            charArray[i] != 'U'){
                System.out.print(charArray[i]);
            }
        }
    }
}
