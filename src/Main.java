import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {
//      1.Create an array to hold the numbers 1-10.
        int[] a = {1,2,3,4,5,6,7,8,9,10};

//      2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        System.out.println(sum);

//      3.Create an array to hold 10 number inputs from the user and print that total to the screen.
        sum = 0;
        a = new int[10];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        for (int i = 0; i <10 ; i++) {
            a[i] = keyboard.nextInt();
            sum += a[i];
        }
        System.out.println("sum = " +sum);

//      4.Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        sum = 0;
        double average;
        a = new int[10];
        keyboard = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        for (int i = 0; i <10 ; i++) {
            a[i] = keyboard.nextInt();
            sum += a[i];
        }
        average = sum/a.length;
        System.out.println("average = " +average);

//      5.Create an array to store 3 names, loop through that array to print out the names.
        String[] names = {"Muhammad", "Amir", "Shah"};
        for (String name:names) {
            System.out.println(name);
        }

//      6.Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the
//      index each time the value equals 5.
        int[] values = {2,5,9,0,2,1,8,5,4};
        for (int i = 0; i <values.length ; i++) {
            if (values[i] == 5){
                System.out.println(i);
            }
        }

//      7. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = b.length; i > 0 ; i--) {
            System.out.print(b[i-1] + " ");
        }
        System.out.println();

//        8. Given the following array: ['w','t','y','h','k']
//        Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        String[] str = {"w","t","y","h","k"};
        for (int i = 0; i <str.length ; i++) {
            if (str[i] == "t"){
                str[i] = "hello";
            }
            System.out.print(str[i] + " ");
        }
        System.out.println();

//      9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//      Write a program that will print out all matching pairs from arrays 1 and 2.
//      Expected output: (7,7) and (6,6)
        int[] array1= {1,7,6,5,9}, array2 ={2,7,6,3,4};
        for (int i = 0; i <array1.length ; i++) {
            if(array1[i] == array2[i]){
                System.out.print("(" + array1[i] + "," + array2[i] +") ");
            }
        }
    }
}
