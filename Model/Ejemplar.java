
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public abstract class Ejemplar {

    private Integer idEjemplar;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private Boolean disponible;
    private Integer duracionDias;

    public Ejemplar() {
    }

    public Ejemplar crearEjemplar() {
        // TODO implement here
        return null;
    }

	public Integer getIdEjemplar() {
		return idEjemplar;
	}

	public void setIdEjemplar(Integer idEjemplar) {
		this.idEjemplar = idEjemplar;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public Integer getDuracionDias() {
		return duracionDias;
	}

	public void setDuracionDias(Integer duracionDias) {
		this.duracionDias = duracionDias;
	}

	@Override
	public String toString() {
		return "Ejemplar [idEjemplar=" + idEjemplar + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + ", disponible=" + disponible + ", duracionDias=" + duracionDias + "]";
	}
    
	
}