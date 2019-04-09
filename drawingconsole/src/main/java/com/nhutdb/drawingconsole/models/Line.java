package com.nhutdb.drawingconsole.models;

public class Line {
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public void draw(Canvas canvas) {
		int minY = Math.min(this.p1.getY(), this.p2.getY());
		int maxY = Math.max(this.p1.getY(), this.p2.getY());
		int minX = Math.min(this.p1.getX(), this.p2.getX());
		int maxX = Math.max(this.p1.getX(), this.p2.getX());
		if(this.p1.getX() == this.p2.getX() && minX > 0) {
			for(int y = minY; y <= maxY; y++) {
				
				canvas.setPoint(y, this.p1.getX(), 'x');
			}
		}
		if(this.p1.getY() == this.p2.getY()) {
			for(int x = minX; x <= maxX; x++) {
				canvas.setPoint(this.p1.getY(), x , 'x');
			}
		}
		
		
	}
}
