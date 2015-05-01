package com.mkyong.common;
import com.mkyong.output.IOutputGenerator;
import com.mkyong.output.impl.CsvOutputGenerator;
 
public class MethodTwo {
	
	IOutputGenerator outputGenerator;
 
	public MethodTwo(){
		outputGenerator = new CsvOutputGenerator();
	}
 
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
 
	 public static void main( String[] args )
	    {
	    	MethodTwo output = new MethodTwo();
	    	output.generateOutput(); 
	    }
}