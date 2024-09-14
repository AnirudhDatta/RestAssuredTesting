import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UsersDocument {

    private String page;
    private String per_page;
    private String total;
    private String total_pages;
    private List<User> data;
    private Support support;
}
