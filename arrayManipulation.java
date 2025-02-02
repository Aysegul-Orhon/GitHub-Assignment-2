public class arrayManipulation {
    public static int[] array;
    public static void findMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum value is: " + min);
    }

    public static void findMax() {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }

    public static int findAverage() {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        return average;
    }
}
