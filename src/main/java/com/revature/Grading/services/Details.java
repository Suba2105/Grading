package com.revature.Grading.services;

public class Details {

	
	private String Student_Name;
	private int Register_Number;
	private int Maths;
	private int Physics;
	private int Chemistry;
	private int Botany;
	private int Zoology;
	private int Total;
	private Double Average;
	private String Grade;
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String s_name) {
		Student_Name = s_name;
	}
	public int getRegister_Number() {
		return Register_Number;
	}
	public void setRegister_Number(int reg_no) {
		Register_Number = reg_no;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int mat) {
		Maths = mat;
	}
	public int getPhysics() {
		return Physics;
	}
	public void setPhysics(int phy) {
		Physics = phy;
	}
	public int getChemistry() {
		return Chemistry;
	}
	public void setChemistry(int che) {
		Chemistry = che;
	}
	public int getBotany() {
		return Botany;
	}
	public void setBotany(int bot) {
		Botany = bot;
	}
	public int getZoology() {
		return Zoology;
	}
	public void setZoology(int zoo) {
		Zoology = zoo;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public Double getAverage() {
		return Average;
	}
	public void setAverage(Double avg) {
		Average = avg;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Admindetailes [Student_Name=" + Student_Name + ", Register_Number=" + Register_Number + ", Maths=" + Maths + ", Physics=" + Physics + ", Chemistry=" + Chemistry
				+ ", Botany=" + Botany + ", Zoology=" + Zoology + ", Total=" + Total + ", Average=" + Average + ", Grade="
				+ Grade + "]";
	}

}

