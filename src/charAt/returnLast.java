package charAt;
import java.util.Scanner;
public class returnLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a string");
Scanner scan=new Scanner(System.in);
String mike=scan.nextLine();

int index=mike.length()-1;
System.out.println(mike.charAt(index));
	}

}
