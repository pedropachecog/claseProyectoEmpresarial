package pe.edu.cibertec.proyemp.jpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_departamento")
public class Departamento {

	public Departamento(String string) {
		// TODO Auto-generated constructor stub
		this.nombre=string;
	}

	@Id
	@GeneratedValue
	@Column(name="DEP_ID")
	private Long id;

	@Column(name="DEP_NOMBRE")
	private String nombre;
	
	@Column(name="DEP_CAPACIDAD")
	private Integer capacidad;
	
	@Column(name="DEP_PAIS")
	private String pais;
	
	@Column(name="DEP_ESTADO", columnDefinition="CHAR(1)")
	private String estado;
	
	
	public Departamento(){
		
	}
	
	
	@OneToMany(mappedBy="departamento",cascade=CascadeType.PERSIST)
	private List<Empleado> empleados = new ArrayList<Empleado>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", capacidad="
				+ capacidad + ", pais=" + pais + ", estado=" + estado
				+ ", empleados=" + empleados + "]";
	}
	
	// Constructores, getters y setters
	
	
	
	
}
