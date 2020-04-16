
public class Part3 {

	public static boolean twoOccurences(String stringa, String stringb) {
		
		int count = 0;
		int lastIndex = 0;
		
		while (lastIndex != -1) {
			lastIndex = stringb.indexOf(stringa,lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += stringa.length(); //skip to the index after the first occurence of stringa
			}
		}
		if(count > 1) {
			return true;
		}
		else 
			return false;
	}
	
	public static String lastPart(String stringa, String stringb) {
		
		String result = "";
		
		int firstOccurence = stringb.indexOf(stringa,0);
		if (firstOccurence == -1) {
			return stringb;
		}
		else 
		result = stringb.substring(firstOccurence + stringa.length(),stringb.length());
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringa = "an";
		String stringb = "banana";
		
		boolean occurence = twoOccurences(stringa,stringb);
		
		System.out.println("The first string is " +stringa);
		System.out.println("The second string is " +stringb);
		System.out.println("Does the first string occur twice in the second string? " +occurence);
		
		stringa = "zoo";
		stringb = "forest";
		occurence = twoOccurences(stringa,stringb);
		System.out.println("The first string is " +stringa);
		System.out.println("The second string is " +stringb);
		System.out.println("Does the first string occur twice in the second string? " +occurence);
		
		System.out.println("");
		
		stringa = "an";
		stringb = "banana";
		String lastPart = lastPart(stringa,stringb);
		System.out.println("The first string is " +stringa);
		System.out.println("The second string is " +stringb);
		System.out.println("The part of the string after " +stringa + " is " +lastPart);

		System.out.println("");
		
		stringa = "zoo";
		stringb = "forest";
		lastPart = lastPart(stringa,stringb);
		System.out.println("The first string is " +stringa);
		System.out.println("The second string is " +stringb);
		System.out.println("The part of the string after " +stringa + " is " +lastPart);
	}

}
