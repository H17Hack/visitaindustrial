// Generated with g9.

package com.dwa.industrial.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="dato")
public class Dato implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=50)
    private String carrera;
    @Column(nullable=false, length=50)
    private String materia;
    @Column(nullable=false, length=200)
    private String nomacad;
    @Column(nullable=false, precision=10)
    private int numest;
    @Column(nullable=false, length=200)
    private String objetivovis;
    @Column(nullable=false, length=100)
    private String fecha;
    @Column(nullable=false, length=50)
    private String semestre;
    @Column(nullable=false, length=100)
    private String correo;
    @Column(nullable=false, length=500)
    private String actividad;
    @Column(nullable=false, length=500)
    private String observar;
    @ManyToOne(optional=false)
    @JoinColumn(name="idautor", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Dato() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for carrera.
     *
     * @return the current value of carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Setter method for carrera.
     *
     * @param aCarrera the new value for carrera
     */
    public void setCarrera(String aCarrera) {
        carrera = aCarrera;
    }

    /**
     * Access method for materia.
     *
     * @return the current value of materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Setter method for materia.
     *
     * @param aMateria the new value for materia
     */
    public void setMateria(String aMateria) {
        materia = aMateria;
    }

    /**
     * Access method for nomacad.
     *
     * @return the current value of nomacad
     */
    public String getNomacad() {
        return nomacad;
    }

    /**
     * Setter method for nomacad.
     *
     * @param aNomacad the new value for nomacad
     */
    public void setNomacad(String aNomacad) {
        nomacad = aNomacad;
    }

    /**
     * Access method for numest.
     *
     * @return the current value of numest
     */
    public int getNumest() {
        return numest;
    }

    /**
     * Setter method for numest.
     *
     * @param aNumest the new value for numest
     */
    public void setNumest(int aNumest) {
        numest = aNumest;
    }

    /**
     * Access method for objetivovis.
     *
     * @return the current value of objetivovis
     */
    public String getObjetivovis() {
        return objetivovis;
    }

    /**
     * Setter method for objetivovis.
     *
     * @param aObjetivovis the new value for objetivovis
     */
    public void setObjetivovis(String aObjetivovis) {
        objetivovis = aObjetivovis;
    }

    /**
     * Access method for fecha.
     *
     * @return the current value of fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter method for fecha.
     *
     * @param aFecha the new value for fecha
     */
    public void setFecha(String aFecha) {
        fecha = aFecha;
    }

    /**
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(String aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for correo.
     *
     * @return the current value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter method for correo.
     *
     * @param aCorreo the new value for correo
     */
    public void setCorreo(String aCorreo) {
        correo = aCorreo;
    }

    /**
     * Access method for actividad.
     *
     * @return the current value of actividad
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Setter method for actividad.
     *
     * @param aActividad the new value for actividad
     */
    public void setActividad(String aActividad) {
        actividad = aActividad;
    }

    /**
     * Access method for observar.
     *
     * @return the current value of observar
     */
    public String getObservar() {
        return observar;
    }

    /**
     * Setter method for observar.
     *
     * @param aObservar the new value for observar
     */
    public void setObservar(String aObservar) {
        observar = aObservar;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Compares the key for this instance with another Dato.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Dato and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Dato)) {
            return false;
        }
        Dato that = (Dato) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Dato.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Dato)) return false;
        return this.equalKeys(other) && ((Dato)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Dato |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
