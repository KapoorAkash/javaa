public class Threads
{
    public static void main(String args[])
    {
        RunMethod r=new RunMethod();
        Thread t=new Thread(r);
        t.start();
    }
}
class RunMethod implements Runnable
{
    public void run()
    {
        System.out.println("run method");
    }
}
