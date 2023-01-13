package kr.co.ezenac.generic;

public class GenericThreeDPrinter<T extends Material>  { //Material에서 상속 받은 것만 사용 가능
	
	private T material;		

	public T getMaterial() {	
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
		public String toString() {
			return material.toString();
		}
	
	public void print() {
		material.doPrint();
	}
}
