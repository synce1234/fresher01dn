package assignment.pk02;

/**
 * 2. Tạo một gói và viết một hàm, hàm đó trả về giai thừa của một đối số được
 * truyền vào trong một chương trình.
 * 
 * @author Admin
 * 
 */
public class Program {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(giaiThua(n));
    }

    public static long giaiThua(int n) {
        int result = 1;
        if ((n == 0) || (n == 1)) {
            return result;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
