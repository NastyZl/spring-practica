package com.example.demo.repository;

import com.example.demo.entity.UserInfo;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserInfoRepository {

    private static int ID;
    private static Map<String, UserInfo> users = new HashMap<>();
    static {
        users.put("Ivan", new UserInfo(++ID, "Ivan", "1"));
    }
    public Optional<UserInfo> findByUserName(String userName) {
        return Optional.ofNullable(users.get(userName));
    }

    public void save(UserInfo userInfo) {
        users.put(userInfo.getUserName(), userInfo);
    }
}
