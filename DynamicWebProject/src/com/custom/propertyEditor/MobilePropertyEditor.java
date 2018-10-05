package com.custom.propertyEditor;

import java.beans.PropertyEditorSupport;

public class MobilePropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String mobile) throws IllegalArgumentException {
		
		setValue("+91- "+mobile);
	}
	

}
