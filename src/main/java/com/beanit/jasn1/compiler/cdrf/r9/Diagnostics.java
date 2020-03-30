/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerInteger;
import com.beanit.jasn1.ber.types.BerType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;


public class Diagnostics implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerInteger gsm0408Cause = null;
	private BerInteger gsm0902MapErrorValue = null;
	private BerInteger ituTQ767Cause = null;
	private ManagementExtension networkSpecificCause = null;
	private BerInteger manufacturerSpecificCause = null;
	private PositionMethodFailureDiagnostic positionMethodFailureCause = null;
	private UnauthorizedLCSClientDiagnostic unauthorizedLCSClientCause = null;
	
	public Diagnostics() {
	}

	public Diagnostics(byte[] code) {
		this.code = code;
	}

	public void setGsm0408Cause(BerInteger gsm0408Cause) {
		this.gsm0408Cause = gsm0408Cause;
	}

	public BerInteger getGsm0408Cause() {
		return gsm0408Cause;
	}

	public void setGsm0902MapErrorValue(BerInteger gsm0902MapErrorValue) {
		this.gsm0902MapErrorValue = gsm0902MapErrorValue;
	}

	public BerInteger getGsm0902MapErrorValue() {
		return gsm0902MapErrorValue;
	}

	public void setItuTQ767Cause(BerInteger ituTQ767Cause) {
		this.ituTQ767Cause = ituTQ767Cause;
	}

	public BerInteger getItuTQ767Cause() {
		return ituTQ767Cause;
	}

	public void setNetworkSpecificCause(ManagementExtension networkSpecificCause) {
		this.networkSpecificCause = networkSpecificCause;
	}

	public ManagementExtension getNetworkSpecificCause() {
		return networkSpecificCause;
	}

	public void setManufacturerSpecificCause(BerInteger manufacturerSpecificCause) {
		this.manufacturerSpecificCause = manufacturerSpecificCause;
	}

	public BerInteger getManufacturerSpecificCause() {
		return manufacturerSpecificCause;
	}

	public void setPositionMethodFailureCause(PositionMethodFailureDiagnostic positionMethodFailureCause) {
		this.positionMethodFailureCause = positionMethodFailureCause;
	}

	public PositionMethodFailureDiagnostic getPositionMethodFailureCause() {
		return positionMethodFailureCause;
	}

	public void setUnauthorizedLCSClientCause(UnauthorizedLCSClientDiagnostic unauthorizedLCSClientCause) {
		this.unauthorizedLCSClientCause = unauthorizedLCSClientCause;
	}

	public UnauthorizedLCSClientDiagnostic getUnauthorizedLCSClientCause() {
		return unauthorizedLCSClientCause;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (unauthorizedLCSClientCause != null) {
			codeLength += unauthorizedLCSClientCause.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
			return codeLength;
		}
		
		if (positionMethodFailureCause != null) {
			codeLength += positionMethodFailureCause.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
			return codeLength;
		}
		
		if (manufacturerSpecificCause != null) {
			codeLength += manufacturerSpecificCause.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
			return codeLength;
		}
		
		if (networkSpecificCause != null) {
			codeLength += networkSpecificCause.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
			return codeLength;
		}
		
		if (ituTQ767Cause != null) {
			codeLength += ituTQ767Cause.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
			return codeLength;
		}
		
		if (gsm0902MapErrorValue != null) {
			codeLength += gsm0902MapErrorValue.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			return codeLength;
		}
		
		if (gsm0408Cause != null) {
			codeLength += gsm0408Cause.encode(reverseOS, false);
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
			gsm0408Cause = new BerInteger();
			codeLength += gsm0408Cause.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			gsm0902MapErrorValue = new BerInteger();
			codeLength += gsm0902MapErrorValue.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			ituTQ767Cause = new BerInteger();
			codeLength += ituTQ767Cause.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			networkSpecificCause = new ManagementExtension();
			codeLength += networkSpecificCause.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			manufacturerSpecificCause = new BerInteger();
			codeLength += manufacturerSpecificCause.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			positionMethodFailureCause = new PositionMethodFailureDiagnostic();
			codeLength += positionMethodFailureCause.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			unauthorizedLCSClientCause = new UnauthorizedLCSClientDiagnostic();
			codeLength += unauthorizedLCSClientCause.decode(is, false);
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

		if (gsm0408Cause != null) {
			sb.append("gsm0408Cause: ").append(gsm0408Cause);
			return;
		}

		if (gsm0902MapErrorValue != null) {
			sb.append("gsm0902MapErrorValue: ").append(gsm0902MapErrorValue);
			return;
		}

		if (ituTQ767Cause != null) {
			sb.append("ituTQ767Cause: ").append(ituTQ767Cause);
			return;
		}

		if (networkSpecificCause != null) {
			sb.append("networkSpecificCause: ");
			networkSpecificCause.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (manufacturerSpecificCause != null) {
			sb.append("manufacturerSpecificCause: ").append(manufacturerSpecificCause);
			return;
		}

		if (positionMethodFailureCause != null) {
			sb.append("positionMethodFailureCause: ").append(positionMethodFailureCause);
			return;
		}

		if (unauthorizedLCSClientCause != null) {
			sb.append("unauthorizedLCSClientCause: ").append(unauthorizedLCSClientCause);
			return;
		}

		sb.append("<none>");
	}

}

