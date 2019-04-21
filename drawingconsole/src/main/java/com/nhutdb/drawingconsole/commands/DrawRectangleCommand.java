package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;
import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Point;
import com.nhutdb.drawingconsole.models.Rectangle;

public class DrawRectangleCommand implements Command {

	private Rectangle rectangle;
	public DrawRectangleCommand(String params) {
		try {
			String[] ps = params.split(" ");
			Point p1 = new Point(Integer.parseInt(ps[0]), Integer.parseInt(ps[1]));
			Point p2 = new Point(Integer.parseInt(ps[2]), Integer.parseInt(ps[3]));
			this.rectangle = new Rectangle(p1, p2);
		}catch (InvalidCommandException e) {
			throw e;
		}catch(Exception ex) {
			throw new InvalidCommandException("Draw Rectangle - Invalid parameters", "Pleae make sure your input follow this format: \n R x1 y1 x2 y2");
		}
	}

	

	@Override
	public void execute(Canvas canvas) {
		this.rectangle.draw(canvas);
	}

}
