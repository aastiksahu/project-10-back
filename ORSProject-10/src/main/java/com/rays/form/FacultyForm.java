package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FacultyDTO;

public class FacultyForm extends BaseForm{

	@NotEmpty(message = "First Name is Required")
	private String firstName;
	
	@NotEmpty(message = "Last Name is Required")
	private String lastName;
	
	@NotNull(message = "Date of Birth is Required")
	private Date dob;
	
	@NotEmpty(message = "Gender is Required")
	private String gender;
	
	@NotNull(message = "Phone No. is Required")
	@Pattern(regexp = "^$|[0-9]{10}")
	private String phoneNo;
	
	@NotEmpty(message = "Email ID is Required")
	private String email;
	
	@NotEmpty(message = "Qualification is Required")
	private String qualification;
	
	@Min(value = 1, message = "College Name is Required")
	private Long collegeId = 0L;
	
	@Min(value = 1, message = "Course Name is Required")
	private Long courseId = 0L;
	
	@Min(value = 1, message = "Subject Name is Required")
	private Long subjectId = 0L;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	
	@Override
	public BaseDTO getDTO() {
		
		FacultyDTO dto = initDTO(new FacultyDTO());
		
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setPhoneNo(phoneNo);
		dto.setEmail(email);
		dto.setQualification(qualification);
		dto.setCollegeId(collegeId);
		dto.setCourseId(courseId);
		dto.setSubjectId(subjectId);
		
		return dto;
	}
}
