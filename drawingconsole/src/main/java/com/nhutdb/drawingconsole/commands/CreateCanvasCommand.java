package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;
import com.nhutdb.drawingconsole.models.Canvas;

public class CreateCanvasCommand implements Command {

	Canvas canvas = null;
	public CreateCanvasCommand(String params) throws InvalidCommandException{
		try {
			String[] ps = params.split(" ");
			int width = Integer.parseInt(ps[0]);
			int height = Integer.parseInt(ps[1]);
			this.canvas = createCanvas(width, height);
		}catch (InvalidCommandException e) {
			throw e;
		}catch(Exception ex) {
			throw new InvalidCommandException("Create Canvas Command - Invalid parameters", "Pleae make sure your input follow this format \n: C with height");
		}
		
	}
	
	
	public Canvas createCanvas(int width, int height) {
		return new Canvas(width, height);
	}
	public Canvas getCanvas() {
		return this.canvas;
	}

	public void execute(Canvas canvas) {
//		canvas.draw();

	}
}
