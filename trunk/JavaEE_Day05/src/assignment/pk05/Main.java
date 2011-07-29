
package assignment.pk05;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 5. Viết một chương trình mà nhập vào một số điện thoại tại dòng lệnh, như một
 * chuỗi có dạng (091) 022-6758080. Chương trình sẽ hiển thị mã quốc gia (091),
 * mã vùng (022), và số điện thoại (6758080) (Sử dụng lớp StringTokenizer).
 * 
 * @author Fresher041
 * 
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out
                .println("Nhập vào 1 số điện thoại dạng: (<Mã quốc gia>) <Mã vùng>-<Số>");
        System.out.println("Tương tự như: (091) 022-6758080");
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        //split bằng StringTokenizer
        StringTokenizer st = new StringTokenizer(str, " ");
        
        //in ra màn hình;
        System.out.println("Số điện thoại bạn vừa nhập có: ");
        System.out.println("Mã quốc gia: " + st.nextToken(" "));
        System.out.println("Mã vùng: " + st.nextToken("-"));
        System.out.println("Số điện thoại: " + st.nextToken());
    }

}
