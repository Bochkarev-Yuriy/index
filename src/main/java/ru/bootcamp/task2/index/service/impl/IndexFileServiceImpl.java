package ru.bootcamp.task2.index.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.bootcamp.dto.file.FileDto;
import ru.bootcamp.task2.index.client.FileCrud;
import ru.bootcamp.task2.index.service.IndexFileService;

import java.io.IOException;

/**
 * @author Yuriy Bochkarev
 * @since 04.02.2019.
 */

@Service
public class IndexFileServiceImpl implements IndexFileService {

    private final FileCrud fileCrud;

    @Autowired
    public IndexFileServiceImpl(FileCrud fileCrud) {
        this.fileCrud = fileCrud;
    }

    public void indexFile(MultipartFile file) {
        FileDto dto = new FileDto();
        dto.setName(file.getOriginalFilename());
        try {
            dto.setFile(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileCrud.addFile(dto);
    }
}
