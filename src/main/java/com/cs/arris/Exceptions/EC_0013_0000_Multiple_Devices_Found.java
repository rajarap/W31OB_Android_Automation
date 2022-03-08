package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0013_0000_Multiple_Devices_Found extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0013_0000_Multiple_Devices_Found(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
