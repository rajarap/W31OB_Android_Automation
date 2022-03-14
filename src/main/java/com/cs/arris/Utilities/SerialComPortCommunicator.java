package com.cs.arris.Utilities;

import com.serialpundit.core.SerialComException;
import com.serialpundit.serial.SerialComManager;
import com.serialpundit.serial.SerialComManager.BAUDRATE;
import com.serialpundit.serial.SerialComManager.DATABITS;
import com.serialpundit.serial.SerialComManager.FLOWCONTROL;
import com.serialpundit.serial.SerialComManager.PARITY;
import com.serialpundit.serial.SerialComManager.STOPBITS;

public class SerialComPortCommunicator {
	public static void main(String[] args) {
		try {
			SerialComManager scm = new SerialComManager();
			long handle = scm.openComPort("/dev/tty.usbserial-142310", true, true, false);
			scm.configureComPortData(handle, DATABITS.DB_8, STOPBITS.SB_1, PARITY.P_NONE, BAUDRATE.B115200, 0);
			scm.configureComPortControl(handle, FLOWCONTROL.NONE, 'x', 'x', false, false);
			scm.findDriverServingComPort("/dev/cu.usbserial-142310");
			System.out.println(scm.getPortName(handle));
			try {
				scm.writeString(handle, "dmcli eRT setv Device.X_ARRIS_COM_General.DeviceReset.ResetMode string FACTORY_RESET", 95);
			}catch(SerialComException e) {e.getStackTrace();}
//			try {
//				scm.writeString(handle, "dmcli eRT setv Device.X_ARRIS_COM_HNE.FactoryReset bool 1 ", 65);
//			}catch(SerialComException e) {e.getStackTrace();}

			String data = scm.readString(handle);
			System.out.println("data read is :" + data);
			scm.closeComPort(handle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
