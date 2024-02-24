import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// File paths
        System.out.print(">>> Introduce the path of the reading file: ");
        String inFilePath = scanner.nextLine();
        
        System.out.print(">>> Introduce the path of the writing file: ");
        String outFilePath = scanner.nextLine();

        // User preferences
        System.out.print(">>> Introduce the length of the search key: ");
        int keyLength = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

		scanner.close();
		
		//calling the function
		ProteinProcessApp App1=new ProteinProcessApp();
		App1.ProcessMethod(inFilePath, outFilePath, keyLength);
	}

}
