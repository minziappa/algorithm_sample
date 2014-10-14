package io.algorithm.main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "njoonk01";
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte [] byteData = md.digest();

			//convert the byte to hex format method 1
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		    }
			
			System.out.println("Format 1 >>> " + sb.toString());

	        //convert the byte to hex format method 2
	        StringBuffer hexString = new StringBuffer();
	    	for (int i=0;i<byteData.length;i++) {
	    		String hex=Integer.toHexString(0xff & byteData[i]);
	   	     	if(hex.length()==1) hexString.append('0');
	   	     	hexString.append(hex);
	    	}
	    	
	    	System.out.println("Format 2 >>> " + hexString.toString());

	    	String rtn = "";
			for (int i = 0; i < byteData.length; i++) {
				rtn += String.format("%02x", byteData[i]);
			}

			System.out.println("Format 3 >>> " + rtn);

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
