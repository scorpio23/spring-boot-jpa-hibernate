package com.programmer.gate.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the VPOST_HICARD_SENDINFO database table.
 * 
 */

@Entity
@Table(name="VPOST_HICARD_SENDINFO")

//@NamedQueries({
//	@NamedQuery(name="VpostHicardSendinfo.findAll", query="SELECT v FROM VpostHicardSendinfo v"),
//	@NamedQuery(name = "VpostHicardSendinfo.findByloginnameAndDatetimestart", 
//						query = "SELECT v FROM VpostHicardSendinfo v WHERE v.loginname = :loginName AND trunc(datetimestart) = trunc(:date)")
//})

public class VpostHicardSendinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH")
	private String branch;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="CREDIT")
	private BigDecimal credit;

	@Id
	@Column(name="CUSTOMERID")
	private String customerid;

	@Column(name="CUSTREF")
	private String custref;

	@Temporal(TemporalType.DATE)
	@Column(name="DATETIMEEND")
	private Date datetimeend;

	@Basic
	@Temporal(TemporalType.DATE)
	@Column(name="DATETIMESTART")
	private Date datetimestart;

	@Column(name="JDAY")
	private String jday;

	@Column(name="KTSN")
	private String ktsn;

	@Column(name="LOGINNAME")
	private String loginname;

	@Column(name="MOP1")
	private String mop1;
	
	@Column(name="MTS1")
	private String mts1;

	@Column(name="MTS2")
	private String mts2;

	@Column(name="MTS3")
	private String mts3;

	@Column(name="MTS4")
	private String mts4;

	@Column(name="MTS5")
	private String mts5;

	@Column(name="NETSREFERENCENUMBER")
	private String netsreferencenumber;

	@Column(name="NETSREFERENCETERMINAL")
	private String netsreferenceterminal;

	@Column(name="PAID")
	private String paid;

	@Column(name="PAYREF1")
	private String payref1;

	@Temporal(TemporalType.DATE)
	@Column(name="RESEND_DATE")
	private Date resendDate;

	@Column(name="RESEND_MTS")
	private String resendMts;

	@Column(name="RESEND_TRXNNUM")
	private BigDecimal resendTrxnnum;

	@Column(name="SNUM")
	private String snum;

	@Column(name="STATUS")
	private String status;

	@Column(name="STV")
	private String stv;

	@Column(name="TREF")
	private String tref;

	@Column(name="TRXNNUM")
	private BigDecimal trxnnum;

	@Column(name="TTID")
	private String ttid;

	@Column(name="UGID")
	private String ugid;

	@Column(name="VARLOG_BONUS")
	private String varlogBonus;

	@Column(name="VARLOG_CURRENT_BALANCE")
	private String varlogCurrentBalance;

	@Column(name="VARLOG_HICARD_BUS_DATE")
	private String varlogHicardBusDate;

	@Column(name="VARLOG_HICARD_EXPIRY_DATE")
	private String varlogHicardExpiryDate;

	@Column(name="VARLOG_HICARD_MESSAGE")
	private String varlogHicardMessage;

	@Column(name="VARLOG_HICARDNO")
	private String varlogHicardno;

	@Column(name="VARLOG_NEW_BALANCE")
	private String varlogNewBalance;

	@Column(name="VARLOG_TOPUP_VALUE")
	private String varlogTopupValue;

	@Column(name="VTSN")
	private String vtsn;


	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public BigDecimal getCredit() {
		return this.credit;
	}

	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustref() {
		return this.custref;
	}

	public void setCustref(String custref) {
		this.custref = custref;
	}

	public Date getDatetimeend() {
		return this.datetimeend;
	}

	public void setDatetimeend(Date datetimeend) {
		this.datetimeend = datetimeend;
	}

	public Date getDatetimestart() {
		return this.datetimestart;
	}

	public void setDatetimestart(Date datetimestart) {
		this.datetimestart = datetimestart;
	}

	public String getJday() {
		return this.jday;
	}

	public void setJday(String jday) {
		this.jday = jday;
	}

	public String getKtsn() {
		return this.ktsn;
	}

	public void setKtsn(String ktsn) {
		this.ktsn = ktsn;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getMop1() {
		return this.mop1;
	}

	public void setMop1(String mop1) {
		this.mop1 = mop1;
	}

	public String getMts1() {
		return this.mts1;
	}

	public void setMts1(String mts1) {
		this.mts1 = mts1;
	}

	public String getMts2() {
		return this.mts2;
	}

	public void setMts2(String mts2) {
		this.mts2 = mts2;
	}

	public String getMts3() {
		return this.mts3;
	}

	public void setMts3(String mts3) {
		this.mts3 = mts3;
	}

	public String getMts4() {
		return this.mts4;
	}

	public void setMts4(String mts4) {
		this.mts4 = mts4;
	}

	public String getMts5() {
		return this.mts5;
	}

	public void setMts5(String mts5) {
		this.mts5 = mts5;
	}

	public String getNetsreferencenumber() {
		return this.netsreferencenumber;
	}

	public void setNetsreferencenumber(String netsreferencenumber) {
		this.netsreferencenumber = netsreferencenumber;
	}

	public String getNetsreferenceterminal() {
		return this.netsreferenceterminal;
	}

	public void setNetsreferenceterminal(String netsreferenceterminal) {
		this.netsreferenceterminal = netsreferenceterminal;
	}

	public String getPaid() {
		return this.paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPayref1() {
		return this.payref1;
	}

	public void setPayref1(String payref1) {
		this.payref1 = payref1;
	}

	public Date getResendDate() {
		return this.resendDate;
	}

	public void setResendDate(Date resendDate) {
		this.resendDate = resendDate;
	}

	public String getResendMts() {
		return this.resendMts;
	}

	public void setResendMts(String resendMts) {
		this.resendMts = resendMts;
	}

	public BigDecimal getResendTrxnnum() {
		return this.resendTrxnnum;
	}

	public void setResendTrxnnum(BigDecimal resendTrxnnum) {
		this.resendTrxnnum = resendTrxnnum;
	}

	public String getSnum() {
		return this.snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStv() {
		return this.stv;
	}

	public void setStv(String stv) {
		this.stv = stv;
	}

	public String getTref() {
		return this.tref;
	}

	public void setTref(String tref) {
		this.tref = tref;
	}

	public BigDecimal getTrxnnum() {
		return this.trxnnum;
	}

	public void setTrxnnum(BigDecimal trxnnum) {
		this.trxnnum = trxnnum;
	}

	public String getTtid() {
		return this.ttid;
	}

	public void setTtid(String ttid) {
		this.ttid = ttid;
	}

	public String getUgid() {
		return this.ugid;
	}

	public void setUgid(String ugid) {
		this.ugid = ugid;
	}

	public String getVarlogBonus() {
		return this.varlogBonus;
	}

	public void setVarlogBonus(String varlogBonus) {
		this.varlogBonus = varlogBonus;
	}

	public String getVarlogCurrentBalance() {
		return this.varlogCurrentBalance;
	}

	public void setVarlogCurrentBalance(String varlogCurrentBalance) {
		this.varlogCurrentBalance = varlogCurrentBalance;
	}

	public String getVarlogHicardBusDate() {
		return this.varlogHicardBusDate;
	}

	public void setVarlogHicardBusDate(String varlogHicardBusDate) {
		this.varlogHicardBusDate = varlogHicardBusDate;
	}

	public String getVarlogHicardExpiryDate() {
		return this.varlogHicardExpiryDate;
	}

	public void setVarlogHicardExpiryDate(String varlogHicardExpiryDate) {
		this.varlogHicardExpiryDate = varlogHicardExpiryDate;
	}

	public String getVarlogHicardMessage() {
		return this.varlogHicardMessage;
	}

	public void setVarlogHicardMessage(String varlogHicardMessage) {
		this.varlogHicardMessage = varlogHicardMessage;
	}

	public String getVarlogHicardno() {
		return this.varlogHicardno;
	}

	public void setVarlogHicardno(String varlogHicardno) {
		this.varlogHicardno = varlogHicardno;
	}

	public String getVarlogNewBalance() {
		return this.varlogNewBalance;
	}

	public void setVarlogNewBalance(String varlogNewBalance) {
		this.varlogNewBalance = varlogNewBalance;
	}

	public String getVarlogTopupValue() {
		return this.varlogTopupValue;
	}

	public void setVarlogTopupValue(String varlogTopupValue) {
		this.varlogTopupValue = varlogTopupValue;
	}

	public String getVtsn() {
		return this.vtsn;
	}

	public void setVtsn(String vtsn) {
		this.vtsn = vtsn;
	}

	@Override
	public String toString() {
		return "VpostHicardSendinfo [branch=" + branch + ", creationDate=" + creationDate + ", credit=" + credit
				+ ", customerid=" + customerid + ", custref=" + custref + ", datetimeend=" + datetimeend
				+ ", datetimestart=" + datetimestart + ", jday=" + jday + ", ktsn=" + ktsn + ", loginname=" + loginname
				+ ", mop1=" + mop1 + ", mts1=" + mts1 + ", mts2=" + mts2 + ", mts3=" + mts3 + ", mts4=" + mts4
				+ ", mts5=" + mts5 + ", netsreferencenumber=" + netsreferencenumber + ", netsreferenceterminal="
				+ netsreferenceterminal + ", paid=" + paid + ", payref1=" + payref1 + ", resendDate=" + resendDate
				+ ", resendMts=" + resendMts + ", resendTrxnnum=" + resendTrxnnum + ", snum=" + snum + ", status="
				+ status + ", stv=" + stv + ", tref=" + tref + ", trxnnum=" + trxnnum + ", ttid=" + ttid + ", ugid="
				+ ugid + ", varlogBonus=" + varlogBonus + ", varlogCurrentBalance=" + varlogCurrentBalance
				+ ", varlogHicardBusDate=" + varlogHicardBusDate + ", varlogHicardExpiryDate=" + varlogHicardExpiryDate
				+ ", varlogHicardMessage=" + varlogHicardMessage + ", varlogHicardno=" + varlogHicardno
				+ ", varlogNewBalance=" + varlogNewBalance + ", varlogTopupValue=" + varlogTopupValue + ", vtsn=" + vtsn
				+ "]";
	}
	
	

}