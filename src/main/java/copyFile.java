import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class copyFile {


    private String destPathName;

    public  copyFile(String des){

        this.destPathName = des;
    }
    public boolean copyFile(String filePathName) {

        File source = new File(filePathName);
        File dest = new File(destPathName);
        try {

            FileUtils.copyFileToDirectory(source, dest);
            return true;
        } catch (IOException e) {

            e.printStackTrace();
            return false;

        }

    }
}
