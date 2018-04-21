package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jingxinhao on 2/25/18.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);

}
