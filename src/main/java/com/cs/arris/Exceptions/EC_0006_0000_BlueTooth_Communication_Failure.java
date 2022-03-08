package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0006_0000_BlueTooth_Communication_Failure extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0006_0000_BlueTooth_Communication_Failure(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
