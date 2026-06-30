package org.scoula.movie.account.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class AuthVO implements GrantedAuthority {
    private Long memberId;
    private String auth;

    @Override
    public String getAuthority() {
        return auth;
    }
}
