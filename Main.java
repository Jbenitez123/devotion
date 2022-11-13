/*
* Name : Jervin Benitez
* Section: IT Dept
* Year : 4th
*/

Submit your solution for the assignment I gave last week on github.
Assignment problem:
// write a program that ask the user to enter a grade.
// if yes, the user will enter a grade
 // while the user chooses yes, the user keeps on entering a grade
 // when the user chooses no, display the average of the grades entered.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner akongIbutang=new Scanner(System.in);
		int Grado=1;
		int tibuok=0;
		int gibalik=0;
		
		while(Grado==1){
		    System.out.print("Isulat imong Grado:");
		    int grado=akongIbutang.nextInt();
		    
		    tibuok+=grado;
		    gibalik+=Grado;
		    
		    System.out.println("Gusto paka mo sulat ug balik sa imong grado?\n[1]Oh   [2]Dili na: ");
		    Grado=akongIbutang.nextInt();
		    
		}
		tibuok=tibuok/gibalik;
		System.out.print("Grado nimo sa tanan kay:" + tibuok);
        }	
}