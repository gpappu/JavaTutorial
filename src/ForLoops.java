public class ForLoops {
    public static void main(String[] args)
    {
        // peint all elements present in an array.
        int[] array1 = {3, 58, 39, 2000, 48};

        for(int i=0; i<array1.length ; i++)
        {
            System.out.println(array1[i]);
        }

        // Enhanced for loop
        String[] name = {"Gayatri", "Rahul", "Arvind", "Vijay", "Chaya"};
        for (String s : name) // s is the variable like i
        {
            System.out.println(s); /* This will print every element in the String name.
            You do not have to explicitly indicate the increment value */
        }



    }





}
