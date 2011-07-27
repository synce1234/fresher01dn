package assignment01;

public class SynchronizedBuffer implements Buffer {
    private int buffer = -1;
    private int occupiedBufferCount = 0;

    @Override
    public synchronized void set(int value) {
        String name = Thread.currentThread().getName();
        while (occupiedBufferCount == -1) {
            try {
                System.err.println(name + " tries to write ");
                displayState("Buffer fulll. " + name + " waits. ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        buffer = value;
        occupiedBufferCount++;
        displayState(name + " writes " + buffer);
        notify();
    }

    @Override
    public synchronized int get() {
        String name = Thread.currentThread().getName();
        while (occupiedBufferCount == 0) {
            try {
                System.err.println(name + " tries to read.");
                displayState("Buffer empty, " + name + " waits.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        --occupiedBufferCount;
        displayState(name + " reads " + buffer);
        notify();
        return buffer;
    }

    public void displayState(String operation) {
        StringBuffer outputLine = new StringBuffer(operation);
        outputLine.setLength(40);
        outputLine.append(buffer + "\t\t" + occupiedBufferCount);
        System.err.println(outputLine);
        System.err.println();
    }

}
