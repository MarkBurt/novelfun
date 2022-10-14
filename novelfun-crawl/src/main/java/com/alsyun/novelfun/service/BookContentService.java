package com.alsyun.novelfun.service;

import com.alsyun.novelfun.entity.BookContent;

import java.util.List;

public interface BookContentService {

    void saveBookContent(List<BookContent> bookContentList,Long bookId);

    void saveBookContent(BookContent bookContent,Long bookId);

    void updateBookContent(BookContent bookContent,Long bookId);


}
