package com.workshop;

public class Car {

	private int speed;

	private double regularPrice;

	private String color;

	public Car(int speed, double regularPrice, String color) {

		this.speed = speed;

		this.regularPrice = regularPrice;

		this.color = color;

	}

	public double getSalePrice() {

		return regularPrice;

	}

}

class Truck extends Car {

	private int weight;

	public Truck(int speed, double regularPrice, String color, int weight) {

		super(speed, regularPrice, color);

		this.weight = weight;

	}

	public double getSalePrice() {

		return super.getSalePrice() * (weight > 2000 ? 0.10 : 0.20);

	}

}

class Ford extends Car {

	private int year;

	public int manufacturerDiscount;

	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {

		super(speed, regularPrice, color);

		this.year = year;

		this.manufacturerDiscount = manufacturerDiscount;

	}

	public double getSalePrice() {

		return super.getSalePrice() - manufacturerDiscount;

	}

}

class Sedan extends Car {

	private int length;

	public Sedan(int speed, double regularPrice, String color, int length) {

		super(speed, regularPrice, color);

		this.length = length;

	}

	public double getSalePrice() {

		return super.getSalePrice() * (length > 20 ? 0.05 : 0.10);

	}

}

class MyOwnAutoShop {

	public static void main(String[] args) {

		Sedan sedan = new Sedan(150, 500000, "red", 25);

		Ford fordOne = new Ford(300, 60000, "black", 2021, 35);

		Ford fordTwo = new Ford(250, 70000, "yellow", 2020, 40);

		Car car = new Car(100, 800000, "white");

		System.out.println("sedan" + sedan.getSalePrice());

		System.out.println("fordOne " + fordOne.getSalePrice());

		System.out.println("fordTwo " + fordTwo.getSalePrice());

		System.out.println("car " + car.getSalePrice());

	}

}