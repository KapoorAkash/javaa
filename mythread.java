import java.util.*;
class MyThread extends Thread{
    int n,i;
MyThread(int n)
{
    this.n=n;
}
synchronized public void run()
    {
        for(int i=0;i<=5;i++)
        {
        System.out.print(Thread.currentThread().getName()+" "+n+"*"+i+"="+(n*i));
        }
        System.out.println();
    }
}
class demo {
    public static void main(String args[]) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(1);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
