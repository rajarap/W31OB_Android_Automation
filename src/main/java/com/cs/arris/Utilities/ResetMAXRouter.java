package com.cs.arris.Utilities;

import java.io.IOException;

public class ResetMAXRouter 
{
	public void reset() {
		try {
			Runtime.getRuntime().exec("python3 /Users/rm2652/Documents/ResetMaxRouterScript/reset.py");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}










//try (PythonInterpreter pyInterp = new PythonInterpreter()) {
//    StringWriter output = new StringWriter();
//    pyInterp.setOut(output);
//    pyInterp.exec("print('Hello Baeldung Readers!!')");
// }










































//Process mProcess;
//public void reset() {
////Process process;
//ProcessBuilder pb;
//try {
//	//process = Runtime.getRuntime().exec("/usr/bin/python3 /Users/rm2652/Documents/ResetMaxRouterScript/reset.py");
//	//process = Runtime.getRuntime().exec(new String[]{"/Users/rm2652/Documents/ResetMaxRouterScript/reset.py"});
//	pb = new ProcessBuilder("/usr/bin/python3", "/Users/rm2652/Documents/ResetMaxRouterScript/reset.py");
//	Process process = pb.start();
//} catch (IOException e) {
//	e.printStackTrace();
//}
//}

//public void reset() {
//Process process;
//
//try {
//	process = Runtime.getRuntime().exec("/usr/bin/python3  /Users/rm2652/Documents/ResetMaxRouterScript/reset.py");
//	mProcess = process;
//} catch (IOException e) {
//	e.printStackTrace();
//}
//InputStream stdout = mProcess.getInputStream();
//   BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
//   String line;
//   try{
//      while((line = reader.readLine()) != null){
//           System.out.println("stdout: "+ line);
//      }
//   }catch(IOException e){
//         System.out.println("Exception in reading output"+ e.toString());
//   }
//}














//public class ResetMAXRouter implements SerialPortEventListener{
//
//	private String portName;
//	private SerialPort port;
//	private CommPortIdentifier portIdentifier;
//	private String command = "dmcli eRT setv Device.X_ARRIS_COM_HNE.FactoryReset bool 1";
//	
//	TestUtils utils = new TestUtils();
//	
//    public void connect (String portName) throws Exception {
//        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
//        if (portIdentifier.isCurrentlyOwned()) {
//            System.out.println("Error: Port is currently in use");
//        } else {
//            CommPort commPort = portIdentifier.open(this.getClass().getName(),6000);
//            if (commPort instanceof SerialPort) {
//                SerialPort serialPort = (SerialPort) commPort;
//                serialPort.setSerialPortParams(115200,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
//                System.out.println("BaudRate: " + serialPort.getBaudRate());
//                System.out.println("DataBIts: " + serialPort.getDataBits());
//                System.out.println("StopBits: " + serialPort.getStopBits());
//                System.out.println("Parity: " + serialPort.getParity());
//                System.out.println("FlowControl: " + serialPort.getFlowControlMode());
//                InputStream in = serialPort.getInputStream();
//                OutputStream out = serialPort.getOutputStream();
//            } else {
//                System.out.println("Error: Only serial ports are handled by this example.");
//            }
//        }     
//    }
//
//	@Override
//	public void serialEvent(SerialPortEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
//}