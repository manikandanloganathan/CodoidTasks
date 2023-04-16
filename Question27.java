import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question27 {
    public static void main(String[] args) throws IOException {

        File f = new File("path"); // exmaple not i am mentioned a path

        f.createNewFile();

        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(); // writing

        bw.close();

        FileReader fr = new FileReader(f);

        BufferedReader br = new BufferedReader(fr);

        br.readLine(); // reading

    }
}
