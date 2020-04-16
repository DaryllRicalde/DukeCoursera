
public class Part1 {
	
	public static String findSimpleGene(String dna) {
		
		String result = "";
		int startIndex = dna.indexOf("ATG");
		if (startIndex == -1) {
			return result = "";
		}
		int endIndex = dna.indexOf("TAA",startIndex + 3); // We want to look for the stop codon after the start codon
		if (endIndex == -1) {
			return result = "";
		}
		
		result = dna.substring(startIndex, endIndex + 3);
		
		//if indexOf() doesnt find its parameter, it returns the value -1
			
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Test Cases:
		 * DNA with no "ATG"
		 * DNA WITH NO "TAA"
		 * DNA with no "ATG" or "TAA"
		 * DNA with "ATG", "TAA" and the substring
		 * between them is a multiple of 3 (a gene)
		 * DNA with "ATG", "TAA" and the substring between
		 * them is not a multiple of 3
		
		*/
		
		String dna = "AATGCGTATGGT"; // no TAA
		System.out.println("DNA strand is " + dna);
		String gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);
		
		
		//dna = "AATGCTAGGGTAATAGGT"; 
		dna = "TTATAA"; // no ATG
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);
		
		dna = "ATCATGCTCTTCGGCTGCTCTAATGT";
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);
		
		dna = "ATGTAA";
		System.out.println("DNA strand is " + dna);
		gene = findSimpleGene(dna);
		System.out.println("Gene is " + gene);
	}

}
