package assigment.pk01stack;

public class Program {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Chương trình demo cấu trúc dữ liệu STACK");
        System.out.println("Chương trình sẽ lần lượt tạo ra các số nguyên"
                + "ngẫu nhiên trong khoảng 0-1000"
                + "và push() vào trong stack"
                + "sau đó pop() lấy và show ra màn hình");
        int randomInt = 0;

        System.out.println("Chương trình sẽ demo bằng 10 phần tử");
        MyStack ms = new MyStack();
        for (int i = 0; i < 10; i++) {
            randomInt = (int) (Math.random() * 1000);
            System.out.println("Phần tử thứ " + i
                    + " được push() vào stack là: " + randomInt);
            ms.push(randomInt);
        }

        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.println("Phần tử thứ " + i
                    + " được pop() ra khỏi stack là: " + ms.pop());
        }

    }
}
