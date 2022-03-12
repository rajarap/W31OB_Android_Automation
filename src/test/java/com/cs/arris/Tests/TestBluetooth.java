package com.cs.arris.Tests;

import java.io.IOException;

import com.cs.arris.Pages.BlueToothPage;

public class TestBluetooth{
	
	public static BlueToothPage bluetoothobj;
	
	public static void main(String[] args)
	{
		enableBlueTooth();
		disableBlueTooth();
	}
	
	
	public static void enableBlueTooth()
	{
		try 
	    {
	        ProcessBuilder pb1 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "shell", "am", "start", "-a", "android.bluetooth.adapter.action.REQUEST_ENABLE");
	        Process pc1 = pb1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void disableBlueTooth()
	{
		try 
	    {
	        ProcessBuilder pb1 = new ProcessBuilder("/Users/rm2652/Library/Android/sdk/platform-tools/adb", "shell", "am", "start", "-a", "android.bluetooth.adapter.action.REQUEST_DISABLE");
	        Process pc1 = pb1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
