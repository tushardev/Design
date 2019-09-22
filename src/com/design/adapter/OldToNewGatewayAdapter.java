package com.design.adapter;

public class OldToNewGatewayAdapter implements NewPaymentGateway {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;

	/* Adapter will have reference of old gateway */
	OldPaymentGateway oldGateway;
	
	
	public OldToNewGatewayAdapter(OldPaymentGateway oldGateway) {
		this.oldGateway = oldGateway;
		setProperties();
	}
	
	
	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;

	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;

	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;

	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;

	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;

	}
	
	private void setProperties() {
		setCustCardNo(this.oldGateway.getCreditCardNo());
		setCardOwnerName(this.oldGateway.getCustomerName());
		setCardExpMonthDate(this.oldGateway.getCardExpMonth() + "/" + this.oldGateway.getCardExpYear());
		setCVVNo(this.oldGateway.getCardCVVNo().intValue());
		setTotalAmount(this.oldGateway.getAmount());
		
	}

}
