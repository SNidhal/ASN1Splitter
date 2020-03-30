/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.cdrf.r9;

import com.beanit.jasn1.ber.BerLength;
import com.beanit.jasn1.ber.BerTag;
import com.beanit.jasn1.ber.ReverseByteArrayOutputStream;
import com.beanit.jasn1.ber.types.BerInteger;
import com.beanit.jasn1.ber.types.BerNull;
import com.beanit.jasn1.ber.types.BerType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SGSNPDPRecord implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class ListOfTrafficVolumes implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<ChangeOfCharCondition> seqOf = null;

		public ListOfTrafficVolumes() {
			seqOf = new ArrayList<ChangeOfCharCondition>();
		}

		public ListOfTrafficVolumes(byte[] code) {
			this.code = code;
		}

		public List<ChangeOfCharCondition> getChangeOfCharCondition() {
			if (seqOf == null) {
				seqOf = new ArrayList<ChangeOfCharCondition>();
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
				ChangeOfCharCondition element = new ChangeOfCharCondition();
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
				Iterator<ChangeOfCharCondition> it = seqOf.iterator();
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

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 17);

	public byte[] code = null;
	private CallEventRecordType recordType = null;
	private NetworkInitiatedPDPContext networkInitiation = null;
	private IMSI servedIMSI = null;
	private IMEI servedIMEI = null;
	private GSNAddress sgsnAddress = null;
	private MSNetworkCapability msNetworkCapability = null;
	private RoutingAreaCode routingArea = null;
	private LocationAreaCode locationAreaCode = null;
	private CellId cellIdentifier = null;
	private ChargingID chargingID = null;
	private GSNAddress ggsnAddressUsed = null;
	private AccessPointNameNI accessPointNameNI = null;
	private PDPType pdpType = null;
	private PDPAddress servedPDPAddress = null;
	private ListOfTrafficVolumes listOfTrafficVolumes = null;
	private TimeStamp recordOpeningTime = null;
	private CallDuration duration = null;
	private SGSNChange sgsnChange = null;
	private CauseForRecClosing causeForRecClosing = null;
	private Diagnostics diagnostics = null;
	private BerInteger recordSequenceNumber = null;
	private NodeID nodeID = null;
	private ManagementExtensions recordExtensions = null;
	private LocalSequenceNumber localSequenceNumber = null;
	private APNSelectionMode apnSelectionMode = null;
	private AccessPointNameOI accessPointNameOI = null;
	private MSISDN servedMSISDN = null;
	private ChargingCharacteristics chargingCharacteristics = null;
	private RATType rATType = null;
	private CAMELInformationPDP cAMELInformationPDP = null;
	private DataVolumeGPRS rNCUnsentDownlinkVolume = null;
	private ChChSelectionMode chChSelectionMode = null;
	private DynamicAddressFlag dynamicAddressFlag = null;
	private BerNull iMSIunauthenticatedFlag = null;
	private UserCSGInformation userCSGInformation = null;
	private PDPAddress servedPDPPDNAddressExt = null;
	private PLMNId sgsnPLMNIdentifier = null;
	
	public SGSNPDPRecord() {
	}

	public SGSNPDPRecord(byte[] code) {
		this.code = code;
	}

	public void setRecordType(CallEventRecordType recordType) {
		this.recordType = recordType;
	}

	public CallEventRecordType getRecordType() {
		return recordType;
	}

	public void setNetworkInitiation(NetworkInitiatedPDPContext networkInitiation) {
		this.networkInitiation = networkInitiation;
	}

	public NetworkInitiatedPDPContext getNetworkInitiation() {
		return networkInitiation;
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

	public void setSgsnAddress(GSNAddress sgsnAddress) {
		this.sgsnAddress = sgsnAddress;
	}

	public GSNAddress getSgsnAddress() {
		return sgsnAddress;
	}

	public void setMsNetworkCapability(MSNetworkCapability msNetworkCapability) {
		this.msNetworkCapability = msNetworkCapability;
	}

	public MSNetworkCapability getMsNetworkCapability() {
		return msNetworkCapability;
	}

	public void setRoutingArea(RoutingAreaCode routingArea) {
		this.routingArea = routingArea;
	}

	public RoutingAreaCode getRoutingArea() {
		return routingArea;
	}

	public void setLocationAreaCode(LocationAreaCode locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
	}

	public LocationAreaCode getLocationAreaCode() {
		return locationAreaCode;
	}

	public void setCellIdentifier(CellId cellIdentifier) {
		this.cellIdentifier = cellIdentifier;
	}

	public CellId getCellIdentifier() {
		return cellIdentifier;
	}

	public void setChargingID(ChargingID chargingID) {
		this.chargingID = chargingID;
	}

	public ChargingID getChargingID() {
		return chargingID;
	}

	public void setGgsnAddressUsed(GSNAddress ggsnAddressUsed) {
		this.ggsnAddressUsed = ggsnAddressUsed;
	}

	public GSNAddress getGgsnAddressUsed() {
		return ggsnAddressUsed;
	}

	public void setAccessPointNameNI(AccessPointNameNI accessPointNameNI) {
		this.accessPointNameNI = accessPointNameNI;
	}

	public AccessPointNameNI getAccessPointNameNI() {
		return accessPointNameNI;
	}

	public void setPdpType(PDPType pdpType) {
		this.pdpType = pdpType;
	}

	public PDPType getPdpType() {
		return pdpType;
	}

	public void setServedPDPAddress(PDPAddress servedPDPAddress) {
		this.servedPDPAddress = servedPDPAddress;
	}

	public PDPAddress getServedPDPAddress() {
		return servedPDPAddress;
	}

	public void setListOfTrafficVolumes(ListOfTrafficVolumes listOfTrafficVolumes) {
		this.listOfTrafficVolumes = listOfTrafficVolumes;
	}

	public ListOfTrafficVolumes getListOfTrafficVolumes() {
		return listOfTrafficVolumes;
	}

	public void setRecordOpeningTime(TimeStamp recordOpeningTime) {
		this.recordOpeningTime = recordOpeningTime;
	}

	public TimeStamp getRecordOpeningTime() {
		return recordOpeningTime;
	}

	public void setDuration(CallDuration duration) {
		this.duration = duration;
	}

	public CallDuration getDuration() {
		return duration;
	}

	public void setSgsnChange(SGSNChange sgsnChange) {
		this.sgsnChange = sgsnChange;
	}

	public SGSNChange getSgsnChange() {
		return sgsnChange;
	}

	public void setCauseForRecClosing(CauseForRecClosing causeForRecClosing) {
		this.causeForRecClosing = causeForRecClosing;
	}

	public CauseForRecClosing getCauseForRecClosing() {
		return causeForRecClosing;
	}

	public void setDiagnostics(Diagnostics diagnostics) {
		this.diagnostics = diagnostics;
	}

	public Diagnostics getDiagnostics() {
		return diagnostics;
	}

	public void setRecordSequenceNumber(BerInteger recordSequenceNumber) {
		this.recordSequenceNumber = recordSequenceNumber;
	}

	public BerInteger getRecordSequenceNumber() {
		return recordSequenceNumber;
	}

	public void setNodeID(NodeID nodeID) {
		this.nodeID = nodeID;
	}

	public NodeID getNodeID() {
		return nodeID;
	}

	public void setRecordExtensions(ManagementExtensions recordExtensions) {
		this.recordExtensions = recordExtensions;
	}

	public ManagementExtensions getRecordExtensions() {
		return recordExtensions;
	}

	public void setLocalSequenceNumber(LocalSequenceNumber localSequenceNumber) {
		this.localSequenceNumber = localSequenceNumber;
	}

	public LocalSequenceNumber getLocalSequenceNumber() {
		return localSequenceNumber;
	}

	public void setApnSelectionMode(APNSelectionMode apnSelectionMode) {
		this.apnSelectionMode = apnSelectionMode;
	}

	public APNSelectionMode getApnSelectionMode() {
		return apnSelectionMode;
	}

	public void setAccessPointNameOI(AccessPointNameOI accessPointNameOI) {
		this.accessPointNameOI = accessPointNameOI;
	}

	public AccessPointNameOI getAccessPointNameOI() {
		return accessPointNameOI;
	}

	public void setServedMSISDN(MSISDN servedMSISDN) {
		this.servedMSISDN = servedMSISDN;
	}

	public MSISDN getServedMSISDN() {
		return servedMSISDN;
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

	public void setCAMELInformationPDP(CAMELInformationPDP cAMELInformationPDP) {
		this.cAMELInformationPDP = cAMELInformationPDP;
	}

	public CAMELInformationPDP getCAMELInformationPDP() {
		return cAMELInformationPDP;
	}

	public void setRNCUnsentDownlinkVolume(DataVolumeGPRS rNCUnsentDownlinkVolume) {
		this.rNCUnsentDownlinkVolume = rNCUnsentDownlinkVolume;
	}

	public DataVolumeGPRS getRNCUnsentDownlinkVolume() {
		return rNCUnsentDownlinkVolume;
	}

	public void setChChSelectionMode(ChChSelectionMode chChSelectionMode) {
		this.chChSelectionMode = chChSelectionMode;
	}

	public ChChSelectionMode getChChSelectionMode() {
		return chChSelectionMode;
	}

	public void setDynamicAddressFlag(DynamicAddressFlag dynamicAddressFlag) {
		this.dynamicAddressFlag = dynamicAddressFlag;
	}

	public DynamicAddressFlag getDynamicAddressFlag() {
		return dynamicAddressFlag;
	}

	public void setIMSIunauthenticatedFlag(BerNull iMSIunauthenticatedFlag) {
		this.iMSIunauthenticatedFlag = iMSIunauthenticatedFlag;
	}

	public BerNull getIMSIunauthenticatedFlag() {
		return iMSIunauthenticatedFlag;
	}

	public void setUserCSGInformation(UserCSGInformation userCSGInformation) {
		this.userCSGInformation = userCSGInformation;
	}

	public UserCSGInformation getUserCSGInformation() {
		return userCSGInformation;
	}

	public void setServedPDPPDNAddressExt(PDPAddress servedPDPPDNAddressExt) {
		this.servedPDPPDNAddressExt = servedPDPPDNAddressExt;
	}

	public PDPAddress getServedPDPPDNAddressExt() {
		return servedPDPPDNAddressExt;
	}

	public void setSgsnPLMNIdentifier(PLMNId sgsnPLMNIdentifier) {
		this.sgsnPLMNIdentifier = sgsnPLMNIdentifier;
	}

	public PLMNId getSgsnPLMNIdentifier() {
		return sgsnPLMNIdentifier;
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

		if (sgsnPLMNIdentifier != null) {
			codeLength += sgsnPLMNIdentifier.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 40
			reverseOS.write(0x28);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (servedPDPPDNAddressExt != null) {
			sublength = servedPDPPDNAddressExt.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 36
			reverseOS.write(0x24);
			reverseOS.write(0xBF);
			codeLength += 2;
		}
		
		if (userCSGInformation != null) {
			codeLength += userCSGInformation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 35
			reverseOS.write(0x23);
			reverseOS.write(0xBF);
			codeLength += 2;
		}
		
		if (iMSIunauthenticatedFlag != null) {
			codeLength += iMSIunauthenticatedFlag.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 34
			reverseOS.write(0x22);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (dynamicAddressFlag != null) {
			codeLength += dynamicAddressFlag.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 33
			reverseOS.write(0x21);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (chChSelectionMode != null) {
			codeLength += chChSelectionMode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 32
			reverseOS.write(0x20);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (rNCUnsentDownlinkVolume != null) {
			codeLength += rNCUnsentDownlinkVolume.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 31
			reverseOS.write(0x1F);
			reverseOS.write(0x9F);
			codeLength += 2;
		}
		
		if (cAMELInformationPDP != null) {
			codeLength += cAMELInformationPDP.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 30
			reverseOS.write(0xBE);
			codeLength += 1;
		}
		
		if (rATType != null) {
			codeLength += rATType.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 29
			reverseOS.write(0x9D);
			codeLength += 1;
		}
		
		codeLength += chargingCharacteristics.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 28
		reverseOS.write(0x9C);
		codeLength += 1;
		
		if (servedMSISDN != null) {
			codeLength += servedMSISDN.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 27
			reverseOS.write(0x9B);
			codeLength += 1;
		}
		
		if (accessPointNameOI != null) {
			codeLength += accessPointNameOI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 26
			reverseOS.write(0x9A);
			codeLength += 1;
		}
		
		if (apnSelectionMode != null) {
			codeLength += apnSelectionMode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 25
			reverseOS.write(0x99);
			codeLength += 1;
		}
		
		if (localSequenceNumber != null) {
			codeLength += localSequenceNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 24
			reverseOS.write(0x98);
			codeLength += 1;
		}
		
		if (recordExtensions != null) {
			codeLength += recordExtensions.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 23
			reverseOS.write(0xB7);
			codeLength += 1;
		}
		
		if (nodeID != null) {
			codeLength += nodeID.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 22
			reverseOS.write(0x96);
			codeLength += 1;
		}
		
		if (recordSequenceNumber != null) {
			codeLength += recordSequenceNumber.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 21
			reverseOS.write(0x95);
			codeLength += 1;
		}
		
		if (diagnostics != null) {
			sublength = diagnostics.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 20
			reverseOS.write(0xB4);
			codeLength += 1;
		}
		
		codeLength += causeForRecClosing.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 19
		reverseOS.write(0x93);
		codeLength += 1;
		
		if (sgsnChange != null) {
			codeLength += sgsnChange.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 18
			reverseOS.write(0x92);
			codeLength += 1;
		}
		
		codeLength += duration.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 17
		reverseOS.write(0x91);
		codeLength += 1;
		
		codeLength += recordOpeningTime.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 16
		reverseOS.write(0x90);
		codeLength += 1;
		
		if (listOfTrafficVolumes != null) {
			codeLength += listOfTrafficVolumes.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			reverseOS.write(0xAF);
			codeLength += 1;
		}
		
		if (servedPDPAddress != null) {
			sublength = servedPDPAddress.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 14
			reverseOS.write(0xAE);
			codeLength += 1;
		}
		
		if (pdpType != null) {
			codeLength += pdpType.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (accessPointNameNI != null) {
			codeLength += accessPointNameNI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		sublength = ggsnAddressUsed.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
		reverseOS.write(0xAB);
		codeLength += 1;
		
		codeLength += chargingID.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 10
		reverseOS.write(0x8A);
		codeLength += 1;
		
		if (cellIdentifier != null) {
			codeLength += cellIdentifier.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (locationAreaCode != null) {
			codeLength += locationAreaCode.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (routingArea != null) {
			codeLength += routingArea.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (msNetworkCapability != null) {
			codeLength += msNetworkCapability.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (sgsnAddress != null) {
			sublength = sgsnAddress.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
		}
		
		if (servedIMEI != null) {
			codeLength += servedIMEI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		codeLength += servedIMSI.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 3
		reverseOS.write(0x83);
		codeLength += 1;
		
		if (networkInitiation != null) {
			codeLength += networkInitiation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
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
				networkInitiation = new NetworkInitiatedPDPContext();
				subCodeLength += networkInitiation.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				servedIMSI = new IMSI();
				subCodeLength += servedIMSI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				servedIMEI = new IMEI();
				subCodeLength += servedIMEI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
				subCodeLength += new BerLength().decode(is);
				sgsnAddress = new GSNAddress();
				subCodeLength += sgsnAddress.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
				msNetworkCapability = new MSNetworkCapability();
				subCodeLength += msNetworkCapability.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
				routingArea = new RoutingAreaCode();
				subCodeLength += routingArea.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				locationAreaCode = new LocationAreaCode();
				subCodeLength += locationAreaCode.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
				cellIdentifier = new CellId();
				subCodeLength += cellIdentifier.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
				chargingID = new ChargingID();
				subCodeLength += chargingID.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
				subCodeLength += new BerLength().decode(is);
				ggsnAddressUsed = new GSNAddress();
				subCodeLength += ggsnAddressUsed.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
				accessPointNameNI = new AccessPointNameNI();
				subCodeLength += accessPointNameNI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
				pdpType = new PDPType();
				subCodeLength += pdpType.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 14)) {
				subCodeLength += new BerLength().decode(is);
				servedPDPAddress = new PDPAddress();
				subCodeLength += servedPDPAddress.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
				listOfTrafficVolumes = new ListOfTrafficVolumes();
				subCodeLength += listOfTrafficVolumes.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
				recordOpeningTime = new TimeStamp();
				subCodeLength += recordOpeningTime.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
				duration = new CallDuration();
				subCodeLength += duration.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 18)) {
				sgsnChange = new SGSNChange();
				subCodeLength += sgsnChange.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 19)) {
				causeForRecClosing = new CauseForRecClosing();
				subCodeLength += causeForRecClosing.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 20)) {
				subCodeLength += new BerLength().decode(is);
				diagnostics = new Diagnostics();
				subCodeLength += diagnostics.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 21)) {
				recordSequenceNumber = new BerInteger();
				subCodeLength += recordSequenceNumber.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 22)) {
				nodeID = new NodeID();
				subCodeLength += nodeID.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 23)) {
				recordExtensions = new ManagementExtensions();
				subCodeLength += recordExtensions.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 24)) {
				localSequenceNumber = new LocalSequenceNumber();
				subCodeLength += localSequenceNumber.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 25)) {
				apnSelectionMode = new APNSelectionMode();
				subCodeLength += apnSelectionMode.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 26)) {
				accessPointNameOI = new AccessPointNameOI();
				subCodeLength += accessPointNameOI.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 27)) {
				servedMSISDN = new MSISDN();
				subCodeLength += servedMSISDN.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 28)) {
				chargingCharacteristics = new ChargingCharacteristics();
				subCodeLength += chargingCharacteristics.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 29)) {
				rATType = new RATType();
				subCodeLength += rATType.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 30)) {
				cAMELInformationPDP = new CAMELInformationPDP();
				subCodeLength += cAMELInformationPDP.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 31)) {
				rNCUnsentDownlinkVolume = new DataVolumeGPRS();
				subCodeLength += rNCUnsentDownlinkVolume.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 32)) {
				chChSelectionMode = new ChChSelectionMode();
				subCodeLength += chChSelectionMode.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 33)) {
				dynamicAddressFlag = new DynamicAddressFlag();
				subCodeLength += dynamicAddressFlag.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 34)) {
				iMSIunauthenticatedFlag = new BerNull();
				subCodeLength += iMSIunauthenticatedFlag.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 35)) {
				userCSGInformation = new UserCSGInformation();
				subCodeLength += userCSGInformation.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 36)) {
				subCodeLength += new BerLength().decode(is);
				servedPDPPDNAddressExt = new PDPAddress();
				subCodeLength += servedPDPPDNAddressExt.decode(is, null);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 40)) {
				sgsnPLMNIdentifier = new PLMNId();
				subCodeLength += sgsnPLMNIdentifier.decode(is, false);
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
		
		if (networkInitiation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("networkInitiation: ").append(networkInitiation);
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
		
		if (sgsnAddress != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sgsnAddress: ");
			sgsnAddress.appendAsString(sb, indentLevel + 1);
		}
		
		if (msNetworkCapability != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("msNetworkCapability: ").append(msNetworkCapability);
		}
		
		if (routingArea != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("routingArea: ").append(routingArea);
		}
		
		if (locationAreaCode != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("locationAreaCode: ").append(locationAreaCode);
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
		if (chargingID != null) {
			sb.append("chargingID: ").append(chargingID);
		}
		else {
			sb.append("chargingID: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (ggsnAddressUsed != null) {
			sb.append("ggsnAddressUsed: ");
			ggsnAddressUsed.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("ggsnAddressUsed: <empty-required-field>");
		}
		
		if (accessPointNameNI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("accessPointNameNI: ").append(accessPointNameNI);
		}
		
		if (pdpType != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pdpType: ").append(pdpType);
		}
		
		if (servedPDPAddress != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servedPDPAddress: ");
			servedPDPAddress.appendAsString(sb, indentLevel + 1);
		}
		
		if (listOfTrafficVolumes != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("listOfTrafficVolumes: ");
			listOfTrafficVolumes.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (recordOpeningTime != null) {
			sb.append("recordOpeningTime: ").append(recordOpeningTime);
		}
		else {
			sb.append("recordOpeningTime: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (duration != null) {
			sb.append("duration: ").append(duration);
		}
		else {
			sb.append("duration: <empty-required-field>");
		}
		
		if (sgsnChange != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sgsnChange: ").append(sgsnChange);
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
		
		if (diagnostics != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("diagnostics: ");
			diagnostics.appendAsString(sb, indentLevel + 1);
		}
		
		if (recordSequenceNumber != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recordSequenceNumber: ").append(recordSequenceNumber);
		}
		
		if (nodeID != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nodeID: ").append(nodeID);
		}
		
		if (recordExtensions != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("recordExtensions: ");
			recordExtensions.appendAsString(sb, indentLevel + 1);
		}
		
		if (localSequenceNumber != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("localSequenceNumber: ").append(localSequenceNumber);
		}
		
		if (apnSelectionMode != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("apnSelectionMode: ").append(apnSelectionMode);
		}
		
		if (accessPointNameOI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("accessPointNameOI: ").append(accessPointNameOI);
		}
		
		if (servedMSISDN != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servedMSISDN: ").append(servedMSISDN);
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
		
		if (cAMELInformationPDP != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cAMELInformationPDP: ");
			cAMELInformationPDP.appendAsString(sb, indentLevel + 1);
		}
		
		if (rNCUnsentDownlinkVolume != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rNCUnsentDownlinkVolume: ").append(rNCUnsentDownlinkVolume);
		}
		
		if (chChSelectionMode != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("chChSelectionMode: ").append(chChSelectionMode);
		}
		
		if (dynamicAddressFlag != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicAddressFlag: ").append(dynamicAddressFlag);
		}
		
		if (iMSIunauthenticatedFlag != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("iMSIunauthenticatedFlag: ").append(iMSIunauthenticatedFlag);
		}
		
		if (userCSGInformation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("userCSGInformation: ");
			userCSGInformation.appendAsString(sb, indentLevel + 1);
		}
		
		if (servedPDPPDNAddressExt != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("servedPDPPDNAddressExt: ");
			servedPDPPDNAddressExt.appendAsString(sb, indentLevel + 1);
		}
		
		if (sgsnPLMNIdentifier != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("sgsnPLMNIdentifier: ").append(sgsnPLMNIdentifier);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
