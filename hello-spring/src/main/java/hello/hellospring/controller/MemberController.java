package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // 하나만 생성해서 공유하는게 편하다.
    // 컨트롤러에 등록하는것?
    private final MemberService memberService;

    // memberservice를 가져다가 연결해준다.
    // 의존관계를 주입시킨다. Depandancy Injection
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
