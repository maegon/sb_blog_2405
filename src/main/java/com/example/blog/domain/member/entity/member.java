package com.example.blog.domain.post.entity;

import com.example.blog.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class member extends BaseEntity {
    @Comment("유저 아이디")
    @Column(unique = true)
    private String userId;
    private String userPw;

    @Column(unique = true)
    private String nickName;
    private String email;
}
