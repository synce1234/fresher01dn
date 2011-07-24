package test;

public class Main {
	public static void main(String args[]) {
		char ch = 0;
		for(ch	 =0; ch <256; ch++){
			System.out.print(ch  );
			if (ch % 30 == 0) {
				System.out.println("\n");
			}
		}
	}
}
