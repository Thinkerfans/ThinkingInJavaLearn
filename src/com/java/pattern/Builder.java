package com.java.pattern;

public class Builder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseFactory factort = new HouseFactory();
		HouseBuilder one = new OneLayerHouse("one layout");
		HouseBuilder two = new TwoLayerHouse("two layout");
		factort.construct(one);
		factort.construct(two);
		
		one.showProgress(null);
		two.showProgress(null);
	}

}

class House{
	String type;
	StringBuilder progress = new StringBuilder();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+"house type:"+type+"\nprogress:"+progress+"]";
	}
	
	
}

abstract class HouseBuilder{
	House house = new House();
	public void showProgress(String progress){
		System.out.println(house);
	}
	
	abstract void buildFoundation();
	abstract void buildFrame();
	abstract void buildExterior();
	abstract void buildInterior();
	
}

class OneLayerHouse extends HouseBuilder{
	
	public OneLayerHouse(String feather) {
		// TODO Auto-generated constructor stub
		house.type = feather;
		
	}
	@Override
	void buildFoundation() {
		// TODO Auto-generated method stub	
		house.progress = house.progress.append("Foundation build over");
	}

	@Override
	void buildFrame() {
		house.progress = house.progress.append("frame build over");		}

	@Override
	void buildExterior() {
		house.progress = house.progress.append("exterior build over");		}

	@Override
	void buildInterior() {
		house.progress = house.progress.append("interior build over");		}
	
}

class TwoLayerHouse extends HouseBuilder{

	public TwoLayerHouse(String feather) {
		// TODO Auto-generated constructor stub
		house.type = feather;
		
	}
	@Override
	void buildFoundation() {
		// TODO Auto-generated method stub	
		house.progress = house.progress.append("Foundation build over");
	}

	@Override
	void buildFrame() {
		house.progress = house.progress.append("frame build over");		}

	@Override
	void buildExterior() {
		house.progress = house.progress.append("exterior build over");		}

	@Override
	void buildInterior() {
		house.progress = house.progress.append("interior build over");		}
	
	
}


class HouseFactory {
	public HouseFactory() {
		// TODO Auto-generated constructor stub
	}
	
	  public void construct(HouseBuilder hb) {
	        hb.buildFoundation();
	        hb.buildFrame();
	        hb.buildExterior();
	        hb.buildInterior();
	    }
	
}


