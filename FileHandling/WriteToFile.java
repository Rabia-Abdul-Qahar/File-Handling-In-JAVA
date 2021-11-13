import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile{
	public static void main(String[] args) {
		try{
			FileWriter obj=new FileWriter("D:\\FileHandling\\File1.txt");
			obj.write("There is no recipe, there is no one way to do things — there is only your way.");
			obj.close();
			System.out.println("Successfully wrote to the file!!");
		}catch(IOException e){
			System.out.println("An Error occured."+e.getMessage());
		}
	}
}