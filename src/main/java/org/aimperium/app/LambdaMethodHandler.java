package org.aimperium.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.aimperium.app.LambdaRequest;
import org.aimperium.app.LambdaResponse;

public class LambdaMethodHandler implements RequestHandler<LambdaRequest, LambdaResponse>{


	@Override


	public LambdaResponse handleRequest (LambdaRequest request, Context cntxt) {
		//throw new UnsupportedOperationException("not suported yet");		
		LambdaResponse response =new LambdaResponse();


		if (request.getOption().equals("1")){
			response.setCode(200);
			response.setEstatus(true);
			response.setMensaje("Holaaa");
		}
		else {

			response.setCode(400);
			response.setEstatus(false);
			response.setMensaje("Error");

		}



		return response;	
		
//	 public String handleRequest(String i, Context cntxt){
//		System.out.println("Iniciando Lambda...\n");
//		return "hola desde el método handlerRequest de la clase LambdaMethodHandler";


		



	}



}
