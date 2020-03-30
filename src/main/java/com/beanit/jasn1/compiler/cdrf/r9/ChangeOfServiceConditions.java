/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.BerLength;
import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerOctetString;
import com.beanit.jasn1.ber.types.BerType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ChangeOfServiceConditions implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class AFRecordInformation implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation> seqOf = null;

		public AFRecordInformation() {
			seqOf = new ArrayList<com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation>();
		}

		public AFRecordInformation(byte[] code) {
			this.code = code;
		}

		public List<com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation> getAFRecordInformation() {
			if (seqOf == null) {
				seqOf = new ArrayList<com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation>();
			}
			return seqOf;
		}

		public int encode(OutputStream reverseOS) throws IOException {
			return encode(reverseOS, true);
		}

		public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				if (withTag) {
					return tag.encode(reverseOS) + code.length;
				}
				return code.length;
			}

			int codeLength = 0;
			for (int i = (seqOf.size() - 1); i >= 0; i--) {
				codeLength += seqOf.get(i).encode(reverseOS, true);
			}

			codeLength += BerLength.encodeLength(reverseOS, codeLength);

			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}

			return codeLength;
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, true);
		}

		public int decode(InputStream is, boolean withTag) throws IOException {
			int codeLength = 0;
			int subCodeLength = 0;
			if (withTag) {
				codeLength += tag.decodeAndCheck(is);
			}

			BerLength length = new BerLength();
			codeLength += length.decode(is);
			int totalLength = length.val;

			while (subCodeLength < totalLength) {
				com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation element = new com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation();
				subCodeLength += element.decode(is, true);
				seqOf.add(element);
			}
			if (subCodeLength != totalLength) {
				throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected " + totalLength + " but has " + subCodeLength);

			}
			codeLength += subCodeLength;

			return codeLength;
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS, false);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			sb.append("{\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (seqOf == null) {
				sb.append("null");
			}
			else {
				Iterator<com.beanit.jasn1.compiler.cdrf.r9.AFRecordInformation> it = seqOf.iterator();
				if (it.hasNext()) {
					it.next().appendAsString(sb, indentLevel + 1);
					while (it.hasNext()) {
						sb.append(",\n");
						for (int i = 0; i < indentLevel + 1; i++) {
							sb.append("\t");
						}
						it.next().appendAsString(sb, indentLevel + 1);
					}
				}
			}

			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private RatingGroupId ratingGroup = null;
	private ChargingRuleBaseName chargingRuleBaseName = null;
	private ResultCode resultCode = null;
	private LocalSequenceNumber localSequenceNumber = null;
	private TimeStamp timeOfFirstUsage = null;
	private TimeStamp timeOfLastUsage = null;
	private CallDuration timeUsage = null;
	private ServiceConditionChange serviceConditionChange = null;
	private EPCQoSInformation qoSInformationNeg = null;
	private GSNAddress sgsnAddress = null;
	private PLMNId sGSNPLMNIdentifier = null;
	private DataVolumeGPRS datavolumeFBCUplink = null;
	private DataVolumeGPRS datavolumeFBCDownlink = null;
	private TimeStamp timeOfReport = null;
	private RATType rATType = null;
	private FailureHandlingContinue failureHandlingContinue = null;
	private ServiceIdentifier serviceIdentifier = null;
	private PSFurnishChargingInformation pSFurnishChargingInformation = null;
	private AFRecordInformation aFRecordInformation = null;
	private BerOctetString userLocationInformation = null;
	private EventBasedChargingInformation eventBasedChargingInformation = null;
	private TimeQuotaMechanism timeQuotaMechanism = null;
	
	public ChangeOfServiceConditions() {
	}

	public ChangeOfServiceConditions(byte[] code) {
		this.code = code;
	}

	public void setRatingGroup(RatingGroupId ratingGroup) {
		this.ratingGroup = ratingGroup;
	}

	public RatingGroupId getRatingGroup() {
		return ratingGroup;
	}

	public void setChargingRuleBaseName(ChargingRuleBaseName chargingRuleBaseName) {
		this.chargingRuleBaseName = chargingRuleBaseName;
	}

	public ChargingRuleBaseName getChargingRuleBaseName() {
		return chargingRuleBaseName;
	}

	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}

	public ResultCode getResultCode() {
		return resultCode;
	}

	public void setLocalSequenceNumber(LocalSequenceNumber localSequenceNumber) {
		this.localSequenceNumber = localSequenceNumber;
	}

	public LocalSequenceNumber getLocalSequenceNumber() {
		return localSequenceNumber;
	}

	public void setTimeOfFirstUsage(TimeStamp timeOfFirstUsage) {
		this.timeOfFirstUsage = timeOfFirstUsage;
	}

	public TimeStamp getTimeOfFirstUsage() {
		return timeOfFirstUsage;
	}

	public void setTimeOfLastUsage(TimeStamp timeOfLastUsage) {
		this.timeOfLastUsage = timeOfLastUsage;
	}

	public TimeStamp getTimeOfLastUsage() {
		return timeOfLastUsage;
	}

	public void setTimeUsage(CallDuration timeUsage) {
		this.timeUsage = timeUsage;
	}

	public CallDuration getTimeUsage() {
		return timeUsage;
	}

	public void setServiceConditionChange(ServiceConditionChange serviceConditionChange) {
		this.serviceConditionChange = serviceConditionChange;
	}

	public ServiceConditionChange getServiceConditionChange() {
		return serviceConditionChange;
	}

	public void setQoSInformationNeg(EPCQoSInformation qoSInformationNeg) {
		this.qoSInformationNeg = qoSInformationNeg;
	}

	public EPCQoSInformation getQoSInformationNeg() {
		return qoSInformationNeg;
	}

	public void setSgsnAddress(GSNAddress sgsnAddress) {
		this.sgsnAddress = sgsnAddress;
	}

	public GSNAddress getSgsnAddress() {
		return sgsnAddress;
	}

	public void setSGSNPLMNIdentifier(PLMNId sGSNPLMNIdentifier) {
		this.sGSNPLMNIdentifier = sGSNPLMNIdentifier;
	}

	public PLMNId getSGSNPLMNIdentifier() {
		return sGSNPLMNIdentifier;
	}

	public void setDatavolumeFBCUplink(DataVolumeGPRS datavolumeFBCUplink) {
		this.datavolumeFBCUplink = datavolumeFBCUplink;
	}

	public DataVolumeGPRS getDatavolumeFBCUplink() {
		return datavolumeFBCUplink;
	}

	public void setDatavolumeFBCDownlink(DataVolumeGPRS datavolumeFBCDownlink) {
		this.datavolumeFBCDownlink = datavolumeFBCDownlink;
	}

	public DataVolumeGPRS getDatavolumeFBCDownlink() {
		return datavolumeFBCDownlink;
	}

	public void setTimeOfReport(TimeStamp timeOfReport) {
		this.timeOfReport = timeOfReport;
	}

	public TimeStamp getTimeOfReport() {
		return timeOfReport;
	}

	public void setRATType(RATType rATType) {
		this.rATType = rATType;
	}

	public RATType getRATType() {
		return rATType;
	}

	public void setFailureHandlingContinue(FailureHandlingContinue failureHandlingContinue) {
		this.failureHandlingContinue = failureHandlingContinue;
	}

	public FailureHandlingContinue getFailureHandlingContinue() {
		return failureHandlingContinue;
	}

	public void setServiceIdentifier(ServiceIdentifier serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;
	}

	public ServiceIdentifier getServiceIdentifier() {
		return serviceIdentifier;
	}

	public void setPSFurnishChargingInformation(PSFurnishChargingInformation pSFurnishChargingInformation) {
		this.pSFurnishChargingInformation = pSFurnishChargingInformation;
	}

	public PSFurnishChargingInformation getPSFurnishChargingInformation() {
		return pSFurnishChargingInformation;
	}

	public void setAFRecordInformation(AFRecordInformation aFRecordInformation) {
		this.aFRecordInformation = aFRecordInformation;
	}

	public AFRecordInformation getAFRecordInformation() {
		return aFRecordInformation;
	}

	public void setUserLocationInformation(BerOctetString userLocationInformation) {
		this.userLocationInformation = userLocationInformation;
	}

	public BerOctetString getUserLocationInformation() {
		return userLocationInformation;
	}

	public void setEventBasedChargingInformation(EventBasedChargingInformation eventBasedChargingInformation) {
		this.eventBasedChargingInformation = eventBasedChargingInformation;
	}

	public EventBasedChargingInformation getEventBasedChargingInformation() {
		return eventBasedChargingInformation;
	}

	public void setTimeQuotaMechanism(TimeQuotaMechanism timeQuotaMechanism) {
		this.timeQuotaMechanism = timeQuotaMechanism;
	}

	public TimeQuotaMechanism getTimeQuotaMechanism() {
		return timeQuotaMechanism;
	}

	public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		int sublength;

		if (timeQuotaMechanism != null) {
			codeLength += timeQuotaMechanism.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 22
			reverseOS.write(0xB6);
			codeLength += 1;
		}
		
		if (eventBasedChargingInformation != null) {
			codeLength += eventBasedChargingInformation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
			reverseOS.write(0xB5);
			codeLength += 1;
		}
		
		if (userLocationInformation != null) {
			codeLength += userLocationInformation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 20
			reverseOS.write(0x94);
			codeLength += 1;
		}
		
		if (aFRecordInformation != null) {
			codeLength += aFRecordInformation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 19
			reverseOS.write(0xB3);
			codeLength += 1;
		}
		
		if (pSFurnishChargingInformation != null) {
			codeLength += pSFurnishChargingInformation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
			reverseOS.write(0xB2);
			codeLength += 1;
		}
		
		if (serviceIdentifier != null) {
			codeLength += serviceIdentifier.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		if (failureHandlingContinue != null) {
			codeLength += failureHandlingContinue.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 16
			reverseOS.write(0x90);
			codeLength += 1;
		}
		
		if (rATType != null) {
			codeLength += rATType.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		codeLength += timeOfReport.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 14
		reverseOS.write(0x8E);
		codeLength += 1;
		
		if (datavolumeFBCDownlink != null) {
			codeLength += datavolumeFBCDownlink.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (datavolumeFBCUplink != null) {
			codeLength += datavolumeFBCUplink.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		if (sGSNPLMNIdentifier != null) {
			codeLength += sGSNPLMNIdentifier.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (sgsnAddress != null) {
			sublength = sgsnAddress.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 10
			reverseOS.write(0xAA);
			codeLength += 1;
		}
		
		if (qoSInformationNeg != null) {
			codeLength += qoSInformationNeg.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			reverseOS.write(0xA9);
			codeLength += 1;
		}
		
		codeLength += serviceConditionChange.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 8
		reverseOS.write(0x88);
		codeLength += 1;
		
		if (timeUsage != null) {
			codeLength += timeUsage.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (timeOfLastUsage != null) {
			codeLength += timeOfLastUsage.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (timeOfFirstUsage != null) {
			codeLength += timeOfFirstUsage.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (localSequenceNumber != null) {
			codeLength += localSequenceNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (resultCode != null) {
			codeLength += resultCode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (chargingRuleBaseName != null) {
			codeLength += chargingRuleBaseName.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (ratingGroup != null) {
			codeLength += ratingGroup.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		codeLength += totalLength;

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			ratingGroup = new RatingGroupId();
			subCodeLength += ratingGroup.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			chargingRuleBaseName = new ChargingRuleBaseName();
			subCodeLength += chargingRuleBaseName.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			resultCode = new ResultCode();
			subCodeLength += resultCode.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			localSequenceNumber = new LocalSequenceNumber();
			subCodeLength += localSequenceNumber.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			timeOfFirstUsage = new TimeStamp();
			subCodeLength += timeOfFirstUsage.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			timeOfLastUsage = new TimeStamp();
			subCodeLength += timeOfLastUsage.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			timeUsage = new CallDuration();
			subCodeLength += timeUsage.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			serviceConditionChange = new ServiceConditionChange();
			subCodeLength += serviceConditionChange.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			qoSInformationNeg = new EPCQoSInformation();
			subCodeLength += qoSInformationNeg.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
			subCodeLength += length.decode(is);
			sgsnAddress = new GSNAddress();
			subCodeLength += sgsnAddress.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			sGSNPLMNIdentifier = new PLMNId();
			subCodeLength += sGSNPLMNIdentifier.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			datavolumeFBCUplink = new DataVolumeGPRS();
			subCodeLength += datavolumeFBCUplink.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			datavolumeFBCDownlink = new DataVolumeGPRS();
			subCodeLength += datavolumeFBCDownlink.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
			timeOfReport = new TimeStamp();
			subCodeLength += timeOfReport.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
			rATType = new RATType();
			subCodeLength += rATType.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
			failureHandlingContinue = new FailureHandlingContinue();
			subCodeLength += failureHandlingContinue.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
			serviceIdentifier = new ServiceIdentifier();
			subCodeLength += serviceIdentifier.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
			pSFurnishChargingInformation = new PSFurnishChargingInformation();
			subCodeLength += pSFurnishChargingInformation.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 19)) {
			aFRecordInformation = new AFRecordInformation();
			subCodeLength += aFRecordInformation.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 20)) {
			userLocationInformation = new BerOctetString();
			subCodeLength += userLocationInformation.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
			eventBasedChargingInformation = new EventBasedChargingInformation();
			subCodeLength += eventBasedChargingInformation.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 22)) {
			timeQuotaMechanism = new TimeQuotaMechanism();
			subCodeLength += timeQuotaMechanism.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (ratingGroup != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ratingGroup: ").append(ratingGroup);
			firstSelectedElement = false;
		}
		
		if (chargingRuleBaseName != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chargingRuleBaseName: ").append(chargingRuleBaseName);
			firstSelectedElement = false;
		}
		
		if (resultCode != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("resultCode: ").append(resultCode);
			firstSelectedElement = false;
		}
		
		if (localSequenceNumber != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("localSequenceNumber: ").append(localSequenceNumber);
			firstSelectedElement = false;
		}
		
		if (timeOfFirstUsage != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("timeOfFirstUsage: ").append(timeOfFirstUsage);
			firstSelectedElement = false;
		}
		
		if (timeOfLastUsage != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("timeOfLastUsage: ").append(timeOfLastUsage);
			firstSelectedElement = false;
		}
		
		if (timeUsage != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("timeUsage: ").append(timeUsage);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (serviceConditionChange != null) {
			sb.append("serviceConditionChange: ").append(serviceConditionChange);
		}
		else {
			sb.append("serviceConditionChange: <empty-required-field>");
		}
		
		if (qoSInformationNeg != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("qoSInformationNeg: ");
			qoSInformationNeg.appendAsString(sb, indentLevel + 1);
		}
		
		if (sgsnAddress != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sgsnAddress: ");
			sgsnAddress.appendAsString(sb, indentLevel + 1);
		}
		
		if (sGSNPLMNIdentifier != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sGSNPLMNIdentifier: ").append(sGSNPLMNIdentifier);
		}
		
		if (datavolumeFBCUplink != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("datavolumeFBCUplink: ").append(datavolumeFBCUplink);
		}
		
		if (datavolumeFBCDownlink != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("datavolumeFBCDownlink: ").append(datavolumeFBCDownlink);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (timeOfReport != null) {
			sb.append("timeOfReport: ").append(timeOfReport);
		}
		else {
			sb.append("timeOfReport: <empty-required-field>");
		}
		
		if (rATType != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rATType: ").append(rATType);
		}
		
		if (failureHandlingContinue != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("failureHandlingContinue: ").append(failureHandlingContinue);
		}
		
		if (serviceIdentifier != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("serviceIdentifier: ").append(serviceIdentifier);
		}
		
		if (pSFurnishChargingInformation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pSFurnishChargingInformation: ");
			pSFurnishChargingInformation.appendAsString(sb, indentLevel + 1);
		}
		
		if (aFRecordInformation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("aFRecordInformation: ");
			aFRecordInformation.appendAsString(sb, indentLevel + 1);
		}
		
		if (userLocationInformation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("userLocationInformation: ").append(userLocationInformation);
		}
		
		if (eventBasedChargingInformation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("eventBasedChargingInformation: ");
			eventBasedChargingInformation.appendAsString(sb, indentLevel + 1);
		}
		
		if (timeQuotaMechanism != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("timeQuotaMechanism: ");
			timeQuotaMechanism.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
