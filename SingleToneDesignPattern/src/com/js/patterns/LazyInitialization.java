package com.js.patterns;

public class LazyInitialization {

	// exception handing is possible
	// object is created only when it required (when call getInstace())
	// we can check null value every time
	//We can make getInstace() synchronized is not good pratic because it is static method and it is not obj level lock
	//performace wise alos not good pratic 

	private static LazyInitialization lazyInitialization;

	private LazyInitialization() {
		// TODO Auto-generated constructor stub
	}

	public static LazyInitialization getInstace() {

		if (lazyInitialization == null) {
			try {
				lazyInitialization = new LazyInitialization();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return lazyInitialization;

	}

	public static void main(String[] args) {

	}

	public static void getData1() {
		System.out.println(LazyInitialization.getInstace().hashCode());
	}

	public static void getData2() {
		System.out.println(LazyInitialization.getInstace().hashCode());
	}

}
