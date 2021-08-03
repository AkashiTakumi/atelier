import jdk.jfr.DataAmount;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResistorDto {
    String username;
    String email;

    public UserResister toEntity() {
        User user = new User();

        user.setUsername(username);
        user.setEmail(email);

        return user;
    }
}

