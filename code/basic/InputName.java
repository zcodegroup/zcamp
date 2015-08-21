import java.util.Scanner;
public class InputName{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Selamat belajar, " + name);
	}
}