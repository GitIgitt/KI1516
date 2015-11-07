import java.util.ArrayList;


public class Problem {
	State initialState;
	State goal;
	Action[] possibleActions = new Action[10]; 
	
	
	public Problem() {
		initialState = new State(3,3,1);
		goal = new State (0,0,0);
		
		possibleActions[0] = new Action(-2, 0, -1);
		possibleActions[1] = new Action(-1, -1, -1);
		possibleActions[2] = new Action(0, -2, -1);
		possibleActions[3] = new Action(-1, 0, -1);
		possibleActions[4] = new Action(0, -1, -1);
		possibleActions[5] = new Action(2, 0, 1);
		possibleActions[6] = new Action(1, 1, 1);
		possibleActions[7] = new Action(0, 2, 1);
		possibleActions[8] = new Action(1, 0, 1);
		possibleActions[9] = new Action(0, 1, 1);
	}
	
	public boolean goalTest(State s) {
		return	s.equals(goal);
	}
	
	public ArrayList<Action> actions (State actualState) {
		ArrayList<Action> allowedActions = new ArrayList<Action>();
		for (Action action:possibleActions) {
			State s = new State (actualState.getX() + action.getChangeX(), 
					actualState.getY() + action.getChangeY(), 
					actualState.getZ() + action.getChangeZ());			
		}
		return allowedActions;
	}
	
	public boolean stateTest(State s) {
		if (s.getX() < 0 || s.getX() > 3) {
			return false;
		}
		
		if (s.getY() < 0 || s.getY() > 3) {
			return false;
		}
		
		if (s.getZ() < 0 || s.getZ() > 1) {
			return false;
		}
		
		
		//missonaries are eaten right
		if (s.getX() < s.getY() && s.getZ() == 0) {
			return false;
		}	
		
		//missionaries are eaten left
		if (s.getX() > s.getY() && s.getZ() == 1) {
			return false;
		}
		
		return true;
	}
	
}
