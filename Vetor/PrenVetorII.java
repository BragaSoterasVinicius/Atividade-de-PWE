import java.util.*;
public class PrenVetorII
{
    public static void main(String args[]) {
      
      int[] N = new int[100];
      int olde;
      Scanner r = new Scanner(System.in);
      N[0] = r.nextInt();
      System.out.println("N["+0+"] = "+N[0]);
      for(int i = 1; i<100; i++)
      {
          olde = N[i-1];
          N[i] = olde/2;
          System.out.println("N["+i+"] = "+N[i]);
      }
    }
}