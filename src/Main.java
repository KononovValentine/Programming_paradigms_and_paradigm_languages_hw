// Императивная парадигма

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int index = -1;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                index = mid;
                break;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Элемент найден на позиции " + index);
        } else {
            System.out.println("Элемент не найден в массиве");
        }
    }
}
