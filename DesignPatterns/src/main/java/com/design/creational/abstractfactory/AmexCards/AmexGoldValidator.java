package com.design.creational.abstractfactory.AmexCards;

import com.design.creational.abstractfactory.CreditCard;
import com.design.creational.abstractfactory.Validator;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
