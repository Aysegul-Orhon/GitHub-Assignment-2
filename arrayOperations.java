public class arrayOperations{
    public static int[] newArray;
    public static void findDifferences()
    {
        double average = findAverage();//returns average
        double[] differences = new double[newArray.length];
        System.out.print("The differences from average are: {");
        for(int i = 0; i < differences.length; i++)
        {
            differences[i] = average - newArray[i];
            System.out.print(differences[i]);
            if(i != newArray.length-1)//not the last number
            {
                System.out.print(", ");
            }
            System.out.println("}");
        }
    }
    public static void findSums()
    {
        int oddsSum = 0;
        int evensSum = 0;
        for(int i = 0; i<newArray.length; i++)
        {
            if(i%2==0)
            {
                evensSum += newArray[i];
            }
            else
            {
                oddsSum += newArray[i];
            }
        }
        System.out.println("Sum of numbers at odd indices: " + oddsSum);
        System.out.println("Sum of numbers at even indices: " + evensSum);
    }
}