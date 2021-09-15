public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = {6, 3, 34, 76, 88, 43};
        bubbleSortFunction(testArray);
    }

    // hàm in giá trị trong mảng ra màn hình
    public static void display(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    // hàm thực hiện bubble sort
    public static void bubbleSortFunction(int[] a) {
        for(int i = 0; i < a.length; i++) { // số lần phải duyệt
            for(int j = 0; j < a.length - 1 - i; j++) { // duyệt j trừ đi i để loại bỏ các phần tử đã nổi bọt
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        display(a);
    }
}