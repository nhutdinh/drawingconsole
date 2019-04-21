package com.nhutdb.drawingconsole.models;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		validate();
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	public void validate() throws InvalidCommandException {
		if (this.x < 1 || this.y < 1)
			throw new InvalidCommandException("Line - invalid params", "x,y should be greater than 0");
	}
	
}
