package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0005_0000_BlueTooth_Is_Not_Enabled extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0005_0000_BlueTooth_Is_Not_Enabled(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
