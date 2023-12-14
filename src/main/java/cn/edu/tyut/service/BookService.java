package cn.edu.tyut.service;


import cn.edu.tyut.entity.Book;

/**
 * @Author 羊羊
 * @ClassName BookService
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:48
 * @Package_Name cn.edu.tyut.service
 */
public interface BookService {
    Book getBookById(Integer id);
}
