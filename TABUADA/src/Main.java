import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int n, m;

		System.out.println("---------------------------");
		System.out.println("QUAL TABUADA VOCÊ QUER VER?");
		System.out.println("---------------------------");
		System.out.println("   ");
		n = sc.nextInt();
		System.out.println("  ");
		while (cont <= 10) {
			m = n * cont; 
			System.out.println(n + " X " + cont + " = " + m);
			cont += 1;
		}
		System.out.println("  ");
		System.out.println("--------------------------");
		System.out.println("APROVEITE SEUS ESTUDOS....");
		System.out.println("--------------------------");
		
		sc.close();
	}
}