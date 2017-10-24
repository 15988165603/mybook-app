package com.mybook.app.dto.verifyRecordDto;

import com.mybook.app.core.BaseEntity;

import java.sql.Timestamp;

public class VerifyRecordEntity extends BaseEntity {

    private String userNo;    //工号

    private Timestamp verifyData; // 验证时间

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Timestamp getVerifyData() {
        return verifyData;
    }

    public void setVerifyData(Timestamp verifyData) {
        this.verifyData = verifyData;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

}