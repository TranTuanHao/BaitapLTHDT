package com.haott2008110116.lab7.animal;

public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private String boundaries;
    private int location;

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPicture() {
		return picture;
	}

	public Animal(String p){
		picture = p;
	}

    protected void makeNoise(){
		System.out.println("Tiếng kêu bình thường");
	}

	protected void eat(){
		System.out.println("Đang ăn");
	}
	
	protected void sleep(){
		System.out.println("Đi ngủ");
	}

	protected void roam(){
		System.out.println("Đi dạo quanh rừng");
	}
}
