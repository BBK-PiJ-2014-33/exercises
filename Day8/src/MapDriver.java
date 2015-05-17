//package week9;

//import week9.ArrayMap.Entry;

public class MapDriver {
	public static void main(String[] args) {
		MyMap mm = new ArrayMap();

		mm.put(6, "Betty");
		mm.put(7, "Fred");
		mm.put(3, "John");
		mm.put(70, "Joe");
		mm.put(3, "Esha");

		out(mm, 6);
		out(mm, 3);
		out(mm, 70);
	}

	private static void out(MyMap mm, Integer i){
		Entry e = mm.get(i);
		System.out.println(e.getValue());
	}
}
