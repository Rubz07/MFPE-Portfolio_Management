package com.pod4.dailymutualfundnav.authorization;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This interface communicates with authorization service to verify the token.
 * It takes the url of the service to whom we wants to communicate and the name
 * attribute in annotation FeignClient must be the name we have specified in the
 * properties file of the service to whom we wants to communicate.
 * 
 */

@FeignClient(url = "http://localhost:8080", name = "Authorization-Service")
public interface AuthorizationClient {

	/**
	 * This method will verify whether the token is valid or expired.
	 * 
	 * @param token
	 * @return An object of type AuthResponse which has fields userid, username and
	 *         isValid.
	 */
	@GetMapping("/getuname")
	public String getUname(@RequestHeader("Authorization") String authorization);
}
