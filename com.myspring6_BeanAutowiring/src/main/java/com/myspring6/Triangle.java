package com.myspring6;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){
		System.out.println("PointA are "+getPointA().getX()+" "+getPointA().getY());
		System.out.println("PointB are "+getPointB().getX()+" "+getPointB().getY());
		System.out.println("PointC are "+getPointC().getX()+" "+getPointC().getY());
		
	}

}
