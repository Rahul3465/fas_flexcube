package com.jmr.testsuite.fas.page.st;
import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "STDTDSIM")
public class STDTDSIM_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;

	@SheetColumn(value = "TDAccountNumber")
	private String fastpath;
	
	@SheetColumn(value = "TDCurrency")
	private String branch;
	
	@SheetColumn(value = "CustomerNumber1")
	private String customernumber1;
	
	@SheetColumn(value = "AccountClass")
	private String accountclas;
	
	@SheetColumn(value = "Compute")
	private String compute;
	
	@SheetColumn(value = "CreateDeposit")
	private String createdeposit;
	
	@SheetColumn(value = "TDAmount")
	private String tdamount;
		
	@SheetColumn(value = "DepositTenor_Years")
	private String deposittenoryears;
	
	@SheetColumn(value = "DepositTenor_Months")
	private String deposittenormonth;
	
	@SheetColumn(value = "DepositTenor_Days")
	private String deposittenordays;
	
	@SheetColumn(value = "AutoRollOver")
	private String autorollover;
	
	@SheetColumn(value = "CloseOnMaturity")
	private String closeonmaturity;

	@SheetColumn(value = "MoveInterestToUnclaimed")
	private String moveintresttounclaimed;
	
	@SheetColumn(value = "MovePrincipalToUnclaimed")
	private String moveprincipaltounclaimed;
	
	@SheetColumn(value = "Single")
	private String single;
	
	@SheetColumn(value = "Joint")
	private String joint;
	
	@SheetColumn(value = "ModeOfOperation")
	private String modeofoperation;
	
	@SheetColumn(value = "Principal")
	private String principal;
	
	@SheetColumn(value = "SpecialAmount")
	private String specialamount;
	
	@SheetColumn(value = "Interest")
	private String interest;
	
	@SheetColumn(value = "Principal+Interest")
	private String principalinterest;
	
	@SheetColumn(value = "RollOverAmount")
	private String rolloveramont;
		
	@SheetColumn(value = "AccountClassTenor")
	private String accountclasstenor;
	
	@SheetColumn(value = "AccountTenor")
	private String accounttenor;
	
	@SheetColumn(value = "IndependentTenor")
	private String independenttenor;
	
	@SheetColumn(value = "TDCurrency")
	private String tdcurrency;
	
	@SheetColumn(value = "TDYears")
	private String tdyears;
	
	@SheetColumn(value = "TDMonths")
	private String tdmonths;
	
	@SheetColumn(value = "TDDays")
	private String tddays;
	
	@SheetColumn(value = "TDPayInOption")
	private String tdpayinoption;
	
	@SheetColumn(value = "Percentage")
	private String percentage;
		
	@SheetColumn(value = "Amount")
	private String amount;
	
	@SheetColumn(value = "OffsetAccount")
	private String offsetaccount;
	
	@SheetColumn(value = "ChequeInstrumentnumber")
	private String chequeinstrumentnumber;
	
	@SheetColumn(value = "ClearingType")
	private String clearingtype;
	
	@SheetColumn(value = "ChequeDate")
	private String chequedate;
	
	@SheetColumn(value = "DraweeAccountNumber")
	private String draweeaccountnumber;
	
	@SheetColumn(value = "RoutingNumber")
	private String routingnumber;
	
	@SheetColumn(value = "PayOutType")
	private String payouttype;
	
	@SheetColumn(value = "PayoutPercentage")
	private String payoutpercentage;
		
	@SheetColumn(value = "Narrative1")
	private String narrative1;
	
	@SheetColumn(value = "PayoutComponent")
	private String payoutcomponent;
	
	
	@SheetColumn(value = "AutoPaymentTakeDown")
	private String autopaymenttakedown;
	
	@SheetColumn(value = "MoveMaturitesttoUnclaimed")
	private String movematuritesttounclaimed;
	
	@SheetColumn(value = "PaymentBranch")
	private String paymentbranch;
	
	@SheetColumn(value = "PaymentAccounts")
	private String paymentaccounts;
	
	@SheetColumn(value = "InstallmentAmount")
	private String installmentamount;
	
	@SheetColumn(value = "MoveFundsonOverdraft")
	private String movefundsoverdraft;
	
	@SheetColumn(value = "Days")
	private String days;
		
	@SheetColumn(value = "Months")
	private String months;
	
	@SheetColumn(value = "Years")
	private String years;
	
	@SheetColumn(value = "SweepType")
	private String sweeptype;
	
	@SheetColumn(value = "MasterAccount")
	private String masteraccounts;
	
	@SheetColumn(value = "AccountDescrption")
	private String accountdescrption;
	
	@SheetColumn(value = "CountryCode")
	private String countrycode;
	
	@SheetColumn(value = "AccountOpenDate")
	private String accountopendate;
	
	@SheetColumn(value = "AleternateAccountNumber")
	private String alternateaccountnumber;
	
	@SheetColumn(value = "ClearingBankCode")
	private String clearingbankcode;
		
	@SheetColumn(value = "Address")
	private String address;
	
	@SheetColumn(value = "Location")
	private String location;
	
	
	@SheetColumn(value = "Media")
	private String media;
	
	@SheetColumn(value = "Name")
	private String name;
	
	@SheetColumn(value = "DateOfBirth")
	private String dateofbirth;
	
	@SheetColumn(value = "RelationShip1")
	private String relationship1;
	
	@SheetColumn(value = "Address1")
	private String address1;
	
	@SheetColumn(value = "GuardianName")
	private String guardianname;
	
	@SheetColumn(value = "RelationShip")
	private String relationship;
		
	@SheetColumn(value = "Minor")
	private String minor;
	
	@SheetColumn(value = "CustomerNumber2")
	private String customernumber2;
	
	@SheetColumn(value = "JointHolderType")
	private String jointholdertype;
	
	@SheetColumn(value = "StartDate")
	private String starydate;
	
	@SheetColumn(value = "EndDate")
	private String enddate;
	
	@SheetColumn(value = "TermDepositTab")
	private String termdeposittab;
	
	@SheetColumn(value = "BankChequetab")
	private String bankchequetab;
	
	@SheetColumn(value = "PCTab")
	private String pctab;
	
	@SheetColumn(value = "Customernumber")
	private String customernumber;
		
	@SheetColumn(value = "DefaultFrom")
	private String defaultfrom;
	
	@SheetColumn(value = "AccountClass")
	private String accountclass;
	
	@SheetColumn(value = "Populate")
	private String populate;
	
	@SheetColumn(value = "BankCode")
	private String bankcode;
	
	@SheetColumn(value = "PayableBranch")
	private String payablebranch;
	
	@SheetColumn(value = "Benificiary")
	private String benificiary;
	
	@SheetColumn(value = "Passport/ICNumber")
	private String passportICNumbewr;
	
	@SheetColumn(value = "Narrative2")
	private String narrative2;
	
	@SheetColumn(value = "BeneficiaryAddress")
	private String beneficiaryAddress;
		
	@SheetColumn(value = "CounterPartyBankCode")
	private String counterpartybankcode;
	
	@SheetColumn(value = "CounterPartyAccount")
	private String counterpartyaccount;
	
	@SheetColumn(value = "BeneficairyName")
	private String beneficairyname;
	
	@SheetColumn(value = "Passport")
	private String passport;
	
	@SheetColumn(value = "Narrative3")
	private String narrative3;
	
	@SheetColumn(value = "BeneficiaryAddress")
	private String beneficairyaddress;
	
	@SheetColumn(value = "UDERate")
	private String uderate;
	
	@SheetColumn(value = "InterestBookingAddress")
	private String interestbookingaddress;
	
	@SheetColumn(value = "EffectiveDate")
	private String effectivedate;
		
	@SheetColumn(value = "Waive")
	private String waive;
	
	@SheetColumn(value = "PoolCode")
	private String poolcode;
	
	
	
	
	
	
	
	
	
	

}
