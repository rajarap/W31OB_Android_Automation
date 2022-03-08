package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0001_0000_BlueTooth_Connection_Failed extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0001_0000_BlueTooth_Connection_Failed(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
