public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int clave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = clave;
        }
    }

    public static void main(String[] args) {
        int[] datos = {12, 11, 13, 5, 6};
        insertionSort(datos);
        for (int num : datos)
            System.out.print(num + " ");
    }
}
