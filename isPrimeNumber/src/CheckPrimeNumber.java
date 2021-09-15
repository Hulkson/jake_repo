public class CheckPrimeNumber {
    public static void main(String[] args) {
        primeCalc(50);
    }

    // hàm truyền mảng để tính số nguyên tố
    static void primeCalc(int c) {
        System.out.println("các số nguyên tố là: ");
        for (int i = 0; i < c; i++) {
            if (isPrimeNumber(i)) { // check nếu hàm kiểm tra trả về true thì in ra màn hình giá trị i
                System.out.print(i + " ");
            }
        }
    }

    //hàm kiểm tra xem 01 số có phải là số nguyên tố không
    static boolean isPrimeNumber(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= a / 2; i++) { // duyệt xem số có chia hết cho bất kỳ số nào trong array hay không
            if (a % i == 0) return false;
        }
        return true;
    }
}
