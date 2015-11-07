import java.util.ArrayList;


public class BreathFirstSearch  extends Search{
	Node actualNode;
	ArrayList<Node> frontier;
	ArrayList<State> explored;
	
	@Override
	public Node search(Problem p) {
		//new Node with initialState and pathCost 0
		actualNode = new Node(p.initialState,0);
		if (p.goalTest(actualNode.getState())) {
			return actualNode;
		}
		frontier = new ArrayList<Node>();
		frontier.add(actualNode);
		
		explored = new ArrayList<State>();
		
		//loop
			if (frontier.size() == 0) {
				return null;
			}
			
			actualNode = frontier.get(0);
			frontier.remove(0);
			explored.add(actualNode.getState());
			
/*			for each action in problem.Actions(node.State)
			child ← Child-Node(problem, node, action)
			if child.State not in explored or frontier then
			if problem.Goal-Test(child.State then return Solution(child) frontier ← Insert(child,frontier)	
			*/
		
		return null;
	}

}
