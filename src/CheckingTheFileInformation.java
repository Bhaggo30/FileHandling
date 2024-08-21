import java.io.File;

public class CheckingTheFileInformation {
    public static void main(String[] args) {
        File file = new File("E:/Employee.txt");
        if (file.exists()){
            System.out.println("the name of the file :"+file.getName());
            System.out.println("the absoloute path of the file is :"+file.getAbsolutePath());
            System.out.println("check we can read the file or not :"+file.canRead());
            System.out.println("check we can write something in file or not :"+file.canWrite());
            System.out.println("check the length of the file is : "+file.length());
        }
        else{
            System.out.println("file does not exit");
        }
    }
}
