package org;

public class Test {

	public static void main(String[] args) {
	Product obj1=new ProductBuilder()//object of productbuilder
			.name("TV")
			.buildProduct();
	Product obj2=new ProductBuilder()//object of productbuilder
			.name("Mobile")
			.brand("Apple")
			.buildProduct();
	Product obj3=new ProductBuilder()//object of productbuilder
			.name("TV")
			.brand("Samsung")
			.buildProduct();
	}

}
