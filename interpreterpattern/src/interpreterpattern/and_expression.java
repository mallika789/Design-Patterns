package interpreterpattern;

public class and_expression implements expression_interpreterpattern{
  	private expression_interpreterpattern expr1; 
  	private expression_interpreterpattern expr2; 
  
    public and_expression(expression_interpreterpattern expr1, expression_interpreterpattern expr2)  
    { 
        this.expr1 = expr1; 
        this.expr2 = expr2; 
    } 
    public boolean interpret(String context)  
    {         
        return expr1.interpret(context) && expr2.interpret(context); 
    } 

}
