import edu.duke.*;

public class Part4 {
	
	public static void findURL() {
		URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
		
		String yt = "youtube.com";
		
		for (String word: ur.words()) {
			 word = word.toLowerCase(); 
			 int index = word.indexOf("youtube.com");
			 if (index != -1) {
				 int begin = word.lastIndexOf("\"", index);
				 int end = word.indexOf("\"", begin + 1);
				 
				 System.out.println(word.substring(begin +1,end));
			 }
		}
	}
	
	public static void main(String[] args) {
		findURL();
	}
}