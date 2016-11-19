package ntic.berrehal.oualaeddine.robot.das;
public abstract class Robot {

	String nom;
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
	
	public Robot(String nom,Position position, Direction direction) {
		super();
		this.nom = nom;
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
	
	public Position getPosition() {
		return position;
	}
	public String sePresenter(){
		return "Nom:"+nom+"\tposition:"+position;
	}
}
