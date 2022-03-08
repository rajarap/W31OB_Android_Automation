package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0015_0000_Cannot_Connect_To_mAX_Device extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0015_0000_Cannot_Connect_To_mAX_Device(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
