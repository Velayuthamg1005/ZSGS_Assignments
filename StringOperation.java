// --- stringutils: This package should include a class that defines methods for:

// a. Concatenating two strings
// b. Reversing a string
// c. Finding the length of a string


package stringutils;

public class StringOperation{
	
	public String concatStrings(String a,String b){
		return a+b;
	}
	
	public String reverseString(String s){
		
		String result="";
		
		char[] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			result=result+ch[i];
		}
		
		return result;
	}
	
	public int stringLength(String s){
		
		int count=0;
		
		for(char ch:s.toCharArray()){
			count++;
		}
		
		return count;
	}
	
}