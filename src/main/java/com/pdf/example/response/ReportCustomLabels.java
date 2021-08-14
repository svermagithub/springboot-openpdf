package com.pdf.example.response;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
public class ReportCustomLabels {

	public Label label1;
	public Label label2;
	public Label label3;
	public Label label4;
	public Label label5;

	@JsonIgnore
	public Map<String,String> labelMapper = new HashMap<>();

	public Label getLabel1() {
		return label1;
	}
	public void setLabel1(Label label1) {
		this.label1 = label1;
	}
	public Label getLabel2() {
		return label2;
	}
	public void setLabel2(Label label2) {
		this.label2 = label2;
	}
	public Label getLabel3() {
		return label3;
	}
	public void setLabel3(Label label3) {
		this.label3 = label3;
	}
	public Label getLabel4() {
		return label4;
	}
	public void setLabel4(Label label4) {
		this.label4 = label4;
	}
	public Label getLabel5() {
		return label5;
	}

	public Map<String, String> getLabelMapper() {
		if(this.label1 !=null)
		{
			labelMapper.put(label1.name,label1.value);
		}
		if(this.label2 !=null)
		{
			labelMapper.put(label2.name,label2.value);
		}
		if(this.label3 !=null)
		{
			labelMapper.put(label3.name,label3.value);
		}
		if(this.label4 !=null)
		{
			labelMapper.put(label4.name,label4.value);
		}
		if(this.label5 !=null)
		{
			labelMapper.put(label5.name,label5.value);
		}
		return labelMapper;
	}
	public void setLabel5(Label label5) {
		this.label5 = label5;
	}


}
