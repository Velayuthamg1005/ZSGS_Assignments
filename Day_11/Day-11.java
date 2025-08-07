import java.io.*;
import java.util.*;

/*

	Day-11 Assignment Questions:

	1. Write a Java program to read the contents of a text file and display it on the console.
	
	2. Write a Menu driven Java program 
	a) to read content from the user and write it into another file and 
	b) from the file to another file 
	c) to modify the content of a file 
	d) to search for a particular word in a file and display how many times it appears 
	e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
		
	3. Write a Java program that reads a file and prints the number of lines, words, and characters.
	
	4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.
	
	5. Design a Java application to manage a product inventory system using file handling and object serialization.
	
		Create a class Product with the following attributes:
		--->int productId
		--->String name
		--->double price
		--->int quantity
		
	a. Ensure the class implements the Serializable interface.
	
	b. Methods: 
	--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
	--->View All Products: Read all product objects from the file and display them.
	--->Search Product by ID: Search for a product by productId in the file and display its details if found.
	--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
	--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
	--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and 
	efficiently.

*/

// 1. Write a Java program to read the contents of a text file and display it on the console.

class ReadFile{
	public static void main(String args[]){
		try{
			File obj=new File("LearnFile.txt");
			if(obj.createNewFile()){
				System.out.println("Successfully Created: "+obj.getName());
			}
			else{
				System.out.println("File Already exists");
			}
			
			FileWriter writer=new FileWriter(obj);
			writer.write("I am Learning File Handling");
			
			System.out.println("Content Added");
			writer.close();
			
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()){
				String data=sc.nextLine();
				System.out.println(data);
			}
			
			sc.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

/*
	2. Write a Menu driven Java program 
		a) to read content from the user and write it into another file and 
		b) from the file to another file 
		c) to modify the content of a file 
		d) to search for a particular word in a file and display how many times it appears 
		e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
	
*/

class MenuDrivenProgram{
	
	public static void writeAnotherFile() throws Exception{
		File file=new File("LearnFile.txt");
		File newFile=new File("NewFile.txt");
		FileWriter writer=new FileWriter(newFile);
		FileReader reader=new FileReader(file);
		BufferedReader buffReader=new BufferedReader(reader);
		
		String line;
		
		while((line=buffReader.readLine())!=null){
			writer.write(line);
		}
		System.out.println("New File Created and added");
		writer.close();
		buffReader.close();
	}
	
	public static void modifyContent() throws Exception{
		
		File file=new File("LearnFile.txt");
		FileReader reader=new FileReader(file);
		BufferedReader buffReader=new BufferedReader(reader);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Old word: ");
		String oldWord=sc.nextLine();
		
		System.out.print("Enter New word: ");
		String newWord=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		String line;
		
		while((line=buffReader.readLine())!=null){
			line=line.replace(oldWord,newWord);
			sb.append(line);
		}
		buffReader.close();
		
		FileWriter writer=new FileWriter(file);
		BufferedWriter buffWriter=new BufferedWriter(writer);
		buffWriter.write(sb.toString());
		buffWriter.close();
		
		System.out.println("Modified");

	}
	
	public static void searchWord() throws IOException {
		
		File file=new File("LearnFile.txt");
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String searchWord=sc.nextLine();

		FileReader reader=new FileReader(file);
        BufferedReader br=new BufferedReader(reader);
        
		int count=0;
        String line;
        while((line=br.readLine())!=null){
            String[] words = line.split("\\W+");
            for (String word:words) 
			{
                if (word.equalsIgnoreCase(searchWord)) 
				{
                    count++;
                }
            }
        }
		
        br.close();
        System.out.println("The word '" +searchWord + "' appeared " + count + " times.");
    }
	
	public static void copyCSV() throws IOException {
		File file=new File("LearnFile.txt");
		FileReader reader=new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        FileWriter fw=new FileWriter("products.csv");

        String line;
        while((line=br.readLine())!=null) 
		{
            fw.write(line +",\n");
        }

        br.close();
        fw.close();
        System.out.println("Successfully copied");
	}
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---Menu Driven Program---");
		System.out.println("1. Copy to Another File");
		System.out.println("2. Modify File");
		System.out.println("3. Search Word and Count");
		System.out.println("4. Read and Copy to csv file");
		System.out.print("Enter the choice: ");
		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
				writeAnotherFile();
				break;
			case 2:
				modifyContent();
				break;
			case 3:
				searchWord();
				break;
			case 4:
				copyCSV();
				break;
			default:
				System.out.println("Please choose anyone");
		}
		
	}
}


// 3. Write a Java program that reads a file and prints the number of lines, words, and characters.

class ReadFileOperations{
	public static void main(String args[]){
		int line_count=0;
		int word_count=0;
		int char_count=0;
		
		try{
			File file=new File("LearnFile.txt");
			FileReader reader=new FileReader(file);
			BufferedReader buffReader=new BufferedReader(reader);
			
			String line;
			
			while((line=buffReader.readLine())!=null){
				line_count++;
				
				String[] word=line.trim().split("\\s");
				word_count=word_count+word.length;
				char_count=char_count+line.length();
			}
			
			System.out.println("Number of Lines: "+line_count);
			System.out.println("Number of Words: "+word_count);
			System.out.println("Number of Characters: "+char_count);
		}
		catch(IOException e){
			System.out.println("Error "+e.getMessage());
		}
	}
}

// 4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.

class AppendText{
	public static void main(String args[]){
		try{
			Scanner sc=new Scanner(System.in);
			
			File file=new File("LearnFile.txt");
			FileWriter writer=new FileWriter(file,true);
			BufferedWriter buffWriter=new BufferedWriter(writer);
			
			System.out.print("Enter Text: ");
			String text=sc.nextLine();
			buffWriter.newLine();
			buffWriter.write(text);
			
		
			buffWriter.close();
			
			FileReader fReader=new FileReader(file);
			BufferedReader buffReader=new BufferedReader(fReader);
			
			String line;
			
			while((line=buffReader.readLine())!=null){
				System.out.println(line);
			}
			
			buffReader.close();
			sc.close();
			
		}
		catch(IOException e){
			System.out.println("Error"+e.getMessage());
		}
	}
}



