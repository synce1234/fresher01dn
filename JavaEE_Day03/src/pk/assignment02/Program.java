/**
 * Write a class that implements the CharSequence interface found in the
 * java.lang package. (Javadoc API:
 * http://download.oracle.com/javase/6/docs/api/java/lang/CharSequence.html)
 * Your implementation should return the string backwards (in reverse order).
 * Select one of the sentences from this home work to use as the data.
 * Write a small main method to test your class; make sure to call all four
 * methods.
 */
package pk.assignment02;

public class Program {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyCharSequence mcs = new MyCharSequence();
        mcs.setData("Fresher01DN");
        
        char c = mcs.charAt(2);
        MyCharSequence mcs2 = (MyCharSequence) mcs.subSequence(0, 4);
        String str = mcs.toString();
        int mcsLength = mcs.length();
        
    }

}
