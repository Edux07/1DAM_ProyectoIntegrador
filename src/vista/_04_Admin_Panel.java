package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controlador.Controlador;
import modelo.Modelo;

public class _04_Admin_Panel extends JPanel implements Vistas {
	private Modelo miModelo;
	private Controlador miControlador;

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private DefaultListModel<String> listModel;
	private JTextField textFieldrol;
	private JPasswordField passwordField;
//final DefaultListModel<String> listModel,this.listModel = listModel;

	public _04_Admin_Panel() {

		setBorder(null);
		setForeground(new Color(153, 193, 241));
		setBackground(new Color(98, 160, 234));
		setLayout(null);

		// USUARIO
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(164, 177, 248, 27);
		add(textFieldNombre);
		textFieldNombre.setBackground(new Color(153, 193, 241));
		textFieldNombre.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(26, 95, 180));
		panel.setBounds(0, 385, 488, 53);
		add(panel);
		panel.setLayout(null);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setSelectedIcon(new ImageIcon(_04_Admin_Panel.class.getResource("/IMAGENES/save.png")));
		btnGuardar.setBounds(383, 12, 93, 30);
		panel.add(btnGuardar);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGuardar.setBackground(new Color(53, 132, 228));
		btnGuardar.setForeground(new Color(0, 1, 56));

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(0, 1, 56));
		btnCancelar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCancelar.setBackground(new Color(53, 132, 228));
		btnCancelar.setBounds(288, 12, 93, 30);
		btnCancelar.setBorderPainted(false);
		panel.add(btnCancelar);

		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					
				
		
				
			}
		});

	
		textFieldrol = new JTextField();
		textFieldrol.setColumns(10);
		textFieldrol.setBackground(new Color(153, 193, 241));
		textFieldrol.setBounds(164, 283, 248, 27);
		add(textFieldrol);

		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBackground(new Color(153, 193, 241));
		passwordField.setBounds(164, 230, 248, 27);
		add(passwordField);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 193, 241));
		separator.setBounds(12, 152, 445, 13);
		add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(153, 193, 241));
		separator_1.setBounds(12, 349, 445, 13);
		add(separator_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(_04_Admin_Panel.class.getResource("/IMAGENES/nuevouser.png")));
		lblNewLabel_1.setBounds(209, 9, 91, 92);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("REGISTRO DE NUEVO USUARIO");
		lblNewLabel_2.setForeground(new Color(156, 246, 255));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBackground(new Color(156, 246, 255));
		lblNewLabel_2.setBounds(111, 113, 332, 27);
		add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(_04_Admin_Panel.class.getResource("/IMAGENES/user.png")));
		lblNewLabel.setBackground(new Color(153, 193, 241));
		lblNewLabel.setBounds(111, 174, 47, 40);
		add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(_04_Admin_Panel.class.getResource("/IMAGENES/passllave.png")));
		lblNewLabel_3.setBounds(111, 226, 47, 40);
		add(lblNewLabel_3);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(_04_Admin_Panel.class.getResource("/IMAGENES/telefono.png")));
		label.setBounds(111, 280, 47, 40);
		add(label);

		btnGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				miControlador.registro(textFieldNombre.getText(), String.valueOf(passwordField.getPassword()),
				textFieldrol.getText());

			}
		});
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
		return null;
	}

	@Override
	public String getPwd() {
		return null;
	}

	public String getRol() {
		return null;
	}

	@Override
	public String getSGBD() {
		return null;
	}

	@Override
	public void actualizar(String prueba) {

	}
}
