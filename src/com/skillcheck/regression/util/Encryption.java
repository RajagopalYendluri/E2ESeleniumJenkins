package com.skillcheck.regression.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class Encryption {
	
	static String encryptionString1 = "I did not fail the test, I just found 100 ways to do it wrong.";

	static public String encryptPassword(String passwordIn) {
		try {
			BasicTextEncryptor basicEncryptor = new BasicTextEncryptor();
			basicEncryptor.setPassword(encryptionString1);
			return basicEncryptor.encrypt(passwordIn);
		}
		catch (Exception e) {
			throw new RuntimeException(e);	
		}
	}

	static public String decryptPassword(String encPassword) {
		try {
			BasicTextEncryptor basicEncryptor = new BasicTextEncryptor();
			basicEncryptor.setPassword(encryptionString1);
			return basicEncryptor.decrypt(encPassword);
		}
		catch (Exception e) {
			throw new RuntimeException(e);	
		}
	}

}