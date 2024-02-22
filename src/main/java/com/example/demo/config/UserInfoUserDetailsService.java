package com.example.demo.config;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoUserDetailsService implements UserDetailsService {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public UserInfoUserDetailsService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> user = userInfoRepository.findByUserName(username);
        return user.map(UserInfoUserDetails::new).orElseThrow(()-> new UsernameNotFoundException("user not found"));
//        if (user.isEmpty()) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new UserInfoUserDetails(user.get());
    }
}
