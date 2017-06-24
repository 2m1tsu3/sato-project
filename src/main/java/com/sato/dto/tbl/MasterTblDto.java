package com.sato.dto.tbl;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MasterTblDto {
	private String id;
	private int tax;
	private LocalDate useStart;
	private LocalDate useEnd;
	private String name;
	private String size;
	private String unit;
	private String detailDivision;
	private String wood;
	private String steel;
	private String judgeFlag;
	private String integrityDivision;
	private String removalDivision;
	private String pipeDivision;
	private String materialDivision;
	private boolean firstFlag;
	private boolean secondFlag;
	private boolean thirdFlag;
	private boolean fourceFlag;
	private boolean fifthFlag;
	private int laborCost;
	private int materialCost;
	private int updateCount;
	private LocalDateTime lastUpdate;
	private String updateUser;
	private String other;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public LocalDate getUseStart() {
		return useStart;
	}
	public void setUseStart(LocalDate useStart) {
		this.useStart = useStart;
	}
	public LocalDate getUseEnd() {
		return useEnd;
	}
	public void setUseEnd(LocalDate useEnd) {
		this.useEnd = useEnd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDetailDivision() {
		return detailDivision;
	}
	public void setDetailDivision(String detailDivision) {
		this.detailDivision = detailDivision;
	}
	public String getWood() {
		return wood;
	}
	public void setWood(String wood) {
		this.wood = wood;
	}
	public String getSteel() {
		return steel;
	}
	public void setSteel(String steel) {
		this.steel = steel;
	}
	public String getJudgeFlag() {
		return judgeFlag;
	}
	public void setJudgeFlag(String judgeFlag) {
		this.judgeFlag = judgeFlag;
	}
	public String getIntegrityDivision() {
		return integrityDivision;
	}
	public void setIntegrityDivision(String integrityDivision) {
		this.integrityDivision = integrityDivision;
	}
	public String getRemovalDivision() {
		return removalDivision;
	}
	public void setRemovalDivision(String removalDivision) {
		this.removalDivision = removalDivision;
	}
	public String getPipeDivision() {
		return pipeDivision;
	}
	public void setPipeDivision(String pipeDivision) {
		this.pipeDivision = pipeDivision;
	}
	public String getMaterialDivision() {
		return materialDivision;
	}
	public void setMaterialDivision(String materialDivision) {
		this.materialDivision = materialDivision;
	}
	public boolean isFirstFlag() {
		return firstFlag;
	}
	public void setFirstFlag(boolean firstFlag) {
		this.firstFlag = firstFlag;
	}
	public boolean isSecondFlag() {
		return secondFlag;
	}
	public void setSecondFlag(boolean secondFlag) {
		this.secondFlag = secondFlag;
	}
	public boolean isThirdFlag() {
		return thirdFlag;
	}
	public void setThirdFlag(boolean thirdFlag) {
		this.thirdFlag = thirdFlag;
	}
	public boolean isFourceFlag() {
		return fourceFlag;
	}
	public void setFourceFlag(boolean fourceFlag) {
		this.fourceFlag = fourceFlag;
	}
	public boolean isFifthFlag() {
		return fifthFlag;
	}
	public void setFifthFlag(boolean fifthFlag) {
		this.fifthFlag = fifthFlag;
	}
	public int getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(int laborCost) {
		this.laborCost = laborCost;
	}
	public int getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(int materialCost) {
		this.materialCost = materialCost;
	}
	public int getUpdateCount() {
		return updateCount;
	}
	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
}