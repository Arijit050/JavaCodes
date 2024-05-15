package thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Arijit");
		map.put(2, "Bishal");
		map.put(3, "Vivek");
		map.put(1, "Ashish");

		// 1 way to traverse a Map, Turn the map into Set then use the for loop
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		//2) Second way to iterate a map.Get the keys as a Set then traverse the keys and the values through the keys
		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			System.out.println(k + " " + map.get(k));
		}
	}

}
