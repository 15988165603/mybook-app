package com.mybook.app.dto.verifyRecordDto;

import com.mybook.app.core.BaseBean;

import java.sql.Timestamp;

//获取验证当日验证错误次数参数
public class VerifyRecordRequest extends BaseBean {

	private Timestamp startData;
	private Timestamp endData;
	private String userNo;

	public VerifyRecordRequest() {
	}

	public VerifyRecordRequest(Timestamp startData, Timestamp endData, String userNo) {
		super();
		this.startData = startData;
		this.endData = endData;
		this.userNo = userNo;
	}

	public Timestamp getStartData() {
		return startData;
	}

	public void setStartData(Timestamp startData) {
		this.startData = startData;
	}

	public Timestamp getEndData() {
		return endData;
	}

	public void setEndData(Timestamp endData) {
		this.endData = endData;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

}
