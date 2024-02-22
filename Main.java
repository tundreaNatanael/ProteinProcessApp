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
        System.out.print(">>> Introduce the length of the first key: ");
        int key1Length = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

        System.out.print(">>> Introduce the length of the second key: ");
        int key2Length = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()

		scanner.close();
		
		//calling the function
		ProteinProcessApp App1=new ProteinProcessApp();
		App1.ProteinProcessAppMethod(inFilePath, outFilePath, key1Length+key2Length);
	}

}
