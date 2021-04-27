import java.util.*;
public class TipoDeCombustivel 
{
    public static void main(String args[]) {
      int alcol=0;
      int gasol=0;
      int diesel=0;
      int n = 0;
      Boolean o = true;
      Scanner r = new Scanner(System.in);
      while(o)
      {
          n = r.nextInt();
          
          if (n>4 || n<1)
          {
              if(n==1)
              {
                  alcol++;
              }
              
              if(n==2)
              {
                  gasol++;
              }
              
              if(n==3)
              {
                  diesel++;
              }
              
              if(n==4)
              {
                  
                  System.out.println("MUITO OBRIGADO");
                  System.out.println("Alcool: "+alcol);
                  System.out.println("Gasolina: "+gasol);
                  System.out.println("Diesel: "+diesel);
                  o = false;
              }
          }
        }
    }
}