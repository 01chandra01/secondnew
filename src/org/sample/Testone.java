package org.sample;

public class Testone {
	
	
	public void link() {
		System.out.println("method1");

	}
private void mail() {
	System.out.println("call");

}

public static void main(String[] args) {

	Testone t=new Testone();
	t.link();
	t.mail();
	
	
}
}
