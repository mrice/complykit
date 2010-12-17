package com.complykit.demos.wagehour;

import java.util.Date;

public class Employee {
	//source: 29 CFR 516.2(a)(1)
	private String fullName;
	//source: 29 CFR 516.2(a)(2)
	private String homeAddress;
	//source: 29 CFR 516.2(a)(2)
	private String homeZip;
	//source: 29 CFR 516.2(a)(3)
	//condition: only if under age 20
	private Date dob;
	//source: 29 CFR 516.2(a)(1)
	private int sex;
	//source: 29 CFR 516.2(a)(1)
	private String occupation;
	//source: 29 CFR 516.2(a)(1)
	private int workWeekStartTime;
	//source: 29 CFR 516.2(a)(1)
	private int workWeekStartDay;
	//source: 29 CFR 516.2(a)(1)
	//calculated by rule
	private float regularHourlyRate;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getHomeZip() {
		return homeZip;
	}
	public void setHomeZip(String homeZip) {
		this.homeZip = homeZip;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getWorkWeekStartTime() {
		return workWeekStartTime;
	}
	public void setWorkWeekStartTime(int workWeekStartTime) {
		this.workWeekStartTime = workWeekStartTime;
	}
	public int getWorkWeekStartDay() {
		return workWeekStartDay;
	}
	public void setWorkWeekStartDay(int workWeekStartDay) {
		this.workWeekStartDay = workWeekStartDay;
	}
	public float getRegularHourlyRate() {
		return regularHourlyRate;
	}
	public void setRegularHourlyRate(float regularHourlyRate) {
		this.regularHourlyRate = regularHourlyRate;
	}
	
}
