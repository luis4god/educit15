package com.mkyong.common;
import com.mkyong.output.IOutputGenerator;
 
public class BestOption
{
	IOutputGenerator outputGenerator;
 
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
 
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}