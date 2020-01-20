package com.jmr.testsuite.fas.action.st;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class STDCIF_Test extends AbstractTestNGSpringContextTests {
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "STDCIF";
	private final String screenName="Customer Maintenance";

	private List<CustomerMaintenance_STDCIF_Page> dataList;
	private List<CustomerMaintenance_STDCIF_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CustomerMaintenance_STDCIF_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (CustomerMaintenance_STDCIF_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					
					if (data.getNewdata().equalsIgnoreCase("Yes")) {

				
					fcubs.clickNew();
					/*
					 * if(data.getType().equalsIgnoreCase("I")) {
					 * fcubs.clickButtonByXpath("//label[contains(text(),'Individual')]"); }else
					 * if(data.getType().equalsIgnoreCase("C")) {
					 * fcubs.clickButtonByXpath("//label[contains(text(),'Corporate')]"); }else
					 * if(data.getType().equalsIgnoreCase("B")) {
					 * fcubs.clickButtonByXpath("//label[contains(text(),'Bank')]"); }
					 */

					fcubs.selectRadioBtn("CTYPE", data.getType());
					fcubs.populateTextById("BLK_CUSTOMER__CUSTNO", data.getCustno());
					fcubs.clickButtonByXpath("//button[@id='BLK_CUSTOMER__BTN_P']");
					fcubs.populateTextById("BLK_CUSTOMER__FULLNAME", data.getFullname());
					fcubs.populateTextById("BLK_CUSTOMER__SNAME", data.getShortname());
					fcubs.populateTextById("BLK_CUSTOMER__CCATEG", data.getCustomercategory());
					fcubs.selectFlag("BLK_CUSTOMER__PRIVATE_CUSTOMER", data.getPrivatecustomer());
					fcubs.populateTextById("BLK_CUSTPERSONAL__TITLE", data.getPrefix());// prefix
					fcubs.populateTextById("BLK_CUSTPERSONAL__FSTNAME", data.getFirstname());// firstname
					fcubs.populateTextById("BLK_CUSTPERSONAL__LSTNAME", data.getLastname());// lastname
					fcubs.populateTextById("BLK_CUSTPERSONAL__MIDNAME", data.getMiddlename());// middlename
					fcubs.populateTextById("BLK_CUSTPERSONAL__TEL_ISD_NOI", data.getWorkphnisd());// workphone isd
					fcubs.populateTextById("BLK_CUSTPERSONAL__TEL", data.getWorkphone());// work phone
					fcubs.populateTextById("BLK_CUSTPERSONAL__MOB_ISD_NOI", data.getMobileisdcode());// mobile isd code
					fcubs.populateTextById("BLK_CUSTPERSONAL__MOBNUM", data.getMobilenumber());// mobile number
					fcubs.selectRadioBtn("CUST_COMM_MODE", data.getCommmode());
					fcubs.populateTextById("BLK_CUSTOMER__NAME", data.getAddname()); // addressName
					fcubs.populateTextById("BLK_CUSTOMER__P_ADDRESS_CODE", data.getAddcode()); // address code
					fcubs.populateTextById("BLK_CUSTOMER__ADDRLN2", data.getAdd2()); // address2
					fcubs.populateTextById("BLK_CUSTOMER__ADDRLN3", data.getAdd3()); // address3
					fcubs.populateTextById("BLK_CUSTOMER__ADDRLN4", data.getAdd4()); // address4
					fcubs.selectDropdownByText("BLK_CUSTPERSONAL__KYCSTAT", data.getKycstatus()); // KYC status
					// fcubs.selectDropdownByText(elementId, text);
					/*if (data.getKycstatus().equalsIgnoreCase("Verified")) {
						fcubs.populateTextById("BLK_CUSTPERSONAL__KYCREFNO", data.getKycrefno());
					}*/
					
					if (data.getKycstatus().equalsIgnoreCase("Verification Failed")||data.getKycstatus().equalsIgnoreCase("Verified")) {
						fcubs.populateTextById("BLK_CUSTPERSONAL__KYCREFNO", data.getKycrefno());
						fcubs.populateTextById("BLK_CUSTPERSONAL__PPTISSDTI", data.getPassportissuedate());
						fcubs.populateTextById("BLK_CUSTPERSONAL__PPTEXPDTI", data.getPassportexpirydate());
						fcubs.populateTextById("BLK_CUSTPERSONAL__PPTNO", data.getPassportnumber());
						
					}


					fcubs.selectRadioBtn("RESSTATUS", data.getResstatus());
					fcubs.populateTextById("BLK_CUSTPERSONAL__MOTHERMAIDN_NAME", data.getMothermainme());
																											
					fcubs.selectDropdownByText("BLK_CUSTPERSONAL__SBMTAGEPROOF", data.getSubmitageprf()); 
																											
					fcubs.populateTextById("BLK_CUSTPERSONAL__PREF_CNTACT_DATEI", data.getPrefdateofcont()); 
					fcubs.populateTextById("BLK_CUSTPERSONAL__PREF_CNTACT_TIME", data.getPreftimeofcont()); 
																											
					fcubs.populateTextById("BLK_CUSTOMER__ADDRLN1", data.getAddr());
					fcubs.populateTextById("BLK_CUSTOMER__COUNTRY", data.getCountry());
					fcubs.populateTextById("BLK_CUSTOMER__NLTY", data.getNationality());
					fcubs.selectRadioBtn("SEX", data.getGender());
					fcubs.populateTextById("BLK_CUSTPERSONAL__LANG", data.getLang());
					fcubs.populateTextById("BLK_CUSTPERSONAL__BIRTH_COUNTRY", data.getBirthcountry());
					
					fcubs.selectFlag("BLK_CUSTPERSONAL__MINOR", data.getMinor());
					fcubs.populateTextById("BLK_CUSTPERSONAL__NAME", data.getGuardian());
					
					
					fcubs.populateTextById("BLK_CUSTPERSONAL__DOBI", data.getDOB());

					// =========================================Corporate Tab==========================================//

					/*if (data.getCorptab().equalsIgnoreCase("Yes")) {
						fcubs.switchTab("Corporate");
						fcubs.populateTextById("BLK_CUSTCORP__CADDR1", data.getCorpadd1());
						fcubs.populateTextById("BLK_CUSTCORP__CADDR2", data.getCorpadd2());
						fcubs.populateTextById("BLK_CUSTCORP__CADDR3", data.getCorpadd3());
						fcubs.populateTextById("BLK_CUSTCORP__CADDR4", data.getCorpadd4());
						fcubs.populateTextById("BLK_CUSTCORP__CNTRY", data.getCorpcountry());
						fcubs.populateTextById("BLK_CUSTCORP__LANGUAGE", data.getCorplang());
						fcubs.selectDropdownByText("BLK_CUSTCORP__KYC_DETAILS", data.getCorpkycstatus());
						
						
					}*/

					// ==============================Additional Tab===================================//

					fcubs.switchTab("Additional");
					fcubs.populateTextById("BLK_CUSTPERSONAL__SAME_PERM_ADDR", data.getSameaddr());
					fcubs.populateTextById("BLK_CUSTOMER__LOC", data.getLoc());
					fcubs.populateTextById("BLK_CUSTOMER__MEDIA", data.getMedia());

					/*
					 * if(data.getJointcheckbox().equalsIgnoreCase("Yes")) {
					 * fcubs.clickButtonById("BLK_CUSTOMER__FLGJOINT"); }
					 */
					fcubs.selectFlag("BLK_CUSTOMER__FLGJOINT", data.getJointcheckbox());

					// ========================================Limit Tab=================================//

					if (data.getLimittab().equalsIgnoreCase("Yes")) {

						fcubs.openChildScreenByTitle("Limits");
						fcubs.populateTextById("BLK_CUST_LIAB__OVERALL_LIMITI", data.getOveralllimit());
						fcubs.closeChildScreen();
						// fcubs.switchToActiveFrame();
					}

					// =======================================Joint Tab============================================//

					if (data.getJointtab().equalsIgnoreCase("Yes")) {
						fcubs.openChildScreenByTitle("Joint");
						fcubs.clickButtonByXpath("//span[@class='ICOadd']");
						fcubs.selectRadioBtn("SEX", data.getJointgend());
						fcubs.populateTextById("BLK_CUSTJOINT__FRSTNAME", data.getJointfn());// joint firstname
						fcubs.populateTextById("BLK_CUSTJOINT__LASTNAME", data.getJointln());// last name

						fcubs.populateTextById("BLK_CUSTJOINT__ADD1", data.getJointaddr1());// address1
						fcubs.populateTextById("BLK_CUSTJOINT__ADD2", data.getJointaddr2()); // address2
						fcubs.populateTextById("BLK_CUSTJOINT__ADD3", data.getJointaddr3());// address3

						fcubs.populateTextById("BLK_CUSTJOINT__DOBI", data.getJointdob()); // DOB
						fcubs.selectRadioBtn("RESISTAT", data.getJointresstatus());
						fcubs.selectRadioBtn("DECEASED", data.getJointdec());
						fcubs.closeChildScreen();
						// fcubs.switchToActiveFrame();
					}

					// ==============================CheckListTab======================================//

					if (data.getDocchecklisttab().equalsIgnoreCase("Yes")) {

						fcubs.switchTab("Check List");

						if (data.getChecklistaddbtn().equalsIgnoreCase("Yes")) {
							fcubs.clickButtonById("cmdAddRow_BLK_CUSTDOC_CHKLIST");

						}

						fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__DOC_CATEGORY", data.getDoccategory()); // Document
																											// catagory
						fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__DOCUMENT_REF_NO", data.getDocref()); // Document
																											// Refno
						fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__REQUEST_DATEI", data.getDocdatereq()); // Date
																											// Requested
						fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__EXP_SUB_DATEI", data.getDocexpecteddate());// Expected
																												// Date
						fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__ACTUAL_SUB_DATEI", data.getDocactualdate()); // actual
																													// Date
						fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__VALID_TILLI", data.getDocexpirydate()); // Expected
																												// Date
						// fcubs.clickRadioButton("BLK_CUSTDOC_CHKLIST__CHECKED"); //Check box

					}

					// ======================================Professional Tab===============================//
					
					if (data.getProfessionaltab().equalsIgnoreCase("Yes")) {


					fcubs.openChildScreenByTitle("Professional");
					fcubs.populateTextById("BLK_CUSTPROF__EMPSTAT", data.getEmployment()); // Employment select
					fcubs.populateTextById("BLK_CUSTPROF__EMPTENUREI", data.getEmptenure()); // Emp tenure
					fcubs.populateTextById("BLK_CUSTPROF__RETIREAGEI", data.getEmpretirmentage()); // Emp retirementage
					fcubs.populateTextById("BLK_CUSTPROF__PREVDESIG", data.getEmpprevousdes()); // previous Designation
					fcubs.populateTextById("BLK_CUSTPROF__PREVEMP", data.getEmppreviousemp()); // previous Emp
					fcubs.populateTextById("BLK_CUSTPROF__CURRDESIG", data.getEmpcurrentdes()); // current Designation
					fcubs.populateTextById("BLK_CUSTPROF__CURREMP", data.getEmpcurrentemp()); // Current Emp
					fcubs.populateTextById("BLK_CUSTPROF__EMPLOYER_DESC", data.getEmployerdescrption()); // Emp
																											// Description
					fcubs.populateTextById("BLK_CUSTPROF__CNTY", data.getEmpcountry()); // Emp Country
					fcubs.populateTextById("BLK_CUSTPROF__AMTCCY1", data.getEmpcurrcy()); // emp currency of amt
					fcubs.populateTextById("BLK_CUSTPROF__SALARYI", data.getEmpsalary()); // emp salary
					fcubs.populateTextById("BLK_CUSTPROF__SALARY_FREQ", data.getEmpsalaryfreq()); // emp salray
																									// frequency
					fcubs.populateTextById("BLK_CUSTPROF__P_ADDRESS_CODE", data.getEmpaddrcode()); // emp add code
					fcubs.populateTextById("BLK_CUSTPROF__TEL", data.getEmptelphone());// Emp Telephone
					fcubs.populateTextById("BLK_CUSTPROF__EMAIL", data.getEmpemailid()); // Emp Email
					fcubs.populateTextById("BLK_CUSTPROF__RENTI", data.getEmprent()); // Emp Rent
					fcubs.populateTextById("BLK_CUSTPROF__INSURANCEI", data.getEmpinsurance()); // Emp Insurance
					fcubs.populateTextById("BLK_CUSTPROF__LOANPMNTI", data.getEmploanpayment()); // Emp LoanAmt
					fcubs.populateTextById("BLK_CUSTPROF__OTHEXPI", data.getEmpother()); // Emp other
					fcubs.populateTextById("BLK_CUSTPROF__HOUSEVALI", data.getEmphousevalue()); // Emp Housevalue
					fcubs.populateTextById("BLK_CUSTPROF__CRCARDI", data.getEmpnoofcreditcards()); // Emp No of credit
																									// card
					fcubs.closeChildScreen();
					// fcubs.switchToActiveFrame();
					}
					
					fcubs.clickSave();
				
					// added to close remark screen/alert
					fcubs.closeRemarkPopUp();
					
					
					try {
					fcubs.closeOverridePopUp();
					}catch(Exception e) {
						
					}
					
					
					}
					
					
					
					
					
		//============================================Coporate Execution=================================================
					
					if (data.getCorporateexecution().equalsIgnoreCase("Yes")) {

						
						fcubs.clickNew();
						
						fcubs.selectRadioBtn("CTYPE", data.getType());
						fcubs.populateTextById("BLK_CUSTOMER__CUSTNO", data.getCustno());
						fcubs.clickButtonByXpath("//button[@id='BLK_CUSTOMER__BTN_P']");
						fcubs.populateTextById("BLK_CUSTOMER__FULLNAME", data.getFullname());
						fcubs.populateTextById("BLK_CUSTOMER__SNAME", data.getShortname());
						fcubs.populateTextById("BLK_CUSTOMER__CCATEG", data.getCustomercategory());
						fcubs.selectFlag("BLK_CUSTOMER__PRIVATE_CUSTOMER", data.getPrivatecustomer());
						fcubs.populateTextById("BLK_CUSTPERSONAL__TITLE", data.getPrefix());// prefix
						fcubs.populateTextById("BLK_CUSTPERSONAL__FSTNAME", data.getFirstname());// firstname
						fcubs.populateTextById("BLK_CUSTPERSONAL__LSTNAME", data.getLastname());// lastname
						/*
						 * if(data.getType().equalsIgnoreCase("I")) {
						 * fcubs.clickButtonByXpath("//label[contains(text(),'Individual')]"); }else
						 * if(data.getType().equalsIgnoreCase("C")) {
						 * fcubs.clickButtonByXpath("//label[contains(text(),'Corporate')]"); }else
						 * if(data.getType().equalsIgnoreCase("B")) {
						 * fcubs.clickButtonByXpath("//label[contains(text(),'Bank')]"); }
						 */

						
						// =========================================Corporate Tab==========================================//

						if (data.getCorptab().equalsIgnoreCase("Yes")) {
							fcubs.switchTab("Corporate");
							fcubs.populateTextById("BLK_CUSTCORP__CADDR1", data.getCorpadd1());
							fcubs.populateTextById("BLK_CUSTCORP__CADDR2", data.getCorpadd2());
							fcubs.populateTextById("BLK_CUSTCORP__CADDR3", data.getCorpadd3());
							fcubs.populateTextById("BLK_CUSTCORP__CADDR4", data.getCorpadd4());
							fcubs.populateTextById("BLK_CUSTCORP__CNTRY", data.getCorpcountry());
							fcubs.populateTextById("BLK_CUSTCORP__LANGUAGE", data.getCorplang());
							fcubs.selectDropdownByText("BLK_CUSTCORP__KYC_DETAILS", data.getCorpkycstatus());
							
							
					if (data.getCorpkycstatus().equalsIgnoreCase("Verification Failed")||data.getCorpkycstatus().equalsIgnoreCase("Verified")) {
								fcubs.populateTextById("BLK_CUSTCORP__KYCREFNO", data.getKycrefno());
							//	fcubs.LOVData("//fieldset[@id='TAB_CORPORATE__SEC_1__PART3__FST_ADDITIONAL2']//span[@class='ICOlov']","//label[contains(text(),'KYC Reference')]//following::input[1]","//label[contains(text(),'KYC Reference')]//following::input[1]","//button[contains(text(),'Fetch')]","//div[@id='LovDiv']//tr[1]//td[2]//div[1]",data.getKycrefno());
								//fcubs.populateTextById("BLK_CUSTPERSONAL__PPTISSDTI", data.getPassportissuedate());
								//fcubs.populateTextById("BLK_CUSTPERSONAL__PPTEXPDT", data.getPassportexpirydate());
							}

						fcubs.populateTextById("BLK_CUSTCORP__CNTRY", data.getCorpcountry());

							
						

						// ==============================Additional Tab===================================//

						fcubs.switchTab("Additional");
						fcubs.populateTextById("BLK_CUSTPERSONAL__SAME_PERM_ADDR", data.getSameaddr());
						fcubs.populateTextById("BLK_CUSTOMER__LOC", data.getLoc());
						fcubs.populateTextById("BLK_CUSTOMER__MEDIA", data.getMedia());

						/*
						 * if(data.getJointcheckbox().equalsIgnoreCase("Yes")) {
						 * fcubs.clickButtonById("BLK_CUSTOMER__FLGJOINT"); }
						 */
						fcubs.selectFlag("BLK_CUSTOMER__FLGJOINT", data.getJointcheckbox());

						// ========================================Limit Tab=================================//

						if (data.getLimittab().equalsIgnoreCase("Yes")) {

							fcubs.openChildScreenByTitle("Limits");
							fcubs.populateTextById("BLK_CUST_LIAB__OVERALL_LIMITI", data.getOveralllimit());
							fcubs.closeChildScreen();
							// fcubs.switchToActiveFrame();
						}

						// =======================================Joint Tab============================================//

						if (data.getJointtab().equalsIgnoreCase("Yes")) {
							fcubs.openChildScreenByTitle("Joint");
							fcubs.clickButtonByXpath("//span[@class='ICOadd']");
							fcubs.selectRadioBtn("SEX", data.getJointgend());
							fcubs.populateTextById("BLK_CUSTJOINT__FRSTNAME", data.getJointfn());// joint firstname
							fcubs.populateTextById("BLK_CUSTJOINT__LASTNAME", data.getJointln());// last name

							fcubs.populateTextById("BLK_CUSTJOINT__ADD1", data.getJointaddr1());// address1
							fcubs.populateTextById("BLK_CUSTJOINT__ADD2", data.getJointaddr2()); // address2
							fcubs.populateTextById("BLK_CUSTJOINT__ADD3", data.getJointaddr3());// address3

							fcubs.populateTextById("BLK_CUSTJOINT__DOBI", data.getJointdob()); // DOB
							fcubs.selectRadioBtn("RESISTAT", data.getJointresstatus());
							fcubs.selectRadioBtn("DECEASED", data.getJointdec());
							fcubs.closeChildScreen();
							// fcubs.switchToActiveFrame();
						}

						// ==============================CheckListTab======================================//

						if (data.getDocchecklisttab().equalsIgnoreCase("Yes")) {

							fcubs.switchTab("Check List");

							if (data.getChecklistaddbtn().equalsIgnoreCase("Yes")) {
								fcubs.clickButtonById("cmdAddRow_BLK_CUSTDOC_CHKLIST");

							}

							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__DOC_CATEGORY", data.getDoccategory()); // Document
																												// catagory
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__DOCUMENT_REF_NO", data.getDocref()); // Document
																												// Refno
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__REQUEST_DATEI", data.getDocdatereq()); // Date
																												// Requested
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__EXP_SUB_DATEI", data.getDocexpecteddate());// Expected
																													// Date
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__ACTUAL_SUB_DATEI", data.getDocactualdate()); // actual
																														// Date
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__VALID_TILLI", data.getDocexpirydate()); // Expected
																													// Date
							// fcubs.clickRadioButton("BLK_CUSTDOC_CHKLIST__CHECKED"); //Check box

						}

						// ======================================Professional Tab===============================//
						
						if (data.getProfessionaltab().equalsIgnoreCase("Yes")) {


						fcubs.openChildScreenByTitle("Professional");
						fcubs.populateTextById("BLK_CUSTPROF__EMPSTAT", data.getEmployment()); // Employment select
						fcubs.populateTextById("BLK_CUSTPROF__EMPTENUREI", data.getEmptenure()); // Emp tenure
						fcubs.populateTextById("BLK_CUSTPROF__RETIREAGEI", data.getEmpretirmentage()); // Emp retirementage
						fcubs.populateTextById("BLK_CUSTPROF__PREVDESIG", data.getEmpprevousdes()); // previous Designation
						fcubs.populateTextById("BLK_CUSTPROF__PREVEMP", data.getEmppreviousemp()); // previous Emp
						fcubs.populateTextById("BLK_CUSTPROF__CURRDESIG", data.getEmpcurrentdes()); // current Designation
						fcubs.populateTextById("BLK_CUSTPROF__CURREMP", data.getEmpcurrentemp()); // Current Emp
						fcubs.populateTextById("BLK_CUSTPROF__EMPLOYER_DESC", data.getEmployerdescrption()); // Emp
																												// Description
						fcubs.populateTextById("BLK_CUSTPROF__CNTY", data.getEmpcountry()); // Emp Country
						fcubs.populateTextById("BLK_CUSTPROF__AMTCCY1", data.getEmpcurrcy()); // emp currency of amt
						fcubs.populateTextById("BLK_CUSTPROF__SALARYI", data.getEmpsalary()); // emp salary
						fcubs.populateTextById("BLK_CUSTPROF__SALARY_FREQ", data.getEmpsalaryfreq()); // emp salray
																										// frequency
						fcubs.populateTextById("BLK_CUSTPROF__P_ADDRESS_CODE", data.getEmpaddrcode()); // emp add code
						fcubs.populateTextById("BLK_CUSTPROF__TEL", data.getEmptelphone());// Emp Telephone
						fcubs.populateTextById("BLK_CUSTPROF__EMAIL", data.getEmpemailid()); // Emp Email
						fcubs.populateTextById("BLK_CUSTPROF__RENTI", data.getEmprent()); // Emp Rent
						fcubs.populateTextById("BLK_CUSTPROF__INSURANCEI", data.getEmpinsurance()); // Emp Insurance
						fcubs.populateTextById("BLK_CUSTPROF__LOANPMNTI", data.getEmploanpayment()); // Emp LoanAmt
						fcubs.populateTextById("BLK_CUSTPROF__OTHEXPI", data.getEmpother()); // Emp other
						fcubs.populateTextById("BLK_CUSTPROF__HOUSEVALI", data.getEmphousevalue()); // Emp Housevalue
						fcubs.populateTextById("BLK_CUSTPROF__CRCARDI", data.getEmpnoofcreditcards()); // Emp No of credit
																										// card
						fcubs.closeChildScreen();
						// fcubs.switchToActiveFrame();
						}
						
					
						
						fcubs.clickSave();
					
						// added to close remark screen/alert
						
						fcubs.closeRemarkPopUp();
						
						fcubs.closeOverridePopUp();
						
						}
					
					
					}
					
					
		//============================================Authorise Record=================================================
					
					if (data.getAuthorise().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_CUSTOMER__CUSTNO", data.getCustno());
						fcubs.clickExecuteQuery();

						fcubs.clickButtonByXpath("//a[contains(text(),'Authorize')]");
						fcubs.switchtosubscreensframe();
						fcubs.clickBtnOk();
						fcubs.closeOverridePopUp1();
						fcubs.popupalert1();

						
					}
					
										
					
					if (data.getDelete().equalsIgnoreCase("Yes")) {
						
						try {
							fcubs.closeInfoPopUp();
						} catch (Exception e) {
							System.out.println("No pop up exists");
						}
						fcubs.clickDelete();
						fcubs.closeConfirmaPopUp();
						
					}
					
										
				/*	if (data.getUnlock().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_CUSTOMER__CUSTNO", data.getCustno());
						fcubs.clickExecuteQuery();
						
						try {
							fcubs.closeInfoPopUp();
						} catch (Exception e) {
								
							System.out.println("No pop up exists");
						}
						fcubs.clickButtonByXpath("//a[contains(text(),'Unlock')]");
						fcubs.clickSave();
						
						// added to close remark screen/alert
						fcubs.closeRemarkPopUp();
						
						fcubs.closeOverridePopUp();
						
					}*/
					
					
			//================================================EnterQuery=================================================		
					
					if (data.getUnlock().equalsIgnoreCase("Yes")) {

						
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_CUSTOMER__CUSTNO", data.getCustno());
						fcubs.clickExecuteQuery();
						
						fcubs.clickButtonByXpath("//a[contains(text(),'Unlock')]");

						/*
						 * if(data.getType().equalsIgnoreCase("I")) {
						 * fcubs.clickButtonByXpath("//label[contains(text(),'Individual')]"); }else
						 * if(data.getType().equalsIgnoreCase("C")) {
						 * fcubs.clickButtonByXpath("//label[contains(text(),'Corporate')]"); }else
						 * if(data.getType().equalsIgnoreCase("B")) {
						 * fcubs.clickButtonByXpath("//label[contains(text(),'Bank')]"); }
						 */

						fcubs.populateTextById("BLK_CUSTOMER__CCATEG", data.getCustomercategory());
						fcubs.selectFlag("BLK_CUSTOMER__PRIVATE_CUSTOMER", data.getPrivatecustomer());
						fcubs.populateTextById("BLK_CUSTPERSONAL__TITLE", data.getPrefix());// prefix
						fcubs.populateTextById("BLK_CUSTPERSONAL__FSTNAME", data.getFirstname());// firstname
						fcubs.populateTextById("BLK_CUSTPERSONAL__LSTNAME", data.getLastname());// lastname
						fcubs.populateTextById("BLK_CUSTPERSONAL__MIDNAME", data.getMiddlename());// middlename
						fcubs.populateTextById("BLK_CUSTPERSONAL__TEL_ISD_NOI", data.getWorkphnisd());// workphone isd
						fcubs.populateTextById("BLK_CUSTPERSONAL__TEL", data.getWorkphone());// work phone
						fcubs.populateTextById("BLK_CUSTPERSONAL__MOB_ISD_NOI", data.getMobileisdcode());// mobile isd code
						fcubs.populateTextById("BLK_CUSTPERSONAL__MOBNUM", data.getMobilenumber());// mobile number
						fcubs.selectRadioBtn("CUST_COMM_MODE", data.getCommmode());
						fcubs.populateTextById("BLK_CUSTOMER__NAME", data.getAddname()); // addressName
						fcubs.populateTextById("BLK_CUSTOMER__P_ADDRESS_CODE", data.getAddcode()); // address code
						fcubs.populateTextById("BLK_CUSTOMER__ADDRLN2", data.getAdd2()); // address2
						fcubs.populateTextById("BLK_CUSTOMER__ADDRLN3", data.getAdd3()); // address3
						fcubs.populateTextById("BLK_CUSTOMER__ADDRLN4", data.getAdd4()); // address4
						fcubs.selectDropdownByText("BLK_CUSTPERSONAL__KYCSTAT", data.getKycstatus()); // KYC status
					


						fcubs.selectRadioBtn("RESSTATUS", data.getResstatus());
						fcubs.populateTextById("BLK_CUSTPERSONAL__MOTHERMAIDN_NAME", data.getMothermainme());
																												
						fcubs.selectDropdownByText("BLK_CUSTPERSONAL__SBMTAGEPROOF", data.getSubmitageprf()); 
																												
						fcubs.populateTextById("BLK_CUSTPERSONAL__PREF_CNTACT_DATEI", data.getPrefdateofcont()); 
						fcubs.populateTextById("BLK_CUSTPERSONAL__PREF_CNTACT_TIME", data.getPreftimeofcont()); 
																												
						fcubs.populateTextById("BLK_CUSTOMER__ADDRLN1", data.getAddr());
						fcubs.populateTextById("BLK_CUSTOMER__COUNTRY", data.getCountry());
						fcubs.populateTextById("BLK_CUSTOMER__NLTY", data.getNationality());
						fcubs.selectRadioBtn("SEX", data.getGender());
						fcubs.populateTextById("BLK_CUSTPERSONAL__LANG", data.getLang());
						fcubs.populateTextById("BLK_CUSTPERSONAL__BIRTH_COUNTRY", data.getBirthcountry());
						fcubs.populateTextById("BLK_CUSTPERSONAL__DOBI", data.getDOB());

						// =========================================Corporate Tab==========================================//

						if (data.getCorptab().equalsIgnoreCase("Yes")) {
							fcubs.switchTab("Corporate");
							fcubs.populateTextById("BLK_CUSTCORP__CADDR1", data.getCorpadd1());
							fcubs.populateTextById("BLK_CUSTCORP__CADDR2", data.getCorpadd2());
							fcubs.populateTextById("BLK_CUSTCORP__CADDR3", data.getCorpadd3());
							fcubs.populateTextById("BLK_CUSTCORP__CADDR4", data.getCorpadd4());
							fcubs.populateTextById("BLK_CUSTCORP__CNTRY", data.getCorpcountry());
							fcubs.populateTextById("BLK_CUSTCORP__LANGUAGE", data.getCorplang());
							
							
						}

						// ==============================Additional Tab===================================//

						fcubs.switchTab("Additional");
						fcubs.populateTextById("BLK_CUSTPERSONAL__SAME_PERM_ADDR", data.getSameaddr());
						fcubs.populateTextById("BLK_CUSTOMER__LOC", data.getLoc());
						fcubs.populateTextById("BLK_CUSTOMER__MEDIA", data.getMedia());

						/*
						 * if(data.getJointcheckbox().equalsIgnoreCase("Yes")) {
						 * fcubs.clickButtonById("BLK_CUSTOMER__FLGJOINT"); }
						 */
						fcubs.selectFlag("BLK_CUSTOMER__FLGJOINT", data.getJointcheckbox());

						// ========================================Limit Tab=================================//

						if (data.getLimittab().equalsIgnoreCase("Yes")) {

							fcubs.openChildScreenByTitle("Limits");
							fcubs.populateTextById("BLK_CUST_LIAB__OVERALL_LIMITI", data.getOveralllimit());
							fcubs.closeChildScreen();
							// fcubs.switchToActiveFrame();
						}

						// =======================================Joint Tab============================================//

						if (data.getJointtab().equalsIgnoreCase("Yes")) {
							fcubs.openChildScreenByTitle("Joint");
							fcubs.clickButtonByXpath("//span[@class='ICOadd']");
							fcubs.selectRadioBtn("SEX", data.getJointgend());
							fcubs.populateTextById("BLK_CUSTJOINT__FRSTNAME", data.getJointfn());// joint firstname
							fcubs.populateTextById("BLK_CUSTJOINT__LASTNAME", data.getJointln());// last name

							fcubs.populateTextById("BLK_CUSTJOINT__ADD1", data.getJointaddr1());// address1
							fcubs.populateTextById("BLK_CUSTJOINT__ADD2", data.getJointaddr2()); // address2
							fcubs.populateTextById("BLK_CUSTJOINT__ADD3", data.getJointaddr3());// address3

							fcubs.populateTextById("BLK_CUSTJOINT__DOBI", data.getJointdob()); // DOB
							fcubs.selectRadioBtn("RESISTAT", data.getJointresstatus());
							fcubs.selectRadioBtn("DECEASED", data.getJointdec());
							fcubs.closeChildScreen();
							// fcubs.switchToActiveFrame();
						}

						// ==============================CheckListTab======================================//

						if (data.getDocchecklisttab().equalsIgnoreCase("Yes")) {

							fcubs.switchTab("Check List");

							if (data.getChecklistaddbtn().equalsIgnoreCase("Yes")) {
								fcubs.clickButtonById("cmdAddRow_BLK_CUSTDOC_CHKLIST");

							}

							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__DOC_CATEGORY", data.getDoccategory()); // Document
																												// catagory
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__DOCUMENT_REF_NO", data.getDocref()); // Document
																												// Refno
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__REQUEST_DATEI", data.getDocdatereq()); // Date
																												// Requested
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__EXP_SUB_DATEI", data.getDocexpecteddate());// Expected
																													// Date
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__ACTUAL_SUB_DATEI", data.getDocactualdate()); // actual
																														// Date
							fcubs.populateTextById("BLK_CUSTDOC_CHKLIST__VALID_TILLI", data.getDocexpirydate()); // Expected
																													// Date
							// fcubs.clickRadioButton("BLK_CUSTDOC_CHKLIST__CHECKED"); //Check box

						}

						// ======================================Professional Tab===============================//
						
						if (data.getProfessionaltab().equalsIgnoreCase("Yes")) {


						fcubs.openChildScreenByTitle("Professional");
						fcubs.populateTextById("BLK_CUSTPROF__EMPSTAT", data.getEmployment()); // Employment select
						fcubs.populateTextById("BLK_CUSTPROF__EMPTENUREI", data.getEmptenure()); // Emp tenure
						fcubs.populateTextById("BLK_CUSTPROF__RETIREAGEI", data.getEmpretirmentage()); // Emp retirementage
						fcubs.populateTextById("BLK_CUSTPROF__PREVDESIG", data.getEmpprevousdes()); // previous Designation
						fcubs.populateTextById("BLK_CUSTPROF__PREVEMP", data.getEmppreviousemp()); // previous Emp
						fcubs.populateTextById("BLK_CUSTPROF__CURRDESIG", data.getEmpcurrentdes()); // current Designation
						fcubs.populateTextById("BLK_CUSTPROF__CURREMP", data.getEmpcurrentemp()); // Current Emp
						fcubs.populateTextById("BLK_CUSTPROF__EMPLOYER_DESC", data.getEmployerdescrption()); // Emp
																												// Description
						fcubs.populateTextById("BLK_CUSTPROF__CNTY", data.getEmpcountry()); // Emp Country
						fcubs.populateTextById("BLK_CUSTPROF__AMTCCY1", data.getEmpcurrcy()); // emp currency of amt
						fcubs.populateTextById("BLK_CUSTPROF__SALARYI", data.getEmpsalary()); // emp salary
						fcubs.populateTextById("BLK_CUSTPROF__SALARY_FREQ", data.getEmpsalaryfreq()); // emp salray
																										// frequency
						fcubs.populateTextById("BLK_CUSTPROF__P_ADDRESS_CODE", data.getEmpaddrcode()); // emp add code
						fcubs.populateTextById("BLK_CUSTPROF__TEL", data.getEmptelphone());// Emp Telephone
						fcubs.populateTextById("BLK_CUSTPROF__EMAIL", data.getEmpemailid()); // Emp Email
						fcubs.populateTextById("BLK_CUSTPROF__RENTI", data.getEmprent()); // Emp Rent
						fcubs.populateTextById("BLK_CUSTPROF__INSURANCEI", data.getEmpinsurance()); // Emp Insurance
						fcubs.populateTextById("BLK_CUSTPROF__LOANPMNTI", data.getEmploanpayment()); // Emp LoanAmt
						fcubs.populateTextById("BLK_CUSTPROF__OTHEXPI", data.getEmpother()); // Emp other
						fcubs.populateTextById("BLK_CUSTPROF__HOUSEVALI", data.getEmphousevalue()); // Emp Housevalue
						fcubs.populateTextById("BLK_CUSTPROF__CRCARDI", data.getEmpnoofcreditcards()); // Emp No of credit
																										// card
						fcubs.closeChildScreen();
						// fcubs.switchToActiveFrame();
						}
						
					
						
						fcubs.clickSave();
						
							// added to close remark screen/alert
							fcubs.closeRemarkPopUp();
							
							fcubs.closeOverridePopUp();
							
							}
					
					
					
					
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					//fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for next test case
					fcubs.closeInfoPopUp();
					fcubs.closeScreen();

					data.setTestCaseResult("SUCCESS");
				}
			} catch (Exception ex) {
				errorMsg = fcubs.checkUIFormatError();
				if (fcubs.validInput(errorMsg)) {
					data.setTestCaseResult(errorMsg);
				} else if (fcubs.validInput(ex.getMessage())) {
					data.setTestCaseResult(ex.getMessage());
				}
				ex.printStackTrace();
				resultList.add(data);
				// to update the status as failed
				// fcubs.updateTestCaseExecutionAsFailed();
			}

		}

	}

	@AfterClass
	public void destroy() throws Exception {
		System.out.println("before destroying opened session");
		fcubs.destroy();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("inside after method");
		if (!result.isSuccess()) {
			fcubs.takeScreenShot("UNHANDLED_EXCEPTION_" + testCaseId);
		}
		System.out.println("Test Case Id\tResult");
		for (CustomerMaintenance_STDCIF_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
