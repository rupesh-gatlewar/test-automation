package com.test.flipkart;

import org.testng.annotations.Test;

import com.test.libs.AppLogin;

public class SearchProduct extends AppLogin{
	
	@Test
	public void searchProduct() throws Throwable
	{
		loginAction();
		searchItem();
	}

}
