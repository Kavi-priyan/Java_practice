package File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class handle {
public static void main(String[] args) throws IOException {

	
	  String str = "C:\\Users\\rkchi\\OneDrive\\Documents/kaby/abcd.txt";
	  String str1 = "C:\\Users\\rkchi\\OneDrive\\Documents/kaby/ab5cd.py";
	
	File f1=new File(str);
	File f2=new File(str1);
	
	FileOutputStream fo=new FileOutputStream(f1,true);
	
	fo.write(new byte[]{80, 111, 111, 107, 105, 101});
	fo.write(new byte[]{10});
	String data="Karrot";
	
	
	for (int i = 0; i < data.length(); i++) {
		fo.write(data.charAt(i));
		
	}
	
	fo.flush();
	fo.close();
	

	
     
	
  }
}
