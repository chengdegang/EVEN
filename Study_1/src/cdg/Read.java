package cdg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	 public void readFromFile(String path) throws IOException{
	        File file = new File(path);
	        BufferedReader reader = new BufferedReader(new FileReader(file));

	        String content ="";
	        String tmp = "";

	        while((tmp = reader.readLine()) != null){
	            content += tmp;
	            content+="\n";
	        }

	        System.out.println(content);

	        reader.close();

	    }

	 public static void main(String[] args) throws IOException {
		String path ="C:\\Users\\thinkpad\\Desktop\\application.yml";
		Read a = new Read();
		a.readFromFile(path);	
	}
}

