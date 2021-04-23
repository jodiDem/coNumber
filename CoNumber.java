import java.util.Scanner;
public class CoNumber
{
    public static void main()
    {
       System.out.print('\u000c');
       Scanner leer = new Scanner(System.in);
       System.out.println("Casos: ");
       int ent = leer.nextInt();
       System.out.println("Coordinadas: ");
       
       for (int i=0; i < ent; i++)
       {
          int coorsx = leer.nextInt();
          int coorsy = leer.nextInt();
          int output = 0;
          
          if ((coorsx % 2 == 0) && (coorsy % 2 == 0))
          {
             output = coorsx + coorsy; 
             System.out.println(output);
          }
          else 
             if ((coorsx % 2 != 0) && (coorsy % 2 != 0))
             {
                output = coorsx + coorsy; 
                System.out.println(output);
             }
             else 
             {
                 System.out.println("No número");
                }
          
          
       }      
    }
}
