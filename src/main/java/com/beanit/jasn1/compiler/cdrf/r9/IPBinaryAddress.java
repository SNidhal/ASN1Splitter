/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerOctetString;
import com.beanit.jasn1.ber.types.BerType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;


public class IPBinaryAddress implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerOctetString iPBinV4Address = null;
	private BerOctetString iPBinV6Address = null;
	
	public IPBinaryAddress() {
	}

	public IPBinaryAddress(byte[] code) {
		this.code = code;
	}

	public void setIPBinV4Address(BerOctetString iPBinV4Address) {
		this.iPBinV4Address = iPBinV4Address;
	}

	public BerOctetString getIPBinV4Address() {
		return iPBinV4Address;
	}

	public void setIPBinV6Address(BerOctetString iPBinV6Address) {
		this.iPBinV6Address = iPBinV6Address;
	}

	public BerOctetString getIPBinV6Address() {
		return iPBinV6Address;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (iPBinV6Address != null) {
			codeLength += iPBinV6Address.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			return codeLength;
		}
		
		if (iPBinV4Address != null) {
			codeLength += iPBinV4Address.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
			codeLength += 1;
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			iPBinV4Address = new BerOctetString();
			codeLength += iPBinV4Address.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			iPBinV6Address = new BerOctetString();
			codeLength += iPBinV6Address.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (iPBinV4Address != null) {
			sb.append("iPBinV4Address: ").append(iPBinV4Address);
			return;
		}

		if (iPBinV6Address != null) {
			sb.append("iPBinV6Address: ").append(iPBinV6Address);
			return;
		}

		sb.append("<none>");
	}

}

