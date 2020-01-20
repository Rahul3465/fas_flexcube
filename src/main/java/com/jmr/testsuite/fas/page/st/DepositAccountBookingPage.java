package com.jmr.testsuite.fas.page.st;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Component
@Sheet("STDCUSTD")
public class DepositAccountBookingPage {

	private String testCaseResult;
	@SheetColumn("Test Case Id")
	private String testCaseId;
	@SheetColumn("Term Deposit Currency")
	private String termDepositCurrency;
	@SheetColumn("Customer No")
	private String customerNo;
	@SheetColumn("Account Class")
	private String accountClass;
	@SheetColumn("Term Deposit Amount")
	private String termDepositAmount;
	@SheetColumn("Deposit Tenor Year")
	private String depositTenorYear;
	@SheetColumn("Deposit Tenor Month")
	private String depositTenorMonth;
	@SheetColumn("Deposit Tenor Days")
	private String depositTenorDays;
	@SheetColumn("Auto Rollover")
	private String autoRollover;
	@SheetColumn("Close on Maturity")
	private String closeonMaturity;
	@SheetColumn("Move Interest to Unclaimed")
	private String moveInteresttoUnclaimed;
	@SheetColumn("Move Principal to Unclaimed")
	private String movePrincipaltoUnclaimed;
	@SheetColumn("Account Type")
	private String accountType;
	@SheetColumn("Mode of Operation")
	private String modeofOperation;
	@SheetColumn("Rollover Type")
	private String rolloverType;
	@SheetColumn("Rollover Amount")
	private String rolloverAmount;
	@SheetColumn("Rollover Tenor")
	private String rolloverTenor;
	@SheetColumn("Rollover Tenor Years")
	private String rolloverTenorYears;
	@SheetColumn("Rollover Tenor Months")
	private String rolloverTenorMonths;
	@SheetColumn("Rollover Tenor Days")
	private String rolloverTenorDays;
	@SheetColumn("Term Deposit Pay In Option")
	private String termDepositPayInOption;
	@SheetColumn("Payin Percentage")
	private String payinPercentage;
	@SheetColumn("Payin Amount")
	private String payinAmount;
	@SheetColumn("Payin Branch")
	private String payinBranch;
	@SheetColumn("Payin Offset Account")
	private String payinOffsetAccount;
	@SheetColumn("Payin Cheque Instrument No ")
	private String payinChequeInstrumentNo;
	@SheetColumn("Payin Clearing Type")
	private String payinClearingType;
	@SheetColumn("Payin Cheque Date")
	private String payinChequeDate;
	@SheetColumn("Payin Drawee Account Number")
	private String payinDraweeAccountNumber;
	@SheetColumn("Payin Routing No")
	private String payinRoutingNo;
	@SheetColumn("Payout Type")
	private String payoutType;
	@SheetColumn("Payout Percentage")
	private String payoutPercentage;
	@SheetColumn("Payout Branch")
	private String payoutBranch;
	@SheetColumn("Payout Offset Account")
	private String payoutOffsetAccount;
	@SheetColumn("Payout Narrative")
	private String payoutNarrative;
	@SheetColumn("Payout Component ")
	private String payoutComponent;
	@SheetColumn("Auto Payment Takedown")
	private String autoPaymentTakedown;
	@SheetColumn("Move Maturities to Unclaimed")
	private String moveMaturitiestoUnclaimed;
	@SheetColumn("Payment Branch")
	private String paymentBranch;
	@SheetColumn("Payment Accounts")
	private String paymentAccounts;
	@SheetColumn("Instalment Amount")
	private String instalmentAmount;
	@SheetColumn("Move funds on Overdraft")
	private String movefundsonOverdraft;
	@SheetColumn("Installment Frequency Days")
	private String installmentFrequencyDays;
	@SheetColumn("Installment Frequency Months")
	private String installmentFrequencyMonths;
	@SheetColumn("Installment Frequency Years")
	private String installmentFrequencyYears;
	@SheetColumn("Sweep Type")
	private String sweepType;
	@SheetColumn("Master Account Number")
	private String masterAccountNumber;
	@SheetColumn("Account Description")
	private String accountDescription;
	@SheetColumn("Country Code")
	private String countryCode;
	@SheetColumn("Account Open Date")
	private String accountOpenDate;
	@SheetColumn("Alternate Account Number")
	private String alternateAccountNumber;
	@SheetColumn("Clearing Bank Code")
	private String clearingBankCode;
	@SheetColumn("Address")
	private String address;
	@SheetColumn("Location")
	private String location;
	@SheetColumn("Media")
	private String media;
	@SheetColumn("Name")
	private String name;
	@SheetColumn("DOB")
	private String dOB;
	@SheetColumn("Relationship")
	private String relationship;
	@SheetColumn("Address 1")
	private String address1;
	@SheetColumn("Guardian Name")
	private String guardianName;
	@SheetColumn("Guardian Relationship")
	private String guardianRelationship;
	@SheetColumn("Minor")
	private String minor;
	@SheetColumn("Joint Holder Customer No")
	private String jointHolderCustomerNo;
	@SheetColumn("Joint Holder Type")
	private String jointHolderType;
	@SheetColumn("Start Date ")
	private String startDate;
	@SheetColumn("End Date ")
	private String endDate;
	@SheetColumn("TD Payout Detail - Term Deposit  - Customer No")
	private String tDPayoutDetailTermDepositCustomerNo;
	@SheetColumn("Default From ")
	private String defaultFrom;
	@SheetColumn("TD Payout Detail - Term Deposit  - Account Class")
	private String tDPayoutDetailTermDepositAccountClass;
	@SheetColumn("TD Payout Detail - Term Deposit  - Populate")
	private String tDPayoutDetailTermDepositPopulate;
	@SheetColumn("Bank Code")
	private String bankCode;
	@SheetColumn("Payable Branch")
	private String payableBranch;
	@SheetColumn("Beneficiary ")
	private String beneficiary;
	@SheetColumn("Passport/IC Number")
	private String passportICNumber;
	@SheetColumn("Banker Cheque Narrative")
	private String bankerChequeNarrative;
	@SheetColumn("Banker Cheque Beneficiary Address")
	private String bankerChequeBeneficiaryAddress;
	@SheetColumn("Counterparty Bank code")
	private String counterpartyBankcode;
	@SheetColumn("Counterparty Account")
	private String counterpartyAccount;
	@SheetColumn("Beneficiary Name")
	private String beneficiaryName;
	@SheetColumn("Passport")
	private String passport;
	@SheetColumn("Narrative")
	private String narrative;
	@SheetColumn("Beneficiary Address")
	private String beneficiaryAddress;
	@SheetColumn("UDE rate")
	private String uDErate;
	@SheetColumn("InterestBooking Account ")
	private String interestBookingAccount;
	@SheetColumn("Effective date")
	private String effectivedate;
	@SheetColumn("Waive")
	private String waive;
	@SheetColumn("Pool Code")
	private String poolCode;
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
	public String getTermDepositCurrency() {
		return termDepositCurrency;
	}
	public void setTermDepositCurrency(String termDepositCurrency) {
		this.termDepositCurrency = termDepositCurrency;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getAccountClass() {
		return accountClass;
	}
	public void setAccountClass(String accountClass) {
		this.accountClass = accountClass;
	}
	public String getTermDepositAmount() {
		return termDepositAmount;
	}
	public void setTermDepositAmount(String termDepositAmount) {
		this.termDepositAmount = termDepositAmount;
	}
	public String getDepositTenorYear() {
		return depositTenorYear;
	}
	public void setDepositTenorYear(String depositTenorYear) {
		this.depositTenorYear = depositTenorYear;
	}
	public String getDepositTenorMonth() {
		return depositTenorMonth;
	}
	public void setDepositTenorMonth(String depositTenorMonth) {
		this.depositTenorMonth = depositTenorMonth;
	}
	public String getDepositTenorDays() {
		return depositTenorDays;
	}
	public void setDepositTenorDays(String depositTenorDays) {
		this.depositTenorDays = depositTenorDays;
	}
	public String getAutoRollover() {
		return autoRollover;
	}
	public void setAutoRollover(String autoRollover) {
		this.autoRollover = autoRollover;
	}
	public String getCloseonMaturity() {
		return closeonMaturity;
	}
	public void setCloseonMaturity(String closeonMaturity) {
		this.closeonMaturity = closeonMaturity;
	}
	public String getMoveInteresttoUnclaimed() {
		return moveInteresttoUnclaimed;
	}
	public void setMoveInteresttoUnclaimed(String moveInteresttoUnclaimed) {
		this.moveInteresttoUnclaimed = moveInteresttoUnclaimed;
	}
	public String getMovePrincipaltoUnclaimed() {
		return movePrincipaltoUnclaimed;
	}
	public void setMovePrincipaltoUnclaimed(String movePrincipaltoUnclaimed) {
		this.movePrincipaltoUnclaimed = movePrincipaltoUnclaimed;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getModeofOperation() {
		return modeofOperation;
	}
	public void setModeofOperation(String modeofOperation) {
		this.modeofOperation = modeofOperation;
	}
	public String getRolloverType() {
		return rolloverType;
	}
	public void setRolloverType(String rolloverType) {
		this.rolloverType = rolloverType;
	}
	public String getRolloverAmount() {
		return rolloverAmount;
	}
	public void setRolloverAmount(String rolloverAmount) {
		this.rolloverAmount = rolloverAmount;
	}
	public String getRolloverTenor() {
		return rolloverTenor;
	}
	public void setRolloverTenor(String rolloverTenor) {
		this.rolloverTenor = rolloverTenor;
	}
	public String getRolloverTenorYears() {
		return rolloverTenorYears;
	}
	public void setRolloverTenorYears(String rolloverTenorYears) {
		this.rolloverTenorYears = rolloverTenorYears;
	}
	public String getRolloverTenorMonths() {
		return rolloverTenorMonths;
	}
	public void setRolloverTenorMonths(String rolloverTenorMonths) {
		this.rolloverTenorMonths = rolloverTenorMonths;
	}
	public String getRolloverTenorDays() {
		return rolloverTenorDays;
	}
	public void setRolloverTenorDays(String rolloverTenorDays) {
		this.rolloverTenorDays = rolloverTenorDays;
	}
	public String getTermDepositPayInOption() {
		return termDepositPayInOption;
	}
	public void setTermDepositPayInOption(String termDepositPayInOption) {
		this.termDepositPayInOption = termDepositPayInOption;
	}
	public String getPayinPercentage() {
		return payinPercentage;
	}
	public void setPayinPercentage(String payinPercentage) {
		this.payinPercentage = payinPercentage;
	}
	public String getPayinAmount() {
		return payinAmount;
	}
	public void setPayinAmount(String payinAmount) {
		this.payinAmount = payinAmount;
	}
	public String getPayinBranch() {
		return payinBranch;
	}
	public void setPayinBranch(String payinBranch) {
		this.payinBranch = payinBranch;
	}
	public String getPayinOffsetAccount() {
		return payinOffsetAccount;
	}
	public void setPayinOffsetAccount(String payinOffsetAccount) {
		this.payinOffsetAccount = payinOffsetAccount;
	}
	public String getPayinChequeInstrumentNo() {
		return payinChequeInstrumentNo;
	}
	public void setPayinChequeInstrumentNo(String payinChequeInstrumentNo) {
		this.payinChequeInstrumentNo = payinChequeInstrumentNo;
	}
	public String getPayinClearingType() {
		return payinClearingType;
	}
	public void setPayinClearingType(String payinClearingType) {
		this.payinClearingType = payinClearingType;
	}
	public String getPayinChequeDate() {
		return payinChequeDate;
	}
	public void setPayinChequeDate(String payinChequeDate) {
		this.payinChequeDate = payinChequeDate;
	}
	public String getPayinDraweeAccountNumber() {
		return payinDraweeAccountNumber;
	}
	public void setPayinDraweeAccountNumber(String payinDraweeAccountNumber) {
		this.payinDraweeAccountNumber = payinDraweeAccountNumber;
	}
	public String getPayinRoutingNo() {
		return payinRoutingNo;
	}
	public void setPayinRoutingNo(String payinRoutingNo) {
		this.payinRoutingNo = payinRoutingNo;
	}
	public String getPayoutType() {
		return payoutType;
	}
	public void setPayoutType(String payoutType) {
		this.payoutType = payoutType;
	}
	public String getPayoutPercentage() {
		return payoutPercentage;
	}
	public void setPayoutPercentage(String payoutPercentage) {
		this.payoutPercentage = payoutPercentage;
	}
	public String getPayoutBranch() {
		return payoutBranch;
	}
	public void setPayoutBranch(String payoutBranch) {
		this.payoutBranch = payoutBranch;
	}
	public String getPayoutOffsetAccount() {
		return payoutOffsetAccount;
	}
	public void setPayoutOffsetAccount(String payoutOffsetAccount) {
		this.payoutOffsetAccount = payoutOffsetAccount;
	}
	public String getPayoutNarrative() {
		return payoutNarrative;
	}
	public void setPayoutNarrative(String payoutNarrative) {
		this.payoutNarrative = payoutNarrative;
	}
	public String getPayoutComponent() {
		return payoutComponent;
	}
	public void setPayoutComponent(String payoutComponent) {
		this.payoutComponent = payoutComponent;
	}
	public String getAutoPaymentTakedown() {
		return autoPaymentTakedown;
	}
	public void setAutoPaymentTakedown(String autoPaymentTakedown) {
		this.autoPaymentTakedown = autoPaymentTakedown;
	}
	public String getMoveMaturitiestoUnclaimed() {
		return moveMaturitiestoUnclaimed;
	}
	public void setMoveMaturitiestoUnclaimed(String moveMaturitiestoUnclaimed) {
		this.moveMaturitiestoUnclaimed = moveMaturitiestoUnclaimed;
	}
	public String getPaymentBranch() {
		return paymentBranch;
	}
	public void setPaymentBranch(String paymentBranch) {
		this.paymentBranch = paymentBranch;
	}
	public String getPaymentAccounts() {
		return paymentAccounts;
	}
	public void setPaymentAccounts(String paymentAccounts) {
		this.paymentAccounts = paymentAccounts;
	}
	public String getInstalmentAmount() {
		return instalmentAmount;
	}
	public void setInstalmentAmount(String instalmentAmount) {
		this.instalmentAmount = instalmentAmount;
	}
	public String getMovefundsonOverdraft() {
		return movefundsonOverdraft;
	}
	public void setMovefundsonOverdraft(String movefundsonOverdraft) {
		this.movefundsonOverdraft = movefundsonOverdraft;
	}
	public String getInstallmentFrequencyDays() {
		return installmentFrequencyDays;
	}
	public void setInstallmentFrequencyDays(String installmentFrequencyDays) {
		this.installmentFrequencyDays = installmentFrequencyDays;
	}
	public String getInstallmentFrequencyMonths() {
		return installmentFrequencyMonths;
	}
	public void setInstallmentFrequencyMonths(String installmentFrequencyMonths) {
		this.installmentFrequencyMonths = installmentFrequencyMonths;
	}
	public String getInstallmentFrequencyYears() {
		return installmentFrequencyYears;
	}
	public void setInstallmentFrequencyYears(String installmentFrequencyYears) {
		this.installmentFrequencyYears = installmentFrequencyYears;
	}
	public String getSweepType() {
		return sweepType;
	}
	public void setSweepType(String sweepType) {
		this.sweepType = sweepType;
	}
	public String getMasterAccountNumber() {
		return masterAccountNumber;
	}
	public void setMasterAccountNumber(String masterAccountNumber) {
		this.masterAccountNumber = masterAccountNumber;
	}
	public String getAccountDescription() {
		return accountDescription;
	}
	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(String accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getAlternateAccountNumber() {
		return alternateAccountNumber;
	}
	public void setAlternateAccountNumber(String alternateAccountNumber) {
		this.alternateAccountNumber = alternateAccountNumber;
	}
	public String getClearingBankCode() {
		return clearingBankCode;
	}
	public void setClearingBankCode(String clearingBankCode) {
		this.clearingBankCode = clearingBankCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
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
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianRelationship() {
		return guardianRelationship;
	}
	public void setGuardianRelationship(String guardianRelationship) {
		this.guardianRelationship = guardianRelationship;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public String getJointHolderCustomerNo() {
		return jointHolderCustomerNo;
	}
	public void setJointHolderCustomerNo(String jointHolderCustomerNo) {
		this.jointHolderCustomerNo = jointHolderCustomerNo;
	}
	public String getJointHolderType() {
		return jointHolderType;
	}
	public void setJointHolderType(String jointHolderType) {
		this.jointHolderType = jointHolderType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String gettDPayoutDetailTermDepositCustomerNo() {
		return tDPayoutDetailTermDepositCustomerNo;
	}
	public void settDPayoutDetailTermDepositCustomerNo(String tDPayoutDetailTermDepositCustomerNo) {
		this.tDPayoutDetailTermDepositCustomerNo = tDPayoutDetailTermDepositCustomerNo;
	}
	public String getDefaultFrom() {
		return defaultFrom;
	}
	public void setDefaultFrom(String defaultFrom) {
		this.defaultFrom = defaultFrom;
	}
	public String gettDPayoutDetailTermDepositAccountClass() {
		return tDPayoutDetailTermDepositAccountClass;
	}
	public void settDPayoutDetailTermDepositAccountClass(String tDPayoutDetailTermDepositAccountClass) {
		this.tDPayoutDetailTermDepositAccountClass = tDPayoutDetailTermDepositAccountClass;
	}
	public String gettDPayoutDetailTermDepositPopulate() {
		return tDPayoutDetailTermDepositPopulate;
	}
	public void settDPayoutDetailTermDepositPopulate(String tDPayoutDetailTermDepositPopulate) {
		this.tDPayoutDetailTermDepositPopulate = tDPayoutDetailTermDepositPopulate;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getPayableBranch() {
		return payableBranch;
	}
	public void setPayableBranch(String payableBranch) {
		this.payableBranch = payableBranch;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
	public String getPassportICNumber() {
		return passportICNumber;
	}
	public void setPassportICNumber(String passportICNumber) {
		this.passportICNumber = passportICNumber;
	}
	public String getBankerChequeNarrative() {
		return bankerChequeNarrative;
	}
	public void setBankerChequeNarrative(String bankerChequeNarrative) {
		this.bankerChequeNarrative = bankerChequeNarrative;
	}
	public String getBankerChequeBeneficiaryAddress() {
		return bankerChequeBeneficiaryAddress;
	}
	public void setBankerChequeBeneficiaryAddress(String bankerChequeBeneficiaryAddress) {
		this.bankerChequeBeneficiaryAddress = bankerChequeBeneficiaryAddress;
	}
	public String getCounterpartyBankcode() {
		return counterpartyBankcode;
	}
	public void setCounterpartyBankcode(String counterpartyBankcode) {
		this.counterpartyBankcode = counterpartyBankcode;
	}
	public String getCounterpartyAccount() {
		return counterpartyAccount;
	}
	public void setCounterpartyAccount(String counterpartyAccount) {
		this.counterpartyAccount = counterpartyAccount;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	public String getBeneficiaryAddress() {
		return beneficiaryAddress;
	}
	public void setBeneficiaryAddress(String beneficiaryAddress) {
		this.beneficiaryAddress = beneficiaryAddress;
	}
	public String getuDErate() {
		return uDErate;
	}
	public void setuDErate(String uDErate) {
		this.uDErate = uDErate;
	}
	public String getInterestBookingAccount() {
		return interestBookingAccount;
	}
	public void setInterestBookingAccount(String interestBookingAccount) {
		this.interestBookingAccount = interestBookingAccount;
	}
	public String getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}
	public String getWaive() {
		return waive;
	}
	public void setWaive(String waive) {
		this.waive = waive;
	}
	public String getPoolCode() {
		return poolCode;
	}
	public void setPoolCode(String poolCode) {
		this.poolCode = poolCode;
	}
	@Override
	public String toString() {
		return "DepositAccountBookingPage [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId
				+ ", termDepositCurrency=" + termDepositCurrency + ", customerNo=" + customerNo + ", accountClass="
				+ accountClass + ", termDepositAmount=" + termDepositAmount + ", depositTenorYear=" + depositTenorYear
				+ ", depositTenorMonth=" + depositTenorMonth + ", depositTenorDays=" + depositTenorDays
				+ ", autoRollover=" + autoRollover + ", closeonMaturity=" + closeonMaturity
				+ ", moveInteresttoUnclaimed=" + moveInteresttoUnclaimed + ", movePrincipaltoUnclaimed="
				+ movePrincipaltoUnclaimed + ", accountType=" + accountType + ", modeofOperation=" + modeofOperation
				+ ", rolloverType=" + rolloverType + ", rolloverAmount=" + rolloverAmount + ", rolloverTenor="
				+ rolloverTenor + ", rolloverTenorYears=" + rolloverTenorYears + ", rolloverTenorMonths="
				+ rolloverTenorMonths + ", rolloverTenorDays=" + rolloverTenorDays + ", termDepositPayInOption="
				+ termDepositPayInOption + ", payinPercentage=" + payinPercentage + ", payinAmount=" + payinAmount
				+ ", payinBranch=" + payinBranch + ", payinOffsetAccount=" + payinOffsetAccount
				+ ", payinChequeInstrumentNo=" + payinChequeInstrumentNo + ", payinClearingType=" + payinClearingType
				+ ", payinChequeDate=" + payinChequeDate + ", payinDraweeAccountNumber=" + payinDraweeAccountNumber
				+ ", payinRoutingNo=" + payinRoutingNo + ", payoutType=" + payoutType + ", payoutPercentage="
				+ payoutPercentage + ", payoutBranch=" + payoutBranch + ", payoutOffsetAccount=" + payoutOffsetAccount
				+ ", payoutNarrative=" + payoutNarrative + ", payoutComponent=" + payoutComponent
				+ ", autoPaymentTakedown=" + autoPaymentTakedown + ", moveMaturitiestoUnclaimed="
				+ moveMaturitiestoUnclaimed + ", paymentBranch=" + paymentBranch + ", paymentAccounts="
				+ paymentAccounts + ", instalmentAmount=" + instalmentAmount + ", movefundsonOverdraft="
				+ movefundsonOverdraft + ", installmentFrequencyDays=" + installmentFrequencyDays
				+ ", installmentFrequencyMonths=" + installmentFrequencyMonths + ", installmentFrequencyYears="
				+ installmentFrequencyYears + ", sweepType=" + sweepType + ", masterAccountNumber="
				+ masterAccountNumber + ", accountDescription=" + accountDescription + ", countryCode=" + countryCode
				+ ", accountOpenDate=" + accountOpenDate + ", alternateAccountNumber=" + alternateAccountNumber
				+ ", clearingBankCode=" + clearingBankCode + ", address=" + address + ", location=" + location
				+ ", media=" + media + ", name=" + name + ", dOB=" + dOB + ", relationship=" + relationship
				+ ", address1=" + address1 + ", guardianName=" + guardianName + ", guardianRelationship="
				+ guardianRelationship + ", minor=" + minor + ", jointHolderCustomerNo=" + jointHolderCustomerNo
				+ ", jointHolderType=" + jointHolderType + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", tDPayoutDetailTermDepositCustomerNo=" + tDPayoutDetailTermDepositCustomerNo + ", defaultFrom="
				+ defaultFrom + ", tDPayoutDetailTermDepositAccountClass=" + tDPayoutDetailTermDepositAccountClass
				+ ", tDPayoutDetailTermDepositPopulate=" + tDPayoutDetailTermDepositPopulate + ", bankCode=" + bankCode
				+ ", payableBranch=" + payableBranch + ", beneficiary=" + beneficiary + ", passportICNumber="
				+ passportICNumber + ", bankerChequeNarrative=" + bankerChequeNarrative
				+ ", bankerChequeBeneficiaryAddress=" + bankerChequeBeneficiaryAddress + ", counterpartyBankcode="
				+ counterpartyBankcode + ", counterpartyAccount=" + counterpartyAccount + ", beneficiaryName="
				+ beneficiaryName + ", passport=" + passport + ", narrative=" + narrative + ", beneficiaryAddress="
				+ beneficiaryAddress + ", uDErate=" + uDErate + ", interestBookingAccount=" + interestBookingAccount
				+ ", effectivedate=" + effectivedate + ", waive=" + waive + ", poolCode=" + poolCode + "]";
	}
	
}
