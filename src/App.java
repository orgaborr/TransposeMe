
public class App {

	public static void main(String[] args) {
		Notes notes = new Notes();
		
		Chord c = new Chord("C", false, false);
		System.out.println(c);
		
		Chord a = new Chord("a", true, false);
		System.out.println(a);
		
		Chord e = new Chord("E", false, true);
		System.out.println(e);
		
		Chord fSharp = new Chord("f#", true, true);
		System.out.println(fSharp);

	}

}
