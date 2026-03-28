import java.util.Scanner;

public class Main {

                                  //TASK 1: Factorial
    // Time Complexity: O(n)
    // Explanation: The function calls itself n times, decreasing n by 1 each time.
    // So the total number of operations grows linearly with n.
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

                                    //TASK 2: Fibonacci
    // Time Complexity: O(2^n)
    // Explanation: Each call generates two more recursive calls,
    // forming a binary tree of calls. This leads to exponential growth.
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

                             //TASK 3: Sum of Array
    // Time Complexity: O(n)
    // Explanation: Each element is visited exactly once,
    // so the number of operations is proportional to array size.
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

                                   // TASK 4: Binary Search
    // Time Complexity: O(log n)
    // Explanation: The search space is divided in half each time,
    // so the number of steps grows logarithmically.
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, target, left, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my project");

        System.out.print("Enter number for factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Factorial = " + factorial(factNum));

        // Task 2
        System.out.print("Enter number for fibonacci: ");
        int fibNum = sc.nextInt();
        System.out.println("Fibonacci = " + fibonacci(fibNum));

        // Task 3
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum = " + sumArray(arr, 0));

        // Task 4
        System.out.print("Enter sorted array size: ");
        int n = sc.nextInt();
        int[] sortedArr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            sortedArr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = binarySearch(sortedArr, target, 0, n - 1);

        if (result != -1)
            System.out.println("Found at index: " + result);
        else
            System.out.println("Not found");

        sc.close();
    }
}