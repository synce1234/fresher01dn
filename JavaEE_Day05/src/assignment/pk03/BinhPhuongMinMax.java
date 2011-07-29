
package assignment.pk03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Fresher041
 */
public class BinhPhuongMinMax {

    /**
     * Tính bình phương min
     * 
     * @param mangCacDoiTuongSoNguyen
     * @return
     */
    public static int binhPhuongMin(ArrayList<Integer> mangCacDoiTuongSoNguyen) {

        int soBeNhat = mangCacDoiTuongSoNguyen.get(0);
        for (int i = 0; i < mangCacDoiTuongSoNguyen.size(); i++) {
            if (Math.pow(soBeNhat, 2) > Math.pow(
                    mangCacDoiTuongSoNguyen.get(i), 2)) {
                soBeNhat = mangCacDoiTuongSoNguyen.get(i);
            }
        }
        return soBeNhat;
    }

    public static int binhPhuongMax(ArrayList<Integer> mangCacDoiTuongSoNguyen) {

        int soLonNhat = mangCacDoiTuongSoNguyen.get(0);
        for (int i = 0; i < mangCacDoiTuongSoNguyen.size(); i++) {
            if (Math.pow(soLonNhat, 2) < Math.pow(
                    mangCacDoiTuongSoNguyen.get(i), 2)) {
                soLonNhat = mangCacDoiTuongSoNguyen.get(i);
            }
        }
        return soLonNhat;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 dãy số, cách nhau bằng (\"space\")");
        String chuoiSo = scanner.nextLine();
        String[] mangSo = chuoiSo.split(" ");
        int i = 0;
        ArrayList<Integer> mangSoNguyen = new ArrayList<Integer>();
        for (String s : mangSo) {
            try {
                i = Integer.parseInt(s);
                mangSoNguyen.add(i);
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
        }
        int soLonNhat = mangSoNguyen.get(0);
        int soBeNhat = mangSoNguyen.get(0);
        for (i = 0; i < mangSoNguyen.size(); i++) {
            if (Math.pow(soLonNhat, 2) < Math.pow(mangSoNguyen.get(i), 2)) {
                soLonNhat = mangSoNguyen.get(i);
            }

            if (Math.pow(soBeNhat, 2) > Math.pow(mangSoNguyen.get(i), 2)) {
                soBeNhat = mangSoNguyen.get(i);
            }
        }
        System.out.println("số lớn nhất là : " + soLonNhat
                + " bình phương của nó là: " + Math.pow(soLonNhat, 2));
        System.out.println("số nhỏ nhất là : " + soBeNhat
                + " bình phương của nó là: " + Math.pow(soBeNhat, 2));
    }
}
