package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger_details")
public class Train {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String passenger_name;
private int passenger_age;
private String train_name;
private String from_to;
private int passenger_fare;
private int otp_no;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassenger_name() {
	return passenger_name;
}
public void setPassenger_name(String passenger_name) {
	this.passenger_name = passenger_name;
}
public int getPassenger_age() {
	return passenger_age;
}
public void setPassenger_age(int passenger_age) {
	this.passenger_age = passenger_age;
}
public String getTrain_name() {
	return train_name;
}
public void setTrain_name(String train_name) {
	this.train_name = train_name;
}
public String getFrom_to() {
	return from_to;
}
public void setFrom_to(String from_to) {
	this.from_to = from_to;
}
public int getPassenger_fare() {
	return passenger_fare;
}
public void setPassenger_fare(int passenger_fare) {
	this.passenger_fare = passenger_fare;
}
public int getOtp_no() {
	return otp_no;
}
public void setOtp_no(int otp_no) {
	this.otp_no = otp_no;
}




}
