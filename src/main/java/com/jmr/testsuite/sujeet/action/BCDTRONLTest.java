package com.jmr.testsuite.sujeet.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestCaseImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.AppConfig;
import com.jmr.testsuite.fas.FlexcubeCommon;
import com.jmr.testsuite.fas.SpringConfiguration;
	import com.jmr.testsuite.fas.page.common.ScreenShotUtil;
import com.jmr.testsuite.sujeet.page.BCDTRONL;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class BCDTRONLTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebDriver driver;
	private WebDriverWait driverWait;
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	@Autowired
	private ScreenShotUtil screenShotUtil;
	private String testCaseId;

	private String errorMsg = "";

	private BCDTRONL data;
	private final String screenId = "BCDTRONL";
	private final String screenName = "Bills and Collection Contract Detailed ";

	private List<BCDTRONL> dataList;
	private List<BCDTRONL> resultList;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(BCDTRONL.class, screenId);
		resultList = new ArrayList<>();

	}
	@Test()
	public void executeTestCase() throws Exception {

		for (BCDTRONL data : dataList) {
			try {
				this.testCaseId = data.getTestCaseID();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);

					fcubs.clickNew();

					fcubs.populateTextById("BLK_CONTRACT_DETAILS__PRDCD", data.getProductCode()); // Product
					// Code
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__OURLCAPP", data.getLcCustomer()); // LC
					// Customer
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__OURLCREF", data.getLcReferenceNumber()); // LC
					// Reference
					// Number
					// fcubs.clickLcDefaultBtn(); // LC Default Button
					// fcubs.closeOverrideScreen(); // Accept button
					Thread.sleep(2000);
					
					fcubs.switchTab("Main"); // Main Tab
					Thread.sleep(2000);
					
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__CUSTID", data.getTheCustomerID()); // Customer
					// ID
					Thread.sleep(2000);

					fcubs.populateTextById("BLK_CONTRACT_DETAILS__BILLAMTI", data.getAmount()); // Amount
					Thread.sleep(2000);
					// fcubs.populateDateField("BLK_CONTRACT_DETAILS__VALDTI",
					// data.getValueDate()); // Value Date
					// fcubs.populateDateField("BLK_CONTRACT_DETAILS__BASDTI",
					// data.getBaseDate()); // Base Date
					// fcubs.populateDateField("BLK_CONTRACT_DETAILS__DRVALDTI",
					// data.getDebitValueDate()); // Debit Value Date
					// fcubs.populateDateField("BLK_CONTRACT_DETAILS__CRVALDTI",
					// data.getCreditValueDate()); // Credit Value Date

					fcubs.populateTextById("BLK_CONTRACT_DETAILS__TENRDSI", data.getTenorDays()); // Tenor
					// Days

					fcubs.switchTab("Details"); // Details Tab

					fcubs.selectFlag("BLK_CONTRACT_DETAILS__ALLWPREPAY", data.getAllowPrepayment()); // Allow
					// Prepayment
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__ACPFRMDTI", data.getFromDate()); // From
					// Date
					fcubs.populateTextById("BLK_CONTRACT_DETAILS__ACPTODTI", data.getToDate()); // To
					// Date

					fcubs.switchTab("Additional"); // Additional Tab

					fcubs.selectFlag("BLK_CONTRACT_DETAILS__AUTOLIQFLG", data.getAutoLiquidate()); // AUTO_LIQUIDATE
					fcubs.selectFlag("BLK_CONTRACT_DETAILS__ALLWROLLOVR", data.getAllowRollover()); // ALLOW_ROLLOVER
					fcubs.selectFlag("BLK_CONTRACT_DETAILS__STATCNFLG", data.getAutoStatusControl()); // AUTO_STATUS_CONTROL
					fcubs.selectFlag("BLK_CONTRACT_DETAILS__USELCREFMSG", data.getUseLcReferenceInMessage()); // USE_LC_REFERENCE_IN_MESSAGE

					fcubs.switchTab("Parties"); // Parties Tab
					
					fcubs.populateTextById("BLK_CONTRACT_PARTIES__PARTID", data.getDraweePartyId()); // Drawee
					// Party
					// ID
					
					fcubs.populateTextById("BLK_CONTRACT_PARTIES__PARTREFNO", data.getDraweeReference()); // Drawee
					// Reference
					// Number
					
					fcubs.populateTextById("BLK_CONTRACT_PARTIES__PARTIDRC1", data.getDrawerPartyId()); // Drawer
					// Party
					// ID
					
					fcubs.populateTextById("BLK_CONTRACT_PARTIES__PARTREFNORC1", data.getDrawerReference()); // Drawer
					// Reference
					// Number

					

					/*if(data.getLimitsTrackingRequired().equalsIgnoreCase("Yes") == true){
						fcubs.selectFlag("BLK_CONTRACT_DETAILS__LMTMONFLG", data.getLimitsTrackingRequired());
						fcubs.clickButtonById("cmdAddRow_BLK_PARTY_LIMITS");
						fcubs.populateTextById("BLK_PARTY_LIMITS__OPERATION", data.getOperation());
						fcubs.populateTextById("BLK_PARTY_LIMITS__PARTTYP", data.getPartyTypeBlockPartyLimits());
						fcubs.populateTextById("BLK_PARTY_LIMITS__CUSTNO", data.getPartyLimitsBlockCustomerNumber());
						fcubs.populateTextById("BLK_PARTY_LIMITS__LIABILITYNO", data.getPartyLimitsBlockLiabilityNumber());
						fcubs.selectDropdownByText("BLK_PARTY_LIMITS__LINKAGETYP", data.getPartyLimitsBlockType());
						fcubs.populateTextById("BLK_PARTY_LIMITS__LINKAGERPERCI", data.getPartyLimitsBlockPercentContribution());
						fcubs.selectDropdownByText("BLK_PARTY_LIMITS__AMOUNTTAG", data.getPartyLimitsBlockAmountTag());
					} else*/

					fcubs.switchTab("Documents"); // Documents

					fcubs.clickButtonById("cmdAddRow_BLK_DOCUMENT_DETAILS"); // Add
					// Row
					// in
					// Document
					// Details
					fcubs.populateTextById("BLK_DOCUMENT_DETAILS__DOCCOD", data.getCode()); // Code
					fcubs.populateTextById("BLK_DOCUMENT_DETAILS__DOCREF", data.getDocumentReference());
					fcubs.populateTextById("BLK_DOCUMENT_DETAILS__DOCDATEI", data.getDocumentDate()); // Document
					// Date

					fcubs.clickButtonById("cmdAddRow_BLK_DOC_CLAUSE");
					fcubs.populateTextById("BLK_DOC_CLAUSE__CLAUSCD", data.getClauseCode()); // CLAUSE_CODE

					fcubs.switchTab("Goods"); // Goods Tab

					fcubs.clickButtonById("cmdAddRow_BLK_CONTRACT_GOODS_DETAILS"); // Add
					// Row
					// in
					// Goods
					// Details
					fcubs.populateTextById("BLK_CONTRACT_GOODS_DETAILS__GOODS_CODE", data.getGoodsCode()); // Goods
					// Code
					fcubs.populateTextById("BLK_CONTRACT_GOODS_DETAILS__NO_OF_UNITSI", data.getNumberOfUnits()); // Number
					// of
					// Units
					fcubs.populateTextById("BLK_CONTRACT_GOODS_DETAILS__PRICE_PER_UNITI", data.getPricePerUnit()); // Price
					// Per
					// Unit

					fcubs.switchTab("Rollover"); // Rollover Tab

					fcubs.selectDropdownByText("BLK_ROLL_PREF__INTLIQDMOD", data.getInterestLiquidationMode()); // Interest
					// Liquidation
					// Mode

					/*	fcubs.switchTab("Insurance"); // Insurance Tab

					fcubs.populateTextById("BLK_INSURANCE_MASTER__INSCOMPCOD", data.getCompanyCode()); // Company
					// Code
					
					if(data.getPurchaseDetailsTab().equalsIgnoreCase("Yes")){

						fcubs.switchTab("Purchase Details"); // Purchase Details Tab
						
						fcubs.populateTextById("BLK_CONTRACT_DETAILS__PURAMTI", data.getPurchaseAmount()); // Purchase Amount
					} else 
						
						if(data.getInterestSubTab().equalsIgnoreCase("Yes")){
						
							fcubs.openChildScreenByTitle("Interest");			// Interest Tab
							fcubs.populateTextById("BLK_INTREST_DETAILS__RATEI", data.getRate()); // Rate
							fcubs.closeChildScreen();							
					} 
						
						if(data.getChargesSubTab().equalsIgnoreCase("Yes")){					
							fcubs.openChildScreenByTitle("Charges");			// Charges Tab
							fcubs.populateTextById("", data.getConsiderAsDiscount());	// Consider As Discount
							fcubs.populateTextById("", data.getWaiver());				// Waiver
							fcubs.populateTextById("", data.getChargesAccrualRequired());// Charges Accrual Required
							fcubs.closeChildScreen();						
					}				
					  if (data.getMisSubTab().equalsIgnoreCase("Yes")) {
					  
					  fcubs.openChildScreenByTitle("MIS"); // MIS Sub Tab
					  Thread.sleep(1000);
					  fcubs.populateTextById("BLK_MISDETAILS__TXNMIS1",
					  data.getCostCTR()); 									// COST_CTR
					  fcubs.closeChildScreen();
					  
					  }	*/	
					fcubs.clickSave();
					fcubs.closeOverridePopUp();

					// added to close remark screen/alert
					fcubs.closeRemarkPopUp();
					try {
						errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseID());
						System.out.println("Error Message  " + errorMsg);
						data.setTestCaseResult(errorMsg);
						if (fcubs.validInput(errorMsg)) {
							resultList.add(data);
							continue;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					// fcubs.closeOverridePopUp();
					data.setTestCaseResult("SUCCESS");
					resultList.add(data);
					// on successful save action confirm and close window for
					// next test case
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
		for (BCDTRONL data : resultList) {
			System.out.println(data.getTestCaseID() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}

}