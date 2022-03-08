package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0003_1014_Service_Not_Available extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0003_1014_Service_Not_Available(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
