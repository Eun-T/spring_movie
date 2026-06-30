package org.scoula.movie.account.service;

import lombok.RequiredArgsConstructor;
import org.scoula.movie.account.domain.CustomUser;
import org.scoula.movie.account.domain.MemberVO;
import org.scoula.movie.account.mapper.UserDetailsMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserDetailsMapper userDetailsMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MemberVO memberVO = userDetailsMapper.get(username);
        if (memberVO == null) {
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
        }
        return new CustomUser(memberVO);
    }
}
