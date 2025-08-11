package com.zhk.common.service.impl;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.zhk.common.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
@Service
public class UploadServiceImp implements UploadService {
    @Override
    public String uploadImage(String path, MultipartFile image) {
        boolean flag = true;
        String fileExtension = "";
        String uniqueFileName;
        try {
            // 1. 文件验证
            if (image == null || image.isEmpty()) {
                System.out.println("文件为空或未接收到文件");
                return null;
            }

            // 2. 获取原始文件名
            String originalFilename = image.getOriginalFilename();
            if (originalFilename == null || originalFilename.trim().isEmpty()) {
                System.out.println("原始文件名为空");
                return null;
            }

            System.out.println("开始上传文件: " + originalFilename);
            System.out.println("文件大小: " + image.getSize() + " bytes");
            System.out.println("上传路径: " + path);

            // 3. 生成唯一文件名（避免文件名冲突）
            if (originalFilename.contains(".")) {
                fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
            }
            uniqueFileName = UUID.randomUUID().toString() + fileExtension;
            System.out.println("生成的文件名: " + uniqueFileName);

            // 4. 确保目录存在
            File uploadDir = new File(path);
            if (!uploadDir.exists()) {
                boolean created = uploadDir.mkdirs();
                System.out.println("创建目录: " + path + ", 结果: " + created);
            }

            // 5. 创建目标文件（使用唯一文件名）
            String filePath = path + uniqueFileName;
            File dest = new File(filePath);
            System.out.println("目标文件路径: " + filePath);

            // 6. 复制文件
            Files.copy(image.getInputStream(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("文件上传成功: " + filePath);

        } catch (IOException e) {
            System.out.println("文件上传失败，错误信息: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            System.out.println("文件上传过程中发生未知错误: " + e.getMessage());
            e.printStackTrace();
            return null;
        }

        return uniqueFileName;
    }

}
