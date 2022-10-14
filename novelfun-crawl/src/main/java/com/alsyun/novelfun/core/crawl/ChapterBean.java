package com.alsyun.novelfun.core.crawl;

import com.alsyun.novelfun.entity.BookContent;
import com.alsyun.novelfun.entity.BookIndex;
import lombok.Data;

import java.util.List;

/**
 * 章节数据封装bean
 * @author Administrator
 */
@Data
public class ChapterBean {

    /**
     * 章节索引集合
     * */
    List<BookIndex> bookIndexList;

    /**
     * 章节内容集合
     * */
    List<BookContent> bookContentList;
}
