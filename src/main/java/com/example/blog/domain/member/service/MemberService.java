package com.example.blog.domain.member.service;

import com.example.blog.domain.member.entity.Member;
import com.example.blog.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    private final PasswordEncoder passwordEncoder;
    public Member signup(String username, String userPw, String nickName, String email) {
        Member member = Member
                .builder()
                .username(username)
                .userPw(passwordEncoder.encode(userPw))
                .nickName(nickName)
                .email(email)
                .build();
        return memberRepository.save(member);
    }
}
