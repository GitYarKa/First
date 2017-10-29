import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Ââĺäčňĺ 3 ÷čńëŕ. Îňâĺňîě áóäóň ęîđíč óđŕâíĺíč˙ ax^2+bx+c=0 čëč ńîîáůĺíčĺ î ňîě, ÷ňî ęîđíĺé íĺň");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (b*b - (4*a*c) < 0)
			System.out.println("Ęîđíĺé íĺň");
		else
		{
			if (b*b - (4*a*c) == 0)
				System.out.println("Îňâĺň: " + (-b/(2*a)));
			else
			{
				System.out.println("Îňâĺň 1: " + ((-b + Math.sqrt(b*b - (4*a*c)))/(2*a)));
				System.out.println("Îňâĺň 2: " + ((-b - Math.sqrt(b*b - (4*a*c)))/(2*a)));
			}
		}
		scan.close();
	}
}
