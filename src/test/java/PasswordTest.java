import org.junit.jupiter.api.*;



public class PasswordTest {


@Test
void checkPass(){

     String password = "This_is_Mypassword";
     boolean bool =  Main.password(password);

     boolean expected = true;

     Assertions.assertEquals(bool, expected);

}

}
