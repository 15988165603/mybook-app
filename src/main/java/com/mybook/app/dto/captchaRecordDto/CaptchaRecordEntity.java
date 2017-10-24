package com.mybook.app.dto.captchaRecordDto;

import java.sql.Timestamp;

public class CaptchaRecordEntity {
	private Long id;
	private String createdAt;
	private Timestamp createdBy;
	private String updatedAt;
	private Timestamp updatedBy;
	private String verifCode;  //验证码

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Timestamp createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Timestamp getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Timestamp updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getVerifCode() {
		return verifCode;
	}

	public void setVerifCode(String verifCode) {
		this.verifCode = verifCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column captcha_record.id
	 *
	 * @return the value of captcha_record.id
	 *
	 * @mbggenerated Mon May 15 19:10:30 CST 2017
	 */

}