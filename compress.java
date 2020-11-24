package week5;

public class compress {
		public static void compressme(String input) {
			input = input + " ";
			StringBuilder output = new StringBuilder();
			int count = 0; 
			for(int i=0;i < input.length()-1; i++) {
				
				if (input.charAt(i) == input.charAt(i+1)) {
					count++;
				}
				
				else {
					count ++;
					char c = input.charAt(i);
					output.append(c).append(count);
					count = 0;
				}
			}
			System.out.println(output);
		}
		
		public static void uncompressme(String input) {
			input = input + " ";
			StringBuilder output = new StringBuilder();
			for(int i=0 ; i < input.length()-1; i=i+2) {
				char c = input.charAt(i);
				int count = Character.getNumericValue(input.charAt(i+1)); 
				for(int j = 0; j < count; j++ ) {
				output.append(c);
				}
			}
			System.out.println(output);
			
		}
	public static void main(String[] args) {
		compressme("aaaAAABCCAABBBBCCDD");
		uncompressme("a3A3B1C2A2B4C2D2");
	}

}
