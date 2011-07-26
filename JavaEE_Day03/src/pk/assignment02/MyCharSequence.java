package pk.assignment02;

import java.util.ArrayList;

public class MyCharSequence implements CharSequence {
    private ArrayList<Character> data = null;

    public MyCharSequence() {
        this.setData(new String());
    }

    @Override
    public char charAt(int index) {
        char c = (char) this.getData().get(index);
        return c;
    }

    @Override
    public int length() {
        return getData().size();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > getData().size()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }

        MyCharSequence ch = new MyCharSequence();
        ch.setData(ch.getData().subList(start, end).toString());
        return ch;
    }

    @Override
    public String toString() {
        String str = this.getData().toString();
        return str;
    }

    public void setData(String data) {
        ArrayList<Character> ar = new ArrayList<Character>();
        char[] cArray = data.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            ar.add(cArray[i]);
        }
        this.data = ar;
    }

    public ArrayList<Character> getData() {
        return data;
    }

    
}
