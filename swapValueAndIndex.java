import java.util.*;
import java.util.Map.*;
import java.io.*;


public class swapValueAndIndex {
    public static void main(String[] args)throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] inputArray = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        int[] out = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            map.put(i, arr[i]);
        }

        for(int i=0; i<n; i++){
            out[arr[i]] = getKeyByValue(map, arr[i]);
        }
        System.out.println(Arrays.toString(out));

    }


    public static int getKeyByValue(HashMap<Integer,Integer> mm, int v){
        for (Entry<Integer, Integer> entry : mm.entrySet()) {
            if (entry.getValue().equals(v)) {
                return entry.getKey();
            }
        }
        return 0;
    }
    


}
