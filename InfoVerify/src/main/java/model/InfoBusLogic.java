package model;

public class InfoBusLogic {
	public boolean zipLengthLess5(Info info) {
		int length;
		length = info.getZip();
		if((length > 99999) || (length < 10000)) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean stateInit(Info info) {
		String initial = "";
		initial = info.getStateIntial();
		if(initial.length() == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printInfo(Info info) {
		System.out.println(info.getNumber() + " " + info.getStreet() + ", " + info.getStateIntial() + " " + info.getZip());
	}
}
