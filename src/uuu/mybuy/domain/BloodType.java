package uuu.mybuy.domain;

public enum BloodType {
	O, A, B, AB;
//	O("O型"){
//
//		@Override
//		public String toString() {	
//			return "這是"+this.name()+"型";
//		}},A("A型"),B("B型"),AB("AB型");
//	
//	private String type;
//	
//
//	private BloodType(String type) {
//		this.type = type;
//		
//	}
//	
//	public String getType() {
//		return type;
//	}


	@Override
	public String toString() {
		return this.name() + "型";
		//return super.toString()+ "型";
		//return getNumber() + getType();
		//return ordinal() + getType();
	}
	
	
	

}
