package com.jmr.testsuite.fas.action.mm;

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
import com.jmr.testsuite.fas.page.mm.MMDTRONL_Page;
import com.jmr.testsuite.fas.page.st.CustomerMaintenance_STDCIF_Page;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)

public class MMDTRONL_Test extends AbstractTestNGSpringContextTests{
	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;

	private String errorMsg = "";

	private final String screenId = "MMDTRONL";
	private final String screenName="Money Market Contract Input";

	private List<MMDTRONL_Page> dataList;
	private List<MMDTRONL_Page> resultList;
	

	private String testCaseId;

	@PostConstruct
	public void initSetup() throws Exception {
		fcubs.setScreenDetails(screenId, screenName);
		fcubs.launchApp();
//		dataList1 = xlsReader.read(CFDFLTRI.class, new File(AppConfig.testFileLocation), 13);
		dataList = fcubs.loadDataFromExcel(MMDTRONL_Page.class, screenId);
		resultList = new ArrayList<>();

	}


	@Test()
	public void executeTestCase() throws Exception {

		for (MMDTRONL_Page data : dataList) {
			try {
				this.testCaseId = data.getTestCaseId();
				System.out.println("Executing Test Case ====>" + this.testCaseId);
				fcubs.setTestCaseId(testCaseId);
				if (data.getRunMode().equalsIgnoreCase("Yes") || data.getRunMode().equalsIgnoreCase("Y")) {
					fcubs.launchScreen(screenId);
					
					if (data.getNewdata().equalsIgnoreCase("Yes")) {

				
					fcubs.clickNew();
	
	
						fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__PRD", data.getProduct());
					fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__COUNTPRTY", data.getCustomernumber());
					fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__CURRENCY", data.getCurrency());
					fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__AMOUNTI", data.getAmount());
					fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__TRADEDTI", data.getTradedate());
					fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__VALDTI", data.getValuedate());
					fcubs.selectRadioBtn("MAT_TYPE", data.getMaturitytype());
					
					//==========================================Unlock=======================================
								
					/*if (data.getUnlock().equalsIgnoreCase("Yes")) {
					fcubs.clickUnlock();
					fcubs.clickButtonByXpath("//span[contains(text(),'Amendments')]");
					fcubs.populateTextById("BLK_LD_CONT_MAST__DATE_FIELD1I", data.getAmendmentdate());
					fcubs.populateTextById("BLK_LD_CONT_MAST__NEW_MATDTI", data.getMaturitydate());					
					}	
					*/
					//=================================Interest Tab===========================================
					
					if (data.getInteresttab().equalsIgnoreCase("Yes")) {
						fcubs.openChildScreenByTitle("Interest");
						try {
							fcubs.closeOverridePopUp();
						}catch(Exception e) {
							
						}
						
						fcubs.populateTextById("BLK_INTREST_DETAILS__RATEI", data.getRate());
						fcubs.closeChildScreen();
					}
					
					fcubs.clickButtonByXpath("//span[contains(text(),'Rollover')]");
					fcubs.selectRadioBtn("ROLLOVER_TYPE", data.getMode());
					fcubs.selectRadioBtn("SCHEDULE_DEFINITION_BASIS", data.getSchedulebasis());
					
					
					fcubs.clickButtonByXpath("//span[contains(text(),'Preferences')]");
					fcubs.selectFlag("BLK_MMVW_CONTRACT_MASTER__IGRHOLDYS", data.getIgnoreholiday());
					fcubs.selectRadioBtn("BLK_MMVW_CONTRACT_MASTER__SCHDMOVE", data.getMoveforward());
					fcubs.selectRadioBtn("BLK_MMVW_CONTRACT_MASTER__SCHDMOVE2", data.getMovebackward());


					
					fcubs.clickSave();
					
					
					try {
						fcubs.closeInfoPopUp();
						}
						catch(Exception ex) {
							System.out.println("No Remark popup exists");
						}
					
					
					try {
						fcubs.closeScreen();
						}
						catch(Exception ex) {
							System.out.println("No Remark popup exists");
						}
				
							
					
				}
					
					
//============================================Authorise Record=================================================
					
					if (data.getAuthorize().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__FCCREF", data.getContractrefnumber());

					//	fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__FCCREF", data.getAccountnumber());
						fcubs.clickExecuteQuery();
						
						try {
							fcubs.closeInfoPopUp();
						} catch (Exception e) {
								// TODO: handle exception
							System.out.println("No pop up exists");
						}

						fcubs.clickButtonByXpath("//a[contains(text(),'Authorize')]");
						fcubs.switchtosubscreensframe();
						fcubs.clickBtnAuthorisebtnMMDTRONL();
						fcubs.closeInfoPopUp();
						fcubs.closeScreen();
										
					}
					
							
					
					
					
					
					
					
					
					
					/*if (data.getUnlock().equalsIgnoreCase("Yes")) {
						fcubs.clickEnterQuery();
						fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__FCCREF", data.getContractrefnumber());
						fcubs.clickExecuteQuery();
						
						try {
							fcubs.closeInfoPopUp();
						} catch (Exception e) {
								// TODO: handle exception
							System.out.println("No pop up exists");
						}
						
						
						fcubs.clickButtonByXpath("//a[contains(text(),'Unlock')]");
						
						try {
							fcubs.closeInfoPopUp();
						} catch (Exception e) {
								// TODO: handle exception
							System.out.println("No pop up exists");
						}
						
						fcubs.populateTextById("BLK_MMVW_CONTRACT_MASTER__AMOUNTI", data.getAmount());
						fcubs.clickSave();
						
						try {
							fcubs.closeInfoPopUp();
							//fcubs.closeScreen();
							}
							catch (Exception ex){
								System.out.println("Record exists");
							}
						
						
						try {
							fcubs.closeScreen();
							}
							catch(Exception ex) {
								System.out.println("No Remark popup exists");
							}
												
					}*/
					
					/*try {
						fcubs.checkUIFormatError();
						}
						catch (Exception ex){
							System.out.println("Record exists");
						}*/
					
					
				
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
					//fcubs.closeScreen();

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
		for (MMDTRONL_Page data : resultList) {
			System.out.println(data.getTestCaseId() + "\t" + data.getTestCaseResult().replace("\n", ";"));
		}
	}


}
