package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TimetableDTO;

public class TImetableForm extends BaseForm{

	@Min(value = 1, message = "Course Name is Required")
	private Long courseId = 0L;
	
	
	private String courseName;
	
	@Min(value = 1, message = "Subject Name is Required")
	private Long subjectId = 0L;
	
	
	private String subjectName;
	
	@NotNull(message = "Exam Date is Required")
	private Date examDate;
	
	@NotEmpty(message = "Exam Time is Required")
	private String examTime;
	
	@NotEmpty(message = "Semester is Required")
	private String semester;
	
	@NotEmpty(message = "Description is Required")
	private String description;

	public Long getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public BaseDTO getDTO() {

		TimetableDTO dto = initDTO(new TimetableDTO());
		
		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setSubjectId(subjectId);
		dto.setSubjectName(subjectName);
		dto.setExamDate(examDate);
		dto.setExamTime(examTime);
		dto.setSemester(semester);
		dto.setDescription(description);
		
		return dto;
	}
}
