package uuu.mybuy.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Customer {
	public static final char MALE = 'M';
	public static final char FEMAIL ='F';
	private String id;
	private String name;
	private String password;
	private char gender = MALE;
	private String email;
	
	private Date birthDate;
	private String address;
	private String phone;
	private boolean married;
	private BloodType bloodType;
	private int status;
	public Customer() {
		
	}
	
	public Customer(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public Customer(String id, String name, String password, char gender, String email) {
		this(id,name,password);
		this.gender = gender;
		this.email = email;	
	}
	public Customer(String id, String name, String password, char gender, String email, Date birthDate,
			String address, String phone, boolean married, BloodType bloodType, int status) {
		this(id,name,password,gender,email);
		this.birthDate = birthDate;
		this.address = address;
		this.phone = phone;
		this.married = married;
		this.bloodType = bloodType;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws MyBuyException {
		if(id != null && (id = id.trim()).length() == 10) {
			this.id = id;
		}else {
			throw new MyBuyException("id欄位必須輸入且格式要正確");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws MyBuyException{
		if(name != null && (name = name.trim()).length() > 0) {
			this.name = name;
		}else {
			throw new MyBuyException("姓名欄位必須輸入");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws MyBuyException{
		if(password != null && (password = password.trim()).length() >0) {
			this.password = password;
		}else {
			throw new MyBuyException("密碼欄位必須輸入");
		}
	}

	public char getGender() {
		return gender;
	}

	public void setGender (char gender) throws MyBuyException{
		if(gender == MALE || gender == FEMAIL) {
			this.gender = gender;
		}else {
			throw new MyBuyException("姓別欄位必須輸入且資料要正確");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws MyBuyException{
		if(email != null && (email = email.trim()).matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
			this.email = email;
		}else {
			throw new MyBuyException("email欄位必須輸入且格式要正確");
		}
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate (Date birthDate) throws MyBuyException {
		if(birthDate == null || birthDate.before(new Date())) {
			this.birthDate = birthDate;
		}else {
			throw new MyBuyException("出生日期必須小於今天");
		}
	}
	
	public void setBirthDate (String sDate) throws MyBuyException {
		if(sDate != null && (sDate = sDate.trim()).length()>0) {
			sDate = sDate.replace("-","/");
			try {
				this.setBirthDate(DateFormat.getDateInstance().parse(sDate));			
			} catch (ParseException e) {
				throw new MyBuyException("出生日期資料格式不正確");
			}
		}else {
			this.birthDate = null;
		}
	
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws MyBuyException{
		if(address == null || (address = address.trim()).length()>0){
			this.address = address;
		}else {
			throw new MyBuyException();
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

}
