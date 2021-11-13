import java.io.File;
import java.io.IOException; //IOException class to handle error
public class CreateFile{
	public static void main(String[] args) {
	try{
		File obj=new File("D:\\FileHandling\\File1.txt");
		if(obj.createNewFile()){
			System.out.println("File Created "+obj.getName());
		} else {
			System.out.println("File Already exists.");
		}
		}catch(IOException e){
			System.out.println("En error occured "+ e.getMessage());
		}
	}
}
