package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;

public class CommandFactory {
	public static Command getCommand(String commandLine) throws InvalidCommandException {
		try {
			String command = "";
			String params = "";

			commandLine = commandLine.trim().replaceAll("\\s+", " ");
			command = commandLine.substring(0, commandLine.indexOf(" "));
			params = commandLine.substring(commandLine.indexOf(" ") + 1);

			System.out.println(command);
			System.out.println(params.toString());

			switch (command) {
				case "C":
					return new CreateCanvasCommand(params);
				case "L":
					return new DrawLineCommand(params);
				case "R":
					return new DrawRectangleCommand(params);
				case "B":
					return new FillBucketCommand(params);
				default:
					throw new InvalidCommandException("Command not found", "HH");
			}
		}catch (InvalidCommandException e) {
			throw e;
		}catch(Exception ex) {
			throw new InvalidCommandException("Invalid input.", "Command 		Description\n" + 
					"C w h           Create a new canvas of width w and height h.\n" + 
					"L x1 y1 x2 y2   Create a new line of 'x' from (x1,y1) to (x2,y2). Only support \n" + 
					"                horizontal or vertical lines.\n" + 
					"R x1 y1 x2 y2   Create a new rectangle, (x1,y1) is upper left corner & (x2,y2) is \n" + 
					"                lower right corner.\n" + 
					"B x y c         Fill the entire area around (x,y) with \"colour\" c.\n" + 
					"                Same as that of the \"bucket fill\" tool in paint programs.\n" + 
					"Q               Quit.");
		}
		

//		return new CreateCanvasCommand();

	}
}
