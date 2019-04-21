package com.nhutdb.drawingconsole.commands;

import com.nhutdb.drawingconsole.exceptions.InvalidCommandException;
import com.nhutdb.drawingconsole.models.BucketFill;
import com.nhutdb.drawingconsole.models.Canvas;
import com.nhutdb.drawingconsole.models.Point;

public class FillBucketCommand implements Command {
	private BucketFill bucket;

	@Override
	public void execute(Canvas canvas) {
		// TODO Auto-generated method stub
		this.bucket.fill(canvas);

	}
	public FillBucketCommand(String params) {
		try {
			String[] ps = params.split(" ");
			Point p = new Point(Integer.parseInt(ps[0]), Integer.parseInt(ps[1]));
			char bucketFillChar = ps[2].charAt(0);
			this.bucket = new BucketFill(p, bucketFillChar);
		}catch (InvalidCommandException e) {
			throw e;
		}catch(Exception ex) {
			throw new InvalidCommandException("Bucket Fill Command - Invalid parameters", "Pleae make sure your input follow this format: \n B x y c");
		}
	}
	

}
