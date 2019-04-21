package com.nhutdb.drawingconsole;

import java.util.Scanner;

import com.nhutdb.drawingconsole.commands.Command;
import com.nhutdb.drawingconsole.commands.CommandFactory;
import com.nhutdb.drawingconsole.commands.CreateCanvasCommand;
import com.nhutdb.drawingconsole.commands.DrawLineCommand;
import com.nhutdb.drawingconsole.commands.DrawRectangleCommand;
import com.nhutdb.drawingconsole.commands.FillBucketCommand;
import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;
import com.nhutdb.drawingconsole.models.BucketFill;
import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Line;
import com.nhutdb.drawingconsole.models.Point;
import com.nhutdb.drawingconsole.models.Rectangle;

/**
 * Hello world!
 *
 */
public class App {
	private static Scanner        scanner;
	private static Canvas canvas;
    public static void main( String[] args )
    
    {
    	scanner = new Scanner(System.in);

        System.out.println("Enter command:");

        while (true) {
            process(scanner.nextLine());
            System.out.println("Enter command:");
        }
    	
    }
    private static void process(String commandLine) {
        Command command = null;

        try {
            command = CommandFactory.getCommand(commandLine);
            if(command instanceof CreateCanvasCommand) {
            	canvas = ((CreateCanvasCommand) command).getCanvas();
            }
            if(canvas != null) {
            	command.execute(canvas);
            } else {
            	System.out.println("You need to create a canvas first");
            }
            canvas.draw();
        } catch (InvalidCommandException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getUsage());
        }
    }
}
