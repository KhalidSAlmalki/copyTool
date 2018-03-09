public class main {

    public static void main(String arg[]){

        copyFile copyFile = new copyFile(" put here dir destination");

        readFile readFile = new readFile();

        // read file and get the list of path names

        String filename = " this is the file input which contain a list of path that needed to be copied ";
        for (String path:readFile.readFile(filename)) {

            if (!copyFile.copyFile(path)){
                System.out.println("fail to copy");
            }

        }


    }
}
