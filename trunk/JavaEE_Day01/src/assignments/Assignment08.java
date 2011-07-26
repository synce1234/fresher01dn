//2.  Write a Java program to count the number of  ‘1’ bit in a binary string 
//which was gotten from a given int number. For example:
//•   Give an int number 0, we got a binary “0”, then result will be 0.
//•   Give an int number 7, we got a binary “111”, then result will be 3. 
//•   Give an int number 8, we got a binary “1000”, then result will be 1.
//•   Give an int number 10, we got a binary “1010”, then result will be 2.

package assignments;

import java.util.BitSet;

//import java.util.Scanner;

public class Assignment08 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 0;
        // nếu muốn tự nhập n vào màn hình console thì dùng:

        // System.out.println("Nhập vào 1 số nguyên dương: ");
        // Scanner scanner = new Scanner(System.in);
        // n = scanner.nextInt();

        // nếu muốn nhận 1 số random trong khoảng [0,2000000000] thì dùng:
        n = (int) (Math.random() * 2000000000);

        // tạo 1 BitSet để lưu các giá trị 0/1 (thực ra là false/true)
        BitSet bitSet = new BitSet(32);
        byte currentIndex = 0;
        int m = n;
        while (m != 0) {
            if ((m % 2) == 0) {
                bitSet.set(currentIndex, false);
            } else {
                bitSet.set(currentIndex, true);
            }
            currentIndex++;
            m = m / 2;
        } // end while (n != 0)

        // sau khi kết thúc vòng lặp thì BitSet của ta sẽ chứa mã nhị phân
        // của n theo thứ tự ngược. nhưng trong bài toán này ta chỉ cần 
        // quan tâm đến số lượng bit 1 (true) trong bitset nhận được 
        // nên mkn :)
        System.out.println("Mã nhị phân tương ứng của " + n + " là:");
        for (int i = bitSet.length(); i > 0; i--) {
            if (bitSet.get(i - 1) == true) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println("\nSố bit 1 trong mã nhị phân của " 
                + n + " là: " + bitSet.cardinality());
        System.exit(0);
    }
}
