package com.org.prototype.example.service.impl;

import com.org.prototype.example.dao.MemberDao;
import com.org.prototype.example.dto.MemberDto;
import com.org.prototype.example.exception.MemberAlreadyExistException;
import com.org.prototype.example.model.Member;
import com.org.prototype.example.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements IMemberService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Member registerNewMember(MemberDto newMember) throws MemberAlreadyExistException {

        final Member member = new Member();

        member.setName(newMember.getName());
        member.setAccount(newMember.getAccount());
        member.setPassword(newMember.getPassword());
        member.setSkypeId(newMember.getSkypeId());

        return memberDao.save(member);
    }

    @Override
    public List<Member> getAllMember() throws Exception {
        return memberDao.findAll();
    }
}
