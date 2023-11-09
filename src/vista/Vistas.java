package vista;

import controlador.*;
import modelo.*;

public interface Vistas {
	public void setModelo(Modelo miModelo);
	public void setControlador (Controlador miControlador);
	public void setVisible(boolean b);
	public String getUsr();
	public String getPwd();
	public String getSGBD();
	public void actualizar(String prueba);
	public String getRol();
}

