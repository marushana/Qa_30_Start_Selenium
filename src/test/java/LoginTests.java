import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    @BeforeClass
    public void preCondition() {
        //open browser
        //open site
    }

    @Test
    public void loginSucsess() {
        //open login form (find element + make click)
        //fill in form email (find element + click + clear + tipe in)
        //fill in form password (find element + click + clear + tipe in)
        //send form (find element + make click)
    }

    @Test
    public void loginWrongEmail() {
        //open login form (find element + make click)
        //fill in form email (find element + click + clear + tipe in)
        //fill in form password (find element + click + clear + tipe in)
        //send form (find element + make click)
    }

    @Test
    public void loginWrongPassword() {
        //open login form (find element + make click)
        //fill in form email (find element + click + clear + tipe in)
        //fill in form password (find element + click + clear + tipe in)
        //send form (find element + make click)
    }

    @Test
    public void loginUnregistered() {
        //open login form (find element + make click)
        //fill in form email (find element + click + clear + tipe in)
        //fill in form password (find element + click + clear + tipe in)
        //send form (find element + make click)
    }

    @AfterClass
    public void postCondition() {
        //close browser
    }
}
