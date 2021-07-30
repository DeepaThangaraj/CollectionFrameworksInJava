import java.util.*;
class HashMapDemo
{
  public static void main(String[] args)
  {
      HashMap m=new HashMap();
      m.put("Deepa",100);
      m.put("Dee",99);
      m.put("Deepu",101);
      System.out.println(m);
      System.out.println(m.put("Deepu",102));
      Set s=m.keySet();
       System.out.println(s);
       Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
       Iterator itr=s1.iterator();
       while(itr.hasNext())
       {
             Map.Entry m1=(Map.Entry)itr.next();
              System.out.println(m1.getKey()+"..."+m1.getValue());
              if(m1.getKey().equals("Dee"))
                     m1.setValue(100000);
           
        }
   System.out.println(m);

  }

}