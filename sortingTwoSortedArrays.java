import java.lang.*;
import java.io.*;
import java.util.*;

public class sortingTwoSortedArrays {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine().replace("N = ", "");
        String t2 = t.replace("M = ", "").replace(",", "").replace(" ", "");
        String a1 = br.readLine().replace("Arr1[] = {", "");
        String a11 = a1.replace(String.valueOf(a1.charAt(a1.length()-1)), "");
        String a2 = br.readLine().replace("Arr2[] = {", "");
        String a22 = a2.replace(String.valueOf(a2.charAt(a2.length()-1)), "");
        String[] size = t2.split("");
        String[] array1 = a11.split(",");
        String[] array2 = a22.split(",");
        ArrayList <Integer> array = new ArrayList<Integer>();
        for(int i=0; i<Integer.parseInt(size[0])+Integer.parseInt(size[1]); i++){
            if(i<Integer.parseInt(size[0])){

                array.add(Integer.parseInt(array1[i].trim()));
            }
            else{

                array.add(Integer.parseInt(array2[i-Integer.parseInt(size[0])].trim()));
            }

        }

        Collections.sort(array);

        String x = "";
        for(int i=0 ;i<array.size(); i++){
            x += array.get(i) + " ";
        }

        System.out.println(x);
    }
}
