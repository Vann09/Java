package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import modelos.Alumno;

public class RepoAlumno extends BaseDatos implements ICRUD <Alumno,Integer>
{

	public RepoAlumno(String servidor, String usuario, String password, String baseDatos) {
		super(servidor, usuario, password, baseDatos);
		
	}
	//CAMPOS
	private String sql;
	private PreparedStatement ps;
	private Statement stmt;
	private ResultSet rs;
	
	//METODOS
	@Override
	public ArrayList<Alumno> listar() throws Exception {
		
		Alumno al;
		//ArrayList<Alumno> datos = new ArrayList<Alumno>();
		super.conectar();
		
		this.sql = "SELECT matricula, nombre, apellido FROM Alumno";
		this.stmt = super.conexion.createStatement();
		this.rs = stmt.executeQuery(sql);
		
		while (rs.next())
		{
			al = new Alumno(rs.getInt("matricula"),rs.getString("apellido"),rs.getString("nombre"));
			System.out.println(al.toString());
			//datos.add(al);
		}
		
		super.desconectar();
		
		return null;
		//return datos;
	}

	@Override
	public Alumno leer(Integer pk) {
		
		return null;
	}

	@Override
	public void nuevo(Alumno modelo) throws Exception {
		super.conectar();
		this.sql = "INSERT INTO Alumno(matricula, nombre, apellido) VALUES(?,?,?)";
		this.ps= super.conexion.prepareStatement(sql);
		
		this.ps.setInt(1,modelo.matricula);
		this.ps.setString(2, modelo.nombre);
		this.ps.setString(3, modelo.apellido);
		
		int cantidad = this.ps.executeUpdate();
		
		if (cantidad==1)
		{
			System.out.println("Guardado");
		}
		else System.out.println("No se ha guardado");
		
		super.desconectar();
	}

	@Override
	public void editar(Integer pk, Alumno modelo) {
		
		
	}

	@Override
	public void elimar(Integer pk) throws Exception {
		conectar();
		this.sql="";
		
	}

}
