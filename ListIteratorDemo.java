import java.util.*;
class ListIteratorDemo
{
   public static  void main(String[] args)
   {
        LinkedList ll=new LinkedList();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("CustardApple");
         ll.add("Durian");
         System.out.println(ll);
         ListIterator ltr=ll.listIterator();
         while(ltr.hasNext())
         {
               String s=(String)ltr.next(); 
               System.out.println(s);

          }
          while(ltr.hasPrevious())
          {
                String s=(String)ltr.previous();
                 System.out.println(s);
           }
         
   }

}
