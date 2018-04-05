package tdd;

import java.util.HashMap;
import java.util.Map;

public class Sheet {
	
	Map<String, String> myVals = new HashMap<String, String>();
	
	public String get(String string) {
		String lol = getLiteral(string);
		if(isNum(lol))
			return lol.trim();
		return getLiteral(string);
	}
	
	public String getLiteral(String str) {
		if (!myVals.keySet().contains(str))
			return "";
		return myVals.get(str);
	}
	
	public void put(String theCell, String string) {
		myVals.put(theCell, string);
	}
	
	private boolean isNum(String str) {
		try {
				double d = Double.parseDouble(str.trim());
		}
		catch (Exception e){
				return false;
		}
		return true;
	}
}
