package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STDCUSAC")
public class STDCUSAC_Page {
	
	private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "CustomerNumber")
	private String customernumber;
	
	@SheetColumn(value = "Currency")
	private String currency;

	@SheetColumn(value = "AccountClass")
	private String accountclass;
	
	@SheetColumn(value = "FetchPopUp")
	private String fetchbutton;
	
	@SheetColumn(value = "MainTab")
	private String maintab;
	
	@SheetColumn(value = "AccountType")
	private String accounttype;
	
	@SheetColumn(value = "ModeOfOperation")
	private String modeofoperation;
	
	@SheetColumn(value = "ATM")
	private String atm;
	
	@SheetColumn(value = "Location")
	private String location;
	
	@SheetColumn(value = "Media")
	private String media;
	
	@SheetColumn(value = "SalaryAccount")
	private String salary;
	
	@SheetColumn(value = "AccountOpeningAmount")
	private String accountopeingamount;
	
	@SheetColumn(value = "PayInOption")
	private String payinoption;
	
	@SheetColumn(value = "OffsetAccount")
	private String offsetaccount;
	
	@SheetColumn(value = "WaiverAccountOpeningCharge")
	private String waiveraccountopeingcharge;
	
	@SheetColumn(value = "NomineeTab")
	private String nomineetab;
	
	@SheetColumn(value = "NewRecord")
	private String newrecord;
	
	@SheetColumn(value = "Name")
	private String name;
	
	@SheetColumn(value = "DateOfBirth")
	private String dateofbirth;
	
	@SheetColumn(value = "RelationShip")
	private String relationship;
	
	@SheetColumn(value = "Address1")
	private String address1;
	
	@SheetColumn(value = "Address2")
	private String address2;
	
	@SheetColumn(value = "Address3")
	private String address3;
	
	@SheetColumn(value = "Address4")
	private String address4;
	
	@SheetColumn(value = "AuxillaryTab")
	private String auxillarytab;
	
	@SheetColumn(value = "ATMAccountNumber")
	private String atmaccontnumber;
	
	@SheetColumn(value = "DailyAmountLimit")
	private String dailyAmountlimit;
	
	@SheetColumn(value = "DailyCountLimit")
	private String dailycountlimit;
	
	@SheetColumn(value = "PostingAllowed")
	private String postingallowd;
	
	@SheetColumn(value = "NoDebits")
	private String nodebits;
	
	@SheetColumn(value = "NoCredits")
	private String nocredits;
	
	@SheetColumn(value = "StatusChangeAutomatic")
	private String statuschangeautomatic;
	
	@SheetColumn(value = "AutoProvisioningRequired")
	private String automprovisingrequired;
	
	@SheetColumn(value = "BackPeriodEntryAllowed")
	private String backperiodentryallowed;
	
	@SheetColumn(value = "TrackReceiveable")
	private String tracrecievable;
	
	@SheetColumn(value = "ProjectAccount")
	private String projectaccount;
	
	@SheetColumn(value = "CheckListTab")
	private String checklisttab;
	
	@SheetColumn(value = "DocumentTab")
	private String documenttab;
	
	@SheetColumn(value = "ExpiryDateOfSubmission")
	private String expirydateofsubmission;
	
	@SheetColumn(value = "ExpectedDateOfSubmission")
	private String expecteddateofsubmission;
	
	@SheetColumn(value = "Checked")
	private String checked;
	
	@SheetColumn(value = "JointHolderSubTab")
	private String jointholdersubtab;
	
	@SheetColumn(value = "AddNewRecord")
	private String addnewrecord;
	
	@SheetColumn(value = "CustomerNumber1")
	private String customno;
	
	@SheetColumn(value = "JointHolderType")
	private String jointholdertype;
	
	@SheetColumn(value = "MISSubTab")
	private String missubtab;
	
	@SheetColumn(value = "PoolCode")
	private String poolcode;
	
	@SheetColumn(value = "MISTab")
	private String mistab;
		
	@SheetColumn(value = "Delete")
	private String delete;
	
	@SheetColumn(value = "New")
	private String newdata;
	
	@SheetColumn(value = "Unlock")
	private String unlock;
	
	@SheetColumn(value = "Reverse")
	private String reverse;
	
	@SheetColumn(value = "Enterquery")
	private String enterquery;
	
	@SheetColumn(value = "Authorise")
	private String authorise;
	
	
	
	
	public String getUnlock() {
		return unlock;
	}

	public void setUnlock(String unlock) {
		this.unlock = unlock;
	}

	@SheetColumn(value = "AccountNumber")
	private String accountnumber;
	
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getNewdata() {
		return newdata;
	}

	public void setNewdata(String newdata) {
		this.newdata = newdata;
	}


	public String getReverse() {
		return reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public String getEnterquery() {
		return enterquery;
	}

	public void setEnterquery(String enterquery) {
		this.enterquery = enterquery;
	}

	public String getAuthorise() {
		return authorise;
	}

	public void setAuthorise(String authorise) {
		this.authorise = authorise;
	}

	public String getExpecteddateofsubmission() {
		return expecteddateofsubmission;
	}

	public void setExpecteddateofsubmission(String expecteddateofsubmission) {
		this.expecteddateofsubmission = expecteddateofsubmission;
	}

	public String getMistab() {
		return mistab;
	}

	public void setMistab(String mistab) {
		this.mistab = mistab;
	}

	public String getTestCaseResult() {
		return testCaseResult;
	}

	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getRunMode() {
		return runMode;
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountclass() {
		return accountclass;
	}

	public void setAccountclass(String accountclass) {
		this.accountclass = accountclass;
	}

	public String getFetchbutton() {
		return fetchbutton;
	}

	public void setFetchbutton(String fetchbutton) {
		this.fetchbutton = fetchbutton;
	}

	public String getMaintab() {
		return maintab;
	}

	public void setMaintab(String maintab) {
		this.maintab = maintab;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getModeofoperation() {
		return modeofoperation;
	}

	public void setModeofoperation(String modeofoperation) {
		this.modeofoperation = modeofoperation;
	}

	public String getAtm() {
		return atm;
	}

	public void setAtm(String atm) {
		this.atm = atm;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAccountopeingamount() {
		return accountopeingamount;
	}

	public void setAccountopeingamount(String accountopeingamount) {
		this.accountopeingamount = accountopeingamount;
	}

	public String getPayinoption() {
		return payinoption;
	}

	public void setPayinoption(String payinoption) {
		this.payinoption = payinoption;
	}

	public String getOffsetaccount() {
		return offsetaccount;
	}

	public void setOffsetaccount(String offsetaccount) {
		this.offsetaccount = offsetaccount;
	}

	public String getWaiveraccountopeingcharge() {
		return waiveraccountopeingcharge;
	}

	public void setWaiveraccountopeingcharge(String waiveraccountopeingcharge) {
		this.waiveraccountopeingcharge = waiveraccountopeingcharge;
	}

	public String getNomineetab() {
		return nomineetab;
	}

	public void setNomineetab(String nomineetab) {
		this.nomineetab = nomineetab;
	}

	public String getNewrecord() {
		return newrecord;
	}

	public void setNewrecord(String newrecord) {
		this.newrecord = newrecord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAuxillarytab() {
		return auxillarytab;
	}

	public void setAuxillarytab(String auxillarytab) {
		this.auxillarytab = auxillarytab;
	}

	public String getAtmaccontnumber() {
		return atmaccontnumber;
	}

	public void setAtmaccontnumber(String atmaccontnumber) {
		this.atmaccontnumber = atmaccontnumber;
	}


	public String getDailyAmountlimit() {
		return dailyAmountlimit;
	}

	public void setDailyAmountlimit(String dailyAmountlimit) {
		this.dailyAmountlimit = dailyAmountlimit;
	}

	public String getDailycountlimit() {
		return dailycountlimit;
	}

	public void setDailycountlimit(String dailycountlimit) {
		this.dailycountlimit = dailycountlimit;
	}

	public String getPostingallowd() {
		return postingallowd;
	}

	public void setPostingallowd(String postingallowd) {
		this.postingallowd = postingallowd;
	}

	public String getNodebits() {
		return nodebits;
	}

	public void setNodebits(String nodebits) {
		this.nodebits = nodebits;
	}

	public String getNocredits() {
		return nocredits;
	}

	public void setNocredits(String nocredits) {
		this.nocredits = nocredits;
	}

	public String getStatuschangeautomatic() {
		return statuschangeautomatic;
	}

	public void setStatuschangeautomatic(String statuschangeautomatic) {
		this.statuschangeautomatic = statuschangeautomatic;
	}

	public String getAutomprovisingrequired() {
		return automprovisingrequired;
	}

	public void setAutomprovisingrequired(String automprovisingrequired) {
		this.automprovisingrequired = automprovisingrequired;
	}

	public String getBackperiodentryallowed() {
		return backperiodentryallowed;
	}

	public void setBackperiodentryallowed(String backperiodentryallowed) {
		this.backperiodentryallowed = backperiodentryallowed;
	}

	public String getTracrecievable() {
		return tracrecievable;
	}

	public void setTracrecievable(String tracrecievable) {
		this.tracrecievable = tracrecievable;
	}

	public String getProjectaccount() {
		return projectaccount;
	}

	public void setProjectaccount(String projectaccount) {
		this.projectaccount = projectaccount;
	}

	public String getChecklisttab() {
		return checklisttab;
	}

	public void setChecklisttab(String checklisttab) {
		this.checklisttab = checklisttab;
	}

	public String getDocumenttab() {
		return documenttab;
	}

	public void setDocumenttab(String documenttab) {
		this.documenttab = documenttab;
	}

	public String getExpirydateofsubmission() {
		return expirydateofsubmission;
	}

	public void setExpirydateofsubmission(String expirydateofsubmission) {
		this.expirydateofsubmission = expirydateofsubmission;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getJointholdersubtab() {
		return jointholdersubtab;
	}

	public void setJointholdersubtab(String jointholdersubtab) {
		this.jointholdersubtab = jointholdersubtab;
	}

	public String getAddnewrecord() {
		return addnewrecord;
	}

	public void setAddnewrecord(String addnewrecord) {
		this.addnewrecord = addnewrecord;
	}

	public String getCustomno() {
		return customno;
	}

	public void setCustomno(String customno) {
		this.customno = customno;
	}

	public String getJointholdertype() {
		return jointholdertype;
	}

	public void setJointholdertype(String jointholdertype) {
		this.jointholdertype = jointholdertype;
	}

	public String getMissubtab() {
		return missubtab;
	}

	public void setMissubtab(String missubtab) {
		this.missubtab = missubtab;
	}

	public String getPoolcode() {
		return poolcode;
	}

	public void setPoolcode(String poolcode) {
		this.poolcode = poolcode;
	}

	@Override
	public String toString() {
		return "STDCUSAC_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", customernumber=" + customernumber + ", currency=" + currency + ", accountclass=" + accountclass
				+ ", fetchbutton=" + fetchbutton + ", maintab=" + maintab + ", accounttype=" + accounttype
				+ ", modeofoperation=" + modeofoperation + ", atm=" + atm + ", location=" + location + ", media="
				+ media + ", salary=" + salary + ", accountopeingamount=" + accountopeingamount + ", payinoption="
				+ payinoption + ", offsetaccount=" + offsetaccount + ", waiveraccountopeingcharge="
				+ waiveraccountopeingcharge + ", nomineetab=" + nomineetab + ", newrecord=" + newrecord + ", name="
				+ name + ", dateofbirth=" + dateofbirth + ", relationship=" + relationship + ", address1=" + address1
				+ ", address2=" + address2 + ", address3=" + address3 + ", address4=" + address4 + ", auxillarytab="
				+ auxillarytab + ", atmaccontnumber=" + atmaccontnumber + ", dailyAmountlimit=" + dailyAmountlimit
				+ ", dailycountlimit=" + dailycountlimit + ", postingallowd=" + postingallowd + ", nodebits=" + nodebits
				+ ", nocredits=" + nocredits + ", statuschangeautomatic=" + statuschangeautomatic
				+ ", automprovisingrequired=" + automprovisingrequired + ", backperiodentryallowed="
				+ backperiodentryallowed + ", tracrecievable=" + tracrecievable + ", projectaccount=" + projectaccount
				+ ", checklisttab=" + checklisttab + ", documenttab=" + documenttab + ", expirydateofsubmission="
				+ expirydateofsubmission + ", expecteddateofsubmission=" + expecteddateofsubmission + ", checked="
				+ checked + ", jointholdersubtab=" + jointholdersubtab + ", addnewrecord=" + addnewrecord
				+ ", customno=" + customno + ", jointholdertype=" + jointholdertype + ", missubtab=" + missubtab
				+ ", poolcode=" + poolcode + ", mistab=" + mistab + ", delete=" + delete + ", newdata=" + newdata
				+ ", unlock=" + unlock + ", reverse=" + reverse + ", enterquery=" + enterquery + ", authorise="
				+ authorise + ", accountnumber=" + accountnumber + "]";
	}




}
