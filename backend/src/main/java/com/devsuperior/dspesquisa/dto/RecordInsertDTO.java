package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RecordInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	private Long gameId;
	
	public RecordInsertDTO() {
	}
	

}
