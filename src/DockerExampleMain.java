import java.util.Scanner;

public class DockerExampleMain {

	public static void main(String[] args) {
		System.out.println("System start");
		while(true) {
			System.out.print("Enter message: ");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			System.out.println("msg = ".concat(s));
			if("exit".equals(s)) {
				System.out.println("System exit!");
				break;
			}
		}
	}

}
