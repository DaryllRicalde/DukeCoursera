
public class Part2 {
	public static String findSimpleGene(String dna, int startIndex, int endIndex) {
		
		String result = "";
		startIndex = dna.indexOf("ATG");
		if (startIndex == -1) {
			return result = "";
		}
		endIndex = dna.indexOf("TAA",startIndex + 3); // We want to look for the stop codon after the start codon
		if (endIndex == -1) {
			return result = "";
		}
		
		result = dna.substring(startIndex, endIndex + 3);
		
		//if indexOf() doesnt find its parameter, it returns the value -1
			
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String dna = "AATGCGTATGGT"; // no TAA
		String dna = "aatgcgtatggt";
		System.out.println("DNA strand is " + dna);
		String gene = findSimpleGene(dna, 0,11);
		System.out.println("Gene is " + gene);
		
		
		//dna = "AATGCTAGGGTAATAGGT"; 
		dna = "atgttataa"; // no ATG
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna,0,7).toLowerCase();
		System.out.println("Gene is " + gene);
		
		
		dna = "ATCATGCTCATGTTCGGCTGTAACTCTAATGT";
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna,9,19);
		System.out.println("Gene is " + gene);
		
		/*dna = "ATGTAA";
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);
		*/
	}

}
