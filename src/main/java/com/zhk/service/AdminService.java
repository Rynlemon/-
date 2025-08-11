package com.zhk.service;

import org.springframework.stereotype.Service;

public interface AdminService {
    boolean login(String username, String password);
}
