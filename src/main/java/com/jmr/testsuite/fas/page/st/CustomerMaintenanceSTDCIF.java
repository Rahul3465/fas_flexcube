package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STDCIF")
public class CustomerMaintenanceSTDCIF {
	
	private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Type")
	private String type;
	
	@SheetColumn(value = "CustomerNumber")
	private String custno;

	@SheetColumn(value = "CustomerCategory")
	private String customercategory;
	
	@SheetColumn(value = "ShortName")
	private String shortname;
	
	@SheetColumn(value = "Prefix")
	private String prefix;
	
	@SheetColumn(value = "FullName")
	private String fullname;
	
	@SheetColumn(value = "FirstName")
	private String firstname;
	
	@SheetColumn(value = "LastName")
	private String lastname;
	
	@SheetColumn(value = "MiddleName")
	private String middlename;
	
	@SheetColumn(value = "WorkPhoneISD")
	private String workphnisd;
	
	@SheetColumn(value = "WorkPhone")
	private String workphone;
	
	@SheetColumn(value = "MobileISDCode")
	private String mobileisdcode;
	
	@SheetColumn(value = "MobileNumber")
	private String mobilenumber;
	
	@SheetColumn(value = "CommunicationMode")
	private String commmode;
	
	@SheetColumn(value = "AddressName")
	private String addname;
	
	@SheetColumn(value = "AddressCode")
	private String addcode;
	
	@SheetColumn(value = "Address1")
	private String add1;
	
	@SheetColumn(value = "Address2")
	private String add2;
	
	@SheetColumn(value = "Address3")
	private String add3;
	
	@SheetColumn(value = "Address4")
	private String add4;
	
	@SheetColumn(value = "KYCStatus")
	private String kycstatus;
	
	@SheetColumn(value = "ResidenceStatus")
	private String resstatus;
	
	@SheetColumn(value = "MothersMaidenName")
	private String mothermainme;
	
	@SheetColumn(value = "SubmitAgeProof")
	private String submitageprf;
	
	@SheetColumn(value = "PreferredDateOfContact")
	private String prefdateofcont;
	
	@SheetColumn(value = "PreferredTimeOfContact")
	private String preftimeofcont;
	
	@SheetColumn(value = "SameAsAddress")
	private String sameaddr;
	
	@SheetColumn(value = "JointGender")
	private String jointgend;
	
	@SheetColumn(value = "JointFirstName")
	private String jointfn;
	
	@SheetColumn(value = "JointAddress1")
	private String jointaddr1;
	
	@SheetColumn(value = "JointAddress2")
	private String jointaddr2;
	
	@SheetColumn(value = "JointAddress3")
	private String jointaddr3;
	
	@SheetColumn(value = "JointDOB")
	private String jointdob;
	
	@SheetColumn(value = "JointResidentStatus")
	private String jointresstatus;
	
	@SheetColumn(value = "JointDeceased")
	private String jointdec;
	
	@SheetColumn(value = "ProfessionalTab")
	private String proftab;
	
	@SheetColumn(value = "EMPLOYMENT")
	private String employment;
	
	@SheetColumn(value = "TENURE")
	private String emptenure;
	
	@SheetColumn(value = "RETIREMENT_AGE")
	private String empretirmentage;
	
	@SheetColumn(value = "PREVIOUS_DESIGNATION")
	private String empprevousdes;
	
	@SheetColumn(value = "PREVIOUS_EMPLOYER")
	private String emppreviousemp;
	
	@SheetColumn(value = "CURRENT_DESIGNATION")
	private String empcurrentdes;
	
	@SheetColumn(value = "CURRENT_EMPLOER")
	private String empcurrentemp;
	
	@SheetColumn(value = "EMPLOYER_DESCRIPTION")
	private String employerdescrption;
	
	@SheetColumn(value = "COUNTRY")
	private String empcountry;
	
	@SheetColumn(value = "CURRENCY_OF_AMOUNTS")
	private String empcurrcy;
	
	@SheetColumn(value = "SALARY")
	private String empsalary;
	
	@SheetColumn(value = "SALARY_FREQUENCY")
	private String empsalaryfreq;
	
	@SheetColumn(value = "ADDRESS_CODE")
	private String empaddrcode;
	
	@SheetColumn(value = "TELEPHONE")
	private String emptelphone;
	
	@SheetColumn(value = "EMAIL_ID")
	private String empemailid;
	
	@SheetColumn(value = "RENT")
	private String emprent;
	
	@SheetColumn(value = "INSURANCE")
	private String empinsurance;
	
	@SheetColumn(value = "LOAN_PAYMENTS")
	private String emploanpayment;
	
	@SheetColumn(value = "OTHER")
	private String empother;
	
	@SheetColumn(value = "HOUSE_VALUE")
	private String emphousevalue;
	
	@SheetColumn(value = "NO_OF_CREDIT_CARDS")
	private String empnoofcreditcards;
	
	@SheetColumn(value = "OverallLimit")
	private String overalllimit;
	
	@SheetColumn(value = "Country")
	private String country;
	
	@SheetColumn(value = "Nationality")
	private String nationality;
	
	@SheetColumn(value = "Language")
	private String lang;
	
	@SheetColumn(value = "Address")
	private String addr;
	
	@SheetColumn(value = "Gender")
	private String gender;
	
	@SheetColumn(value = "BirthCountry")
	private String birthcountry;
	
	@SheetColumn(value = "DateofBirth")
	private String DOB;
	
	@SheetColumn(value = "JointCustomer")
	private String jointcust;
	
	@SheetColumn(value = "Location")
	private String loc;
	
	@SheetColumn(value = "Media")
	private String media;
	
	@SheetColumn(value = "LiabilityName")
	private String libname;
	
	@SheetColumn(value = "JointLastName")
	private String jointln;
	
	@SheetColumn(value = "Checkaddbutton")
	private String checklistaddbtn;
	
	
	@SheetColumn(value = "CHECKLIST_TAB")
	private String docchecklisttab;
	
	@SheetColumn(value = "DOCUMENT_CATEGORY")
	private String doccategory;
	
	@SheetColumn(value = "DOCUMENT_TYPE")
	private String doctype;
	
	@SheetColumn(value = "DOCUMENT_NAME")
	private String documentname;
	
	
	@SheetColumn(value = "DOCUMENT_REFERENCE")
	private String docref;
	
	@SheetColumn(value = "DATE_REQUESTED")
	private String docdatereq;
	
	@SheetColumn(value = "EXPECTED_DATE")
	private String docexpecteddate;
	
	@SheetColumn(value = "ACTUAL_DATE")
	private String docactualdate;
	
	
	@SheetColumn(value = "EXPIRY_DATE")
	private String docexpirydate;
	
	@SheetColumn(value = "REMARKS")
	private String docremark;
	

	@SheetColumn(value = "CHECK")
	private String doccheck;
	

	@SheetColumn(value = "JointTab")
	private String jointtab;
	
	
	@SheetColumn(value = "JointCheckbox")
	private String jointcheckbox;
	


	public String getJointcheckbox() {
		return jointcheckbox;
	}


	public void setJointcheckbox(String jointcheckbox) {
		this.jointcheckbox = jointcheckbox;
	}


	public String getJointtab() {
		return jointtab;
	}


	public void setJointtab(String jointtab) {
		this.jointtab = jointtab;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCustno() {
		return custno;
	}


	public void setCustno(String custno) {
		this.custno = custno;
	}


	public String getCustomercategory() {
		return customercategory;
	}


	public void setCustomercategory(String customercategory) {
		this.customercategory = customercategory;
	}


	public String getShortname() {
		return shortname;
	}


	public void setShortname(String shortname) {
		this.shortname = shortname;
	}


	public String getPrefix() {
		return prefix;
	}


	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getWorkphnisd() {
		return workphnisd;
	}


	public void setWorkphnisd(String workphnisd) {
		this.workphnisd = workphnisd;
	}


	public String getWorkphone() {
		return workphone;
	}


	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}


	public String getMobileisdcode() {
		return mobileisdcode;
	}


	public void setMobileisdcode(String mobileisdcode) {
		this.mobileisdcode = mobileisdcode;
	}


	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getCommmode() {
		return commmode;
	}


	public void setCommmode(String commmode) {
		this.commmode = commmode;
	}


	public String getAddname() {
		return addname;
	}


	public void setAddname(String addname) {
		this.addname = addname;
	}


	public String getAddcode() {
		return addcode;
	}


	public void setAddcode(String addcode) {
		this.addcode = addcode;
	}


	public String getAdd1() {
		return add1;
	}


	public void setAdd1(String add1) {
		this.add1 = add1;
	}


	public String getAdd2() {
		return add2;
	}


	public void setAdd2(String add2) {
		this.add2 = add2;
	}


	public String getAdd3() {
		return add3;
	}


	public void setAdd3(String add3) {
		this.add3 = add3;
	}


	public String getAdd4() {
		return add4;
	}


	public void setAdd4(String add4) {
		this.add4 = add4;
	}


	public String getKycstatus() {
		return kycstatus;
	}


	public void setKycstatus(String kycstatus) {
		this.kycstatus = kycstatus;
	}


	public String getResstatus() {
		return resstatus;
	}


	public void setResstatus(String resstatus) {
		this.resstatus = resstatus;
	}


	public String getMothermainme() {
		return mothermainme;
	}


	public void setMothermainme(String mothermainme) {
		this.mothermainme = mothermainme;
	}


	public String getSubmitageprf() {
		return submitageprf;
	}


	public void setSubmitageprf(String submitageprf) {
		this.submitageprf = submitageprf;
	}


	public String getPrefdateofcont() {
		return prefdateofcont;
	}


	public void setPrefdateofcont(String prefdateofcont) {
		this.prefdateofcont = prefdateofcont;
	}


	public String getPreftimeofcont() {
		return preftimeofcont;
	}


	public void setPreftimeofcont(String preftimeofcont) {
		this.preftimeofcont = preftimeofcont;
	}


	public String getSameaddr() {
		return sameaddr;
	}


	public void setSameaddr(String sameaddr) {
		this.sameaddr = sameaddr;
	}


	public String getJointgend() {
		return jointgend;
	}


	public void setJointgend(String jointgend) {
		this.jointgend = jointgend;
	}


	public String getJointfn() {
		return jointfn;
	}


	public void setJointfn(String jointfn) {
		this.jointfn = jointfn;
	}


	public String getJointaddr1() {
		return jointaddr1;
	}


	public void setJointaddr1(String jointaddr1) {
		this.jointaddr1 = jointaddr1;
	}


	public String getJointaddr2() {
		return jointaddr2;
	}


	public void setJointaddr2(String jointaddr2) {
		this.jointaddr2 = jointaddr2;
	}


	public String getJointaddr3() {
		return jointaddr3;
	}


	public void setJointaddr3(String jointaddr3) {
		this.jointaddr3 = jointaddr3;
	}


	public String getJointdob() {
		return jointdob;
	}


	public void setJointdob(String jointdob) {
		this.jointdob = jointdob;
	}


	public String getJointresstatus() {
		return jointresstatus;
	}


	public void setJointresstatus(String jointresstatus) {
		this.jointresstatus = jointresstatus;
	}


	public String getJointdec() {
		return jointdec;
	}


	public void setJointdec(String jointdec) {
		this.jointdec = jointdec;
	}


	public String getProftab() {
		return proftab;
	}


	public void setProftab(String proftab) {
		this.proftab = proftab;
	}


	public String getEmployment() {
		return employment;
	}


	public void setEmployment(String employment) {
		this.employment = employment;
	}


	public String getEmptenure() {
		return emptenure;
	}


	public void setEmptenure(String emptenure) {
		this.emptenure = emptenure;
	}


	public String getEmpretirmentage() {
		return empretirmentage;
	}


	public void setEmpretirmentage(String empretirmentage) {
		this.empretirmentage = empretirmentage;
	}


	public String getEmpprevousdes() {
		return empprevousdes;
	}


	public void setEmpprevousdes(String empprevousdes) {
		this.empprevousdes = empprevousdes;
	}


	public String getEmppreviousemp() {
		return emppreviousemp;
	}


	public void setEmppreviousemp(String emppreviousemp) {
		this.emppreviousemp = emppreviousemp;
	}


	public String getEmpcurrentdes() {
		return empcurrentdes;
	}


	public void setEmpcurrentdes(String empcurrentdes) {
		this.empcurrentdes = empcurrentdes;
	}


	public String getEmpcurrentemp() {
		return empcurrentemp;
	}


	public void setEmpcurrentemp(String empcurrentemp) {
		this.empcurrentemp = empcurrentemp;
	}


	public String getEmployerdescrption() {
		return employerdescrption;
	}


	public void setEmployerdescrption(String employerdescrption) {
		this.employerdescrption = employerdescrption;
	}


	public String getEmpcountry() {
		return empcountry;
	}


	public void setEmpcountry(String empcountry) {
		this.empcountry = empcountry;
	}


	public String getEmpcurrcy() {
		return empcurrcy;
	}


	public void setEmpcurrcy(String empcurrcy) {
		this.empcurrcy = empcurrcy;
	}


	public String getEmpsalary() {
		return empsalary;
	}


	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}


	public String getEmpsalaryfreq() {
		return empsalaryfreq;
	}


	public void setEmpsalaryfreq(String empsalaryfreq) {
		this.empsalaryfreq = empsalaryfreq;
	}


	public String getEmpaddrcode() {
		return empaddrcode;
	}


	public void setEmpaddrcode(String empaddrcode) {
		this.empaddrcode = empaddrcode;
	}


	public String getEmptelphone() {
		return emptelphone;
	}


	public void setEmptelphone(String emptelphone) {
		this.emptelphone = emptelphone;
	}


	public String getEmpemailid() {
		return empemailid;
	}


	public void setEmpemailid(String empemailid) {
		this.empemailid = empemailid;
	}


	public String getEmprent() {
		return emprent;
	}


	public void setEmprent(String emprent) {
		this.emprent = emprent;
	}


	public String getEmpinsurance() {
		return empinsurance;
	}


	public void setEmpinsurance(String empinsurance) {
		this.empinsurance = empinsurance;
	}


	public String getEmploanpayment() {
		return emploanpayment;
	}


	public void setEmploanpayment(String emploanpayment) {
		this.emploanpayment = emploanpayment;
	}


	public String getEmpother() {
		return empother;
	}


	public void setEmpother(String empother) {
		this.empother = empother;
	}


	public String getEmphousevalue() {
		return emphousevalue;
	}


	public void setEmphousevalue(String emphousevalue) {
		this.emphousevalue = emphousevalue;
	}


	public String getEmpnoofcreditcards() {
		return empnoofcreditcards;
	}


	public void setEmpnoofcreditcards(String empnoofcreditcards) {
		this.empnoofcreditcards = empnoofcreditcards;
	}


	public String getOveralllimit() {
		return overalllimit;
	}


	public void setOveralllimit(String overalllimit) {
		this.overalllimit = overalllimit;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getLang() {
		return lang;
	}


	public void setLang(String lang) {
		this.lang = lang;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBirthcountry() {
		return birthcountry;
	}


	public void setBirthcountry(String birthcountry) {
		this.birthcountry = birthcountry;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getJointcust() {
		return jointcust;
	}


	public void setJointcust(String jointcust) {
		this.jointcust = jointcust;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public String getMedia() {
		return media;
	}


	public void setMedia(String media) {
		this.media = media;
	}


	public String getLibname() {
		return libname;
	}


	public void setLibname(String libname) {
		this.libname = libname;
	}


	public String getJointln() {
		return jointln;
	}


	public void setJointln(String jointln) {
		this.jointln = jointln;
	}


	public String getChecklistaddbtn() {
		return checklistaddbtn;
	}


	public void setChecklistaddbtn(String checklistaddbtn) {
		this.checklistaddbtn = checklistaddbtn;
	}


	public String getDocchecklisttab() {
		return docchecklisttab;
	}


	public void setDocchecklisttab(String docchecklisttab) {
		this.docchecklisttab = docchecklisttab;
	}


	public String getDoccategory() {
		return doccategory;
	}


	public void setDoccategory(String doccategory) {
		this.doccategory = doccategory;
	}


	public String getDoctype() {
		return doctype;
	}


	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}


	public String getDocumentname() {
		return documentname;
	}


	public void setDocumentname(String documentname) {
		this.documentname = documentname;
	}


	public String getDocref() {
		return docref;
	}


	public void setDocref(String docref) {
		this.docref = docref;
	}


	public String getDocdatereq() {
		return docdatereq;
	}


	public void setDocdatereq(String docdatereq) {
		this.docdatereq = docdatereq;
	}


	public String getDocexpecteddate() {
		return docexpecteddate;
	}


	public void setDocexpecteddate(String docexpecteddate) {
		this.docexpecteddate = docexpecteddate;
	}


	public String getDocactualdate() {
		return docactualdate;
	}


	public void setDocactualdate(String docactualdate) {
		this.docactualdate = docactualdate;
	}


	public String getDocexpirydate() {
		return docexpirydate;
	}


	public void setDocexpirydate(String docexpirydate) {
		this.docexpirydate = docexpirydate;
	}


	public String getDocremark() {
		return docremark;
	}


	public void setDocremark(String docremark) {
		this.docremark = docremark;
	}


	public String getDoccheck() {
		return doccheck;
	}


	public void setDoccheck(String doccheck) {
		this.doccheck = doccheck;
	}


	@Override
	public String toString() {
		return "CustomerMaintenanceSTDCIF [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", runMode=" + runMode + ", type=" + type + ", custno=" + custno + ", customercategory="
				+ customercategory + ", shortname=" + shortname + ", prefix=" + prefix + ", fullname=" + fullname
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", middlename=" + middlename + ", workphnisd="
				+ workphnisd + ", workphone=" + workphone + ", mobileisdcode=" + mobileisdcode + ", mobilenumber="
				+ mobilenumber + ", commmode=" + commmode + ", addname=" + addname + ", addcode=" + addcode + ", add1="
				+ add1 + ", add2=" + add2 + ", add3=" + add3 + ", add4=" + add4 + ", kycstatus=" + kycstatus
				+ ", resstatus=" + resstatus + ", mothermainme=" + mothermainme + ", submitageprf=" + submitageprf
				+ ", prefdateofcont=" + prefdateofcont + ", preftimeofcont=" + preftimeofcont + ", sameaddr=" + sameaddr
				+ ", jointgend=" + jointgend + ", jointfn=" + jointfn + ", jointaddr1=" + jointaddr1 + ", jointaddr2="
				+ jointaddr2 + ", jointaddr3=" + jointaddr3 + ", jointdob=" + jointdob + ", jointresstatus="
				+ jointresstatus + ", jointdec=" + jointdec + ", proftab=" + proftab + ", employment=" + employment
				+ ", emptenure=" + emptenure + ", empretirmentage=" + empretirmentage + ", empprevousdes="
				+ empprevousdes + ", emppreviousemp=" + emppreviousemp + ", empcurrentdes=" + empcurrentdes
				+ ", empcurrentemp=" + empcurrentemp + ", employerdescrption=" + employerdescrption + ", empcountry="
				+ empcountry + ", empcurrcy=" + empcurrcy + ", empsalary=" + empsalary + ", empsalaryfreq="
				+ empsalaryfreq + ", empaddrcode=" + empaddrcode + ", emptelphone=" + emptelphone + ", empemailid="
				+ empemailid + ", emprent=" + emprent + ", empinsurance=" + empinsurance + ", emploanpayment="
				+ emploanpayment + ", empother=" + empother + ", emphousevalue=" + emphousevalue
				+ ", empnoofcreditcards=" + empnoofcreditcards + ", overalllimit=" + overalllimit + ", country="
				+ country + ", nationality=" + nationality + ", lang=" + lang + ", addr=" + addr + ", gender=" + gender
				+ ", birthcountry=" + birthcountry + ", DOB=" + DOB + ", jointcust=" + jointcust + ", loc=" + loc
				+ ", media=" + media + ", libname=" + libname + ", jointln=" + jointln + ", checklistaddbtn="
				+ checklistaddbtn + ", docchecklisttab=" + docchecklisttab + ", doccategory=" + doccategory
				+ ", doctype=" + doctype + ", documentname=" + documentname + ", docref=" + docref + ", docdatereq="
				+ docdatereq + ", docexpecteddate=" + docexpecteddate + ", docactualdate=" + docactualdate
				+ ", docexpirydate=" + docexpirydate + ", docremark=" + docremark + ", doccheck=" + doccheck
				+ ", jointtab=" + jointtab + ", jointcheckbox=" + jointcheckbox + "]";
	}


	
		
}
