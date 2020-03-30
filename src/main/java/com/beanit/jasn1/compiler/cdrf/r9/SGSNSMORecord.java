/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.BerLength;
import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;


public class SGSNSMORecord implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 17);

	public byte[] code = null;
	private CallEventRecordType recordType = null;
	private IMSI servedIMSI = null;
	private IMEI servedIMEI = null;
	private MSISDN servedMSISDN = null;
	private MSNetworkCapability msNetworkCapability = null;
	private AddressString serviceCentre = null;
	private RecordingEntity recordingEntity = null;
	private LocationAreaCode locationArea = null;
	private RoutingAreaCode routingArea = null;
	private CellId cellIdentifier = null;
	private MessageReference messageReference = null;
	private TimeStamp eventTimeStamp = null;
	private SMSResult smsResult = null;
	private ManagementExtensions recordExtensions = null;
	private NodeID nodeID = null;
	private LocalSequenceNumber localSequenceNumber = null;
	private ChargingCharacteristics chargingCharacteristics = null;
	private RATType rATType = null;
	private SmsTpDestinationNumber destinationNumber = null;
	private CAMELInformationSMS cAMELInformationSMS = null;
	private ChChSelectionMode chChSelectionMode = null;
	
	public SGSNSMORecord() {
	}

	public SGSNSMORecord(byte[] code) {
		this.code = code;
	}

	public void setRecordType(CallEventRecordType recordType) {
		this.recordType = recordType;
	}

	public CallEventRecordType getRecordType() {
		return recordType;
	}

	public void setServedIMSI(IMSI servedIMSI) {
		this.servedIMSI = servedIMSI;
	}

	public IMSI getServedIMSI() {
		return servedIMSI;
	}

	public void setServedIMEI(IMEI servedIMEI) {
		this.servedIMEI = servedIMEI;
	}

	public IMEI getServedIMEI() {
		return servedIMEI;
	}

	public void setServedMSISDN(MSISDN servedMSISDN) {
		this.servedMSISDN = servedMSISDN;
	}

	public MSISDN getServedMSISDN() {
		return servedMSISDN;
	}

	public void setMsNetworkCapability(MSNetworkCapability msNetworkCapability) {
		this.msNetworkCapability = msNetworkCapability;
	}

	public MSNetworkCapability getMsNetworkCapability() {
		return msNetworkCapability;
	}

	public void setServiceCentre(AddressString serviceCentre) {
		this.serviceCentre = serviceCentre;
	}

	public AddressString getServiceCentre() {
		return serviceCentre;
	}

	public void setRecordingEntity(RecordingEntity recordingEntity) {
		this.recordingEntity = recordingEntity;
	}

	public RecordingEntity getRecordingEntity() {
		return recordingEntity;
	}

	public void setLocationArea(LocationAreaCode locationArea) {
		this.locationArea = locationArea;
	}

	public LocationAreaCode getLocationArea() {
		return locationArea;
	}

	public void setRoutingArea(RoutingAreaCode routingArea) {
		this.routingArea = routingArea;
	}

	public RoutingAreaCode getRoutingArea() {
		return routingArea;
	}

	public void setCellIdentifier(CellId cellIdentifier) {
		this.cellIdentifier = cellIdentifier;
	}

	public CellId getCellIdentifier() {
		return cellIdentifier;
	}

	public void setMessageReference(MessageReference messageReference) {
		this.messageReference = messageReference;
	}

	public MessageReference getMessageReference() {
		return messageReference;
	}

	public void setEventTimeStamp(TimeStamp eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	public TimeStamp getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setSmsResult(SMSResult smsResult) {
		this.smsResult = smsResult;
	}

	public SMSResult getSmsResult() {
		return smsResult;
	}

	public void setRecordExtensions(ManagementExtensions recordExtensions) {
		this.recordExtensions = recordExtensions;
	}

	public ManagementExtensions getRecordExtensions() {
		return recordExtensions;
	}

	public void setNodeID(NodeID nodeID) {
		this.nodeID = nodeID;
	}

	public NodeID getNodeID() {
		return nodeID;
	}

	public void setLocalSequenceNumber(LocalSequenceNumber localSequenceNumber) {
		this.localSequenceNumber = localSequenceNumber;
	}

	public LocalSequenceNumber getLocalSequenceNumber() {
		return localSequenceNumber;
	}

	public void setChargingCharacteristics(ChargingCharacteristics chargingCharacteristics) {
		this.chargingCharacteristics = chargingCharacteristics;
	}

	public ChargingCharacteristics getChargingCharacteristics() {
		return chargingCharacteristics;
	}

	public void setRATType(RATType rATType) {
		this.rATType = rATType;
	}

	public RATType getRATType() {
		return rATType;
	}

	public void setDestinationNumber(SmsTpDestinationNumber destinationNumber) {
		this.destinationNumber = destinationNumber;
	}

	public SmsTpDestinationNumber getDestinationNumber() {
		return destinationNumber;
	}

	public void setCAMELInformationSMS(CAMELInformationSMS cAMELInformationSMS) {
		this.cAMELInformationSMS = cAMELInformationSMS;
	}

	public CAMELInformationSMS getCAMELInformationSMS() {
		return cAMELInformationSMS;
	}

	public void setChChSelectionMode(ChChSelectionMode chChSelectionMode) {
		this.chChSelectionMode = chChSelectionMode;
	}

	public ChChSelectionMode getChChSelectionMode() {
		return chChSelectionMode;
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

		if (chChSelectionMode != null) {
			codeLength += chChSelectionMode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 20
			reverseOS.write(0x94);
			codeLength += 1;
		}
		
		if (cAMELInformationSMS != null) {
			codeLength += cAMELInformationSMS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 19
			reverseOS.write(0xB3);
			codeLength += 1;
		}
		
		if (destinationNumber != null) {
			codeLength += destinationNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 18
			reverseOS.write(0x92);
			codeLength += 1;
		}
		
		if (rATType != null) {
			codeLength += rATType.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		codeLength += chargingCharacteristics.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 16
		reverseOS.write(0x90);
		codeLength += 1;
		
		if (localSequenceNumber != null) {
			codeLength += localSequenceNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (nodeID != null) {
			codeLength += nodeID.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (recordExtensions != null) {
			codeLength += recordExtensions.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
			reverseOS.write(0xAD);
			codeLength += 1;
		}
		
		if (smsResult != null) {
			sublength = smsResult.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			reverseOS.write(0xAC);
			codeLength += 1;
		}
		
		codeLength += eventTimeStamp.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 11
		reverseOS.write(0x8B);
		codeLength += 1;
		
		codeLength += messageReference.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 10
		reverseOS.write(0x8A);
		codeLength += 1;
		
		if (cellIdentifier != null) {
			codeLength += cellIdentifier.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (routingArea != null) {
			codeLength += routingArea.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (locationArea != null) {
			codeLength += locationArea.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (recordingEntity != null) {
			codeLength += recordingEntity.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (serviceCentre != null) {
			codeLength += serviceCentre.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (msNetworkCapability != null) {
			codeLength += msNetworkCapability.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (servedMSISDN != null) {
			codeLength += servedMSISDN.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (servedIMEI != null) {
			codeLength += servedIMEI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		codeLength += servedIMSI.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 1
		reverseOS.write(0x81);
		codeLength += 1;
		
		codeLength += recordType.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 0
		reverseOS.write(0x80);
		codeLength += 1;
		
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
		while (subCodeLength < totalLength) {
			subCodeLength += berTag.decode(is);
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				recordType = new CallEventRecordType();
				subCodeLength += recordType.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				servedIMSI = new IMSI();
				subCodeLength += servedIMSI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				servedIMEI = new IMEI();
				subCodeLength += servedIMEI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				servedMSISDN = new MSISDN();
				subCodeLength += servedMSISDN.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				msNetworkCapability = new MSNetworkCapability();
				subCodeLength += msNetworkCapability.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
				serviceCentre = new AddressString();
				subCodeLength += serviceCentre.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
				recordingEntity = new RecordingEntity();
				subCodeLength += recordingEntity.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
				locationArea = new LocationAreaCode();
				subCodeLength += locationArea.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				routingArea = new RoutingAreaCode();
				subCodeLength += routingArea.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
				cellIdentifier = new CellId();
				subCodeLength += cellIdentifier.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
				messageReference = new MessageReference();
				subCodeLength += messageReference.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
				eventTimeStamp = new TimeStamp();
				subCodeLength += eventTimeStamp.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
				subCodeLength += new BerLength().decode(is);
				smsResult = new SMSResult();
				subCodeLength += smsResult.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
				recordExtensions = new ManagementExtensions();
				subCodeLength += recordExtensions.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
				nodeID = new NodeID();
				subCodeLength += nodeID.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
				localSequenceNumber = new LocalSequenceNumber();
				subCodeLength += localSequenceNumber.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
				chargingCharacteristics = new ChargingCharacteristics();
				subCodeLength += chargingCharacteristics.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
				rATType = new RATType();
				subCodeLength += rATType.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 18)) {
				destinationNumber = new SmsTpDestinationNumber();
				subCodeLength += destinationNumber.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 19)) {
				cAMELInformationSMS = new CAMELInformationSMS();
				subCodeLength += cAMELInformationSMS.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 20)) {
				chChSelectionMode = new ChChSelectionMode();
				subCodeLength += chChSelectionMode.decode(is, false);
			}
		}
		if (subCodeLength != totalLength) {
			throw new IOException("Length of set does not match length tag, length tag: " + totalLength + ", actual set length: " + subCodeLength);

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

		sb.append("{");
		sb.append("\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (recordType != null) {
			sb.append("recordType: ").append(recordType);
		}
		else {
			sb.append("recordType: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (servedIMSI != null) {
			sb.append("servedIMSI: ").append(servedIMSI);
		}
		else {
			sb.append("servedIMSI: <empty-required-field>");
		}
		
		if (servedIMEI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servedIMEI: ").append(servedIMEI);
		}
		
		if (servedMSISDN != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servedMSISDN: ").append(servedMSISDN);
		}
		
		if (msNetworkCapability != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("msNetworkCapability: ").append(msNetworkCapability);
		}
		
		if (serviceCentre != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("serviceCentre: ").append(serviceCentre);
		}
		
		if (recordingEntity != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recordingEntity: ").append(recordingEntity);
		}
		
		if (locationArea != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("locationArea: ").append(locationArea);
		}
		
		if (routingArea != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("routingArea: ").append(routingArea);
		}
		
		if (cellIdentifier != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cellIdentifier: ").append(cellIdentifier);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (messageReference != null) {
			sb.append("messageReference: ").append(messageReference);
		}
		else {
			sb.append("messageReference: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (eventTimeStamp != null) {
			sb.append("eventTimeStamp: ").append(eventTimeStamp);
		}
		else {
			sb.append("eventTimeStamp: <empty-required-field>");
		}
		
		if (smsResult != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("smsResult: ");
			smsResult.appendAsString(sb, indentLevel + 1);
		}
		
		if (recordExtensions != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recordExtensions: ");
			recordExtensions.appendAsString(sb, indentLevel + 1);
		}
		
		if (nodeID != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nodeID: ").append(nodeID);
		}
		
		if (localSequenceNumber != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("localSequenceNumber: ").append(localSequenceNumber);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (chargingCharacteristics != null) {
			sb.append("chargingCharacteristics: ").append(chargingCharacteristics);
		}
		else {
			sb.append("chargingCharacteristics: <empty-required-field>");
		}
		
		if (rATType != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rATType: ").append(rATType);
		}
		
		if (destinationNumber != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("destinationNumber: ").append(destinationNumber);
		}
		
		if (cAMELInformationSMS != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cAMELInformationSMS: ");
			cAMELInformationSMS.appendAsString(sb, indentLevel + 1);
		}
		
		if (chChSelectionMode != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chChSelectionMode: ").append(chChSelectionMode);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
