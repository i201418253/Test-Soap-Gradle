package com.synopsis.ws.TestSoapGradle.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import com.synopsis.ws.TestSoapGradle.repository.UserRepository;
import com.synopsis.ws.TestSoapGradle.user.GetUserDetailsRequest;
import com.synopsis.ws.TestSoapGradle.user.GetUserDetailsResponse;

@Endpoint
public class UserServiceEndpoint {
	private final String NAMESPACE = "https://www.jeejava.com/UserService";

	@Autowired
	private UserRepository userRepository;

	@PayloadRoot(namespace = NAMESPACE, localPart = "getUserDetailsRequest")
	@ResponsePayload
	public GetUserDetailsResponse getUser(@RequestPayload final GetUserDetailsRequest request) {
		GetUserDetailsResponse response = new GetUserDetailsResponse();
		response.getUsers().addAll(userRepository.getUsuarios(request.getName()));
		return response;
	}
}
