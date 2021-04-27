import java.util.*;
public class SomaImpar {
    public static void main(String args[]) {
      Scanner r = new Scanner(System.in);
      int x = r.nextInt();
      int y = r.nextInt();
      int soma = 0;
      int maior = 0;
      int menor = 0;
      
      if (x>=y)
      {
          maior = x;
          menor = y;
      }
      if (x<=y)
      {
          maior = y;
          menor = x;
      }
      menor=menor+1;
      while(menor<maior)
      {
          if (menor%2==1)
          {
              soma = soma + menor;
          }
          menor=menor+1;
      }
      System.out.println(soma);
    }
}