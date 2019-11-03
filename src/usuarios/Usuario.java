package usuarios;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String dni; 
	private String area; 
	private String sector;
	private int diasVacaciones;
	private int categoriaVacaciones;
	private int codigo;
	private int edad;
	
	public Usuario(String nombre, String apellido, String dni, String area, String sector, int diasVacaciones, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.area = area;
		this.sector = sector;
		this.diasVacaciones = diasVacaciones;
		this.setCodigo(0);
		this.edad = edad;
	}

	public String getSector() {
		return sector;
	}
	
	public void setSector(String sector) {
		this.sector = sector;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	
	public void setDiasVacaciones(int dias) {
		diasVacaciones = dias;
	}

	public void setCategoriaVacaciones(int categoriaVacaciones) {
		this.categoriaVacaciones = categoriaVacaciones;
	}
	
	public int getCategoriaVacaciones() {
		return categoriaVacaciones;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}

	public int getEdad() {
		return edad;
	}
	
	public void presentarUsuario(Usuario usuario) {
		System.out.println("Código: "+usuario.getCodigo());
		System.out.println("DNI: "+usuario.getDni());
		System.out.println("Nombre: "+usuario.getNombre());
		System.out.println("Apellido: "+usuario.getApellido());
		System.out.println("Area: "+usuario.getArea());
		System.out.println("Sector: "+usuario.getSector());
		System.out.println("Días de vacaciones: "+usuario.getDiasVacaciones());
		System.out.println("Categoría de vacaciones: "+usuario.getCategoriaVacaciones());
		System.out.println("------------------------------------------------------------------------------");
	}
	
}
