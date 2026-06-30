package org.scoula.movie.account.mapper;

import org.scoula.movie.account.domain.MemberVO;

public interface UserDetailsMapper {
    MemberVO get(String username);
}
