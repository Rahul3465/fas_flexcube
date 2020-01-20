package com.jmr.testsuite.fas.page.sms;

import org.springframework.stereotype.Component;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
@Component
@Sheet(value = "SMSJOBBR")
public class SMSJOBBR_Page {
	
private String testCaseResult;
	
	@SheetColumn(value = "Test Case Id")
	private String testCaseId;
	
	@SheetColumn(value = "RunMode")
	private String runMode;
	
	@SheetColumn(value = "Fastpath")
	private String fastpath;
	
	@SheetColumn(value = "JobName")
	private String jobname;
	
	@SheetColumn(value = "State")
	private String state;

	@SheetColumn(value = "Scheduler")
	private String scheduler;
	
	@SheetColumn(value = "JobGroup")
	private String jobgropu;
	
	@SheetColumn(value = "NextFireTime")
	private String nextfiretime;

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

	public String getFastpath() {
		return fastpath;
	}

	public void setFastpath(String fastpath) {
		this.fastpath = fastpath;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getScheduler() {
		return scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getJobgropu() {
		return jobgropu;
	}

	public void setJobgropu(String jobgropu) {
		this.jobgropu = jobgropu;
	}

	public String getNextfiretime() {
		return nextfiretime;
	}

	public void setNextfiretime(String nextfiretime) {
		this.nextfiretime = nextfiretime;
	}

	@Override
	public String toString() {
		return "SMSJOBBR_Page [testCaseResult=" + testCaseResult + ", testCaseId=" + testCaseId + ", runMode=" + runMode
				+ ", fastpath=" + fastpath + ", jobname=" + jobname + ", state=" + state + ", scheduler=" + scheduler
				+ ", jobgropu=" + jobgropu + ", nextfiretime=" + nextfiretime + "]";
	}
	
	

}
