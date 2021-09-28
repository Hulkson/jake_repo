public class QuickSort {
    public static void main(String[] args) {
        int[] testArray = {98, 87, 65, 23, 19, 21, 4, 5};

        display(testArray);
    }

    // hàm truyền và in mảng ra màn hình
    static void display(int[] d) {
        quickSort(d, 0, 7);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }

    // hàm tính quick sort
    static void quickSort(int[] a, int i,  int j) {
        if(i >= j) return; // nếu i > j -> đầu vào sai -> return
        int leftIndex = i;
        int rightIndex = j;
        int pivot = a[(leftIndex + rightIndex) / 2];
        System.out.println("pivot là: " + pivot);
        System.out.println();

        do {
            while (a[leftIndex] < pivot) leftIndex++; // duyệt xem phần tử có lớn hơn pivot ko --> dừng tại vị trí sai
            while (a[rightIndex] > pivot) rightIndex--; // duyệt xem phần tử có nhỏ hơn pivot ko --> dừng tại vị trí sai

            if (leftIndex <= rightIndex) { // nếu left index của phần tử sai < right index thì hoán đổi
                System.out.println(a[leftIndex] + " trước khi đổi " + a[rightIndex]);
                for (int k = 0; k < a.length; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();

                int temp = a[leftIndex]; // thực hiện hoán đổi
                a[leftIndex] = a[rightIndex];
                a[rightIndex] = temp;

                System.out.println();
                System.out.println(a[leftIndex] + " sau khi đổi " + a[rightIndex]);
                for (int h = 0; h < a.length; h++) {
                    System.out.print(a[h] + " ");
                }
                System.out.println();
                leftIndex++; //hoán đổi xong tăng, giảm giá trị để tiếp tục
                rightIndex--;
            }
        }
        while (leftIndex < rightIndex); // nếu leftIndex < rightIndex thì lặp lại vòng do
                                        // còn không thì gọi đệ quy phân tách mảng ra làm 2

        System.out.println("đệ quy " + leftIndex + " " + rightIndex);
        // gọi đệ quy
        quickSort(a, i, rightIndex);
        quickSort(a, leftIndex, j);
    }
}
