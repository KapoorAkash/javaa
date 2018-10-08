import java.util.*;
public class p9 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        TreeSet t=new TreeSet();
        TreeSet t1=new TreeSet();
        TreeSet t3=new TreeSet();
        int n=s.nextInt();
       // s.nextLine();
        for(int i=0;i<n;i++)
        {
            String x=s.nextLine();
            t.add(x);
        }
        s.nextLine();
        int n1=s.nextInt();
        s.nextLine();
        for(int i=0;i<n1;i++)
        {
            String x1=s.nextLine();
            t1.add(x1);
        }

        Iterator itr=t1.iterator();
        while(itr.hasNext())
        {
            Object ob=itr.next();
            if(t.contains(ob))
            {
                t3.add(ob);
            }
        }
        System.out.println(t3);
    }
}
