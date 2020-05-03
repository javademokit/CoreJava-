   package com.rsb;
 
import java.io.IOException;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
public class BuildISOMessage {
 
	public static void main(String[] args) throws IOException, ISOException {
		// Create Packager based on XML that contain DE type
		GenericPackager packager = new GenericPackager("F:/EclipseServlet/flexcube_jpos_atm_setup/src/com/jmr/basic.xml");
 
		// Create ISO Message
		ISOMsg isoMsg = new ISOMsg();
		isoMsg.setPackager(packager);
		isoMsg.setMTI("0200");
		isoMsg.set(3, "201234");
		isoMsg.set(4, "10000");
		isoMsg.set(7, "110722180");
		isoMsg.set(11, "123456");
		isoMsg.set(44, "A5DFGR");
		isoMsg.set(105, "ABCDEFGHIJ 1234567890");
 
		// print the DE list
		logISOMsg(isoMsg);
 
		// Get and print the output result
		byte[] data = isoMsg.pack();
		System.out.println("RESULT : " + new String(data));
	}
 
	private static void logISOMsg(ISOMsg msg) {
		System.out.println("----ISO MESSAGE-----");
		try {
			System.out.println("  MTI : " + msg.getMTI());
			for (int i=1;i<=msg.getMaxField();i++) {
				if (msg.hasField(i)) {
					System.out.println("    Field-"+i+" : "+msg.getString(i));
				}
			}
		} catch (ISOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("--------------------");
		}
 
	}
 
}
