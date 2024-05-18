package com.oopssinsa.model.dto;

// 작업자는 본인의 ID로 입고지시 테이블을 조회한다
// locationId를 통해 브랜드와 카테고리를 알 수 있다

import java.time.LocalDate;

public class IbInstructionDto {

    private long ibId;
    private LocalDate manufactureID;
    private long productId;
    private String workerId;
    private int locationId;

    public IbInstructionDto(long ibId, LocalDate manufactureID, long productId, String workerId, int locationId) {
        this.ibId = ibId;
        this.manufactureID = manufactureID;
        this.productId = productId;
        this.workerId = workerId;
        this.locationId = locationId;
    }

    public long getIbId() {
        return ibId;
    }

    public void setIbId(long ibId) {
        this.ibId = ibId;
    }

    public LocalDate getManufactureID() {
        return manufactureID;
    }

    public void setManufactureID(LocalDate manufactureID) {
        this.manufactureID = manufactureID;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}