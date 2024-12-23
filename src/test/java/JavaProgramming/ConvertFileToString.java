package JavaProgramming;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ConvertFileToString {

    String path=System.getProperty("user.dir")+"\\Dummy.txt";
    @Test
    public void ConvertFileToString() throws IOException {
        // C:\Users\DELL\IdeaProjects\Rest\Dummy.txt
        Charset encoding=Charset.defaultCharset();
        byte []encoded=Files.readAllBytes(Paths.get(path));
        String lines=new String(encoded);
        System.out.println(lines);
    }

    @Test
    public void appendIntoFile() throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(new File(path)));

        //One Way
//        int i;
//        while ((i=reader.read())!=-1){
//            System.out.print((char)i );
//        }

        //2nd Way
        String name;
        while ((name = reader.readLine()) != null) {
            System.out.println(name);
        }
        reader.close();
    }
}
