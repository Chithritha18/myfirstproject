package sjc;
import org.testng.Assert;
import org.testng.annotations.Test;
import sjcit.App;
public class Apptest {
	public void test1() {
		App myapp = new App();
		Assert.assertEquals(myapp.userlogin("sjcit", "Sjc123"), 0);
		}
	public void test2() {
		App myapp2 = new App();
		Assert.assertEquals(myapp2.userlogin("sjcit", "Sjc123"), 1);
	    }
	}


