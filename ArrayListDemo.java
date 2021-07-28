import java.util.*;
class ArrayListDemo
{
   public static void main(String[] args)
    {
               ArrayList al=new ArrayList();
                al.add("A");
                al.add(1);
                 al.add("B");
                  al.add(null);
                  System.out.println(al);
                   al.remove(2);
                System.out.println(al);
                 al.add(2,"C");
                 al.add("E");
                System.out.println(al);

     }

}