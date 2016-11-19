package ntic.berrehal.oualaeddine.robot.das;
public class TestRobot {
	 public static void main (String [] args){
		  RobotEnergivore r = new RobotEnergivore(50);
		  System.out.println(r.position+"\t Niveau: "+r.getNiveau()+"\t Vitesse: "+r.getVitesse());
		  r.map = new Map(10,10);
		  r.deplacerNord();
		  System.out.println(r.position+"\t Niveau: "+r.getNiveau()+"\t Vitesse: "+r.getVitesse());
		  r.deplacerEst();
		  System.out.println(r.position+"\t Niveau: "+r.getNiveau()+"\t Vitesse: "+r.getVitesse());
		  r.accelerer();
		  System.out.println(r.position+"\t Niveau: "+r.getNiveau()+"\t Vitesse: "+r.getVitesse());
		  r.deplacerNord();r.deplacerNord();r.deplacerNord();
		  System.out.println(r.position+"\t Niveau: "+r.getNiveau()+"\t Vitesse: "+r.getVitesse());
		  r.deplacerNord(); // Here yesra le rebond 
		  System.out.println(r.position+"\t Niveau: "+r.getNiveau()+"\t Vitesse: "+r.getVitesse());

	}
}
