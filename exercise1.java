import java.util.Scanner;

public class Exercise1 {

    public Exercise1() {
        // TODO Auto-generated constructor stub
    }

    final static int min = -100;
    final static int max = 100;

    // Create a function:
    public static int[] createArray(Scanner scan) {
        int n;

        System.out.println("Please enter the length of the array: ");
        n = Integer.parseInt(scan.nextLine());

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return a;
    }

    // Print an array:
    public static void printArray(int a[]) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }

    // Find the position of the smallest value;
    public static void findSmallestValue(int a[]) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[index]) {
                index = i;
            }
        }
        System.out.println("The smallest value is: " + a[index] + " at position: " + index);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int a[] = createArray(scan);
        printArray(a);
        System.out.println("\n");
        findSmallestValue(a);
    }

}
