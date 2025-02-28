package library_management.model.mapper;


import library_management.model.dto.MemberDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
    // 회원 등록
    @Insert("insert into member(mid, mpwd, mname) values(#{mid}, #{mpwd}, #{mname})")
    public boolean memberSave(MemberDto memberDto);

    // 회원 전체 조회
    @Select("select * from member")
    public List<MemberDto> memberFindAll();

    // 회원 개별 조회
    @Select(("select * from member where mno = #{mno}"))
    public MemberDto memberFindMno(int mno);


    // 회원 수정
    @Update("update member set mpwd = #{mpwd}, mname = #{mname} where mno = #{mno}")
    public boolean memberUpdate(MemberDto memberDto);


    // 회원 삭제
    @Delete("delete from member where mno = #{mno}")
    public boolean memberDelete(int mno);

}
