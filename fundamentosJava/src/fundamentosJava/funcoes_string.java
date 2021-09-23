package fundamentosJava;

public class funcoes_string {

	public static void main(String[] args) {
		String original = "abcde ABCDE Abc aBC aBC abCb";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(3);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("ORIGINAL: - " + original + " -");
		System.out.println("TO LOWER CASE: - " + s01 + " -");
		System.out.println("TO UPPER CASE: - " + s02 + " -");
		System.out.println("TRIM: -" + s03 + "-");
		System.out.println("SUBSTRING(3): - " + s04 + " -");
		System.out.println("SUBSTRING(3, 9): - " + s05 + " -");
		System.out.println("REPLACE('a', 'x'): - " + s06 + " -");
		System.out.println("REPLACE('abc', 'xy'): - " + s07 + " -");
		System.out.println("indexOF('bc'): - " + i + " -");
		System.out.println("lastIndexOf('bc'): - " + j + " -");

		/*String s = "Potato Apple Lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	*/
	}

}
