package com.joomak.backend.domain.member;


import com.joomak.backend.domain.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PROTECTED;

/**
 * UserDetails를 Entity에서 구현할지 새로운 DTO를 만들어 구현할 지 결정.
 */
@Entity
@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PACKAGE)
@Table(name = "memberBase")
//implements UserDetails
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private Long id;

    private String memberName;

    @Enumerated(EnumType.STRING)
    private MemberState memberState; //normal, standby ,banned, secession, dormant

    @Enumerated(EnumType.STRING)
    private Grade grade; //bronze, silver, gold, platinum, diamond

    private String loginId;

    private String nickName;

    @Enumerated(EnumType.STRING)
    private Position position; //USER, OWNER, ADMINISTRATOR

    private char snsLoginYn;

    private LocalDateTime birth;

    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender; //male female;

    private String profileImagePath;

    private String mobile;

    private String uid;

    private char bannedYn;

    private String password;

    private LocalDateTime loginFailCount;

    public Member updateNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public Member updateMobile(String mobile){
        this.mobile = mobile;
        return this;
    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.loginId;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }

}
