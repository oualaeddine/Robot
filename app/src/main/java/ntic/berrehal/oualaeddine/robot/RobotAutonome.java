package ntic.berrehal.oualaeddine.robot;

public class RobotAutonome extends Robot {

	private int vitesse;
	private Integer robotImg = R.drawable.hi;

	public RobotAutonome() {

		vitesse = 0;
	}
	

	public RobotAutonome(int vitesse) {
		super();
		this.vitesse = vitesse;
	}


	@Override
	void deplacerEst() {

	}

	@Override
	void deplacerOuest() {

	}

	@Override
	void deplacerNord() {

	}

	@Override
	void deplacerSud() {

	}

	@Override
	void demarrer() {

	}

	@Override
	void stop(){
		vitesse = 0;
		System.out.println(position);
	}

	public void accelerer() {
		vitesse++;
	}

    public Integer getRobotImg() {
        return robotImg;
    }
}

