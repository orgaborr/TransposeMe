
public class Chord extends Notes{
	private String note;
	private boolean isMinor;
	private boolean sus7;
	
	public Chord(String note, boolean isMinor, boolean sus7) {
		for(int i=0; i<11; i++) {
			if(note.equalsIgnoreCase(getNote(i))) {
				this.note = note;
			} else {
				System.out.println("Invalid note");
			}
		}
		this.isMinor = isMinor;
		this.sus7 = sus7;
	}
		
	




	public String getChord(int element, boolean minor, boolean sus7) {
		if(minor && !sus7) {
			return notes[element]+"m";
		} else if(!minor && sus7) {
			return notes[element]+"7";
		} else if(minor && sus7) {
			return notes[element]+"m"+"7";
		} else {
			return notes[element];
		}
	}
}
