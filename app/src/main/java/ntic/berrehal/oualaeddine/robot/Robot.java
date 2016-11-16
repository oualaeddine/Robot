package ntic.berrehal.oualaeddine.robot;

public abstract class Robot {

	String nom;
	int vitesse;
	Position position;
	enum Direction {Nord,Sud,Est,Ouest};
	Direction direction;
	Map map;

	
	public Robot(){
		position = new Position (0,0);
		direction = Direction.Nord;
	}
	
	public Robot(String nom){
		this.nom = nom;
	}
	
	public Robot(String nom, int vitesse, Position position, Direction direction) {
		super();
		this.nom = nom;
		this.vitesse = vitesse;
		this.position = position;
		this.direction = direction;
	}

	abstract void deplacerEst();
	abstract void deplacerOuest();
	abstract void deplacerNord();
	abstract void deplacerSud();

	abstract void stop();
	abstract void demarrer();
	void tournerDroite(){
		if (direction == Direction.Nord){
			direction = Direction.Est;
		}
		else{
			if (direction == Direction.Est){
				direction = Direction.Sud;
			}
			else {
				if (direction == Direction.Sud){
					direction = Direction.Ouest;
				}
				else{
					direction = Direction.Nord;
				}
			}
		}
	}
	
	Position getPosition() {
		return position;
	}
	String setPresenter(){
		return "Nom:"+nom+"position:"+position;
	}
}
