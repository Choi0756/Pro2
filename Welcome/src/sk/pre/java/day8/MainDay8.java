package sk.pre.java.day8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainDay8 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		MainDay8 day8 = new MainDay8();
		day8.test1();
	}
	
	public void test1() {
		TestFile tf = new TestFile();
		//tf.connectFile();
		try {
			tf.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
