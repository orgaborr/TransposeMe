import java.util.ArrayList;

public class ChordProgression {
	private ArrayList<Chord> progression = new ArrayList<Chord>();
	
	public boolean addChord(Chord chord) {
		if(chord == null) {
			progression.add(chord);
			return true;
		}
		
		return false;
	}
	
	public boolean removeLastChord() {
		if(progression.isEmpty()) {
			System.out.println("Chord progression is empty");
			return false;
		}
		progression.remove(progression.size()-1);
		return true;
	}
	
	
}
