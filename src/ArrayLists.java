import java.util.ArrayList;

public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList a = new ArrayList();
        a.add(4);
        a.add("Gayatri");
        a.add(55.4);
        a.add('d');
        a.add(2999);
        a.remove(Character.valueOf('d'));// Removing an element using remove(Object).
        a.add(3, "bnym");
        System.out.println(a);
        System.out.println(a.get(0)); // get method gets the element in a specific index


    }







}
