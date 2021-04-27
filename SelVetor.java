import java.util.*;
public class SelVetor
{
    public static void main(String args[]) {
      
      float[] A = new float[10];
      Scanner r = new Scanner(System.in);
      
      for(int i=0;i<10;i++)
      {
          A[i] = r.nextFloat();
          if (A[i]<=10)
          {
              System.out.println("A["+i+"] ="+A[i]);
          }
      }
    }
}