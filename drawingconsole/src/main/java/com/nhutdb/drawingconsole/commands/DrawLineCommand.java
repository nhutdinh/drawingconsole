package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Line;

public class DrawLineCommand implements Command {

	private Line line;
	public DrawLineCommand(Line line) {
		this.line = line;
	}

	@Override
	public void execute(Canvas canvas) {
		this.line.draw(canvas);
	}
	

}
