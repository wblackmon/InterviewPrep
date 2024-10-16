public class Utilities {
    public static int[] bubbleSortSwapped(int[] arr)
    {
        boolean swapped = true;
        int j = 0;
        while(swapped)
        {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++)
            {
                int tmp = 0;
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        printArray(arr);
        return arr;
    }

    public static int[] bubbleSortFor(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int tmp = 0;
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        printArray(arr);
        return  arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("arr = [");
        for (int i = 0; i < arr.length; i++) {
            if (i < (arr.length - 1)) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void print2dArray(int[][] arr) {
        System.out.print("arr = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j < (arr[i].length - 1)) {
                    System.out.print(arr[i][j] + ",");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            if (i < (arr.length - 1))
                System.out.print("],");
            else
                System.out.print("]");
        }
        System.out.print("]");
    }

}
