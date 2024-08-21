import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CreateAFolder {
    public static void main(String[] args) {
        File file = new File("E:/Student");
        boolean result = file.mkdir();
        System.out.println(result);

      //   create a file in folder
        File File1 = new File("E:/Student.txt");
        try{
            boolean result1 = File1.createNewFile();
            System.out.println(result1);
        }
        catch (IOException e){
            e.printStackTrace();

        }
        // delete file from a file
        File file2 = new File("E:/Student.txt");
        if (file2.exists()){
            file2.delete();
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("file not exit");
        }
        // rename a file from a file
        File f1 = new File("E:/Student.txt");
        File f2 = new File("E:/Employee.txt");
        System.out.println(f1.renameTo(f2));

        // modified the date in a file
        Date date = new Date(new File("E:/Employee.txt").lastModified());
        System.out.println(date);

    }

}
