package com.design.creational.abstractfactory;

import com.design.creational.abstractfactory.VisaCards.VisaBlackCreditCard;
import com.design.creational.abstractfactory.VisaCards.VisaGoldCreditCard;
import com.design.creational.abstractfactory.VisaCards.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
