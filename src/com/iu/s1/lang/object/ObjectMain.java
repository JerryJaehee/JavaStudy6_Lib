package com.iu.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectStudy1 object = new ObjectStudy1();
		//참조변수 : 객체를 가리키는 주소를 담고 있는 변수
		object.Study1();
		//참조변수명.멤버
		
		Car car = new Car();
		System.out.println("Car : "+car);
		
		Object obj = car;
		
		FireCar fc = new FireCar();
		fc.hashCode();
		obj = fc;
		
		boolean check = car.equals(fc);
		System.out.println(check);
	}

}
