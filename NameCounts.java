package week4;

import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	
	public void run() {

	HashMap<String,Integer> nameMap = new HashMap<String,Integer>();
		 readNames(nameMap);
		 printMap(nameMap);
	}

	private void readNames(Map<String,Integer> map) {
		while (true) {
		String name = readLine("Enter name: ");
		if (name.equals("")) break;
		
		Integer count = map.get(name);
		if (count == null) {
			count = 1;
		} else {
			count++;
		}
		map.put(name, count);
			}
		}
		
	private void printMap(Map<String,Integer> map) {
		 for(String key : map.keySet()){
		 int count = map.get(key); 
		 println("Entry [" + key + "] has count " + count);
		 }
	}
		
}
	
