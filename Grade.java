/**
* Name: Jervin Benitez
* Section: IT Dept - Devotion
* Year: 4th Year
*/

package benitez;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ibutang =new Scanner(System.in);
		int Grado=1;
		int tanan=0;
		int gibalik=0;
		
		while(Grado==1){
		    System.out.print("Ibutang imong Grado:");
		    int grado=ibutang.nextInt();
		    
		    tanan+=grado;
		    gibalik+=Grado;
		    
		    System.out.println("Mobalik pakag butang sa imong grado??\n[1]YES   [2]NO:");
		    Grado=ibutang.nextInt();
		    
		}
		tanan=tanan/gibalik;
		System.out.printf("Tanan nimong Average:" + tanan);
    }	
}