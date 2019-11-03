package principal;

import usuarios.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		Usuario usuarios[] = new Usuario[10];
		String sectores[] = {"Comercial", "Atención al público", "Programador", "Tester", "Scrum Master"};
		String areas[] = {"Sistemas", "Marketing", "RRHH", "Atención", "Empaquetado"};
		int vacaciones[] = {7, 14, 21, 28};
		
		int s = 0;
		int a = 0;
		int v = 0;
		
		for(int i = 0; i < 10; i++) {
			
			s = (int)(Math.random()*5);
			a = (int)(Math.random()*5);
			v = (int)(Math.random()*4);
			
			switch(i) {
				case 0: usuarios[i] = new Usuario("Juan", "Gomez", "1234", areas[a], sectores[s], vacaciones[v], 27);
				break;
				
				case 1: usuarios[i] = new Usuario("Alberto", "Lopez", "5678", areas[a], sectores[s], vacaciones[v], 18);
				break;
				
				case 2: usuarios[i] = new Usuario("Analía", "Giraudo", "91023", areas[a], sectores[s], vacaciones[v], 29);
				break;
				
				case 3: usuarios[i] = new Usuario("Pedro", "Almada", "28761", areas[a], sectores[s], vacaciones[v], 37);
				break;
				
				case 4: usuarios[i] = new Usuario("Julia", "Hilda", "92661", areas[a], sectores[s], vacaciones[v], 14);
				break;
				
				case 5: usuarios[i] = new Usuario("Josefina", "Pedraza", "29465", areas[a], sectores[s], vacaciones[v], 47);
				break;
				
				case 6: usuarios[i] = new Usuario("Enrique", "Schell", "38176", areas[a], sectores[s], vacaciones[v], 19);
				break;
				
				case 7: usuarios[i] = new Usuario("Ana", "Centurion", "38059", areas[a], sectores[s], vacaciones[v], 56);
				break;
				
				case 8: usuarios[i] = new Usuario("Julio", "Almodovar", "37625", areas[a], sectores[s], vacaciones[v], 15);
				break;
				
				case 9: usuarios[i] = new Usuario("Ernesto", "Huller", "99938", areas[a], sectores[s], vacaciones[v], 35);
				break;
				
				case 10: usuarios[i] = new Usuario("Malena", "Steffan", "11946", areas[a], sectores[s], vacaciones[v], 21);
				break;
			}
		}
		
		for(int i = 0; i < usuarios.length; i++) {
			
			if(usuarios[i].getEdad() < 18) {
				eliminar(usuarios[i]);
			}
		}
		
		for(int i = 0; i < usuarios.length; i++) {
			
			switch(usuarios[i].getSector()) {
				case "Comercial": usuarios[i].setCodigo(1);
				break;
				
				case "Atención al público": usuarios[i].setCodigo(2);
				break;
				
				case "Programador": usuarios[i].setCodigo(3);
				break;
				
				default: usuarios[i].setCodigo(10);
				break;
			}
			
			switch(usuarios[i].getDiasVacaciones()) {
				case 7: usuarios[i].setCategoriaVacaciones(1);
				break;
				
				case 14: usuarios[i].setCategoriaVacaciones(2);
				break;
				
				case 21: usuarios[i].setCategoriaVacaciones(3);
				break;
				
				case 28: usuarios[i].setCategoriaVacaciones(4);
				break;
				
				default: usuarios[i].setCategoriaVacaciones(5);
				break;
			}
		}
		
		for(int i = 0; i < usuarios.length; i++) {
			presentarUsuarios(usuarios[i]);
		}
		
	}
	
	public static void eliminar(Usuario usuario) {
		usuario.setNombre("");
		usuario.setApellido("");
		usuario.setDni("");
		usuario.setArea("");
		usuario.setSector("");
		usuario.setDiasVacaciones(0);
		usuario.setCategoriaVacaciones(0);
		usuario.setCodigo(0);
	}
	
	public static void presentarUsuarios(Usuario usuario) {
		usuario.presentarUsuario(usuario);
	}

}
