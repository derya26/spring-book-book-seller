package com.derya.bookseller.service;

import com.derya.bookseller.model.User;

public interface IAuthenticationService {

	User signInAndReturnJWT(User signInRequest);

}
