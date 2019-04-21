package com.nhutdb.drawingconsole.models;

import java.util.LinkedList;
import java.util.Queue;

public class BucketFill {
	private Point p;
	private char bucketChar;
	
	public BucketFill(Point inP, char inX) {
		p = inP;
		bucketChar = inX;
	}
	public void fill(Canvas canvas) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(p);
		Point traveralPoint;
		char pointingChar = canvas.getAt(p.getY()-1, p.getX() -1);
		while(!queue.isEmpty()) {
			traveralPoint = queue.remove();
			canvas.setAt(traveralPoint.getY()-1, traveralPoint.getX()-1, bucketChar);
			if(traveralPoint.getX()-1 > 0 && canvas.getAt(traveralPoint.getY()-1, traveralPoint.getX()-2) == pointingChar) {
				queue.add(new Point(traveralPoint.getX()-1, traveralPoint.getY()));
			}
			if(traveralPoint.getX()+1 <= canvas.getW() && canvas.getAt(traveralPoint.getY()-1, traveralPoint.getX()) == pointingChar) {
				queue.add(new Point(traveralPoint.getX()+1, traveralPoint.getY()));
			}
			if(traveralPoint.getY()-1 > 0 && canvas.getAt(traveralPoint.getY() - 2, traveralPoint.getX()-1) == pointingChar) {
				queue.add(new Point(traveralPoint.getX(), traveralPoint.getY() - 1));
			}
			if(traveralPoint.getY()+1 <= canvas.getH() && canvas.getAt(traveralPoint.getY(), traveralPoint.getX()-1) == pointingChar) {
				queue.add(new Point(traveralPoint.getX(), traveralPoint.getY() + 1));
			}
			
		}
	}
}
