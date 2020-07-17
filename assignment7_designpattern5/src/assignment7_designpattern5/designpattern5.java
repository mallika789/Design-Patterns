package assignment7_designpattern5;

public class designpattern5 {
	public static void main( String[] args ) {
    	abstractfactory shape = factory_producer.getfactory(false);
        draw_shape shape1 = shape.getshape("Rectangle");
        shape1.draw();
        draw_shape shape2 = shape.getshape("Square");
        shape2.draw();
        abstractfactory shapefactory = factory_producer.getfactory(true);
        draw_shape shape3 = shapefactory.getshape("Rectangle");
        shape3.draw();
        draw_shape shape4 = shapefactory.getshape("Square");
        shape4.draw();
    }

}
