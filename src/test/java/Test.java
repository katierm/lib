import com.katier.lib.Main;
import org.junit.Assert;
import org.junit.Before;

public class Test {

    public static void main(String[] args) {
        new Test().testF();
    }

    @org.junit.Test
    public void testF(){
        Assert.assertTrue(Main.f()==42);
    }
}
