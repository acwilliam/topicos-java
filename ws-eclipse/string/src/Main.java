
public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIK ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05= original.substring(2,9);
		String s06= original.replace('a', 'x');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original" + original + "-");
		System.out.println("toLowerCase" + s01 + "-");
		System.out.println("toUpperCase"+ s02 + "-");
		System.out.println("trim" + s03 + "-");
		System.out.println("substring" + s04 + "-");
		System.out.println("substring" + s05 + "-");
		System.out.println("repplace" + s06 + "-");
		System.out.println("indexOf : " + i);
		System.out.println("lastIndexOf : " + j);
	}

}
