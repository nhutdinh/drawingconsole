package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.models.Canvas;

public interface Command {
	void execute(Canvas canvas);
}
