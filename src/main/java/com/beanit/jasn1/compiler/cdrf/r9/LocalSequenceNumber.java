/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.types.BerInteger;

import java.math.BigInteger;


public class LocalSequenceNumber extends BerInteger {

	private static final long serialVersionUID = 1L;

	public LocalSequenceNumber() {
	}

	public LocalSequenceNumber(byte[] code) {
		super(code);
	}

	public LocalSequenceNumber(BigInteger value) {
		super(value);
	}

	public LocalSequenceNumber(long value) {
		super(value);
	}

}