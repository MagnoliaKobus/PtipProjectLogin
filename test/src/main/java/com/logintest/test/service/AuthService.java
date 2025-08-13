package com.logintest.test.service;

import org.springframework.http.ResponseEntity;

import com.logintest.test.dto.request.auth.CheckCertificationRequestDto;
import com.logintest.test.dto.request.auth.EmailCertificationRequestDto;
import com.logintest.test.dto.request.auth.IdCheckRequestDto;
import com.logintest.test.dto.request.auth.SignInRequestDto;
import com.logintest.test.dto.response.auth.SignInResponseDto;
import com.logintest.test.dto.request.auth.SignUpRequestDto;
import com.logintest.test.dto.response.auth.SignUpResponseDto;
import com.logintest.test.dto.response.auth.IdCheckResponseDto;
import com.logintest.test.dto.response.auth.EmailCertificationResponseDto;
import com.logintest.test.dto.response.auth.CheckCertificationResponseDto;


public interface AuthService {
    ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);
    ResponseEntity<? super EmailCertificationResponseDto> emailCertification(EmailCertificationRequestDto dto);
    ResponseEntity<? super CheckCertificationResponseDto> checkCertification(CheckCertificationRequestDto dto);
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
