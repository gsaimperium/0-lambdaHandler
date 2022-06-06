package org.aimperium.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.aimperium.app.LambdaRequest;
import org.aimperium.app.LambdaResponse;

public class LambdaRequest{

	private String option;

	public String getOption(){
		return option;
		}	

	public void setOption(String option){
		this.option=option;
	}





}
