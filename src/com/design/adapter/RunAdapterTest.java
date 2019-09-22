package com.design.adapter;

public class RunAdapterTest {

	public static void main(String[] args) {
		
		 // Object for Xpay

		OldPaymentGateway oldpay = new OldGatewayImpl();

		oldpay.setCreditCardNo("4789565874102365");

		oldpay.setCustomerName("Max Warner");

		oldpay.setCardExpMonth("09");

		oldpay.setCardExpYear("25");

		oldpay.setCardCVVNo((short)235);

		oldpay.setAmount(2565.23);

		 
		NewPaymentGateway newPay = new OldToNewGatewayAdapter(oldpay);

		testPayD(newPay);

	}


	private static void testPayD(NewPaymentGateway newPay){

		System.out.println(newPay.getCardOwnerName());

		System.out.println(newPay.getCustCardNo());

		System.out.println(newPay.getCardExpMonthDate());

		System.out.println(newPay.getCVVNo());

		System.out.println(newPay.getTotalAmount());

	}

}

