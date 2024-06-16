package org.hdcd.repository;

import org.hdcd.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    List<Member> findByUserId(String userId);
    List<Member> findByUserPw(String userPw);
    List<Member> findByUserIdAndUserPw(String userId, String userPw);
    List<Member> findByUserNameContaining(String userName);
    Collection<Member> findByUserNoGreaterThan(Long userNo);
}
