package com.nhutdb.drawingconsole;

import com.nhutdb.drawingconsole.commands.Command;
import com.nhutdb.drawingconsole.commands.CreateCanvasCommand;
import com.nhutdb.drawingconsole.commands.DrawLineCommand;
import com.nhutdb.drawingconsole.commands.DrawRectangleCommand;
import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Line;
import com.nhutdb.drawingconsole.models.Point;
import com.nhutdb.drawingconsole.models.Rectangle;

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
        
        command = new DrawLineCommand(new Line(new Point(1, 2), new Point(6,2)));
        command.execute(canvas);
        
//        command = new DrawLineCommand(new Line(new Point(6, 3), new Point(6,4)));
//        command.execute(canvas);
        
        command = new DrawRectangleCommand(new Rectangle(new Point(14,1), new Point(18,3)));
        command.execute(canvas);
        
        canvas.draw();
    }
}
