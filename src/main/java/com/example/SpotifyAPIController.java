package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpotifyAPIController {

	public SpotifyAPIController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping ("/callback")
	public getToken(String authCode) {
		
	}

	
//	When the authorization code has been received, you will need to exchange it with an access token by making a POST request to the Spotify Accounts service, this time to its /api/token endpoint: POST https://accounts.spotify.com/api/token The body of this POST request must contain the following parameters encoded in ´application/x-www-form-urlencoded as defined in the OAuth 2.0 specification:
//
//		REQUEST BODY PARAMETER	VALUE
//		grant_type	Required.
//		As defined in the OAuth 2.0 specification, this field must contain the value "authorization_code".
//		code	Required.
//		The authorization code returned from the initial request to the Account /authorize endpoint.
//		redirect_uri	Required.
//		This parameter is used for validation only (there is no actual redirection). The value of this parameter must exactly match the value of redirect_uri supplied when requesting the authorization code.
//		HEADER PARAMETER	VALUE
//		Authorization	Required.
//		Base 64 encoded string that contains the client ID and client secret key. The field must have the format: Authorization: Basic *<base64 encoded client_id:client_secret>*	
//	send auth code back to:
//	https://accounts.spotify.com/api/token
	
	
}
