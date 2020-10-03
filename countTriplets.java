import java.util.*;
public class countTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        do{
            int x = Integer.parseInt(sc.nextLine());
            String[] a = sc.nextLine().split(" ");
            int[] arr = new int[a.length];
            for(int i=0; i<arr.length; i++){
                arr[i] = Integer.parseInt(a[i]);
            }
            int answer = checkTriplets(arr, x);
            System.out.println(answer);
            testCases--;
        }
        while(testCases>0);
    }


    private static int checkTriplets(int[] array, int n){
        int out = 0;
        HashMap<Integer,Integer> c = new HashMap<Integer, Integer>(n);
        for(int i=0; i<n; i++){c.put(array[i],i);}
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(c.containsKey( array[i] + array[j])){
                    out +=1;
                }
            }
        }
        if(out == 0){
            out = -1;
        }
        return out;
    }


}
