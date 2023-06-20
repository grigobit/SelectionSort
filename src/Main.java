public class Main {
    public static void main(String[] args) {
        int[] chrisList = {24, 12, 47, 10, 1, 45, 2, 29, 59, 6, 61, 16, 7, 3};

        System.out.println("The array before sorting is: ");
        arrayPrint(chrisList);

        selectionSort(chrisList);

        System.out.println("\nThe array after sorting is: ");
        arrayPrint(chrisList);
    }

    public static void arrayPrint(int[] myList) {
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }

    public static void selectionSort(int[] myList) {
        
        for (int i = 0; i < myList.length - 1; i++) {
            int currentMin = myList[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < myList.length; j++) {
                if (currentMin > myList[j]) {
                    currentMin = myList[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                myList[currentMinIndex] = myList[i];
                myList[i] = currentMin;
            }
        }
    }
}