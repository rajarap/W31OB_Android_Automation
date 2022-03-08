package com.cs.arris.Exceptions;

import com.cs.arris.Utilities.TestUtils;

public class EC_0014_0000_Bluetooth_Pairing_Failed extends RuntimeException
{
	TestUtils utils = new TestUtils();

	public EC_0014_0000_Bluetooth_Pairing_Failed(String errorMessage, Throwable err) {
        utils.log().info(errorMessage, err);
	}
}
