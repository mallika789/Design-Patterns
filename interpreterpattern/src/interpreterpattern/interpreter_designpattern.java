package interpreterpattern;

public class interpreter_designpattern {
	public static void main( String[] args ) { 
		expression_interpreterpattern mango = new Terminal_expression("mango");
		expression_interpreterpattern pineapple=new Terminal_expression("pineapple");
		expression_interpreterpattern check=new or_expression(mango,pineapple);
		expression_interpreterpattern fruit = new Terminal_expression("mango");
		expression_interpreterpattern ripen=new Terminal_expression("ripen");
		expression_interpreterpattern state= new and_expression(fruit,ripen);
		System.out.println(check.interpret("mango"));
		System.out.println(state.interpret("ripen mango"));

    }

}
