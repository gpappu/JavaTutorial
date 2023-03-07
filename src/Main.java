public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Intellij");
        int my_number = 2; /* This is called a declaration statement.
        It is used to define a variable indicating the datatype, the name of variable and assigning a specific value
        In Java, variables have to initialized before being used.*/
        String name = "Gayatri";
        char letter = 'd';
        double dec  = 33.6;
        boolean result = true;

        int[] a = new int[4]; // This is to say 'a' will hold 4 values and is of type int.
        a[0] = 1; // In an array, values are stored in the zeroth index. This is a tedious way of defining arrays.
        a[1] = 3;
        a[2] = 5;
        a[3] = 10;

        // The alternate way is
        int[] arr = {1, 2, 4, 90};
        System.out.println(arr[3]);


    }
}