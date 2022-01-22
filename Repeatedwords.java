package com.all_concepts;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Repeatedwords {
	public static void main(String[] args) {
		String Str = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy";
		List<String> St = Pattern.compile(" ").splitAsStream(Str).collect(Collectors.toList());
		Map<String,Integer> m= new LinkedHashMap<String,Integer>();
		for(String word:St) {
			if(m.containsKey(word)) {
			Integer value=m.get(word);
			m.put(word,value +1);
			}
			else {
				m.put(word, 1);
			
				
			}
		}
		System.out.println(m);
	Set<Entry<String, Integer>> Entry = m.entrySet();
	for (Entry<String, Integer> Es: Entry) {
		if(Es.getValue()>1) {
		System.out.println(Es);
	}
	}
	}
}


	
		
		
	
	
	
	
	
	
	
	
	
	
	

