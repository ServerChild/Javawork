package list01;

import java.util.Vector;

public class Vector02 {
	public static void main(String[] args) {
		// Vector<> : ArrayList와 사용방법 동일
		Vector<String> vlist = new Vector<>();
		
		vlist.add("Vector");
		vlist.add("ArrayList");
		
		vlist.remove(0);
		vlist.remove("ArrayList");
	}
}
