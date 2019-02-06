package ru.bootcamp.task2.index.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.bootcamp.task2.index.service.IndexFileService;

/**
 * @author Yuriy Bochkarev
 * @since 04.02.2019.
 */

@RestController
@RequestMapping
public class IndexController {

    private final IndexFileService indexFileService;

    @Autowired
    public IndexController(IndexFileService indexFileService) {
        this.indexFileService = indexFileService;
    }

    @PostMapping(value = "/index_file", produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void indexFile(@RequestParam("file") MultipartFile file) {
        indexFileService.indexFile(file);
    }
}
