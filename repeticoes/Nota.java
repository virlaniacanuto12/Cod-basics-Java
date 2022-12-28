import java.util.Scanner;
public class Nota {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nota;

        do{
            System.out.println("Informe uma nota de 0 a 10:");
            nota = sc.nextInt(); 
            if(nota < 0 | nota > 10) System.out.println("Nota inválida.");      
        }while(nota < 0 | nota > 10) ;
        
    }
}
