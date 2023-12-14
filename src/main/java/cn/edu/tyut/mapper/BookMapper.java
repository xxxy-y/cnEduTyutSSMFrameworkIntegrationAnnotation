package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @Author 羊羊
 * @ClassName BookMapper
 * @SubmitTime 周三
 * @DATE 2023/12/13
 * @Time 20:47
 * @Package_Name cn.edu.tyut.mapper
 */
@Repository
public interface BookMapper {
    @Select("SELECT * FROM tb_book WHERE id=#{id}")
    Book getBookById(Integer id);
}
