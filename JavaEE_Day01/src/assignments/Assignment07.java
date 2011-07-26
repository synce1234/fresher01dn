//Giải phương trình bậc 2 1 ẩn.
package assignments;

//import java.util.Scanner;

public class Assignment07 {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 2 một ẩn:");
        System.out.println("a*x^2 + b*x + c = 0");
        double a = 0, b = 0, c = 0;

        // Nhập dữ liệu cho a,b,c
        // Nếu muốn nhập giá trị từ màn hình console thì dùng doạn code
        // dưới đây:

        // Scanner input = new Scanner(System.in);
        //
        // System.out.print("Nhập giá trị của a: ");
        // a = input.nextDouble();
        // System.out.print("Nhập giá trị của b: ");
        // b = input.nextDouble();
        // System.out.print("Nhập giá trị của c: ");
        // c = input.nextDouble();

        // Nếu muốn chạy thử với a,b,c là các số ngẫu nhiên 
        // trong [0,100] thì dùng đoạn code dưới đây:

        a = Math.random() * 100;
        b = Math.random() * 100;
        c = Math.random() * 100;

        // kết thúc nhập dữ liệu cho a,b,c

        // Show a,b,c ra màn hình:
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        // Tính toán và giải :
        double delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
            System.exit(0);
        } else {
            if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: ");
                System.out.println("x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
