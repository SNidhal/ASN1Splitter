/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.BerLength;
import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerBoolean;
import com.beanit.jasn1.ber.types.BerInteger;
import com.beanit.jasn1.ber.types.BerOctetString;
import com.beanit.jasn1.ber.types.BerType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;


public class ServiceEvent implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerInteger serviceCode = null;
	private DataVolumeGPRS uplinkVolume = null;
	private DataVolumeGPRS downlinkVolume = null;
	private BerInteger usageduration = null;
	private BerOctetString url = null;
	private ChargingRuleBaseName chargingRuleBaseName = null;
	private RatingGroupId ratingGroup = null;
	private ServiceIdentifier serviceIdentifier = null;
	private LocalSequenceNumber localSequenceNumber = null;
	private TimeStampExtension envelopeStartTime = null;
	private TimeStampExtension envelopeEndTime = null;
	private CallDurationExtension duration = null;
	private BerInteger changeTimeTimeZone = null;
	private BerBoolean noOCSCreditControl = null;
	
	public ServiceEvent() {
	}

	public ServiceEvent(byte[] code) {
		this.code = code;
	}

	public void setServiceCode(BerInteger serviceCode) {
		this.serviceCode = serviceCode;
	}

	public BerInteger getServiceCode() {
		return serviceCode;
	}

	public void setUplinkVolume(DataVolumeGPRS uplinkVolume) {
		this.uplinkVolume = uplinkVolume;
	}

	public DataVolumeGPRS getUplinkVolume() {
		return uplinkVolume;
	}

	public void setDownlinkVolume(DataVolumeGPRS downlinkVolume) {
		this.downlinkVolume = downlinkVolume;
	}

	public DataVolumeGPRS getDownlinkVolume() {
		return downlinkVolume;
	}

	public void setUsageduration(BerInteger usageduration) {
		this.usageduration = usageduration;
	}

	public BerInteger getUsageduration() {
		return usageduration;
	}

	public void setUrl(BerOctetString url) {
		this.url = url;
	}

	public BerOctetString getUrl() {
		return url;
	}

	public void setChargingRuleBaseName(ChargingRuleBaseName chargingRuleBaseName) {
		this.chargingRuleBaseName = chargingRuleBaseName;
	}

	public ChargingRuleBaseName getChargingRuleBaseName() {
		return chargingRuleBaseName;
	}

	public void setRatingGroup(RatingGroupId ratingGroup) {
		this.ratingGroup = ratingGroup;
	}

	public RatingGroupId getRatingGroup() {
		return ratingGroup;
	}

	public void setServiceIdentifier(ServiceIdentifier serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;
	}

	public ServiceIdentifier getServiceIdentifier() {
		return serviceIdentifier;
	}

	public void setLocalSequenceNumber(LocalSequenceNumber localSequenceNumber) {
		this.localSequenceNumber = localSequenceNumber;
	}

	public LocalSequenceNumber getLocalSequenceNumber() {
		return localSequenceNumber;
	}

	public void setEnvelopeStartTime(TimeStampExtension envelopeStartTime) {
		this.envelopeStartTime = envelopeStartTime;
	}

	public TimeStampExtension getEnvelopeStartTime() {
		return envelopeStartTime;
	}

	public void setEnvelopeEndTime(TimeStampExtension envelopeEndTime) {
		this.envelopeEndTime = envelopeEndTime;
	}

	public TimeStampExtension getEnvelopeEndTime() {
		return envelopeEndTime;
	}

	public void setDuration(CallDurationExtension duration) {
		this.duration = duration;
	}

	public CallDurationExtension getDuration() {
		return duration;
	}

	public void setChangeTimeTimeZone(BerInteger changeTimeTimeZone) {
		this.changeTimeTimeZone = changeTimeTimeZone;
	}

	public BerInteger getChangeTimeTimeZone() {
		return changeTimeTimeZone;
	}

	public void setNoOCSCreditControl(BerBoolean noOCSCreditControl) {
		this.noOCSCreditControl = noOCSCreditControl;
	}

	public BerBoolean getNoOCSCreditControl() {
		return noOCSCreditControl;
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
		if (noOCSCreditControl != null) {
			codeLength += noOCSCreditControl.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 16
			reverseOS.write(0x90);
			codeLength += 1;
		}
		
		if (changeTimeTimeZone != null) {
			codeLength += changeTimeTimeZone.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (duration != null) {
			codeLength += duration.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (envelopeEndTime != null) {
			codeLength += envelopeEndTime.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (envelopeStartTime != null) {
			codeLength += envelopeStartTime.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		if (localSequenceNumber != null) {
			codeLength += localSequenceNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (serviceIdentifier != null) {
			codeLength += serviceIdentifier.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
		}
		
		if (ratingGroup != null) {
			codeLength += ratingGroup.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (chargingRuleBaseName != null) {
			codeLength += chargingRuleBaseName.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (url != null) {
			codeLength += url.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (usageduration != null) {
			codeLength += usageduration.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (downlinkVolume != null) {
			codeLength += downlinkVolume.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (uplinkVolume != null) {
			codeLength += uplinkVolume.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (serviceCode != null) {
			codeLength += serviceCode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
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

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			serviceCode = new BerInteger();
			subCodeLength += serviceCode.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			uplinkVolume = new DataVolumeGPRS();
			subCodeLength += uplinkVolume.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			downlinkVolume = new DataVolumeGPRS();
			subCodeLength += downlinkVolume.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			usageduration = new BerInteger();
			subCodeLength += usageduration.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			url = new BerOctetString();
			subCodeLength += url.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			chargingRuleBaseName = new ChargingRuleBaseName();
			subCodeLength += chargingRuleBaseName.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			ratingGroup = new RatingGroupId();
			subCodeLength += ratingGroup.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			serviceIdentifier = new ServiceIdentifier();
			subCodeLength += serviceIdentifier.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			localSequenceNumber = new LocalSequenceNumber();
			subCodeLength += localSequenceNumber.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			envelopeStartTime = new TimeStampExtension();
			subCodeLength += envelopeStartTime.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			envelopeEndTime = new TimeStampExtension();
			subCodeLength += envelopeEndTime.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
			duration = new CallDurationExtension();
			subCodeLength += duration.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
			changeTimeTimeZone = new BerInteger();
			subCodeLength += changeTimeTimeZone.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
			noOCSCreditControl = new BerBoolean();
			subCodeLength += noOCSCreditControl.decode(is, false);
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
		if (serviceCode != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("serviceCode: ").append(serviceCode);
			firstSelectedElement = false;
		}
		
		if (uplinkVolume != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("uplinkVolume: ").append(uplinkVolume);
			firstSelectedElement = false;
		}
		
		if (downlinkVolume != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("downlinkVolume: ").append(downlinkVolume);
			firstSelectedElement = false;
		}
		
		if (usageduration != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("usageduration: ").append(usageduration);
			firstSelectedElement = false;
		}
		
		if (url != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("url: ").append(url);
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
		
		if (ratingGroup != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ratingGroup: ").append(ratingGroup);
			firstSelectedElement = false;
		}
		
		if (serviceIdentifier != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("serviceIdentifier: ").append(serviceIdentifier);
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
		
		if (envelopeStartTime != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("envelopeStartTime: ").append(envelopeStartTime);
			firstSelectedElement = false;
		}
		
		if (envelopeEndTime != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("envelopeEndTime: ").append(envelopeEndTime);
			firstSelectedElement = false;
		}
		
		if (duration != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("duration: ").append(duration);
			firstSelectedElement = false;
		}
		
		if (changeTimeTimeZone != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("changeTimeTimeZone: ").append(changeTimeTimeZone);
			firstSelectedElement = false;
		}
		
		if (noOCSCreditControl != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("noOCSCreditControl: ").append(noOCSCreditControl);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

