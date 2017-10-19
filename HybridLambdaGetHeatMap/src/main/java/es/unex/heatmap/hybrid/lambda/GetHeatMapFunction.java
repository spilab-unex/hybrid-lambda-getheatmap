package es.unex.heatmap.hybrid.lambda;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import es.unex.heatmap.hybrid.messages.LocationFrequency;

public class GetHeatMapFunction implements RequestHandler<String, List<LocationFrequency>>{

	public List<LocationFrequency> handleRequest(String requestId, Context context) {
		context.getLogger().log("Request received: "+requestId);
		//Static result for testing purposes
		List<LocationFrequency> result=new ArrayList<LocationFrequency>();
		LocationFrequency location=new LocationFrequency();
		location.setLatitude(39.4789);
		location.setLongitude(-6.3420);
		location.setFrequency(10);
		result.add(location);
		location=new LocationFrequency();
		location.setLatitude(39.4786);
		location.setLongitude(-6.3423);
		location.setFrequency(5);
		result.add(location);
		return result;
	}

}
