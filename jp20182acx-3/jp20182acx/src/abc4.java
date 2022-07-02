public class abc4 {
  public static void main(String s[])
    {
     long k1 =   System.currentTimeMillis();
     
     for(int i=1;i<=1000;i++)
         System.out.println("a");
     
     long k2 =   System.currentTimeMillis();
     
     System.out.println(k2-k1);
    }    
}
