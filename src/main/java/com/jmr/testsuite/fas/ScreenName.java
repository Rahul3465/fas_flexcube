package com.jmr.testsuite.fas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.jmr.testsuite.fas.page.st.DepositAccountBookingPage;

import io.github.millij.poi.ss.reader.XlsxReader;

@ContextConfiguration(classes = SpringConfiguration.class)
public class ScreenName extends AbstractTestNGSpringContextTests {

	@Autowired
	private FlexcubeCommon fcubs;
	@Autowired
	private XlsxReader xlsReader;
	private String errorMsg = "";
	/** function of the screen */
	private final String screenId = "STDCUSTD";
	/** screen title/name */
	private final String screenName = "Deposit Account Booking";

	private List<DepositAccountBookingPage> dataList;
	/** to save result of each test case */
	private List<DepositAccountBookingPage> resultList;
	/** use in example multi-entry input needed */
	private List<String> multiEntryElementIdText;
	/** use in example multi-entry input needed */
	private List<String> multiEntryElementValueText;
	/** use in example multi-entry input needed */
	private List<String> multiEntryElementType;
	private String testCaseId;

	@PostConstruct
	public void init() throws Exception {
		/** Initialize multi-entry object */
		multiEntryElementIdText = new ArrayList<>();
		multiEntryElementValueText = new ArrayList<>();
		multiEntryElementType = new ArrayList<>();

		/** setting details of screen id and screen name to framework */
		fcubs.setScreenDetails(screenId, screenName);
		/** to launch application */
		fcubs.launchApp();
		/** to load test data from Microsoft Excel File .xlsx format */
		dataList = xlsReader.read(DepositAccountBookingPage.class, new File(AppConfig.testFileLocation), 5);
		/** initialize result list object */
		resultList = new ArrayList<>();
	}

	@Test()
	public void executeTestCase() throws Exception {

		/** getting test data row by row for execution */
		for (DepositAccountBookingPage data : dataList) {

			/** launch FLEXCUBE screen */
			fcubs.launchScreen(screenId);

			/** action to perform after screen opened Eg. New */
			fcubs.clickNew();

			/**
			 * to input lov/text using id and input value. argument 1 - element id. argument
			 * 2 - element value
			 */
			fcubs.populateDateField("", "");

			/**
			 * to input date using id and input value. argument 1 - element id. argument 2 -
			 * element value
			 */
			fcubs.populateDateField("", "");

			/**
			 * to ON/OFF checkbox using id and input value. argument 1 - element id.
			 * argument 2 - element value allowed values Yes/Y and No/N
			 */
			fcubs.selectFlag("", "");

			/**
			 * to select radio button. argument 1 - html attribute name of field eg.
			 * <inputtype="radio" name="CTYPE" /> argument. argument 2 - label of the field
			 * eg.Individual
			 */
			fcubs.selectRadioBtn("", "");

			/**
			 * to select dropdown list argument 1 - element id. argument 2 - text available
			 * in dropdown list
			 */
			fcubs.selectDropdownByText("", "");

			/**
			 * to switch tab using the tab name availble in FLEXCUBE screen Eg.
			 */
			fcubs.switchTab("");

			/**
			 * to open any child screen found on FLEXCUBE Main Screen using child-screen
			 * Name Eg. Interest | Event Entry
			 */
			fcubs.openChildScreenByTitle("");

			/**
			 * to close child-screen after a child-screen opened
			 */
			fcubs.closeChildScreen();

			/**
			 * to input multi-entry data multiRowAddId - add button element id
			 * multiRowAddXpath - add button element xpath elementTypeList - list of element
			 * type eg. text,date,dropdown,radio button,checkbox elementIdList - list of
			 * element id elementValueList - list of element value
			 * 
			 * NOTE: use either add button id or xpath. kindly avoid pass both value
			 * 
			 * multiEntryElementType.add("text");
			 * multiEntryElementIdText.add("BLK_ACC_NOMINEES__NAM");
			 * multiEntryElementValueText.add(data.getName());
			 * 
			 */
			fcubs.MultiEntryFieldById("", "", null, null, null);

			/**
			 * clear the list used for passing element type, element id and element value
			 * before reusing it for another multi-entry block
			 */
			fcubs.clearMultiEntryList(multiEntryElementIdText, multiEntryElementValueText, multiEntryElementType);

			/**
			 * to close information message popup
			 */
			fcubs.closeInfoPopUp();

			/**
			 * to close confirmation message popup
			 */
			fcubs.closeConfirmaPopUp();

			/**
			 * to close Override message popup
			 */
			fcubs.closeOverridePopUp();

			/**
			 * to close remark message popup
			 */
			fcubs.closeRemarkPopUp();

			/**
			 * to close error message, take screenshot and return error message
			 * 
			 */
			fcubs.getAllErrorMsgAndClose("");

			/**
			 * only to close active main screen
			 */
			fcubs.closeScreen();

			/**
			 * to cancel any main screen opened without any
			 * Information/Confirmation/Override/Remark/Error Message popup and child-screen
			 * opened
			 * 
			 * @throws Exception
			 */
			fcubs.cancelMainScreen();

			/**
			 * to handle error message popup, screenshot and continue to next test case use the
			 * following
			 */
			errorMsg = fcubs.getAllErrorMsgAndClose(data.getTestCaseId());
			if (fcubs.validInput(errorMsg)) {
				System.out.println("Error Message  " + errorMsg);
				data.setTestCaseResult(errorMsg);
				resultList.add(data);
				continue;
			}
		}
	}

}
