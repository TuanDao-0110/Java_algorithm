import java.util.Scanner;

public class Exercise7 {

    public Exercise7() {
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

    // Find the first value within the range [x;y]
    public static int findValue(int a[], int x, int y) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < y && a[i] > x) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int a[] = createArray(scan);
        displayArray(a);
        System.out.println("\n");
        System.out.println("Enter the value of x for the range [x;y]:");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the value of y for the range [x;y]:");
        int y = Integer.parseInt(scan.nextLine());

        int index = findValue(a, x, y);
        if (index != -1) {
            System.out.println("The first value within the range [" + x + ";" + y + "] is at index: " + index
                    + " and has the value: " + a[index]);
        } else {
            System.out.println("There is no value in array 'a' that falls within the range [" + x + ";" + y + "]");
        }
    }
}
