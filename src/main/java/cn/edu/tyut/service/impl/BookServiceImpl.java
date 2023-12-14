package cn.edu.tyut.service.impl;

import cn.edu.tyut.entity.Book;
import cn.edu.tyut.mapper.BookMapper;
import cn.edu.tyut.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author 羊羊
 * @ClassName BookServiceImpl
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:50
 * @Package_Name cn.edu.tyut.service.impl
 */
@Service
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    @Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }
}
