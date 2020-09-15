package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.entities.enums.Platform;

import lombok.Data;

@Data
public class RecordDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	public RecordDTO() {
	}
	
	public RecordDTO(Record entity) {
		id = entity.getId();
		moment = entity.getMoment();
		name = entity.getName();
		age = entity.getAge();
		gameTitle = entity.getGame().getTitle();
		gamePlatform = entity.getGame().getPlatform();
		genreName = entity.getGame().getGenre().getName();
		
		
	}
}
