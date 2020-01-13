import ateliermvc.model.Model;
import com.sun.tools.javac.util.Assert;
import org.junit.Test;


public class TestModel {
    @Test
    public void testGetMessage(){
        Model model=new Model();
        String m=model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Hello World !");
    }
}
