import java.util.Scanner;

public class Exercise5 {

    public Exercise5() {
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

    // Find numbers closest to a given value
    public static void findNearestNumbers(int a[], int x) {
        int minDistance = Math.abs((a[0] - x));
        for (int i = 1; i < a.length; i++) {
            int temp = a[i] - x;
            if (Math.abs(temp) < minDistance) {
                minDistance = Math.abs(temp);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - x) == minDistance) {
                System.out.println("The number closest to " + x + " is: " + a[i] + "\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = createArray(scan);
        displayArray(a);

        System.out.println("\n");
        System.out.println("Enter the value of x:");
        int x = Integer.parseInt(scan.nextLine());
        findNearestNumbers(a, x);
    }
}
