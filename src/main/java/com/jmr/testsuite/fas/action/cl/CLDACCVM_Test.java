package com.jmr.testsuite.fas.action.cl;

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

import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
import com.jmr.testsuite.fas.page.cl.CLDACCVM_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class CLDACCVM_Test extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "CLDACCVM";//Run in BSPUSER9
	private final String screenName="Value Dated Amendments";

	private List<CLDACCVM_Page> dataList;
	private List<CLDACCVM_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(CLDACCVM_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (CLDACCVM_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					if (data.getNewdata().equalsIgnoreCase("Yes")) {

				
					fcubs.clickEnterQuery();;
				
					fcubs.populateTextById("BLK_ACCOUNT_MASTER__ACCNOVAMD", data.getAccountnumber());
					
					fcubs.clickExecuteQuery();
					
					fcubs.clickButtonByXpath("//a[contains(text(),'Unlock')]");
					
					if(data.getMaintab().equalsIgnoreCase("Yes")) {
											
						fcubs.switchTab("Main");
						
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__EFFDTVAMDI", data.getEffectivedate());
						fcubs.clickButtonById("BLK_ACCOUNT_MASTER__BTN_CREATE_AMEND");

						fcubs.populateTextById("BLK_ACCOUNT_MASTER__VALDTI", data.getValuedate());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__MATDTI", data.getMaturitydate());

						fcubs.populateTextById("BLK_ACCOUNT_MASTER__AMTFINANCEDI", data.getAmountfinanced());
				
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__NOOFINSI", data.getNumberofinstallment());
						fcubs.selectDropdownByText("BLK_ACCOUNT_MASTER__FREQUNIT", data.getUnit());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__FREQI", data.getFrequency());
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__NOOFINSI", data.getNumberofinstallment());
						fcubs.selectDropdownByText("BLK_ACCOUNT_MASTER__MATTYP", data.getMaturitytype());
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__BTN_EDITUDE", data.getEditudedetail());
						
						if(data.getEffectivedatereq().equalsIgnoreCase("Yes")) {
							
							fcubs.clickButtonByXpath("//button[@id='cmdAddRow_BLK_EFFEC_DATE']//span[@class='ICOadd']");

							fcubs.populateTextById("BLK_EFFEC_DATE__EFFDTIRC1", data.getEffectivedate2());

						}

						
						if(data.getInterestratereq().equalsIgnoreCase("Yes")) {
											
							fcubs.clickButtonByXpath("//button[@id='cmdAddRow_BLK_UDE_VALS']//span[@class='ICOadd']");
							fcubs.populateTextById("BLK_UDE_VALS__UDEVALI", data.getInterestvalue());
							fcubs.LOVData("//body/div[@id='DIVWNDContainer']/div[@id='DIVScrContainer']/div[@id='ResTree']/div[@id='DIVMainTmp']/div[@id='mainTabContainer']/div[@class='DIVtabC']/div[@id='TBLPageTAB_MAIN']/div[@id='TAB_MAIN__SEC_3']/div[@id='TAB_MAIN__SEC_3__SEC3_PART2']/fieldset[@id='TAB_MAIN__SEC_3__SEC3_PART2__FST_UDEVALS']/div[@id='dataContainer_BLK_UDE_VALS']/div[@class='DIVmultiplebox']/div[@id='BLK_UDE_VALS_tableContainer']/table[@id='BLK_UDE_VALS']/tbody/tr/td[3]/div[1]/button[1]/span[1]","//label[contains(text(),'User Defined Element Id')]//following::input[1]","//label[contains(text(),'User Defined Element Id')]//following::input[1]","//button[contains(text(),'Fetch')]","//div[@id='LovDiv']//tr[1]//td[2]//div[1]",data.getElementid());
							fcubs.switchToActiveFrame();
														
						}
						
						
						
						//fcubs.populateTextById("BLK_UDE_VALS__UDEVALIRC2", data.getInterestrate());
						/*fcubs.populateTextById("BLK_UDE_VALS__RATECODERC2", data.getRatecode());
						fcubs.selectDropdownByText("BLK_UDE_VALS__CODEUSAGERC2", data.getCodeusage());*/
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__BTN_E_ENRICH", data.getEnrich());
						
						
						
							try {
						fcubs.closeInfoPopUp();;
						}
						catch(Exception ex) {
							System.out.println("No Override popup exists");
						}

										
					}
					
					
					///==============================Preference Tab=========================================
					if(data.getPreferencetab().equalsIgnoreCase("Yes")) {
						
						fcubs.switchTab("Preferences");

						
						if(data.getHoliday().equalsIgnoreCase("Yes")) {
							fcubs.clickButtonById("cmdAddRow_BLK_HOL_PERIODS");
							fcubs.populateTextById("BLK_HOL_PERIODS__HOLPERDS", data.getHoliday());
						}
						
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__AMENDPASTPAIDSCH", data.getAmendpastpaidschedule());
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__LIQDBACKVALUESCH", data.getLiquidatebackschedule());
						fcubs.selectDropdownByText("BLK_ACCOUNT_MASTER__LIQDMODE", data.getAutoliquidation());
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__ALIQREVPMT", data.getResetretrycount());
						fcubs.selectFlag("BLK_ACCOUNT_MASTER__PARTIALLIQD", data.getPartialLiquidation());
						fcubs.selectRadioBtn("STATUS_CHANGE_MODE", data.getStatuschange());
											
					}
					
					
					
					//===============================Linkage Tab============================================
					
					
					if(data.getLinkagestab().equalsIgnoreCase("Yes")) {
						
						fcubs.switchTab("Linkage Details");
						fcubs.clickButtonById("cmdDelRow_BLK_CLTBS_ACC_COLL_LINK_DTLS");
						fcubs.clickButtonById("cmdAddRow_BLK_CLTBS_ACC_COLL_LINK_DTLS");
						fcubs.selectDropdownByText("BLK_CLTBS_ACC_COLL_LINK_DTLS__LINKAGE_TYPE", data.getLinkagetype());
						fcubs.populateTextById("BLK_CLTBS_ACC_COLL_LINK_DTLS__LINKED_REFERENCE_NO", data.getLinkedrefnumber());
						fcubs.populateTextById("BLK_CLTBS_ACC_COLL_LINK_DTLS__HAIRCUT", data.getHaircut());
						fcubs.populateTextById("BLK_CLTBS_ACC_COLL_LINK_DTLS__LINKED_PERCENT_NUMBERI", data.getLinkedpercentage());
						fcubs.populateTextById("BLK_CLTBS_ACC_COLL_LINK_DTLS__UTIL_ORDERI", data.getUtilizedordernumber());
					}

					
					
					fcubs.clickSave();
				
					// added to close remark screen/alert
					try {
					fcubs.closeOverridePopUp();
					}
					catch(Exception e) {
						System.out.println("Override pop up doesnot exists");
					}
					
				}
					
					
					
					
					
//============================================Authorise Record=================================================
					
					if (data.getAuthorize().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_ACCOUNT_MASTER__ACCNOVAMD", data.getAccountnumber());
						fcubs.clickExecuteQuery();

						fcubs.clickButtonByXpath("//a[contains(text(),'Authorize')]");
						fcubs.switchtosubscreensframe();
						fcubs.clickBtnAuthorisebtnCLVAMI();
						fcubs.closeInfoPopUp();
						fcubs.closeScreen();
										
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
		for (CLDACCVM_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
