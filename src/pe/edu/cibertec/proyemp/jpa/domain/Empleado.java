package pe.edu.cibertec.proyemp.jpa.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pe.edu.cibertec.proyemp.jpa.listener.EmpleadoListener;

@Entity
//@EntityListeners(EmpleadoListener.class)
@Table(name="tb_empleado")

public class Empleado {
	
	@Id
	@GeneratedValue
	@Column(name="EMP_ID", nullable=false, unique=true)
	private Long id;

	@Column(name="EMP_NOMBRE", nullable=false, length=200)	
	private String nombre;

	@ManyToOne
	@JoinColumn(name="DEP_ID") // No es Column por la llave foránea
	private Departamento departamento;

	@Column(name="EMP_SALARIO", precision=10, scale=2)
	private BigDecimal salario;
	
	@Column(name="EMP_FEC_ING")
	@Temporal(value = TemporalType.DATE) // No olvidar esta anotación para fechas
	private Date fechaIngreso;
	
	
	// Agregadas por ejercicio
	
	@Column(name="EMP_APELLIDO", length = 50)
	private String apellido;
	
	
	@Column(name="EMP_DNI", unique=true, columnDefinition="CHAR(8)")
	private String dni;
	
	@Column(name="EMP_FEC_NAC")
	@Temporal(value = TemporalType.DATE) // No olvidar esta anotación para fechas
	private Date fechaNacimiento;
	
	@Column(name="EMP_ESTADO", columnDefinition="CHAR(1)")
	private String estado;

	public Empleado(){
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Empleado(String string, Departamento departamento2) {
		// TODO Auto-generated constructor stub
		this.nombre=string;
		this.departamento=departamento2;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	
	

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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", departamento="
				+ departamento + ", salario=" + salario + ", fechaIngreso="
				+ fechaIngreso + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado
				+ "]";
	}

	
	// Constructores, getters y setters
	
	
	
}
