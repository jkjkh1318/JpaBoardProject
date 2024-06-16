package org.hdcd.repository;

import org.hdcd.constant.Gender;
import org.hdcd.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
//@Transactional //rollback
public class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    public void testRegister(){
        Member member1 = new Member();
        member1.setUserId("jupiter");
        member1.setUserPw("1234");
        member1.setUserName("Alex");
        member1.setGender(Gender.MALE);
        member1.setJoinDate(LocalDateTime.now());

        System.out.println("###_1 save before");
        memberRepository.save(member1);
        System.out.println("###_1 save after");
    }

    @Test
    public void testRegister2(){
        for(int i=0; i<10; i++){
            long userNo = i+1;
            Member member = new Member();
            member.setUserId("user" + userNo);
            member.setUserPw("password" + userNo);
            member.setUserName("alex" + userNo);

            memberRepository.save(member);
        }
    }

    @Test
    public void testList(){
        System.out.println("###_1 findAll before");
        Iterable<Member> memberList = memberRepository.findAll();
        System.out.println("###_1 findAll after");

        for (Member member : memberList) {
            System.out.println("member = " + member);
        }
    }

    @Test
    public void testList01(){
        List<Member> memberList = memberRepository.findByUserId("user7");

        for (Member member : memberList) {
            System.out.println("member = " + member);
        }
    }

//    @Test
//    public void testModify(){
//        System.out.println("###_1 findById before");
//        Optional<Member> memberOptional = memberRepository.findById(1L);
//        System.out.println("###_1 findById after");
//
//        if(memberOptional.isPresent()){
//
//        }
//
//    }

    @Test
    public void testRemove(){
        memberRepository.deleteById(1L);
    }





}
