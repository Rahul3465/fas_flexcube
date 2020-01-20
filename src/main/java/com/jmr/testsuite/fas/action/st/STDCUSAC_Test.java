package com.jmr.testsuite.fas.action.st;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.st.STDCUSAC_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class STDCUSAC_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "STDCUSAC";
	private final String screenName="Customer Accounts Maintenance";

	private List<STDCUSAC_Page> dataList;
	private List<STDCUSAC_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(STDCUSAC_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (STDCUSAC_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					if (data.getNewdata().equalsIgnoreCase("Yes")) {
				
					fcubs.clickNew();
				
					
					fcubs.populateTextById("BLK_CUST_ACCOUNT__CUSTNO", data.getCustomernumber());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__CCY", data.getCurrency());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ACCLS", data.getAccountclass());
					fcubs.clickButtonById("BLK_CUST_ACCOUNT__BTN_ACCPKP");
					
					// =========================================Main Tab==========================================//

					fcubs.populateTextById("TAB_MAIN", data.getMaintab());
					fcubs.selectRadioBtn("ACCTYPE", data.getAccounttype());
					fcubs.selectDropdownByText("BLK_CUST_ACCOUNT__OPMODE", data.getModeofoperation());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__ATM", data.getAtm());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__LOC", data.getLocation());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__MEDIA", data.getMedia());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__SALARY_ACCOUNT", data.getSalary());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ACC_OPENING_AMTI", data.getAccountopeingamount());
					fcubs.selectRadioBtn("PAY_IN_OPTION", data.getPayinoption());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__INF_OFFSET_ACCOUNT", data.getOffsetaccount());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__WAIVE_ACCOPEN_CHG", data.getWaiveraccountopeingcharge());
					


					// =========================================Nominee Tab==========================================//
					
					fcubs.clickButtonByXpath("//span[contains(text(),'Nominee')]");
			
					if (data.getNewrecord().equalsIgnoreCase("Yes")) {
						fcubs.clickButtonByXpath("//button[@name='BTN_ADD_BLK_ACC_NOMINEES']//span[@class='ICOadd']");
						fcubs.populateTextById("BLK_ACC_NOMINEES__NAM", data.getName());
						fcubs.populateTextById("BLK_ACC_NOMINEES__DOBI", data.getDateofbirth());
						fcubs.populateTextById("BLK_ACC_NOMINEES__RELSHIP", data.getRelationship());
						fcubs.populateTextById("BLK_ACC_NOMINEES__NADDR1", data.getAddress1());
						fcubs.populateTextById("BLK_ACC_NOMINEES__NADDR2", data.getAddress2());
						fcubs.populateTextById("BLK_ACC_NOMINEES__NADDR3", data.getAddress3());
						fcubs.populateTextById("BLK_ACC_NOMINEES__NADDR4", data.getAddress4());
					}
					
					
					
					
					
					// =========================================Auxiliary Tab==========================================//
					
					
					fcubs.clickButtonByXpath("//span[contains(text(),'Auxiliary')]");
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ATMACC", data.getAtmaccontnumber());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ATMDLIMI", data.getDailyAmountlimit());
					fcubs.populateTextById("BLK_CUST_ACCOUNT__ATMDCNTLIMI", data.getDailycountlimit());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__POSTALLOWED", data.getPostingallowd());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__ACSTATNOCR", data.getNocredits());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__ACSTATNODR", data.getNodebits());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__AUTOSTATCHANGE", data.getStatuschangeautomatic());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__AUTOPROVREQ", data.getAutomprovisingrequired());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__ALLWBKPERENTRY", data.getBackperiodentryallowed());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__TRKREC", data.getTracrecievable());
					fcubs.selectFlag("BLK_CUST_ACCOUNT__PROJECTACCNT", data.getProjectaccount());
					
					
					// =========================================Document Tab==========================================//

					fcubs.clickButtonByXpath("//span[contains(text(),'Check List')]");
					fcubs.clickButtonByXpath("//button[@id='cmdAddRow_BLK_DOCTYPE_CHECKLIST']//span[@class='ICOadd']");
					fcubs.populateTextById("BLK_DOCTYPE_CHECKLIST__DOCUMENT_TYPE", data.getDocumenttab());
					fcubs.populateTextById("BLK_DOCTYPE_CHECKLIST__EXPIRY_DATEI", data.getExpirydateofsubmission());
					fcubs.populateTextById("BLK_DOCTYPE_CHECKLIST__EXPECTED_DATE_SUBMISSIONI", data.getExpecteddateofsubmission());
					fcubs.selectFlag("BLK_DOCTYPE_CHECKLIST__CHECKED", data.getChecked());
					
					
					
					// ======================================MIS Tab===============================//
					
					if (data.getMissubtab().equalsIgnoreCase("Yes")) {
						fcubs.openChildScreenByTitle("MIS");
						fcubs.populateTextById("BLK_MISDETAILS__POOLCD", data.getPoolcode());
						fcubs.closeChildScreen();	
					//	fcubs.switchToActiveFrame();
					}
					
					
					// ======================================JointHolder Tab===============================//

					if (data.getJointholdersubtab().equalsIgnoreCase("Yes")) {
						fcubs.openChildScreenByTitle("Joint Holders");
						fcubs.clickButtonByXpath("//span[@class='ICOadd']");
						fcubs.populateTextById("BLK_JOINTHOLDERS__JNTHLDCDE", data.getCustomno());
						fcubs.closeChildScreen();
						//fcubs.switchToActiveFrame();

					}
							
					fcubs.clickSave();
				
					// added to close remark screen/alert
					try {
						fcubs.closeRemarkPopUp();
						
						fcubs.closeInfoPopUp();
						
						fcubs.closeScreen();
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("no such pop up exists");
					}
					
			
				}
					
					
					
					
					
//============================================Authorise Record=================================================
					
					if (data.getAuthorise().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_CUST_ACCOUNT__ACC", data.getAccountnumber());
						fcubs.clickExecuteQuery();

						fcubs.clickButtonByXpath("//a[contains(text(),'Authorize')]");
						fcubs.switchtosubscreensframe();
						fcubs.clickBtnOk();
						fcubs.closeInfoPopUp();
						fcubs.closeScreen();
									
					}
					
			
					
					if (data.getUnlock().equalsIgnoreCase("Yes")) {
						
					
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_CUST_ACCOUNT__ACC", data.getAccountnumber());
						fcubs.clickExecuteQuery();
						
						try {
							fcubs.closeInfoPopUp();
						} catch (Exception e) {
								// TODO: handle exception
							System.out.println("No pop up exists");
						}
						fcubs.clickButtonByXpath("//a[contains(text(),'Unlock')]");
						fcubs.populateTextById("BLK_CUST_ACCOUNT__ACC_OPENING_AMTI", data.getAccountopeingamount());
						fcubs.selectRadioBtn("PAY_IN_OPTION", data.getPayinoption());

						fcubs.clickSave();
						
						// added to close remark screen/alert
						try {
							fcubs.closeRemarkPopUp();
							
							fcubs.closeInfoPopUp();
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("no such pop up exists");
						}
						
						
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
				//	fcubs.closeInfoPopUp();
				//	fcubs.closeScreen();

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
		for (STDCUSAC_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
