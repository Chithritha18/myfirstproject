package sjcit;
import java.util.ResourceBundle;
public class App {
		public int userlogin(String in_user, String in_pwd)
		{

		 ResourceBundle rb= ResourceBundle.getBundle("config");

		 String username = rb.getString("sjcit");
		 String password=rb.getString("Sjc123");

		if(in_user.equals(username) && in_pwd.equals (password))

		return 1;

		else return 0;
		}

	}

