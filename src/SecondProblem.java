import java.util.Arrays;

public class SecondProblem {
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 6, 2, 8, 4, 7, 3};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, mid, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
