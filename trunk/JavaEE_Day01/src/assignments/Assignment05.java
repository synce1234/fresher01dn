package assignments;

public class Assignment05 {

    /**
     * @param args
     */
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Trong java, khi tính toán 1 biểu thức logic rất dài
        //nếu JVM bắt được 1 thành phần = false && (AND) 
        //hoặc 1 thành phần = true || (OR) với phần còn lại
        //thì nó không tính toán cho phần còn lại.
        
        //trong câu lệnh sau sẽ demo bằng cách gọi 1 hàm mà nó 
        //trả về 1 giá trị boolean đồng thời in ra màn hình chuỗi tham số.
        //để ý rằng isTrue("long") sẽ trả về 1 giá trị false 
        //nên các hàm còn lại sẽ không được thực hiện 
        //(không in các chuỗi trong phần còn lại ra màn hình)
        boolean b = isTrue("long") && ((isTrue("true") 
                || isTrue("quang")) || isTrue("true"));
        
        //tương tự ta có 1 biểu thức || với phần còn lại:
        boolean c = isTrue("true") || (isTrue("long") && isTrue("quang"));
    }

    public static boolean isTrue(String str) {
        System.out.println(str);
        String trueString = "true";
        if (trueString.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
