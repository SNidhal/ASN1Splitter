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


public class SGSNLCORecord implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 17);

	public byte[] code = null;
	private CallEventRecordType recordType = null;
	private RecordingEntity recordingEntity = null;
	private LCSClientType lcsClientType = null;
	private LCSClientIdentity lcsClientIdentity = null;
	private IMSI servedIMSI = null;
	private MSISDN servedMSISDN = null;
	private GSNAddress sgsnAddress = null;
	private LocationMethod locationMethod = null;
	private LCSQoSInfo lcsQos = null;
	private LCSPriority lcsPriority = null;
	private ISDNAddressString mlcNumber = null;
	private TimeStamp eventTimeStamp = null;
	private CallDuration measurementDuration = null;
	private LocationAreaAndCell location = null;
	private RoutingAreaCode routingArea = null;
	private ExtGeographicalInformation locationEstimate = null;
	private PositioningData positioningData = null;
	private LCSCause lcsCause = null;
	private Diagnostics diagnostics = null;
	private NodeID nodeID = null;
	private LocalSequenceNumber localSequenceNumber = null;
	private ChargingCharacteristics chargingCharacteristics = null;
	private ChChSelectionMode chChSelectionMode = null;
	private RATType rATType = null;
	private ManagementExtensions recordExtensions = null;
	private CauseForRecClosing causeForRecClosing = null;
	
	public SGSNLCORecord() {
	}

	public SGSNLCORecord(byte[] code) {
		this.code = code;
	}

	public void setRecordType(CallEventRecordType recordType) {
		this.recordType = recordType;
	}

	public CallEventRecordType getRecordType() {
		return recordType;
	}

	public void setRecordingEntity(RecordingEntity recordingEntity) {
		this.recordingEntity = recordingEntity;
	}

	public RecordingEntity getRecordingEntity() {
		return recordingEntity;
	}

	public void setLcsClientType(LCSClientType lcsClientType) {
		this.lcsClientType = lcsClientType;
	}

	public LCSClientType getLcsClientType() {
		return lcsClientType;
	}

	public void setLcsClientIdentity(LCSClientIdentity lcsClientIdentity) {
		this.lcsClientIdentity = lcsClientIdentity;
	}

	public LCSClientIdentity getLcsClientIdentity() {
		return lcsClientIdentity;
	}

	public void setServedIMSI(IMSI servedIMSI) {
		this.servedIMSI = servedIMSI;
	}

	public IMSI getServedIMSI() {
		return servedIMSI;
	}

	public void setServedMSISDN(MSISDN servedMSISDN) {
		this.servedMSISDN = servedMSISDN;
	}

	public MSISDN getServedMSISDN() {
		return servedMSISDN;
	}

	public void setSgsnAddress(GSNAddress sgsnAddress) {
		this.sgsnAddress = sgsnAddress;
	}

	public GSNAddress getSgsnAddress() {
		return sgsnAddress;
	}

	public void setLocationMethod(LocationMethod locationMethod) {
		this.locationMethod = locationMethod;
	}

	public LocationMethod getLocationMethod() {
		return locationMethod;
	}

	public void setLcsQos(LCSQoSInfo lcsQos) {
		this.lcsQos = lcsQos;
	}

	public LCSQoSInfo getLcsQos() {
		return lcsQos;
	}

	public void setLcsPriority(LCSPriority lcsPriority) {
		this.lcsPriority = lcsPriority;
	}

	public LCSPriority getLcsPriority() {
		return lcsPriority;
	}

	public void setMlcNumber(ISDNAddressString mlcNumber) {
		this.mlcNumber = mlcNumber;
	}

	public ISDNAddressString getMlcNumber() {
		return mlcNumber;
	}

	public void setEventTimeStamp(TimeStamp eventTimeStamp) {
		this.eventTimeStamp = eventTimeStamp;
	}

	public TimeStamp getEventTimeStamp() {
		return eventTimeStamp;
	}

	public void setMeasurementDuration(CallDuration measurementDuration) {
		this.measurementDuration = measurementDuration;
	}

	public CallDuration getMeasurementDuration() {
		return measurementDuration;
	}

	public void setLocation(LocationAreaAndCell location) {
		this.location = location;
	}

	public LocationAreaAndCell getLocation() {
		return location;
	}

	public void setRoutingArea(RoutingAreaCode routingArea) {
		this.routingArea = routingArea;
	}

	public RoutingAreaCode getRoutingArea() {
		return routingArea;
	}

	public void setLocationEstimate(ExtGeographicalInformation locationEstimate) {
		this.locationEstimate = locationEstimate;
	}

	public ExtGeographicalInformation getLocationEstimate() {
		return locationEstimate;
	}

	public void setPositioningData(PositioningData positioningData) {
		this.positioningData = positioningData;
	}

	public PositioningData getPositioningData() {
		return positioningData;
	}

	public void setLcsCause(LCSCause lcsCause) {
		this.lcsCause = lcsCause;
	}

	public LCSCause getLcsCause() {
		return lcsCause;
	}

	public void setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	public Diagnostics getDiagnostics() {
		return diagnostics;
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

	public void setChChSelectionMode(ChChSelectionMode chChSelectionMode) {
		this.chChSelectionMode = chChSelectionMode;
	}

	public ChChSelectionMode getChChSelectionMode() {
		return chChSelectionMode;
	}

	public void setRATType(RATType rATType) {
		this.rATType = rATType;
	}

	public RATType getRATType() {
		return rATType;
	}

	public void setRecordExtensions(ManagementExtensions recordExtensions) {
		this.recordExtensions = recordExtensions;
	}

	public ManagementExtensions getRecordExtensions() {
		return recordExtensions;
	}

	public void setCauseForRecClosing(CauseForRecClosing causeForRecClosing) {
		this.causeForRecClosing = causeForRecClosing;
	}

	public CauseForRecClosing getCauseForRecClosing() {
		return causeForRecClosing;
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

		codeLength += causeForRecClosing.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 25
		reverseOS.write(0x99);
		codeLength += 1;
		
		if (recordExtensions != null) {
			codeLength += recordExtensions.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 24
			reverseOS.write(0xB8);
			codeLength += 1;
		}
		
		if (rATType != null) {
			codeLength += rATType.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 23
			reverseOS.write(0x97);
			codeLength += 1;
		}
		
		if (chChSelectionMode != null) {
			codeLength += chChSelectionMode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 22
			reverseOS.write(0x96);
			codeLength += 1;
		}
		
		codeLength += chargingCharacteristics.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 21
		reverseOS.write(0x95);
		codeLength += 1;
		
		if (localSequenceNumber != null) {
			codeLength += localSequenceNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 20
			reverseOS.write(0x94);
			codeLength += 1;
		}
		
		if (nodeID != null) {
			codeLength += nodeID.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 19
			reverseOS.write(0x93);
			codeLength += 1;
		}
		
		if (diagnostics != null) {
			sublength = diagnostics.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
			reverseOS.write(0xB2);
			codeLength += 1;
		}
		
		if (lcsCause != null) {
			codeLength += lcsCause.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		if (positioningData != null) {
			codeLength += positioningData.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 16
			reverseOS.write(0x90);
			codeLength += 1;
		}
		
		if (locationEstimate != null) {
			codeLength += locationEstimate.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (routingArea != null) {
			codeLength += routingArea.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (location != null) {
			codeLength += location.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
			reverseOS.write(0xAD);
			codeLength += 1;
		}
		
		if (measurementDuration != null) {
			codeLength += measurementDuration.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		codeLength += eventTimeStamp.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 11
		reverseOS.write(0x8B);
		codeLength += 1;
		
		if (mlcNumber != null) {
			codeLength += mlcNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
		}
		
		if (lcsPriority != null) {
			codeLength += lcsPriority.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (lcsQos != null) {
			codeLength += lcsQos.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		codeLength += locationMethod.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 7
		reverseOS.write(0x87);
		codeLength += 1;
		
		if (sgsnAddress != null) {
			sublength = sgsnAddress.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
		}
		
		if (servedMSISDN != null) {
			codeLength += servedMSISDN.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		codeLength += servedIMSI.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 4
		reverseOS.write(0x84);
		codeLength += 1;
		
		if (lcsClientIdentity != null) {
			codeLength += lcsClientIdentity.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (lcsClientType != null) {
			codeLength += lcsClientType.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		codeLength += recordingEntity.encode(reverseOS, false);
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
				recordingEntity = new RecordingEntity();
				subCodeLength += recordingEntity.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				lcsClientType = new LCSClientType();
				subCodeLength += lcsClientType.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
				lcsClientIdentity = new LCSClientIdentity();
				subCodeLength += lcsClientIdentity.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				servedIMSI = new IMSI();
				subCodeLength += servedIMSI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
				servedMSISDN = new MSISDN();
				subCodeLength += servedMSISDN.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
				subCodeLength += new BerLength().decode(is);
				sgsnAddress = new GSNAddress();
				subCodeLength += sgsnAddress.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
				locationMethod = new LocationMethod();
				subCodeLength += locationMethod.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				lcsQos = new LCSQoSInfo();
				subCodeLength += lcsQos.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
				lcsPriority = new LCSPriority();
				subCodeLength += lcsPriority.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
				mlcNumber = new ISDNAddressString();
				subCodeLength += mlcNumber.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
				eventTimeStamp = new TimeStamp();
				subCodeLength += eventTimeStamp.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
				measurementDuration = new CallDuration();
				subCodeLength += measurementDuration.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
				location = new LocationAreaAndCell();
				subCodeLength += location.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
				routingArea = new RoutingAreaCode();
				subCodeLength += routingArea.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
				locationEstimate = new ExtGeographicalInformation();
				subCodeLength += locationEstimate.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
				positioningData = new PositioningData();
				subCodeLength += positioningData.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
				lcsCause = new LCSCause();
				subCodeLength += lcsCause.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
				subCodeLength += new BerLength().decode(is);
				diagnostics = new Diagnostics();
				subCodeLength += diagnostics.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 19)) {
				nodeID = new NodeID();
				subCodeLength += nodeID.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 20)) {
				localSequenceNumber = new LocalSequenceNumber();
				subCodeLength += localSequenceNumber.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 21)) {
				chargingCharacteristics = new ChargingCharacteristics();
				subCodeLength += chargingCharacteristics.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 22)) {
				chChSelectionMode = new ChChSelectionMode();
				subCodeLength += chChSelectionMode.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 23)) {
				rATType = new RATType();
				subCodeLength += rATType.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 24)) {
				recordExtensions = new ManagementExtensions();
				subCodeLength += recordExtensions.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 25)) {
				causeForRecClosing = new CauseForRecClosing();
				subCodeLength += causeForRecClosing.decode(is, false);
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
		if (recordingEntity != null) {
			sb.append("recordingEntity: ").append(recordingEntity);
		}
		else {
			sb.append("recordingEntity: <empty-required-field>");
		}
		
		if (lcsClientType != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lcsClientType: ").append(lcsClientType);
		}
		
		if (lcsClientIdentity != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lcsClientIdentity: ");
			lcsClientIdentity.appendAsString(sb, indentLevel + 1);
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
		
		if (servedMSISDN != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servedMSISDN: ").append(servedMSISDN);
		}
		
		if (sgsnAddress != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sgsnAddress: ");
			sgsnAddress.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (locationMethod != null) {
			sb.append("locationMethod: ").append(locationMethod);
		}
		else {
			sb.append("locationMethod: <empty-required-field>");
		}
		
		if (lcsQos != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lcsQos: ").append(lcsQos);
		}
		
		if (lcsPriority != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lcsPriority: ").append(lcsPriority);
		}
		
		if (mlcNumber != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("mlcNumber: ").append(mlcNumber);
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
		
		if (measurementDuration != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measurementDuration: ").append(measurementDuration);
		}
		
		if (location != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("location: ");
			location.appendAsString(sb, indentLevel + 1);
		}
		
		if (routingArea != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("routingArea: ").append(routingArea);
		}
		
		if (locationEstimate != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("locationEstimate: ").append(locationEstimate);
		}
		
		if (positioningData != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("positioningData: ").append(positioningData);
		}
		
		if (lcsCause != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("lcsCause: ").append(lcsCause);
		}
		
		if (diagnostics != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("diagnostics: ");
			diagnostics.appendAsString(sb, indentLevel + 1);
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
		
		if (chChSelectionMode != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chChSelectionMode: ").append(chChSelectionMode);
		}
		
		if (rATType != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rATType: ").append(rATType);
		}
		
		if (recordExtensions != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recordExtensions: ");
			recordExtensions.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (causeForRecClosing != null) {
			sb.append("causeForRecClosing: ").append(causeForRecClosing);
		}
		else {
			sb.append("causeForRecClosing: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

