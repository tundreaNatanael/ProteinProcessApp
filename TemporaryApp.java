import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;


public class TemporaryApp {

//	public static void ProteinIndexing(String inFilePath, String outFilePath, int keyLength)
//	{
//		Map<String, Integer> map = new HashMap<>();
//		try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath))) {
//			// Initializing what is needed
//			String line1;
//			StringBuilder protein=new StringBuilder();
//         // Go line by line and processing the strings
//            while ((line1 = reader.readLine()) != null) 
//            {
//            	StringBuilder line= new StringBuilder(line1);
//            	System.out.println("pas");
//                if(line.length() > 0 && line.charAt(0) == '>')
//                {
//                	int proteinLength = protein.length();
//                	if(proteinLength>=keyLength)
//                	{
//                		for(int index=0; index<=proteinLength-keyLength; index++)
//                		{
//                			StringBuilder key= new StringBuilder();
//                			// Forming the key
//                			for(int i=index; i<index+keyLength; i++)
//                				key.append(protein.charAt(i));
//                			//updating the map
//                			if(map.containsKey(key.toString()))
//                				map.put(key.toString(), map.get(key.toString())+1);
//                			else
//                				map.put(key.toString(), 1);
//                		}
//                	}
//                	protein.setLength(0);
//                }
//                else
//                	protein.append(line);
//            }
//
//        } catch (IOException e) {
//            // Handle IOException (e.g., file not found or unable to read)
//            e.printStackTrace();
//        }
//		
//		// Write the CSV file
//		try (FileWriter csvWriter = new FileWriter(outFilePath)) {
//            // Writing header if needed
//            csvWriter.append("Key,Value\n");
//
//            // Writing data
//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//                csvWriter.append(entry.getKey())
//                         .append(",")
//                         .append(entry.getValue().toString())
//                         .append("\n");
//            }
//
//            System.out.println("HashMap successfully written to CSV at: " + outFilePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
	
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
