package kr.co.ezenac.interfacee5;

public class Customer implements Buy, Sell{

	public void Sell() {
		System.out.println("Customer sell");
		
	}

	public void Buy() {
		System.out.println("Customer buy");
	}
	
	public void sayWorld() {
		System.out.println("Hello");
	}

	@Override
	public void sell() {
		System.out.println("customer order");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		kr.co.ezenac.interfacee5.Buy.super.order();
	}

}
