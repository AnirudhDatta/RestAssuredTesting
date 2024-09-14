import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestsExamples {

    Gson gson = new Gson();

    @Test
    public void test_1() {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());

        UsersDocument usersDocument = gson.fromJson(response.getBody().asString(), UsersDocument.class);
        System.out.println(usersDocument);

        System.out.println(usersDocument.getData().stream().filter(user -> 8 == (user.getId())).map(User::getEmail).findFirst().orElse(null));
    }
}
