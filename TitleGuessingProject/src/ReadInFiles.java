
import javax.swing.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadInFiles {
    String fileName;

    public ReadInFiles(){
        this.fileName = "movies.txt";
    }

    public  ReadInFiles(String fileName){
        this.fileName = fileName;
    }


    public Scanner read() throws FileNotFoundException {
        File file = new File(this.fileName);
        Scanner scanner = new Scanner(file);
        return scanner;
    }
}
