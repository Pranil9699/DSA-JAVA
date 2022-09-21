import java.util.Scanner;

public class Pattern_q {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		System.out.println("Enter How many Rows y Want ");
int ROW = sc.nextInt();

// 1 
//System.out.println("The half Pyramid ");
//for(int i = 0  ; i < ROW ; i++) {
//	for(int j =0 ; j<=i ; j++)
//		System.out.print(" * ");
//	System.out.println();
//}

// 2
//System.out.println("The invert half Pyramid ");
//for(int i = 0  ; i < ROW ; i++) {
//	for(int j =ROW-i ; j>0 ; j--)
//		System.out.print(" * ");
//	System.out.println();
//}

// 3
//System.out.println("The Mirror half Pyramid ");
//for(int i = 0  ; i < ROW ; i++) {
//	for(int j =ROW-i ; j>0 ; j--)
//		System.out.print("   ");
//	for(int k = 0; k<=i ; k++)
//		System.out.print(" * ");
//	System.out.println();
//}

// 4
//System.out.println("The invert Mirror half Pyramid ");
//for(int i = 0  ; i < ROW ; i++) {
//	for(int j =0 ; j<i; j++)
//		System.out.print("   ");
//	for(int k = ROW-i; k>0; k--)
//		System.out.print(" * ");
//	System.out.println();
//}

// 5
//System.out.println("Full Pyramid ");
//for(int i = 0  ; i < ROW ; i++) {
//for(int j =ROW-i ; j>0 ; j--)
//	System.out.print("   ");
//for(int k = 0; k<=i ; k++)
//	System.out.print(" * ");
//if(i>=1) {
//	for(int l=0 ; l<i ; l++)
//		System.out.print(" * ");
//}
//System.out.println();
//}

// 6 
System.out.println("Invert Full Pyramid ");
for(int i = 0  ; i < ROW ; i++) {
for(int j =0 ; j<i; j++)
	System.out.print("   ");
for(int k = ROW-i; k>0; k--)
	System.out.print(" * ");
for(int l=ROW-i+1; l>0;l--) {
System.out.print(" * ");
}
System.out.println();
}
		}
		catch(Exception e) {
			System.out.println("Exception Occurs");
		}
	}
}
