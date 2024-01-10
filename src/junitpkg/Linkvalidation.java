package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Linkvalidation {


public void test() throws IOException
{

	URL u= new URL("https://www.facebook.com");
	HttpURLConnection con =(HttpURLConnection)u.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("Response code is 200");
		
	}
	else
	{
		System.out.println("Response code is 200");
			
	}
}
}
