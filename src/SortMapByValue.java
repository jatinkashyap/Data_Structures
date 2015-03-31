import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class SortMapByValue {
	public static void main(String[] args) {
		Map<String,Integer> m = new TreeMap<String,Integer>();
		m.put("java", 20);
	    m.put("C++", 45);
	    m.put("Java2Novice", 2);
	    m.put("Unix", 67);
	    m.put("MAC", 26);
		System.out.println(m);
		
		Set<Entry<String,Integer>> set = m.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set); 
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println(list);
		for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
	}
}
