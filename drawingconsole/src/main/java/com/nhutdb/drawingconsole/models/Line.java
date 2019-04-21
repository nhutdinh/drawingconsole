package com.nhutdb.drawingconsole.models;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;

public class Line {
	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		validate(p1, p2);
		this.p1 = p1;
		this.p2 = p2;
	}

	public void draw(Canvas canvas) {
		int minY = Math.min(this.p1.getY(), this.p2.getY());
		minY = getMaxY(minY, canvas);
		
		int maxY = Math.max(this.p1.getY(), this.p2.getY());
		maxY = getMaxY(maxY, canvas);
		
		int minX = Math.min(this.p1.getX(), this.p2.getX());
		minX = getMaxX(minX, canvas);
		
		int maxX = Math.max(this.p1.getX(), this.p2.getX());
		maxX = getMaxX(maxX, canvas);

		for (int row = minY - 1; row <= maxY - 1; row++) {
			for (int col = minX - 1; col <= maxX - 1; col++) {
				canvas.setAt(row, col, 'x');
			}
		}

	}

	private void validate(Point p1, Point p2) throws InvalidCommandException {
		if (p1.getX() != p2.getX() && p1.getY() != p2.getY())
			throw new InvalidCommandException("Line - invalid params", "Only support horizontal or vertical lines.");

	}
	private int getMaxX(int x, Canvas canvas) {
		if(x > canvas.getW()) {
			x = canvas.getW();
		}
		return x;
		
	}
	private int getMaxY(int y, Canvas canvas) {
		if(y > canvas.getH()) {
			y = canvas.getH();
		}
		return y;
		
	}
}
