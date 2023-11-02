import java.util.Scanner;

public class Exercise6 {

    public Exercise6() {
        // TODO Auto-generated constructor stub
    }

    final static int min = -100;
    final static int max = 100;

    // Create a function to generate an array
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

    // Display the array
    public static void displayArray(int a[]) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }

    // Find the range containing the minimum and maximum values
    public static void findRange(int a[]) {
        int minVal = a[0];
        int maxVal = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minVal) {
                minVal = a[i];
            }
        }
        System.out.println("The range " + "[" + minVal + ";" + maxVal + "] contains all the values in the one-dimensional array 'a'");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int a[] = createArray(scan);
        displayArray(a);

        System.out.println("\n");
        findRange(a);
    }
}
