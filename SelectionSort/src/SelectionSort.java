public class SelectionSort {
    public static void main(String[] args) {
        int[] testArray = {1, 5, 77, 65, 34, 98, 88, 11, 34};
        System.out.print(" mảng chưa sắp xếp: " );
        display(testArray);
        System.out.print(" mảng đã sắp xếp: ");
        selectionSort(testArray);
    }

    // hàm Selection Sort 1 mảng
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int minIndex = i; // gắn giá trị ngay lần đầu tiên i = 0 = minIndex
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) { // so sánh 2 phần tử, lượt đầu tiên minIndex = i[0];

                    //hoán đổi vị trí
                    int temp = a[j];
                    a[j] = a[minIndex];
                    a[minIndex] = temp;
                }
            }
        }
        display(a);
    }

    //hàm in mảng ra màn hình khi hàm selectionSort xử lý xong
    static void display(int[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }
}
