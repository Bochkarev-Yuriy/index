package ru.bootcamp.task2.index.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.bootcamp.dto.file.FileDto;

import java.util.List;

@FeignClient("file-crud")
public interface FileCrud {

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<FileDto> getAllFile();

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void addFile(@RequestBody FileDto file);

    @PostMapping(value = "/add_get_id", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Long addFileGetId(@RequestBody FileDto file);
}
