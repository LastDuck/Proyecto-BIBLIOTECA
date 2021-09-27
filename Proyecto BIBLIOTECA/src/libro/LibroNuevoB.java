package libro;

import java.time.LocalDate;

public class LibroNuevoB extends Libro {
	
	private String codigo;
	private int anoDePublicacion;
	private String editorial;
	private int cantidadPaginas;
	private double precio;
	private String estado="Disponible";
	private String cedula;
		
	private String codigoAutorizado;
	private int tiempoLectura;
	

	
	private  LocalDate fechaReserva=null;
	
	public LibroNuevoB(String codigo,String nombre, String autor, int anoDePublicacion,String editorial,int cantidadPaginas,double precio,String codigoAutorizado,int tiempoLectura,String cedula) {
		super(nombre, autor);
		// TODO Auto-generated constructor stub
		this.codigoAutorizado=codigoAutorizado;
		this.tiempoLectura=tiempoLectura;
		this.codigo=codigo;
		this.anoDePublicacion=anoDePublicacion;
		this.editorial=editorial;
		this.cantidadPaginas=cantidadPaginas;
		this.precio=precio;
		this.cedula=cedula;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getAnoDePublicacion() {
		return anoDePublicacion;
	}

	public void setAnoDePublicacion(int anoDePublicacion) {
		this.anoDePublicacion = anoDePublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Codigo:" + codigo + "Nombre:"+super.getNombre()+"Autor: "+super.getAutor();
	}
	
	public String getEstado() {
		return estado;
		
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigoAutorizado() {
		return codigoAutorizado;
	}

	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}

	public int getTiempoLectura() {
		return tiempoLectura;
	}

	public void setTiempoLectura(int tiempoLectura) {
		this.tiempoLectura = tiempoLectura;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

}
