package com.nhutdb.drawingconsole;

import com.nhutdb.drawingconsole.commands.Command;
import com.nhutdb.drawingconsole.commands.CreateCanvasCommand;
import com.nhutdb.drawingconsole.commands.DrawLineCommand;
import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Point;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Canvas canvas = new Canvas(20,4);
        Command command = new CreateCanvasCommand();
        command.execute(canvas);
        
        command = new DrawLineCommand(new Point(4,2), new Point(2,0));
        command.execute(canvas);
        
        canvas.draw();
    }
}
