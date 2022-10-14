package com.alsyun.novelfun.service.impl;

import com.alsyun.novelfun.core.utils.FileUtil;
import com.alsyun.novelfun.entity.BookContent;
import com.alsyun.novelfun.service.BookContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "txt")
@RequiredArgsConstructor
public class FileBookContentServiceImpl implements BookContentService {

    @Value("${content.save.path}")
    private String fileSavePath;

    @Override
    public void saveBookContent(List<BookContent> bookContentList,Long bookId) {
        bookContentList.forEach(bookContent -> saveBookContent(bookContent,bookId));

    }

    @Override
    public void saveBookContent(BookContent bookContent,Long bookId) {
        FileUtil.writeContentToFile(fileSavePath,"/"+bookId+"/"+bookContent.getIndexId()+".txt",bookContent.getContent());
    }

    @Override
    public void updateBookContent(BookContent bookContent,Long bookId) {
        FileUtil.writeContentToFile(fileSavePath,"/"+bookId+"/"+bookContent.getIndexId()+".txt",bookContent.getContent());
    }
}
