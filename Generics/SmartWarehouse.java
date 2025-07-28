class Gen<T>{
	private T rollNo;
	public Gen(T rollNo) {
		this.rollNo = rollNo;
	}
	public T getGen() {
		return rollNo;
	}
}
public class SmartWarehouse {

	public static void main(String[] args) {
		
		Gen<Integer> first = new Gen<>(101);
		System.out.print(first.getGen());

	}

}
