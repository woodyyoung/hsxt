package com.gy.hsxt.gp.mapper.vo;

import java.util.Date;

public class TGpRetryPeriod {
	private Integer periodId;

	private String retryBusinessType;

	private String retryIntervals;

	private String crossDayEndTime;

	private Date createdDate;

	private Date updatedDate;

	public Integer getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	public String getRetryBusinessType() {
		return retryBusinessType;
	}

	public void setRetryBusinessType(String retryBusinessType) {
		this.retryBusinessType = retryBusinessType == null ? null
				: retryBusinessType.trim();
	}

	public String getRetryIntervals() {
		return retryIntervals;
	}

	public void setRetryIntervals(String retryIntervals) {
		this.retryIntervals = retryIntervals == null ? null : retryIntervals
				.trim();
	}

	public String getCrossDayEndTime() {
		return crossDayEndTime;
	}

	public void setCrossDayEndTime(String crossDayEndTime) {
		this.crossDayEndTime = crossDayEndTime;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}