package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")

public class Score {
	
	// id composto
	@EmbeddedId
	
	private ScorePK id = new ScorePK();
	
	private Double value;

	private Score() {
			
	}

	// associacao do filme com o score
	public void setMovie( Movie movie) {
		id.setMovie(movie);
	}
	
	// associacao do user com o score
	public void setUser( User user) {
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
