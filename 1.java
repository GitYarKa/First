import java.util.Scanner; 

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, abuf, bbuf;
		System.out.println("Ââåäèòå 2 ÷èñëà. Îòâåòîì áóäåò òî ÷èñëî, êîòîðîå áëèæå ê 10");
		a = scan.nextInt();
		b = scan.nextInt();
		abuf = Math.abs(a - 10);
		bbuf = Math.abs(b - 10);
		if (abuf > bbuf)
			System.out.println("Îòâåò: " + b);
		else
			System.out.println("Îòâåò: " + a);
		scan.close();
		
	}
}
