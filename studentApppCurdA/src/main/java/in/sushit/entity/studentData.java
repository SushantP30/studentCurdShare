package in.sushit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentDb")
public class studentData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer rollNo;
private String name;
private float percentage;
private String branch;
public Integer getRollNo() {
	return rollNo;
}
public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public studentData(Integer rollNo, String name, float percentage, String branch) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.percentage = percentage;
	this.branch = branch;
}
public studentData() {
	super();
}
@Override
public String toString() {
	return "studentData [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
			+ "]";
}

}
