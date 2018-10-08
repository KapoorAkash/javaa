import java.util.*;
    class MultiPriority extends Thread {
        public void run() {

            System.out.println("running thread" + Thread.currentThread().getName());
            System.out.println("running thread" + Thread.currentThread().getPriority());
        }

        public static void main(String args[]) {
            MultiPriority m1 = new MultiPriority();
            MultiPriority m2 = new MultiPriority();
            m1.setPriority(Thread.MIN_PRIORITY);
            m2.setPriority(Thread.MAX_PRIORITY);
            m1.start();
            m2.start();
        }
    }
