import java.util.Random;

public class arrayOperations{
    public static int[] createArray( int size ) {
        Random rand = new Random();
        int[] array = new int[ size ];
        for ( int i = 0; i < size; i++ ) {
            array[ i ] = rand.nextInt( 101 );
        } 
        return array;
    }
    public static void findMin( int[] array ) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum value is: " + min);
    }

    public static void findMax( int[] array ) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }

    public static int findAverage( int[] array ) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        return average;
    }
    public static void findDifferences( int[] array )
    {
        double average = findAverage( array );//returns average
        double[] differences = new double[array.length];
        System.out.print("The differences from average are: {");
        for(int i = 0; i < differences.length; i++)
        {
            differences[i] = average - array[i];
            System.out.print(differences[i]);
            if(i != array.length-1)//not the last number
            {
                System.out.print(", ");
            }
            System.out.println("}");
        }
    }
    public static void findSums( int[] array )
    {
        int oddsSum = 0;
        int evensSum = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(i%2==0)
            {
                evensSum += array[i];
            }
            else
            {
                oddsSum += array[i];
            }
        }
        System.out.println("Sum of numbers at odd indices: " + oddsSum);
        System.out.println("Sum of numbers at even indices: " + evensSum);
    }
}