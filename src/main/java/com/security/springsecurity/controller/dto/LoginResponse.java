package com.security.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {

}
