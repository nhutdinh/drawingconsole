package com.nhutdb.drawingconsole.models;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;

public class Canvas{
	private static final char HORIZONTAL_EDGE_CHAR = '-';
	private static final char VERTICAL_EDGE_CHAR = '|';

	private int w;
	private int h;
	private char[][] matrix;

	public Canvas(int w, int h) {
		validate(w, h);
		this.w = w;
		this.h = h;
		this.matrix = new char[h][w];
	}

	public void setAt(int x, int y, char value) {
		this.matrix[x][y] = value;
	}

	public char getAt(int row, int col) {
		return this.matrix[row][col];
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
	
	private void validate(int w, int h) throws InvalidCommandException{
		if(w <= 0 || h <=0) throw new InvalidCommandException("Canvas", "width and height should be postivie integer");
		
	}

	public void draw() {
		StringBuilder builder = new StringBuilder();

		for (int row = -1; row < this.getH() + 1; row++) {

			for (int col = -1; col < this.getW() + 1; col++) {
				if (row == -1 || row == this.getH()) {
					builder.append(HORIZONTAL_EDGE_CHAR);
				} else if (col == -1 || col == this.getW()) {
					builder.append(VERTICAL_EDGE_CHAR);
				} else if (row < this.getH() && col < this.getW() && this.matrix[row][col] != '\u0000') {
					builder.append(this.matrix[row][col]);
				} else {
					builder.append(' ');
				}
			}

			builder.append("\n");
		}
		System.out.print(builder.toString());

	}

}
