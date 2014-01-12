package com.java.pattern;

/**
 * 原型模式: prototype pattern
 * 
 * @是什么？ 
 * java的一种设计模式，属于创建型模式。
 * @用来干什么？ 
 * 在指定的原型对象上采用clone方式来创建新对象。而不是通常的new关键字创建。
 * @为什么？
 *  先思考一个问题？ 
 *  当你想在已有的对象上的基础上，创建一个新对象，但它们就只有一个或几个属性值不一样时，该怎么处理？
 *  如大猫和小猫，它们只有体重不一样,现在有个大猫对象，如何创建小猫对象？ 
 *  方式一：new一个Cat对象出来，然后将大猫的除体重外其他属性值赋值给小猫，最后修改体重属性。
 *  方式二：就是采用原型模式，直接调用clone()方法，拷贝大猫对象生产小猫对象，修改体重属性就好了。
 *  对比这两种方式的优缺点得到原型模式设计的初衷： 
 *  一、通过new创建对象时，首先回顾下new的三个作用：
 *       1、申请内存，创建一个对象（实例化一个类），
 *       2、执行构造函数进行对象初始化，3、返回该对象的引用
 * 而原型模式：
 * 		   是通过复制一个已经存在的对象来创建一个新的对象。 这个被复制的实例就是我们所称的“原型”，这个原型是可定制的。
 *       原型模式多用于创建复杂的或者耗时或者属性值基本一致的实例，因为这种情况下，复制一个已经存在的实例使程序运行更高效；
 *       或者创建值相等，只是命名不一样的同类数据。
 * 二、clone存在两种形式：(shallow copy)浅拷贝和深拷贝(deep copy)。
 *       1、Shallow copy object and original objects share the member variables.
 *       Object's clone method will do shallow copy. 
 *       2、Where as in deep copy deep copy object and original object will its own member variables. We
 *       can get this one by seralisation. 
 *注：
 *       浅拷贝：即原对象和拷贝对象共享成员变量。Object类的clone方法为浅拷贝。
 *       深拷贝：原对象和拷贝对象都拥有自己独立的成员变量。我们可以通过序列号实现深拷贝。
 *       Java中除了8种基本类型及其封装类型和String类型外，其余的都是浅拷贝，都需要自己实现深拷贝。
 * 
 * @怎么用？ 如下例子
 * 
 * @author thinker
 * 
 * @link object-clone: http://en.wikipedia.org/wiki/Object_copy
 * @link clone description:
 *       http://blog.csdn.net/dlutbrucezhang/article/details/9422575
 * @link http://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
 * @link http://www.javacamp.org/designPattern/
 * @link http://sourcemaking.com/design_patterns/prototype
 * @link http://www.programcreek.com/2013/02/java-design-pattern-prototype/
 */
public class PrototypeTest {
	
	public  static void main(String[] s){
		Cat bigCat = new Cat("007",2);
		Cat smallCat = (Cat) bigCat.clone();
		
		bigCat.id = "big";
		smallCat.id = "small";
	
		bigCat.weight = 10;
		smallCat.weight = 5;
		
		bigCat.s[0] = "BitCat";
		smallCat.s[0] = "SmallCat";
		
		System.out.println(bigCat);
		System.out.println(smallCat);
		
	}
		
}

class Prototype implements Cloneable {
	public String[]  s = {"prototype","test"};
	@Override
	public Object clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
			
//			prototype.s = s.clone();// deep clone the String[] type data
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}		
}

class Cat extends Prototype{
	public String id;
	public Integer weight;
	
	
	public Cat(String id,int weight){
		this.id = id;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Cat [id=" + id +", id.hashCode()=" + id.hashCode() + ", weight=" + weight +", weight.hashCode()=" + weight.hashCode()+",s="+s[0]+","+s[1]+"]";
	}	
}


