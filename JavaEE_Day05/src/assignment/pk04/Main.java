
package assignment.pk04;

import java.util.Scanner;

import common.RandomString;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ContactBook cb = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        ContactEntry ce = null;
        // String selection = "";
        // boolean tiepTuc = true;
        // do {
        // System.out.println("Nhập tên : ");
        // ce = new ContactEntry();
        // ce.setName(scanner.nextLine());
        // scanner.reset();
        // System.out.println("Nhập số điện thoại: ");
        // try {
        // ce.setNumber(Integer.parseInt(scanner.nextLine()));
        // scanner.reset();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // cb.add(ce);
        //
        // System.out.println("Tiếp tục (C|K)?");
        // scanner.reset();
        // selection = scanner.nextLine();
        // if(selection.equalsIgnoreCase("k")){
        // tiepTuc = false;
        // }
        // } while (tiepTuc);
        // System.out.println(cb.toString());

        // tạo 1 contact book các contact ngẫu nhiên.
        int n = 10;
        RandomString rs = new RandomString(10);
        for (int i = 0; i < n; i++) {
            ce = new ContactEntry();
            ce.setName(rs.nextString());
            ce.setNumber((int) (Math.random() * 10000));
            cb.add(ce);
        }

        System.out.println("STT\tName and Number");

        for (int i = 0; i < cb.getListEntry().size(); i++) {
            System.out.println(i + "\t" + cb.getListEntry().get(i));
        }

        System.out.println("Nhập tên muốn tìm: ");
        String nameToSearch = scanner.nextLine();
        ContactEntry ceGot = cb.searchByName(nameToSearch);
        if(ceGot != null){
            System.out.println(ceGot.toString());
        } else {
            System.out.println("Không tìm thấy " + nameToSearch + " trong CSDL");
        }
        
        System.out.println("Nhập số muốn tìm: ");
        int numberToSearch = Integer.parseInt(scanner.nextLine());
        ceGot = cb.searchByNumber(numberToSearch);
        if(ceGot != null) {
            System.out.println("Tìm thấy: ");
            System.out.println(ceGot.toString());
        } else {
            System.out.println("Không tìm thấy " + numberToSearch + "trong CSDL");
        }
        
        System.out.println("Nhập số muốn delete : ");
        numberToSearch = Integer.parseInt(scanner.nextLine());
        ceGot = cb.searchByNumber(numberToSearch);
        if(ceGot != null) {
            cb.delete(ceGot);
            System.out.println("Đã xóa thành công Contact số" + numberToSearch);
            System.out.println("Danh sách còn lại:");
            cb.show();
        } else {
            System.out.println("Không tìm thấy " + numberToSearch + "trong CSDL");
        }
        
    }
}
