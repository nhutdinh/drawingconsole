package com.nhutdb.drawingconsole.models;

public class Canvas {
	private int w;
	private int h;
	private char[][] matrix;
	public Canvas(int w, int h) {
		this.w = w;
		this.h = h;
		this.matrix= new char[h+2][w+2];
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
		for (int i = 0; i < this.getH(); i++) {
		  
		      for (int j = 0; j < this.getW(); j++) {
		          builder.append(this.matrix[i][j]);
		      }
		      
		      builder.append("\n");
		  }
//	  builder.append(horizontalEdge);
		System.out.print(builder.toString());

	}
	
}