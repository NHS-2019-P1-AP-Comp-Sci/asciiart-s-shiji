public class ASCIIArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		top1();
		top2();
		body();
		body();
		body();
		body();
		body();
		body();
		bottom();
	

	}

	public static void top1() {
		System.out.println("        |=|");
		System.out.println("        |=|");
		System.out.println("        |=|");
	}

	public static void top2() {
		System.out.println("         |");
		System.out.println("       /   \\");
		System.out.println("     /       \\");
	    System.out.println("   /           \\");
	    System.out.println(" /               \\");
	    System.out.println("|-----------------|");
	}
	
	public static void body() {
		System.out.println("|                 |");
	}
	
	public static void bottom() {
		System.out.println("|_________________|");
	}
}