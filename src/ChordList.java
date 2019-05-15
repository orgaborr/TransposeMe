
public class ChordList {
	private final String[] chords = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	
	//returns the chord at a specific index, and checks if it is minor or suspended7
	public String getChord(int element, boolean minor, boolean sus7) {
		if(minor && !sus7) {
			return chords[element]+"m";
		} else if(!minor && sus7) {
			return chords[element]+"7";
		} else if(minor && sus7) {
			return chords[element]+"m"+"7";
		} else {
			return chords[element];
		}
	}
	
}
