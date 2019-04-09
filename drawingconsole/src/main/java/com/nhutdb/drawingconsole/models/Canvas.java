package com.nhutdb.drawingconsole.models;

public class Canvas {
	private static final char HORIZONTAL_EDGE_CHAR = '-';
    private static final char VERTICAL_EDGE_CHAR   = '|';
    
	private int w;
	private int h;
	private char[][] matrix;
	public Canvas(int w, int h) {
		this.w = w;
		this.h = h;
		this.matrix= new char[h][w];
	}
	public void setPoint(int x, int y, char value) {
		this.matrix[x][y] = value;
	}
	/**
	 * @return the w
	 */
	public int getW() {
		return w;
	}
	/**
	 * @param w the w to set
	 */
	public void setW(int w) {
		this.w = w;
	}
	/**
	 * @return the h
	 */
	public int getH() {
		return h;
	}
	/**
	 * @param h the h to set
	 */
	public void setH(int h) {
		this.h = h;
	}
	public void draw() {
		StringBuilder builder = new StringBuilder();
		
//		builder.append(horizontalEdge).append("\n");
		for (int row = 0; row < this.getH() + 2; row++) {
		  
		      for (int col = 0; col < this.getW() + 2; col++) {
//		          builder.append(this.matrix[i][j]);
		          if(row == 0 || row  == this.getH() + 1) {
		        	  builder.append(HORIZONTAL_EDGE_CHAR);
		          } else if(col == 0 || col == this.getW() + 1) {
		        	  builder.append(VERTICAL_EDGE_CHAR);
		          } else if(row < this.getH() && col < this.getW() && this.matrix[row][col] != '\u0000' ) {
		        	  builder.append(this.matrix[row][col]);
		          } else {
		        	  builder.append(' ');
		          }
		      }
		      
		      builder.append("\n");
		  }
//	  builder.append(horizontalEdge);
		System.out.print(builder.toString());

	}
	
}
