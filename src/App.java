
public class App {

	public static void main(String[] args) {
		Notes chords = new Notes();
		
		System.out.println(chords.getChord(0, false, false));
		System.out.println(chords.getChord(1, true, false));
		System.out.println(chords.getChord(2, false, true));
		System.out.println(chords.getChord(3, true, true));

	}

}
