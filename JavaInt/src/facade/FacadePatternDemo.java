package facade;

public class FacadePatternDemo {
	   public static void main(String[] args) {
	      Shapemaker shapeMaker = new Shapemaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
	}