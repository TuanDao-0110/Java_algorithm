import java.util.Scanner;

public class Exercise4 {

    public Exercise4() {
        // Constructor
    }

    final static int min = -100;
    final static int max = 100;

    // Create an array
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

    // Display array
    public static void displayArray(int a[]) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = createArray(scan);
        displayArray(a);
        System.out.println("\n");
    }
}
