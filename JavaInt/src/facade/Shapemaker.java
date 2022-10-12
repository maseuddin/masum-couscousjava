package facade;

public class Shapemaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public Shapemaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	}