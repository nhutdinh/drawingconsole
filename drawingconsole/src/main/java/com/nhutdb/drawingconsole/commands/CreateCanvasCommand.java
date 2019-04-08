package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.models.Canvas;

public class CreateCanvasCommand implements Command {

//    private final String             horizontalEdge;
    private static final char HORIZONTAL_EDGE_CHAR = '-';
    private static final char VERTICAL_EDGE_CHAR   = '|';
    
	public void execute(Canvas canvas) {
		// TODO Auto-generated method stub
		drawCanvas(canvas);

	}
	private void drawCanvas(Canvas canvas) {
		for(int i = 0; i < canvas.getH(); i++) {
			
			for(int j = 0; j < canvas.getW(); j ++) {
				if(i !=0 && j!= 0 && i != canvas.getH() - 1 && j != canvas.getW() - 1) {
					canvas.setPoint(i, j, ' ');
				} else if(j == 0 || j == canvas.getW() - 1){
					canvas.setPoint(i, j, VERTICAL_EDGE_CHAR);
				} else {
					canvas.setPoint(i, j, HORIZONTAL_EDGE_CHAR);
					 
				}
				
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
