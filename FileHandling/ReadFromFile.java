import java.io.File; 
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFromFile{
	public static void main(String[] args) {
	try{
		File obj=new File("D:\\FileHandling\\File1.txt");
		Scanner reader=new Scanner(obj);
		while(reader.hasNextLine()){
			String data=reader.nextLine();
			System.out.println(data);
		} 
		reader.close();
		}catch(FileNotFoundException e){
			System.out.println("An Error occurred. "+e.getMessage());
		}
	}
}