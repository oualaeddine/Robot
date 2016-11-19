
public class RobotEnergivore extends RobotAutonome{
	private int niveau;
	  public RobotEnergivore(){
	    super();
	    this.niveau=60;
	  }
	  public RobotEnergivore(int n){
	    super();
	    this.niveau=n;
	  }
	  
	  public void setNiveau(int n){
	    this.niveau=n;
	  }
	  public int getNiveau(){
	    return niveau;
	  }
	  public void deplacerNord(){
		  if(position.getY()<map.getYrange()){
			 for(int i=0;i<getVitesse();i++){
				 position.setY(position.getY()+1);
				 if(position.getY()==map.getYrange()){
					 for(int j=0;j<getVitesse()-i-1;j++){
						 position.setY(position.getY()-1);
						 i++;
					 }
				 }
			 }
		  }
		  else this.deplacerSud();
	  }
	  public void deplacerSud(){
		  if(position.getY()>0){
				 for(int i=0;i<getVitesse();i++){
					 position.setY(position.getY()-1);
					 if(position.getY()==map.getYrange()){
						 for(int j=0;j<getVitesse()-i-1;j++){
							 position.setY(position.getY()+1);
							 i++;
						 }
					 }
				 }
			  }
			  else this.deplacerNord();
	  }
	  public void deplacerEst(){
		  if(position.getX()<map.getXrange()){
				 for(int i=0;i<getVitesse();i++){
					 position.setX(position.getX()+1);
					 if(position.getX()==map.getXrange()){
						 for(int j=0;j<getVitesse()-i-1;j++){
							 position.setX(position.getX()-1);
							 i++;
						 }
					 }
				 }
			  }
			  else this.deplacerOuest();
	  }
	  public void deplacerOuest(){
		  if(position.getX()>0){
				 for(int i=0;i<getVitesse();i++){
					 position.setX(position.getX()-1);
					 if(position.getX()==map.getXrange()){
						 for(int j=0;j<getVitesse()-i-1;j++){
							 position.setX(position.getX()+1);
							 i++;
						 }
					 }
				 }
			  }
			  else this.deplacerEst();
	  }
}
