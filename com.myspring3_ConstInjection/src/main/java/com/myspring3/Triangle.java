package com.myspring3;

public class Triangle {
	
	private String type;
	private int height;
	
	//Values are injected into this constructor
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(String type, int height){
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}
	
	/*public void setType(String type) {
		this.type = type;
	}*/

	public int getHeight() {
		return height;
	}

	public void draw(){
		System.out.println(getType()+" Triangle Drawn "+getHeight());
	}

}
