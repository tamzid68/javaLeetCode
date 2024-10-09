public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] ar1 = {2, 5, 5, 6, 9};
        int[] ar2 = {1, 3, 4, 6, 7, 8};
        int[] sum = new int[ar1.length + ar2.length];  // Correct length

        sortSum(ar1, ar2, sum);

        for (int value : sum)
            System.out.print(value + " ");  // Added space for readability
    }

    static void sortSum(int[] ar1, int[] ar2, int[] sum) {
        int x = 0, y = 0, z = 0;

        // Merge elements while there are still elements in both arrays
        while (x < ar1.length && y < ar2.length) {
            sum[z++] = (ar1[x] < ar2[y]) ? ar1[x++] : ar2[y++];
        }

        // Append remaining elements from ar1, if any
        while (x < ar1.length) {
            sum[z++] = ar1[x++];
        }

        // Append remaining elements from ar2, if any
        while (y < ar2.length) {
            sum[z++] = ar2[y++];
        }
    }
}