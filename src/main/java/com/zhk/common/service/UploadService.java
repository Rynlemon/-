package com.zhk.common.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    String uploadImage(String path, MultipartFile image);
}
