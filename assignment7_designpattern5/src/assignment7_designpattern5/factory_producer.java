package assignment7_designpattern5;

public class factory_producer {
	public static abstractfactory getfactory(boolean rounded){   
	      if(rounded){
	         return new roundedshape_factory();         
	      }
	      else{
	         return new shape_factory();
	      }
	   }

}
