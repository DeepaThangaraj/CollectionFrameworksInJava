import java.util.*;

class TreeSetDemo
{
    public static void main(String[] args)
    {
           TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
             t.add(120);
               t.add(300);
              t.add(112);
             t.add(10);
              t.add(50);
              System.out.println(t);

     }
}
class MyComparator implements Comparator<Integer>
{
    public int compare(Integer obj1,Integer obj2)
    {
          Integer I1=(Integer)obj1;
          Integer I2=(Integer)obj2;
         /*  if(I1 < I2)
               return +1;
          else if(I1>I2)
               return -1;
            else
                 return 0;  */
          //other way of sorting reverse order
         return -I2.compareTo(I1);
        //preserve insertion order
         //return +1;        
         //reverse inversion order
        //return -1;
        //onli first element wil be inserted and all other elements are considered as duplicates
        //return 0;
     }
}