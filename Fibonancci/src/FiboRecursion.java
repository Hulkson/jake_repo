
public class FiboRecursion {
    public static void main(String[] args) {
        System.out.println("kết quả hàm tính giai thừa là: \n" + factorial(10));

        fiboCalc(10); // hàm truyền tham số vào để tính fibonacci
    }


    // tính giai thừa có sử dụng đệ quy
    public static int factorial(int n) {
        if (n != 0) { // điều kiện dừng
            return n * factorial(n - 1); // gọi đệ quy
        }
        else {
            return 1;
        }
    }

    static void fiboCalc(int c) {
        System.out.println("kết quả hàm tính fibonacci là: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // hàm tính 1 phần tử fn = f0 + f1
    static int fibonacci(int a) {
            if (a < 0) {
                return -1;
            }
            else if (a == 0 || a == 1) {
                return a;
            }
            else
                return fibonacci(a - 1) + fibonacci(a - 2);
    }
}
