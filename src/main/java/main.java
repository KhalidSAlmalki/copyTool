public class main {

    public static void main(String arg[]){

        copyFile copyFile = new copyFile("C:\\Users\\khalid\\Desktop\\codeSmellSample\\SourceCode\\java");

        readFile readFile = new readFile();

        // read file and get the list of path names

        String filename = "C:\\Users\\khalid\\Desktop\\javaSample.csv";
        for (String path:readFile.readFile(filename)) {

            if (!copyFile.copyFile(path)){
                System.out.println("fail to copy");
            }

        }


    }
}
