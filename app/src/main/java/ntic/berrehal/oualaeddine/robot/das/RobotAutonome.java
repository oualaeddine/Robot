package ntic.berrehal.oualaeddine.robot.das;
public class RobotAutonome extends Robot {

	private int vitesse;
	public RobotAutonome() {
		super();
        this.vitesse = 2;
	}

    public RobotAutonome(String nom) {
        super(nom);
    }

    public RobotAutonome(int vitesse) {
		super();
		this.vitesse = vitesse;
	}

	@Override
	void deplacerEst() {
		position.setX(position.getX()+vitesse);
	}

	@Override
	void deplacerOuest() {
		position.setX(position.getX()-vitesse);
	}

	@Override
	void deplacerNord() {
		position.setY(position.getY()+vitesse);
	}

	@Override
	void deplacerSud() {
		position.setY(position.getY()-vitesse);
	}

	@Override
	void demarrer() {
		vitesse=2;
		System.out.println("Je suis pr�t");
	}

	@Override
	void stop(){
		vitesse = 0;
		System.out.println(position);
	}

	public void accelerer() {
		if(vitesse+1<=10)
			vitesse++;
		else
			System.out.println("Error");
	}

	public void accelerer(int v){
		if(vitesse+v<=10){
			vitesse=+v;
		}
		else System.out.println("Error");
	}
	public void decelerer(){
		if(vitesse-1>=0)
			vitesse--;
		else
			System.out.println("Error");
	}
	public void decelerer(int v){
		if(vitesse-v>=0){
			vitesse=-v;
		}
		else System.out.println("Error");
	}
	public int getVitesse(){
		return vitesse;
	}
	public void setVitesse(int v){
		this.vitesse=v;
	}
}
