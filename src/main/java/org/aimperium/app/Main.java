package org.aimperium.app;

import com.amazonaws.services.lambda.runtime.Context;
import org.aimperium.app.LambdaRequest;
import org.aimperium.app.LambdaResponse;
import org.aimperium.app.LambdaMethodHandler;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "MAIN" );

	LambdaMethodHandler lh = new LambdaMethodHandler();
	Context cntxt = null; 
	LambdaRequest request = new LambdaRequest();
	request.setOption("2");
	LambdaResponse response = lh.handleRequest(request,cntxt);
	System.out.println(response.getMensaje());
    }
}
