package com.devsuperior.dspesquisa.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_record")
public class Record implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;

	public Record() {
	}

	public Record(Long id, String name, Integer age, Instant moment, Game game) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.moment = moment;
		this.game = game;
	}
	
}
