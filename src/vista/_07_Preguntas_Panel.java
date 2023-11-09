package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controlador.Controlador;
import modelo.Modelo;

import java.awt.Font;
import javax.swing.ImageIcon;

public class _07_Preguntas_Panel extends JPanel implements Vistas{

	private Controlador miControlador;
	private Modelo miModelo;
	
	public _07_Preguntas_Panel() {
		setBorder(null);
		setForeground(new Color(153, 193, 241));
		setBackground(new Color(98, 160, 234));
		setLayout(null);

		JLabel lblPREG = new JLabel("PREGUNTAS FRECUENTES");
		lblPREG.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPREG.setHorizontalAlignment(SwingConstants.CENTER);
		lblPREG.setBounds(183, 11, 241, 14);
		add(lblPREG);

		JLabel lblPregunta1 = new JLabel("¿Como instalar el Java?");
		lblPregunta1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblPregunta1.setBounds(10, 36, 174, 26);
		add(lblPregunta1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 193, 241));
		panel.setBounds(10, 73, 594, 393);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Accede al sitio oficial de Eclipse: https://www.eclipse.org/downloads/");
		lblNewLabel.setBounds(0, 0, 584, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("En la sección de descargas, elige la versión de Eclipse que quieres descargar de acuerdo con tu sistema operativo (Windows, Mac o Linux) y con la arquitectura de tu procesador (32 bits o 64 bits).");
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setBounds(0, 43, 594, 64);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Después de descargar el archivo, ejecuta el instalador de Eclipse");
		lblNewLabel_3.setBackground(Color.GRAY);
		lblNewLabel_3.setBounds(0, 123, 471, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("En la pantalla de instalación, selecciona el paquete de recursos que deseas instalar. Si eres un principiante, puedes elegir el paquete \"Eclipse IDE for Java Developers\", que incluye todo lo necesario para empezar a programar en Java.");
		lblNewLabel_4.setBackground(Color.GRAY);
		lblNewLabel_4.setBounds(0, 194, 594, 64);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Selecciona la ubicación donde deseas instalar Eclipse y completa el proceso de instalación.");
		lblNewLabel_5.setBackground(Color.GRAY);
		lblNewLabel_5.setBounds(0, 269, 594, 54);
		panel.add(lblNewLabel_5);
	}
	@Override
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	@Override
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	@Override
	public String getUsr() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPwd() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getSGBD() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void actualizar(String prueba) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getRol() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
