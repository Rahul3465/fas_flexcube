package com.jmr.testsuite.fas.action.fx;

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
import com.jmr.testsuite.fas.page.fx.FXDTRONL_Page;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class FXDTRONL_Test  extends AbstractTestNGSpringContextTests {
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "FXDTRONL";
	private final String screenName="Foreign Exchange Contract Input";

	private List<FXDTRONL_Page> dataList;
	private List<FXDTRONL_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(FXDTRONL_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (FXDTRONL_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
				
					fcubs.clickNew();
					
					fcubs.populateTextById("BLK_CONTRACT_MASTER__PRDCD",data.getProduct());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__COUNTERPARTY", data.getCounterparty());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__BOOKINGDTI", data.getBookingtype());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__BOTCCY", data.getBroughtcurrency());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__BOTAMTI", data.getBroughtamount());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__BOTVALDTI", data.getBroughtvaluedate());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__SOLDCCY", data.getSoldcurrency());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__SOLDAMTI", data.getBroughtamount());
					fcubs.populateTextById("BLK_CONTRACT_MASTER__SOLDVALDTI", data.getSoldvaluedate());
					fcubs.selectFlag("BLK_CONTRACT_MASTER__BTN_RECALCULATE", data.getCalculatebutton());
					fcubs.selectRadioBtn("BUYSELLIND", data.getDealtype());
					
					//-------------------------------------------RollOverInstruction Tab-----------------------//
					fcubs.clickButtonByXpath("//span[contains(text(),'Rollover Instructions')]");
					fcubs.selectFlag("BLK_CONTRACT_MASTER__AUTOLIQD", data.getAutoliquidation());
					fcubs.selectFlag("BLK_CONTRACT_MASTER__ROLLOVERREQD", data.getRolloverrequired());
					
					//-------------------------------------------Netting Tab---------------------------------//
					fcubs.clickButtonByXpath("//span[contains(text(),'Netting')]");
					fcubs.selectDropdownByText("BLK_CONTRACT_MASTER__NETTYPE", data.getNettingtype());
					fcubs.selectDropdownByText("BLK_CONTRACT_MASTER__NETMODE", data.getModeofnetting());
					
					fcubs.clickSave();
					
					try {
						fcubs.closeOverridePopUp();
					}catch(Exception ex) {
						System.out.println("No Override pop up Exists");
					}

					fcubs.closeInfoPopUp();
					
									
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
					//fcubs.closeInfoPopUp();
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
		for (FXDTRONL_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}
