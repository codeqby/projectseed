package com.none.dao;

import com.none.model.Book;
import java.util.List;

public interface BookMapper {
    /**
    *@mbg.generated
     */
    int deleteByPrimaryKey(Long bookId);

    /**
    *@mbg.generated
     */
    int insert(Book record);

    /**
    *@mbg.generated
     */
    Book selectByPrimaryKey(Long bookId);

    /**
    *@mbg.generated
     */
    List<Book> selectAll();

    /**
    *@mbg.generated
     */
    int updateByPrimaryKey(Book record);
}