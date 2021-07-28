import java.util.*;
class IteratorDemo
{
   public static void main(String[] args)
   {
        ArrayList al=new ArrayList();
         for(int i=0;i<=10;i++)
         al.add(i);
          System.out.println(al);
         Iterator itr=al.iterator();
         while(itr.hasNext())
          {
                 Integer ig=(Integer)itr.next();
                 if(ig%2==0)
                      System.out.println(ig);
                 else
                     itr.remove();

          }
         System.out.println(al);

   }

}