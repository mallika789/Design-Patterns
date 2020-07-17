package interpreterpattern;

public  class Terminal_expression implements expression_interpreterpattern{ 
    	private String data; 
    	public Terminal_expression(String data) { 
    		this.data = data;  
        } 
    	public boolean interpret(String context)  { 
    		if(context.contains(data)) { 
    			return true; 
    		} 
    		return false;
        } 
}
