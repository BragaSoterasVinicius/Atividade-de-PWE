import java.util.*;
public class MenorPosi
{
    public static void main(String args[]) {
        int contador;
        int menorz;
        int pos;
        String resto;
        
        Scanner r = new Scanner(System.in);
        contador = r.nextInt();
        
        int[] todonum = new int[contador];
        resto = r.next();
        String todonum[] = resto.split(" ");
        
        menorz=todonum[0];
        for(int i=0;i<contador;i++)
        {
            if(todonum[i]<menorz)
            {
                menorz=todonum[i];
                pos=i;
            }
        }
        System.out.println("Menor valor: "+menorz);
        System.out.println("Posicao: "+pos);
     
    }
}