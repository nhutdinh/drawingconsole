package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;
import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Line;
import com.nhutdb.drawingconsole.models.Point;

public class DrawLineCommand implements Command {

	private Line line;
	public DrawLineCommand(String params) {
		try {
			String[] ps = params.split(" ");
			Point p1 = new Point(Integer.parseInt(ps[0]), Integer.parseInt(ps[1]));
			Point p2 = new Point(Integer.parseInt(ps[2]), Integer.parseInt(ps[3]));
			this.line = new Line(p1, p2);
		}catch (InvalidCommandException e) {
			throw e;
		}catch(Exception ex) {
			throw new InvalidCommandException("Draw Line Command - Invalid parameters", "Pleae make sure your input follow this format: \n L x1 y1 x2 y2");
		}
	}

	@Override
	public void execute(Canvas canvas) {
		
		this.line.draw(canvas);
	}
	

}
