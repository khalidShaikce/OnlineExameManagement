package org.springframework.model;

import java.net.URL;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonAutoDetect;


//@XmlRootElement
@JsonAutoDetect
@Entity
@Table(name="UserSelectedOption")
public final class UserSelectedOption {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int questionNo;
	
	@Column(name="option_selected")
	private int optionSelected;
	
	public UserSelectedOption(int questionNo, int optionSelected) {
		super();
		this.questionNo=questionNo;
		this.optionSelected=optionSelected;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public int getOptionSelected() {
		return optionSelected;
	}
	public void setOptionSelected(int optionSelected) {
		this.optionSelected = optionSelected;
	}
	
	
	
}
