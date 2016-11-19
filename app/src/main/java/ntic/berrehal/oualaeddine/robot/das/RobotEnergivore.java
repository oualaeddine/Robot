package ntic.berrehal.oualaeddine.robot.das;
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
		  if(getNiveau()>0){
			  if(this.position.getY()<this.map.getYrange()){
				 for(int i=0;i<this.getVitesse();i++){
					 this.position.setY((this.position.getY())+1);
					 if(this.position.getY()==this.map.getYrange()){
						 for(int j=0;j<this.getVitesse()-i-1;j++){
							 this.position.setY((this.position.getY())-1);
						 }
						 break;
					 }
				 }
				 setNiveau(getNiveau()-this.getVitesse());
			  }
			  else this.deplacerSud();
		  }
		  else stop();
	  }
	  public void deplacerSud(){
		  if(getNiveau()>0){
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
					 setNiveau(getNiveau()-getVitesse());
				  }
				  else this.deplacerNord();
		  }
		  else stop();
	  }
	  public void deplacerEst(){
		  if(getNiveau()>0){
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
					 setNiveau(getNiveau()-getVitesse());
				  }
				  else this.deplacerOuest();
		  }
		  else stop();
	  }
	  public void deplacerOuest(){
		  if(getNiveau()>0){
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
					 setNiveau(getNiveau()-getVitesse());
				  }
				  else this.deplacerEst();
		  }
		  else stop();
	  }
}