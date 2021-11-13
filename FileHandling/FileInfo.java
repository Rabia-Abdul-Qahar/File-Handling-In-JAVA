import java.io.File;
public class FileInfo{
	public static void main(String[] args) {
		File obj=new File("D:\\FileHandling\\File1.txt");
		if(obj.exists()){
			System.out.println("File name "+obj.getName());
			System.out.println("Absolute Path "+obj.getAbsolutePath());
			System.out.println("Writeable "+obj.canWrite());
			System.out.println("Readable "+obj.canRead());
			System.out.println("File name "+obj.getName());
			System.out.println("File size in bytes "+obj.length());
		} else{
			System.out.println("The File doesn't exist.");
		}
	}
}