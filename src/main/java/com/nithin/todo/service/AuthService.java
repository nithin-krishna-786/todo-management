package com.nithin.todo.service;

import com.nithin.todo.dto.LoginDto;
import com.nithin.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);
}
