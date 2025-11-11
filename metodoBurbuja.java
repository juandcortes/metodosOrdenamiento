public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Este primer bucle controla cuántas veces se recorrerá el array
        for (int i = 0; i < n - 1; i++) {
            // Este segundo bucle realiza las comparaciones e intercambios
            // n-1 porque el último elemento ya estará en su lugar en cada pasada
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara el elemento actual con el siguiente
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método para imprimir el array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos = {5, 1, 4, 2, 8};
        System.out.println("Array original:");
        printArray(datos);
        
        bubbleSort(datos);

        System.out.println("Array ordenado:");
        printArray(datos);
    }
}
