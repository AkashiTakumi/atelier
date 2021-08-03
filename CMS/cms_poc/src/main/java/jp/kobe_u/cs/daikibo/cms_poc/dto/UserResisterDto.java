package jp.kobe_u.cs.daikibo.cms_poc.dto;

import jp.kobe_u.cs.daikibo.cms_poc.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResisterDto {
    String username;
    String email;

    public User toEntity() {
        User user = new User();

        user.setUsername(username);
        user.setEmail(email);

        return user;
    }
}

