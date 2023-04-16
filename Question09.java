import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question09 {
    public static void main(String[] args) throws IOException {

        File f = new File("sample.txt"); // only for exmaple path is not mentioned

        f.createNewFile(); // creating new file

        FileReader fr = new FileReader(f);

        BufferedReader br = new BufferedReader(fr);

        String s = "";

        while ((s = br.readLine()) != null) {

            System.out.println(s);
        }
    }
}
