
public class Chord extends Notes{
	private String note;
	private boolean isMinor;
	private boolean sus7;
	
	//return null if note is not found
	public Chord(String note, boolean isMinor, boolean sus7) {
		for(int i=0; i<11; i++) {
			if(note.equalsIgnoreCase(getNote(i))) {
				this.note = getNote(i);
				break;
			}
		}
		
		this.isMinor = isMinor;
		this.sus7 = sus7;
	}
		
	public String toString() {
		if(isMinor && !sus7) {
			return note+"m";
		} else if(!isMinor && sus7) {
			return note+"7";
		} else if(isMinor && sus7) {
			return note+"m"+"7";
		} else {
			return note;
		}
	}
}
