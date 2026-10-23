package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

	@GetMapping("/hash")
	public String getHash() throws NoSuchAlgorithmException {
		String data = "Mark Lafrenz - Artemis Financial Project Two";

		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		byte[] hash = messageDigest.digest(data.getBytes());

		return "Data: " + data + "<br>SHA-256 Checksum: " + bytesToHex(hash);
	}

	private String bytesToHex(byte[] hash) {
		StringBuilder hexString = new StringBuilder();

		for (byte b : hash) {
			String hex = Integer.toHexString(0xff & b);

			if (hex.length() == 1) {
				hexString.append('0');
			}

			hexString.append(hex);
		}

		return hexString.toString();
	}
}