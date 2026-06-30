package org.scoula.movie.account.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class MemberVO {
    private Long id;
    private String username;
    private String password;
    private String name;

    private List<AuthVO> authList;
}
