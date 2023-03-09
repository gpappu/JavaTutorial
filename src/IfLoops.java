public class IfLoops {
    public static void main(String[] args) {
        // print all even numbers in the array.
        int[] array1 = {3, 58, 39, 2000, 48, 55, 100};
        for (int i : array1) {

            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is not an even number");
            }
        }

        // Requirement is to check if there is at least even number in the list.
        for (int i : array1) {
            if (i % 2 == 0) {
                System.out.println("There is an even number in the list");
                break;
            }
        }
    }
}