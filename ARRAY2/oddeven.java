import java.util.Scanner;
class oddeven{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n;
		n=sc.nextInt();
		while(n%2==0){
			System.out.println("Even Number ");
			++n;

		}
		while(n%2!=0){
			System.out.println("Odd Number ");
			++n;

		}

	}
}