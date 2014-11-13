package io.algorithm.main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "njoonk02";

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

		System.out.println("abcd 1>>> " + toHexString(password.getBytes(), false));
		System.out.println("abcd 2>>> " + testMD5(password));
		System.out.println("abcd 2>>> " + testSHA256(password));
	}

	private static final String toHexString(byte[] data, boolean upper){
		StringBuffer result = new StringBuffer();
		
		for(int index = 0 ; data.length > index ; index++){
			int n = data[index] & 0xff;
			String digest = upper ? Integer.toHexString(n).toUpperCase() : Integer.toHexString(n).toLowerCase();
			if(digest.length() == 1)
				digest = "0" + digest;
			result.append(digest);
		}
		
		return result.toString();
	}

	public static String testMD5(String str){

		String MD5 = "";
		try{
			MessageDigest md = MessageDigest.getInstance("MD5"); 
			md.update(str.getBytes()); 
			byte byteData[] = md.digest();
			StringBuffer sb = new StringBuffer(); 
			for(int i = 0 ; i < byteData.length ; i++){
				sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
			}
			MD5 = sb.toString();
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace(); 
			MD5 = null; 
		}

		return MD5;
	}

	public static String testSHA256(String str){

		String SHA = ""; 

		try{
			MessageDigest sh = MessageDigest.getInstance("SHA-256"); 
			sh.update(str.getBytes()); 
			byte byteData[] = sh.digest();
			StringBuffer sb = new StringBuffer(); 
	
			for(int i = 0 ; i < byteData.length ; i++){
				sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
			}	
			SHA = sb.toString();

		}catch(NoSuchAlgorithmException e){
			e.printStackTrace(); 
			SHA = null; 
		}

		return SHA;
	}

}
