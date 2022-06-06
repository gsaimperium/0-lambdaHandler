package org.aimperium.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.aimperium.app.LambdaRequest;
import org.aimperium.app.LambdaResponse;

public class LambdaResponse{

	private boolean estatus;
	private int code;
	private String mensaje;
	
	public boolean isEstatus(){
		return estatus;
	} 

	public void setEstatus(boolean estatus) {
		this.estatus=estatus;	

		}


	public int getCode() {
		return code;
	}

	public void setCode(int code){
		this.code=code;
	}

	public String getMensaje(){
		return mensaje;
	}
	public void setMensaje(String mensaje){
		this.mensaje=mensaje;
	}


}
