package OCP;

public class ShapeDrawer_Bien {
	private Drawable_Bien shape;
	public ShapeDrawer_Bien(Drawable_Bien shape) {
	this.shape = shape;
	}
	public void drawShape() {
	shape.draw();
	}
} 
