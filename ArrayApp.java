import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr;
        int size;
        int option = 0;
        Scanner input = new Scanner( System.in );

        System.out.print( "Welcome to Array Operations! Please enter a size for your array (int): ");

        while ( !input.hasNextInt() ) { // checks for valid input
            input.nextLine();
            System.out.print( "Invalid size! Please enter a valid size: ");
        }
        size = input.nextInt();
        arr = ArrayMethods.createArray( size );
        System.out.println( "Your array has been created!");
        System.out.println();

        do {
            option = 0;
            System.out.println( "1- Display the maximum value in the array");
            System.out.println( "2- Display the minimum value in the array");
            System.out.println( "3- Display the average of the array");
            System.out.println( "4- Display the difference from average for each element");
            System.out.println( "5- Display the sum of elements with odd and even indices");
            System.out.println( "6- Exit operations");
            System.out.print( "Please choose an operation: ");

            if ( !input.hasNextInt() ) { // checks for valid integer input
                input.next();
                System.out.println( "Invalid option!" ); 
            }
            else {
                option = input.nextInt();

                if ( option == 1 ) { // prints out the max value
                    ArrayMethods.findMax( arr );
                }
                else if ( option == 2 ) { // prints out the min value
                    ArrayMethods.findMin( arr );
                }
                else if ( option == 3 ) { // prints out the average
                    System.out.println("The average of the array is: " + ArrayMethods.findAverage( arr ) );
                }
                else if ( option == 4 ) { // prints out the distances from the average
                    ArrayMethods.findDifferences( arr );
                }
                else if ( option == 5 ) { // prints out odd and even index sums
                    ArrayMethods.findSums( arr );
                }
                else if ( option == 6 ) { // prints exit message and exits the loop
                    System.out.println( "Goodbye!" );
                }
                else { // if the input is not one of the options, prints invalid message
                    System.out.println( "Invalid option!" );
                }
            }
            System.out.println();
        } while ( option != 6 );

        input.close();
    }
}