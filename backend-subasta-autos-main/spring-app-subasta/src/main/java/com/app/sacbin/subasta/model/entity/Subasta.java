package com.app.sacbin.subasta.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "subastas")
public class Subasta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate fecha;
	@ManyToOne
	private FechaSubasta fechaSubasta;
	@ManyToOne
	private HoraSubasta horaSubasta;
	@ManyToOne
	private TiempoSubasta tiempoSubasta;
	@ManyToOne
	private Usuario usario;
	
	@PrePersist
	private void prePersist() {
		fecha=LocalDate.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public FechaSubasta getFechaSubasta() {
		return fechaSubasta;
	}

	public void setFechaSubasta(FechaSubasta fechaSubasta) {
		this.fechaSubasta = fechaSubasta;
	}

	public HoraSubasta getHoraSubasta() {
		return horaSubasta;
	}

	public void setHoraSubasta(HoraSubasta horaSubasta) {
		this.horaSubasta = horaSubasta;
	}

	public TiempoSubasta getTiempoSubasta() {
		return tiempoSubasta;
	}

	public void setTiempoSubasta(TiempoSubasta tiempoSubasta) {
		this.tiempoSubasta = tiempoSubasta;
	}

	public Usuario getUsario() {
		return usario;
	}

	public void setUsario(Usuario usario) {
		this.usario = usario;
	}
}
