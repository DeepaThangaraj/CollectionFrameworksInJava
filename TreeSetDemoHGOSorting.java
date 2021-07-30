import java.util.*;
class TreeSetDemoHGOSorting
{

   /*
   write a program to insert String  and StringBuffer object into TreeSet where sorting order is increasing length order.If two objects having same length then consider their alphabetical order


    */
  public static void main(String[] args)
  {
         TreeSet t=new TreeSet(new MyComparator());
         t.add(new StringBuffer("Apple"));
          t.add("Zebra");
          t.add("AA");
           t.add("Banana");
          t.add("Aerop");
          t.add("AA");
          t.add(new StringBuffer("Cat"));
          System.out.println(t);

   }
}
class MyComparator implements Comparator
{
     public int compare(Object obj1,Object obj2)
     {
           String s1=obj1.toString();
            String s2=obj2.toString();
             int length1=s1.length();
            int length2=s2.length();
            if(length1<length2)
                return -1;
           else if(length1>length2 )
                return +1;
           else 
                  return s1.compareTo(s2);
      }
}
 