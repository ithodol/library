package library_management.service;

import library_management.model.dto.MemberDto;
import library_management.model.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    // 회원 등록
    public boolean memberSave(MemberDto memberDto){
        return memberMapper.memberSave(memberDto);
    }

    // 회원 전체 조회
    public List<MemberDto> memberFindAll(){
        return memberMapper.memberFindAll();
    }

    // 회원 개별 조회
    public MemberDto memberFindMno(int mno){
        return memberMapper.memberFindMno(mno);
    }

    // 회원 수정
    public boolean memberUpdate(MemberDto memberDto){
        return memberMapper.memberUpdate(memberDto);
    }

    // 회원 삭제
    public boolean memberDelete(int mno){
        return memberMapper.memberDelete(mno);
    }
}
