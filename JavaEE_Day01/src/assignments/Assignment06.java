package assignments;

public class Assignment06 {
	public static void main(String[] args) {
		double f = 1.5;
		String s = doubleToString(f);
		
		String s2 = "1989";
		int i = stringToInt(s2);
		boolean b = validateInt(i);
		if (b == true) {
			System.out.println("phương thức stringToInt đã chạy đúng");
		} else {
			System.out.println("pthức stringToInt chạy sai hoặc không chạy");
		}
		
		double f2 = Double.parseDouble(s);
		if (f2 ==f ) {
			System.out.println("phương thức doubleToString đã chạy đúng");
		} else {
			System.out.println("pthức doubleToString chạy sai hoặc không chạy");
		}
	}

	public static String doubleToString(double doubleParam) {
		Double doubleGot = new Double(doubleParam);
		return doubleGot.toString();
	}

	public static int stringToInt(String stringParam) {
		int i = Integer.parseInt(stringParam);
		return i;
	}
	
	public static boolean validateInt(int i) {
		try {
			Integer chkInteger = Integer.valueOf(i);
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
