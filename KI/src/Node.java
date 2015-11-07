
public class Node {
	private State state;
	private int pathCost;

	public Node(State s, int costs) {
		state = s;
		pathCost = costs;
	}
	
	public State getState() {
		return state;
	}
	
}
