package week04;

class SuperCls{
	int a;
	void printSup(){
		System.out.println("I'm supper class");
	}
}

class SubCls extends SuperCls{
	int b;
	void printSub() {
		System.out.println("I'm sub class");
	}
}

public class ClassCast {
	public static void Opp(Object ooo) {
		SuperCls sup = (SuperCls) ooo;
		SubCls sub = (SubCls)ooo;
	}
	
	public static void main(String[] args) {	
		SuperCls sup = new SuperCls();
		SubCls sub = new SubCls();
		SuperCls sss = new SubCls(); // -> 부모만 사용가능	
		SubCls ssub = (SubCls)sss; // -> 캐스팅
		Object obj = new SuperCls();
		Object obj1 = new Object();
		Object obj2 = new SuperCls();
		Opp(obj1);
		Opp(sup);
		Opp(sub);
	}
}
