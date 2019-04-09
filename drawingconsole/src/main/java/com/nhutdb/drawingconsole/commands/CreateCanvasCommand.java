package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.models.Canvas;

public class CreateCanvasCommand implements Command {

//    private final String             horizontalEdge;
    
    
	public void execute(Canvas canvas) {
		// TODO Auto-generated method stub
		canvas.draw();

	}
	private void drawCanvas(Canvas canvas) {
		for(int i = 0; i < canvas.getH(); i++) {
			
			for(int j = 0; j < canvas.getW(); j ++) {
				
				
			}
			
		}
	}
//		StringBuilder builder = new StringBuilder();
//        builder.append(horizontalEdge).append("\n");
//        for (int i = 0; i < canvas.getH(); i++) {
//            builder.append(VERTICAL_EDGE_CHAR);
//            for (int j = 0; j < canvas.getW(); j++) {
//                builder.append(cachedCanvasArray[i][j]);
//            }
//            builder.append(VERTICAL_EDGE_CHAR);
//            builder.append("\n");
//        }
//        builder.append(horizontalEdge);
//        return builder.toString();
//	}

}
