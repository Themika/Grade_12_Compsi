package Practice.Algorithms;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Algo {
    public static void main(String[] args) {
        // size can be provided as first argument, default to 1000
        int n = 1000000;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {}
        }

        int[] original = generateRandomArray(n, 1, 1000000);

        // preserve insertion order
        Map<String, Long> durationsNs = new LinkedHashMap<>();

        // Bubble Sort
        int[] arr = Arrays.copyOf(original, original.length);
        long start = System.nanoTime();
        bubbleSort(arr);
        long end = System.nanoTime();
        durationsNs.put("Bubble Sort", end - start);

        // Insertion Sort
        arr = Arrays.copyOf(original, original.length);
        start = System.nanoTime();
        insertionSort(arr);
        end = System.nanoTime();
        durationsNs.put("Insertion Sort", end - start);

        // Merge Sort
        arr = Arrays.copyOf(original, original.length);
        start = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        end = System.nanoTime();
        durationsNs.put("Merge Sort", end - start);

        // Quick Sort
        arr = Arrays.copyOf(original, original.length);
        start = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        end = System.nanoTime();
        durationsNs.put("Quick Sort", end - start);

        // Optionally print results to console
        System.out.println("Timing results (milliseconds) for n = " + n + ":");
        for (Map.Entry<String, Long> e : durationsNs.entrySet()) {
            System.out.printf("%s: %d ms%n", e.getKey(), e.getValue() / 1_000_000);
        }

        // Save to file
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write("Timing results (nanoseconds) for n = " + n + ":\n");
            for (Map.Entry<String, Long> e : durationsNs.entrySet()) {
                writer.write(String.format("%s: %d ns (%d ms)\n", e.getKey(), e.getValue(), e.getValue() / 1_000_000));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // QuickSort (corrected)
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    // Partition (corrected)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] generateRandomArray(int n, int min, int max) {
        Random random = new Random();
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(max - min + 1) + min;
        }
        return randomArray;
    }

    // Utility for small arrays only; avoid using for large n
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
