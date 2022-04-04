package week05;

public class NodeEx  <E extends Comparable<E>>{
	private E    item;
	private NodeEx<E> next;
	
	public NodeEx(E newItem, NodeEx<E> p){ // 생성자
		item  = newItem;
		next  = p;
	}
	// get 메소드와 set 메소드
	// getter
	public E    getItem() { return item;}
    public NodeEx getNext() { return next;}
    
    // setter
    public void setItem(E newItem)  { item = newItem;}
    public void setNext(NodeEx n) 	{ next = n;}
}
