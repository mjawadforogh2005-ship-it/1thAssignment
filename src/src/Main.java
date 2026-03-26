public class Main {
    //task1: factorial

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1); // Time Complexity for this task is: O(n)
    }

    //task2: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;//the time Complexity is: O(2^n)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Task 3: sum of array

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) return 0;//the time Complexity is: O(n) – every element visited once
        return arr[index] + sumArray(arr, index + 1);
    }

    // Task 4: binary search
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid; //the time Complexity is: O(log n)
        else if (arr[mid] > target) return binarySearch(arr, target, left, mid - 1);
        else return binarySearch(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of your number: " + factorial(10));
        System.out.println("Here is the fibonacci of your number: " + fibonacci(10));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of the array: " + sumArray(arr, 0));
        int[] sortedArr = {1, 6, 10, 50, 100, 150};
        System.out.println("Binary Search for your number is: " + binarySearch(sortedArr, 150, 0, sortedArr.length - 1));
    }
}

