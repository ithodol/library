package library_management.controller;


import library_management.model.dto.MemberDto;
import library_management.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    // 회원 등록
    @PostMapping
    public boolean memberSave(@RequestBody MemberDto memberDto) {
        System.out.println("MemberController.memberSave");
        System.out.println("memberDto = " + memberDto);
        return memberService.memberSave(memberDto);
    }

    // 회원 전체 조회
    @GetMapping
    public List<MemberDto> memberFindAll() {
        System.out.println("MemberController.memberFindAll");
        return memberService.memberFindAll();
    }

    // 회원 개별 조회
    @GetMapping("/view")
    public MemberDto memberFindMno(@RequestParam int mno) {
        System.out.println("MemberController.memberFindMno");
        System.out.println("mno = " + mno);
        return memberService.memberFindMno(mno);
    }


    // 회원 수정
    @PutMapping
    public boolean memberUpdate(@RequestBody MemberDto memberDto) {
        System.out.println("MemberController.memberUpdate");
        System.out.println("memberDto = " + memberDto);
        return memberService.memberUpdate(memberDto);
    }

    // 회원 삭제
    @DeleteMapping
    public boolean memberDelete(@RequestParam int mno) {
        System.out.println("MemberController.memberDelete");
        System.out.println("mno = " + mno);
        return memberService.memberDelete(mno);
    }

}
