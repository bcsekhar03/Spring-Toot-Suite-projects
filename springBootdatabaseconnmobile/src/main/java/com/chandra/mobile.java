package com.chandra;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class mobile {
@Id
private int modelNo;
private String modelName;
private int ram_size;
private int rom_size;
private String os_name;
private String version_name;
private int processor;
private double price;
private int f_cam;
private int b_cam;
private int battery;
private int display_size;
private long IMEI_No;
private String color;
public mobile() {
	super();
}
public mobile(int modelNo, String modelName, String string, int rom_size, String os_name, String version_name,
		int processor, double price, int f_cam, int b_cam, double d, int display_size, long iMEI_No, String color) {
	super();
	this.modelNo = modelNo;
	this.modelName = modelName;
	this.ram_size = ram_size;
	this.rom_size = rom_size;
	this.os_name = os_name;
	this.version_name = version_name;
	this.processor = processor;
	this.price = price;
	this.f_cam = f_cam;
	this.b_cam = b_cam;
	this.battery = battery;
	this.display_size = display_size;
	IMEI_No = iMEI_No;
	this.color = color;
}
public int getModelNo() {
	return modelNo;
}
public void setModelNo(int modelNo) {
	this.modelNo = modelNo;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public int getRam_size() {
	return ram_size;
}
public void setRam_size(int ram_size) {
	this.ram_size = ram_size;
}
public int getRom_size() {
	return rom_size;
}
public void setRom_size(int rom_size) {
	this.rom_size = rom_size;
}
public String getOs_name() {
	return os_name;
}
public void setOs_name(String os_name) {
	this.os_name = os_name;
}
public String getVersion_name() {
	return version_name;
}
public void setVersion_name(String version_name) {
	this.version_name = version_name;
}
public int getProcessor() {
	return processor;
}
public void setProcessor(int processor) {
	this.processor = processor;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getF_cam() {
	return f_cam;
}
public void setF_cam(int f_cam) {
	this.f_cam = f_cam;
}
public int getB_cam() {
	return b_cam;
}
public void setB_cam(int b_cam) {
	this.b_cam = b_cam;
}
public int getBattery() {
	return battery;
}
public void setBattery(int battery) {
	this.battery = battery;
}
public int getDisplay_size() {
	return display_size;
}
public void setDisplay_size(int display_size) {
	this.display_size = display_size;
}
public long getIMEI_No() {
	return IMEI_No;
}
public void setIMEI_No(long iMEI_No) {
	IMEI_No = iMEI_No;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "mobile [modelNo=" + modelNo + ", modelName=" + modelName + ", ram_size=" + ram_size + ", rom_size="
			+ rom_size + ", os_name=" + os_name + ", version_name=" + version_name + ", processor=" + processor
			+ ", price=" + price + ", f_cam=" + f_cam + ", b_cam=" + b_cam + ", battery=" + battery + ", display_size="
			+ display_size + ", IMEI_No=" + IMEI_No + ", color=" + color + "]";
}

}

