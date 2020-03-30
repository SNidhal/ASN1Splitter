/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.types.BerInteger;

import java.math.BigInteger;


public class ServiceIdentifier extends BerInteger {

	private static final long serialVersionUID = 1L;

	public ServiceIdentifier() {
	}

	public ServiceIdentifier(byte[] code) {
		super(code);
	}

	public ServiceIdentifier(BigInteger value) {
		super(value);
	}

	public ServiceIdentifier(long value) {
		super(value);
	}

}