package charAt;
import java.util.Scanner;
public class returnLast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string");
String mike=scan.nextLine();
System.out.println(pizza(mike));

}
	public static String pizza(String apple){
		//get the 1st  char 
		char cl=apple.charAt(0);
		// gets 2md to last
		char cp=apple.charAt(apple.length()-2);
		return cl+" "+cp;
	}

	
	
}
