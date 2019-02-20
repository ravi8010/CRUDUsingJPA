import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student1 {
@Id 
@Column(name="id")
private int id;
@Column(name="name",length=10)
private String name;
@Column(name="MobileNumber",length=10)
private String mobileNo;



public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getMobileNo() {
	return mobileNo;
}
public Student1() {
	super();
	// TODO Auto-generated constructor stub
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
}
