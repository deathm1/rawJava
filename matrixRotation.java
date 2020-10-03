import java.util.*;

import java.io.*;
import java.lang.*;

public class matrixRotation {
    public static void main(String[] args)throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] para = br.readLine().trim().split(" ");

        int[][] matrixStart = new int[Integer.parseInt(para[0])][Integer.parseInt(para[1])];
        int[][] matrixEnd = new int[Integer.parseInt(para[0])][Integer.parseInt(para[1])];
        //Fill Matrix


        int size = Integer.parseInt(para[0]);

        for(int i=0; i<Integer.parseInt(para[0]); i++){
            String[] currentRow = br.readLine().trim().split(" ");
            for(int j=0; j<Integer.parseInt(para[1]); j++){
                matrixStart[i][j] = Integer.parseInt(currentRow[j]);
            }
        }


        if(Integer.parseInt(para[2]) == 1){
            System.out.println("Rotating right...");

            //00 01 02	20 10 00
            //10 11 12	21 11 01
            //20 21 22	22 12 02


            int cx = 0;
            for(int j = 0; j < size; j++) {
                int var = size-1;
                for(int k = 0; k < size; k++) {
                    matrixEnd[j][k] = matrixStart[var][cx];
                    var--;
                }
                cx++;
            }




        }
        else if(Integer.parseInt(para[2]) == 0){
            System.out.println("Rotating left...");


            //00 01 02		02 12 22
            //10 11 12		01 11 21
            //20 21 22		00 10 20

            int count = size-1;
            for(int j = 0; j < size; j++) {
                for(int k = 0; k < size; k++) {
                    matrixEnd[j][k] = matrixStart[k][count];
                }
                count--;
            }


        }

        for(int i=0; i<Integer.parseInt(para[0]); i++){
            for(int j=0; j<Integer.parseInt(para[1]); j++){
                System.out.print(matrixEnd[i][j]+" ");
            }
            System.out.print("\n");
        }








    }
}
