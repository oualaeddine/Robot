package ntic.berrehal.oualaeddine.robot.das;
public class RobotProgramme extends Robot {
	public RobotProgramme() {
		super();
	}

	@Override
	public void deplacerEst() {
		position.setX(position.getX()+1);
	}

	@Override
	public void deplacerOuest() {

		if (position.getX()-1<=0){
			stop();
		}else{
			position.setX(position.getX()-1);
		}
	}

	@Override
	public void deplacerNord() {
		if (position.getY()+1<=map.getYrange()){
			stop();
		}else{
			position.setY(position.getY()+1);
		}
	}

	@Override
	public void deplacerSud() {
		if (position.getY()-1<=0){
			stop();
		}else{
			position.setY(position.getY()-1);
		}
	}

	@Override
	public void stop() {
		position.setX(0);
		position.setY(0);
	}

	@Override
	public void demarrer() {
		System.out.println("Je suis pr�t");
	}

}
