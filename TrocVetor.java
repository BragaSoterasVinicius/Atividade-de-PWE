import java.util.*;
public class TrocVetor
{
    public static void main(String args[]) {
      int extra = 0;
      int[] N = new int[20];
      Scanner r = new Scanner(System.in);
      
      for(int i=0;i<20;i++)
      {
          N[i] = r.nextInt();
      }
      for(int o=0;o<10;o++)
      {
          extra = N[19-o];
          N[19-o] = N[o];
          N[o]=extra;
      }
      for(int i=0;i<20;i++)
      {
          System.out.println("N["+i+"] = "+N[i]);
      }
    }
}