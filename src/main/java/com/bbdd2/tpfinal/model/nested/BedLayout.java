package com.bbdd2.tpfinal.model.nested;

/**
 * @author nahuel.barrena on 25/4/21
 */
public class BedLayout {

	private String code;
	private Long quantity;

	public BedLayout(){}

	public BedLayout(String code, Long quantity) {
		this.code = code;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
}

