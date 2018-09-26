import java.util.*;

     class SortClass implements Comparator{
        public int compare(Object ob1,Object ob2)
        {
            String s1=(String)ob1;
            String s2=(String)ob2;
            return -(s1.compareTo(s2));
        }
    }
    class Revers{
        public static void main(String args[])
        {
            TreeSet t=new TreeSet(new SortClass());
            t.add("Ekta");
            t.add("Ajay");
            t.add("Neeraj");
            t.add("Vijay");

            System.out.println(t);
        }

    }

