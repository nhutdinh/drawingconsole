package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Line;
import com.nhutdb.drawingconsole.models.Point;
import com.nhutdb.drawingconsole.models.Rectangle;

public class DrawRectangleCommand implements Command {

	private Rectangle rectangle;
	public DrawRectangleCommand(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	

	@Override
	public void execute(Canvas canvas) {
		this.rectangle.draw(canvas);
	}

}
