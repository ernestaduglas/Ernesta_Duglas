import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner reader = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = reader.nextInt();
		System.out.print("Enter second number: ");
		int b = reader.nextInt();

	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int substract(int a, int b){
	return a-b;
}
	public static double divide(int a, int b){
	return a/b;
}
	public static int multiply(int a, int b, int c) {
	return a*b*c;
}
	public static double sqRoot(int a) {
	return Math.sqrt(a);
}
	public static double power(int a, int b){
	return Math.pow(a,b);
}
}
