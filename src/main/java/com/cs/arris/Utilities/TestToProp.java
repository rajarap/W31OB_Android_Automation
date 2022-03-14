package com.cs.arris.Utilities;


public class TestToProp {
	public static void main(String args[])
	{
		SerialCommunicator comm = new SerialCommunicator();
		comm.getSerialPorts();
		comm.resetMAXRouter();

	}

}
