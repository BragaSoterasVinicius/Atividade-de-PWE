import java.util.*;
public class QuadradoECubo {
    public static void main(String args[]) {
      Scanner r = new Scanner(System.in);
      int n = r.nextInt();
      for(int i = 1;i<=n;i++)
      {
          System.out.println(i+" "+Math.pow(i, 2)+" "+Math.pow(i, 3));
      }
    }
}