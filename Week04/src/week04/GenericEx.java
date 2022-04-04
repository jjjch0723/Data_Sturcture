package week04;
class GenericTest<T>{
	T a;
	T print() {
		T temp=null;
		System.out.println(temp);
		return temp;
	}
}
//클래스 하나로 여러가지 생성자 만들때 Generic을 이용하여 wrapper class를 이용하면 쉽다
public class GenericEx {
	public static void main(String[] args) {
		int a = 1; // stack에 만들어짐, primitive type
		Integer b = 1; // hip에 만들어짐, wrapper class
		
		GenericTest<Integer> g = new GenericTest<Integer>(); //primitive type이 들어오면 안됌
		GenericTest<String> g2 = new GenericTest<String>();
		GenericTest<Double> g3 = new GenericTest<Double>();
		g.a = 1;
		g.print();
	}
}
