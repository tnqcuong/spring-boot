//package com.org.prototype.example.controller;
//
//import com.org.prototype.example.common.GenericResponse;
//import com.org.prototype.example.dto.MemberDto;
//import com.org.prototype.example.model.Member;
//import com.org.prototype.example.service.IMemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class MemberController {
//
//    @Autowired
//    public IMemberService memberService;
//
//    @RequestMapping(value = "/member", method = RequestMethod.GET)
//    public List<Member> getAllMember() throws Exception {
//        return memberService.getAllMember();
//    }
//
//    @RequestMapping(value = "/member/registration", method = RequestMethod.POST)
//    public GenericResponse registerNewMember(@Valid @RequestBody final MemberDto memberDto, final HttpServletRequest request) {
//
//        Member createdMember = memberService.registerNewMember(memberDto);
//        return new GenericResponse("success");
//    }
//}
