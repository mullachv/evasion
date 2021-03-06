package evasion.prey.strategies;
import evasion.Board;
import evasion.prey.PreyMove;

public abstract class AbsPreyStrategy {
	
	public abstract PreyMove makeAMove(Board bd);
	
	public boolean isAValidMove(PreyMove hm) {
		return false;
	}
	
	public PreyMove bounceAdjustMove(PreyMove hm) {
		return null;
	}
	public static AbsPreyStrategy getStrategy(String str) {
		switch (str) {
			case "R":
				return new PRRandomV1();
			case "W":
				return new MaxSpaceStrategy();
			case "F":
				return new FellowHunterStrategy();				
			default:
				return new PRRandomV1();
		}
	}
}
