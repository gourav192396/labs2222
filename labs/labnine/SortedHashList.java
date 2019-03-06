package labnine;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortedHashList {

	
	public List getValues(Map<String,String> map)
	{	
		List<String> list = new ArrayList<String>();
		
		for (String string : map.keySet()) {
			list.add(map.get(string));
		}
		
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		
		Map<String , String> map = new HashMap<String, String>();
		map.put("K1", "Tushar");
		map.put("K2", "Aditya");
		map.put("K3", "Ajay");
		map.put("K4", "Durvesh");
		map.put("K5", "Mohit");
	
		SortedHashList sortedHashList = new SortedHashList();
		
		List l = sortedHashList.getValues(map);
		
		for (Object object : l) {
			System.out.println(object);			
		}
	}

}
