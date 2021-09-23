package entities;

public class student {
	public String name;
	public double x;
	public double y;
	public double z;
	
	public double allNotes() {
		return x + y + z;
	}
	
	public double passOrNot() {
		if (allNotes() < 60.0) {
			return 60.0 - allNotes();
		} else {
			return 0.0;
		}
	}
}
