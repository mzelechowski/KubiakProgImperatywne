package R6Pliki;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testy {
    public static void main(String[] args) throws IOException {
        String filePath = "testy.txt";
        int number = 1234567;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(Integer.toString(number));
        }catch(IOException e) {
            e.getMessage();
        }
        finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
        FileReader fr=new FileReader(filePath);
        int singleChar;
        while((singleChar=fr.read())!=-1){
            System.out.print((char) singleChar);
            //System.out.print(Integer.parseInt(Character.toString(singleChar)));
        }


    }
}
