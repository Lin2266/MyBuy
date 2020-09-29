package uuu.mybuy.test;

import uuu.mybuy.domain.BloodType;

public class TestBloodType {

	public static void main(String[] args) {
		for(BloodType type:BloodType.values()) {
			System.out.println(type.toString());
		}	
		

	}

}
