package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Mapsub{
	
	private String userId;
	private String keyId;
	
	public Mapsub(String userId, String keyId) {
		super();
		this.userId = userId;
		this.keyId = keyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

}

public class MapEX02 {
	
	public static void main(String[] args) {
		
		Map<String, String> keyVal = new HashMap<>();
		
		keyVal.put("key1","m1");
		keyVal.put("key2","m2");
		keyVal.put("key3","m3");
		keyVal.put("key4","m4");
		keyVal.put("key5","m5");
		
		Set<String> keys = keyVal.keySet();
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next(); //key
			String val = keyVal.get(key); //key에 해당하는 value를 가져옴
			
			System.out.println("{"+key+":"+val+"}"); //{키(key):값(value)} <- 모양 기억해두기
		}
		
	}

}
