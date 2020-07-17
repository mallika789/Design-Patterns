package assignment7_designpattern5;

public  class roundedshape_factory extends abstractfactory {
	   public draw_shape getshape(String shapetype){    
		      if(shapetype.equalsIgnoreCase("Rectangle")){
		         return new rounded_rectangle();         
		      }else if(shapetype.equalsIgnoreCase("Square")){
		         return new rounded_square();
		      }	 
		      return null;
		   } 

}
