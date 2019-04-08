package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Point;

public class DrawLineCommand implements Command {

	private Point to;
	private Point from;
	public DrawLineCommand(Point from, Point to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void execute(Canvas canvas) {
		drawLine(canvas, this.from, this.to);
	}
	private void drawLine(Canvas canvas, Point a, Point b) {
		int minX = Math.min(a.getX(), b.getX());
		int maxX = Math.max(a.getX(), b.getY());
		int step = Math.abs(a.getY() - b.getY());
		for(int i = minX + 1; i < maxX; i++) {
			canvas.setPoint(i, i+step-1, 'x');
		}
		
	}

}
