import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;

}
