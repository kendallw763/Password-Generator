import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class test {
    @Test
    public void passwordTest(){
     // 8 character long password test
    String password = RandomPasswordGenerator.generatePassword(8);
    assertEquals(8, password.length());

    // 15 character long password test
    password = RandomPasswordGenerator.generatePassword(15);
    assertEquals(15, password.length());

    //12 character long password test
    password = RandomPasswordGenerator.generatePassword(12);
    assertEquals(12, password.length());


    }
}
