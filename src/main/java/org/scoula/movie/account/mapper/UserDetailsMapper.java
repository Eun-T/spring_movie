package org.scoula.movie.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scoula.movie.account.domain.MemberVO;

@Mapper
public interface UserDetailsMapper {
    MemberVO get(String username);
}
