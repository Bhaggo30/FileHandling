import java.io.File;

public class CreateAFolder {
    public static void main(String[] args) {
        File file = new File("E:/Student");
        boolean result = file.mkdir();
        System.out.println(result);
    }
}
