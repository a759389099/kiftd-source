package kohgylw.kiftd.mc;

import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = Test.class.getResourceAsStream("/ws/schild/jave/native/ffmpeg-x86.exe");
		System.out.println(is);
	}

}
