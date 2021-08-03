import jdk.jfr.DataAmount;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserResistorDto {
    Long uid;
    String username;
    String email;

    public UserResister toEntity() {
        User user = new User();

        user.setUid(uid);
        user.setUsername(username);
        user.setEmail(email);

        return user;
    }
}

