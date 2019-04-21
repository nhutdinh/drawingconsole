package com.nhutdb.drawingconsole.models;

public class Rectangle {

	private Point tl;
	private Point rb;
	
	public Rectangle(Point tl, Point rb) {
		this.tl = tl;
		this.rb = rb;
	}
	public void draw(Canvas canvas) {
		
		Line l1 = new Line(this.tl, new Point(this.rb.getX(), this.tl.getY()));
		Line l2 = new Line(new Point(this.rb.getX(), this.tl.getY()), this.rb);
		Line l3 = new Line(this.rb, new Point(this.tl.getX(), this.rb.getY()));
		Line l4 = new Line(new Point(this.tl.getX(), this.rb.getY()), this.tl);
		l1.draw(canvas);
		l2.draw(canvas);
		l3.draw(canvas);
		l4.draw(canvas);
		
		
	}
}
