package Array_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Notes_Array_ArrayList {
    public static void main(String[] args) {

        //Syntax
        //datatype[] variable_name = new datatype[size]

        //store 5 roll No.
//        int [] rollNo = new int[5];

        //or directly
//        int [] rollNo = {1, 2, 3, 4, 5};

        //We can store only one type of datatype in an Array.
        //Eg. below - this will give errors.
//        int [] arr = {1, 3, 5, "Nidhi", true};

        int [] n; //Declaration, n is getting defined.
        //size have to be mentioned in initialization.
        n = new int[5]; //initialization : actually here the object is being created in heap memory.

        //input for Arrays
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }

        //Arrays.toString Method.
        System.out.println(Arrays.toString(arr));

        //for String Input
        sc.next();


         /*int[][]arr = new int[3][];

        //Giving the no. of columns in Jagged Arrays.
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[2];


        //Taking Input for 2D Jagged Arrays

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //Output for 2D Jagged Arrays

        //Method 1

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Method 2

        for (int row = 0; row < arr.length ; row++) {
                System.out.println(Arrays.toString(arr[row]));
        }

        //Method 3

        for (int [] a: arr) {
            System.out.println(Arrays.toString(a));
        }*/


        //ArrayLists Input

      /*  ArrayList<Integer> AL = new ArrayList<>();

        int n = 5;
        for (int i = 0; i < n; i++) {
            AL.add(sc.nextInt());
        }
        System.out.println(AL);
*/


        //Multidimensional Array

        /*ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);*/



    }
}
