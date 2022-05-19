package com.company;
import java.util.Scanner; //to get user input
import java.util.ArrayList; //to create an array list
import java.util.Arrays; // to create an array
public class Main {

    public static void main(String[] args) {

        /*********************************************
         *	MAIN PROGRAM:
         *********************************************/
            ArrayList<Integer> values = new ArrayList<Integer>();

            // Given a list of int, n, sort them using bubble sort.
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many numbers are you putting into the array? : ");
            int numOfValuesInArray = 0; //no need to initialize
            numOfValuesInArray = scanner.nextInt();

            System.out.println("You want to input " + numOfValuesInArray +
                    " values into the array.");

            System.out.println("\nEnter numbers into the array to be sorted. ");

            // int numInArr = 0; //not neccessary
            // numInArr = scanner.nextInt();

            //store user input value in array
            for (int i = 0; i < numOfValuesInArray; i++) {
                values.add(scanner.nextInt());
            }

            //create an array from the arraylist
            Integer[] arr = values.toArray(new Integer[0]);

            //print og array
            System.out.println("Original array from Array List is: " + values);

            //use bubbleSort method to sort the values of the array
            bubbleSortAction(arr);

            System.out.println("\nNew sorted array using bubble sort: " + Arrays.toString(arr));

            scanner.close();

        }
        private static void bubbleSortAction(Integer[] arr) {

            int exchange = 0;
            for (int m = 0; m < arr.length; m++) {
                for (int n = 1; n < (arr.length) - m; n++) {
                    if (arr[n - 1] > arr[n]) {
                        exchange = arr[n - 1];
                        arr[n - 1] = arr[n];
                        arr[n] = exchange;
                    }
                }
            }
        }
}
