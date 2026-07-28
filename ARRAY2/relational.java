import java.util.Scanner;
class relational{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter four Number");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			int d= sc.nextInt();

			System.out.println("Relational And Operator ");
            System.out.println((a>b)&&(c>d));
            System.out.println((a>b)&&(c<d));
            System.out.println((a<b)&&(c<d));

            System.out.println("Relational Or Operator ");
            System.out.println((a>b)||(c>d));
            System.out.println((a>b)||(c<d));
            System.out.println((a<b)||(c<d));

           System.out.println("Relational Not Operator ");
            System.out.println(!(a>b));
           

		}
	}
