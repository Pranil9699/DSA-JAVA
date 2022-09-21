import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row");
		int row = sc.nextInt();
		System.out.println("Enter the Col");
		int col = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if ((j == 0 || j == col - 1) || (i == 0 || i == row - 1))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
