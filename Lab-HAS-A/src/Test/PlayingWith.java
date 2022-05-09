package Test;

import models.ActionFigure;
import models.Doll;

public class PlayingWith {
	
	public static void main(String[] args) {
	      Doll doll = new Doll("Annabelle","blue");
	      ActionFigure actionfigure = new ActionFigure ("He-Man", "aluminum");
	      System.out.println("Our doll "+doll.getName()
	                    +" has "+doll.getEyeColor()+" eyes.");
	      System.out.println("Our action figure " +actionfigure.getName() + " is made of " +actionfigure.getModelType());
	      doll.play();
	      doll.makeTalk();
	   }

}
