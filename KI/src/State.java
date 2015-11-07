
public class State {
	// number of missionaries right (<=3)
	private int x;
	// number of cannibals right (<=3)
	private int y;
	// number of boats right (<=3)
	private int z;
	
	public State (int x, int y, int z) {
		x = x;
		y = y;
		z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public boolean equals(State s) {
		if (s.getX() == x && s.getY() == y && s.getZ() == z) {
			return true;
		}
		
		return false;
	}
}
