package ru.bootcamp.task2.index.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Yuriy Bochkarev
 * @since 04.02.2019.
 */

public interface IndexFileService {

    void indexFile(MultipartFile file);
}
