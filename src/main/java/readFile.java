import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class readFile {


    public ArrayList<String> readFile(String filePath){

        ArrayList<String> list = new ArrayList();
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null){
                list.add(st);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
