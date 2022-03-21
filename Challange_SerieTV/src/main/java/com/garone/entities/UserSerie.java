package com.garone.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserSerie implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "user_id")
    private int idUser;

    @Column(name = "serietv_id")
    private int idSerie;
    
    public UserSerie() {
		// TODO Auto-generated constructor stub
	}
    
    

	public UserSerie(int idUser, int idSerie) {
		super();
		this.idUser = idUser;
		this.idSerie = idSerie;
	}



	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	@Override
	public String toString() {
		return "UserSerie [idUser=" + idUser + ", idSerie=" + idSerie + "]";
	}
}