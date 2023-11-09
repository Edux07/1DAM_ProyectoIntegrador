package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.Modelo;

public class _06_Contactanos_Panel extends JPanel implements Vistas{
	
	private Controlador miControlador;
	private Modelo miModelo;
	
	private JPanel contentPane;
	private Object listModel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public _06_Contactanos_Panel() {
		this.listModel = listModel;
		setBorder(null);
		setForeground(new Color(153, 193, 241));
		setBackground(new Color(98, 160, 234));
		setLayout(null);

		JLabel lblNombre = new JLabel("Nombre y apellido");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNombre.setBounds(10, 68, 149, 20);
		add(lblNombre);

		JLabel lblEMPLE = new JLabel("Numero de empleado");
		lblEMPLE.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEMPLE.setBounds(10, 153, 149, 20);
		add(lblEMPLE);

		JLabel lblZonaDelCampo = new JLabel("Zona de la consulta");
		lblZonaDelCampo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblZonaDelCampo.setBounds(10, 240, 149, 20);
		add(lblZonaDelCampo);

		JLabel lblExpliqueElMotivo = new JLabel("Explique el motivo de la consulta");
		lblExpliqueElMotivo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblExpliqueElMotivo.setBounds(10, 329, 248, 20);
		add(lblExpliqueElMotivo);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(79, 352, 450, 68);
		add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 69, 290, 20);
		add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 154, 290, 20);
		add(textField_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Hoyos", "Cesped", "Medidas" }));
		comboBox.setBounds(180, 240, 149, 22);
		add(comboBox);

		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnEnviar.setBackground(new Color(119, 172, 236));
		btnEnviar.setBounds(271, 447, 89, 30);
		add(btnEnviar);
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
