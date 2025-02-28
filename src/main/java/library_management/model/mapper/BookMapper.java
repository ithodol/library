package library_management.model.mapper;

import library_management.model.dto.BookDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    // 도서 등록
    @Insert("insert into book(bname, bwriter, bpub) values(#{bname}, #{bwriter}, #{bpub})")
    public boolean bookSave(BookDto bookDto);

    // 도서 전체 조회
    @Select("select * from book")
    public List<BookDto> bookFindAll();

    // 도서 개별 조회
    @Select(("select * from book where bno = #{bno}"))
    public BookDto bookFindBno(int bno);


    // 도서 수정
    @Update("update book set bname = #{bname}, bwriter = #{bwriter}, bpub = #{bpub} where bno = #{bno}")
    public boolean bookUpdate(BookDto bookDto);


    // 도서 삭제
    @Delete("delete from book where bno = #{bno}")
    public boolean bookDelete(int bno);
}
