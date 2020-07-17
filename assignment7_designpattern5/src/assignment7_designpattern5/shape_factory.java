package assignment7_designpattern5;

public  class shape_factory  extends abstractfactory {
	   public draw_shape getshape(String shapetype){    
		      if(shapetype.equalsIgnoreCase("Rectangle")){
		         return new rectangle();         
		      }else if(shapetype.equalsIgnoreCase("Square")){
		         return new square();
		      }	 
		      return null;
		   }

}
