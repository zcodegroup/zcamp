import java.util.Scanner;
public class Kondisional{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Bagimana kondisi hari ini (hujan/cerah)? ");
		String kondisi = sc.nextLine();
		
		// Simple kondisional
		if ( kondisi.equals("cerah") ){
			System.out.println("Yeah.. kondisi cerah.. kita akan pergi memancing!");
		} else {
			System.out.println("Ugh... kita g akan berangkat memancing :(");
		}



	}
}