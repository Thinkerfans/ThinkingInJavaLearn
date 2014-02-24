package com.java.chapter8;
import static com.thinker.log.Mylog.*;


//有打印结果可知道：导出类与基类构造器直接调用顺序，其实想想继承机制，也知道为什么会有这个顺序。

public class ConstructCallOrder extends PortableLunch {

	Meal m = new Meal();
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();
	
	
	public ConstructCallOrder() {
		p("ConstrutCallOrder()");
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructCallOrder();
	}

}

class Meal{
	public Meal(){
		p("Meal()");
	}
}
class Bread{
	public Bread(){
		p("Bread()");
	}
}

class Cheese{
	public Cheese(){
		p("Cheese()");
	}
}

class Lettuce{
	public Lettuce(){
		p("Lettuce()");
	}
}

class Lunch extends Meal{
	public Lunch(){
		p("Lunch()");
	}	
}

class PortableLunch extends Lunch{
	public PortableLunch(){
		p("PortableLunch()");
	}	
}

