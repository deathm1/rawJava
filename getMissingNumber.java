import java.util.*;

public class getMissingNumber{

    static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        do{
            int size = Integer.parseInt(sc.nextLine());
            String[] input = sc.nextLine().split(" ");
            LinkedList<Integer> arrayIn = new LinkedList<Integer>();
            for(int i=0; i<input.length; i++){arrayIn.add(Integer.parseInt(input[i]));}
            int answer = computer(arrayIn,size);
            System.out.println(answer);
            testCases--;
        }
        while(testCases>0);
    }



    private static int computer(LinkedList<Integer> array, int size){
        int out = 0;
        for(int i=1; i<=size; i++){
            if(!array.contains(i)){
                out = i;
            }
        }


        return out;
    }
}