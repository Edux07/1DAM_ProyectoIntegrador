package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controlador.Controlador;
import modelo.Modelo;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
//TODO bug en caso de que un usuario ya existe
public class _03_Admin extends JFrame implements Vistas {

	private Controlador miControlador;
	private Modelo miModelo;

	private JButton btnAñadir;
	private JPanel content;
	private JButton btnNewButton;
	private DefaultListModel<String> listModel;
	private JPanel panel;

	private JSeparator separator_1;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTable table;
	
	private JTextField textFieldNombre;
 	private JTextField textFieldrol;
 	private JPasswordField passwordField;

	public _03_Admin() {
		getContentPane().setBackground(new Color(1, 12, 120));
		setBackground(new Color(26, 95, 180));
		setSize(839, 518);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		listModel = new DefaultListModel<String>();

		panel = new JPanel();
		panel.setBackground(new Color(26, 95, 180));
		panel.setBounds(54, 0, 204, 488);
		getContentPane().add(panel);
		panel.setLayout(null);
		// BOTON AÑADIR USUARIO
		
		
		btnAñadir = new JButton("Añadir");
 		btnAñadir.setBounds(22, 416, 162, 28);
 		panel.add(btnAñadir);
 		btnAñadir.setFont(new Font("Dialog", Font.BOLD, 13));
 		btnAñadir.setForeground(new Color(156, 246, 255));
 		btnAñadir.setBackground(new Color(53, 132, 228));
 		btnAñadir.setBorderPainted(false);

		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(156, 246, 255));
		separator_1.setBounds(12, 103, 172, 10);
		panel.add(separator_1);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon(_03_Admin.class.getResource("/IMAGENES/icons8-cambiar-usuario-masculino-80.png")));
		lblNewLabel.setBounds(53, 12, 93, 79);
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Añadir Nuevo Usuario");
		lblNewLabel_1.setForeground(new Color(156, 246, 255));
		lblNewLabel_1.setBackground(new Color(156, 246, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 110, 172, 32);
		panel.add(lblNewLabel_1);

		JPanel panel_menu_1 = new JPanel();
		panel_menu_1.setForeground(new Color(255, 255, 255));
		panel_menu_1.setBackground(new Color(0, 51, 102));
		panel_menu_1.setBounds(0, 0, 55, 488);
		getContentPane().add(panel_menu_1);
		
		textFieldNombre = new JTextField();
 		textFieldNombre.setBounds(12, 199, 172, 32);
 		panel.add(textFieldNombre);
 		textFieldNombre.setColumns(10);

 		textFieldrol = new JTextField();
 		textFieldrol.setColumns(10);
 		textFieldrol.setBounds(12, 329, 172, 32);
 		panel.add(textFieldrol);

 		passwordField = new JPasswordField();
 		passwordField.setBounds(12, 261, 172, 28);
 		panel.add(passwordField);

 		JLabel lblNewLabel_1_1 = new JLabel("USUARIOS");
 		lblNewLabel_1_1.setForeground(new Color(156, 246, 255));
 		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
 		lblNewLabel_1_1.setBackground(new Color(156, 246, 255));
 		lblNewLabel_1_1.setBounds(12, 168, 172, 32);
 		panel.add(lblNewLabel_1_1);

 		JLabel lblNewLabel_1_1_1 = new JLabel("CONTRASEÑA");
 		lblNewLabel_1_1_1.setForeground(new Color(156, 246, 255));
 		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
 		lblNewLabel_1_1_1.setBackground(new Color(156, 246, 255));
 		lblNewLabel_1_1_1.setBounds(12, 229, 172, 32);
 		panel.add(lblNewLabel_1_1_1);

 		JLabel lblNewLabel_1_1_1_1 = new JLabel("ROL");
 		lblNewLabel_1_1_1_1.setForeground(new Color(156, 246, 255));
 		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
 		lblNewLabel_1_1_1_1.setBackground(new Color(156, 246, 255));
 		lblNewLabel_1_1_1_1.setBounds(12, 300, 172, 32);
 		panel.add(lblNewLabel_1_1_1_1);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(0, 0, 55, 55);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		//
		btnNewButton_5.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user-50.png")));

		btnNewButton_5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user-50.png")));
			}

		});
		panel_menu_1.setLayout(null);
		panel_menu_1.add(btnNewButton_5);
		btnNewButton_5.setForeground(new Color(23, 22, 123));
		btnNewButton_5.setBackground(new Color(255, 255, 255));

		JButton btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.setBounds(0, 66, 55, 55);
		btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));

		btnNewButton_5_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-edit.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic

				miControlador.cambiarVentana(3, 2);

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));
			}
		});
		btnNewButton_5_2.setForeground(new Color(23, 22, 123));
		btnNewButton_5_2.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_2);

		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.setBounds(0, 132, 55, 55);

		//
		btnNewButton_5_1.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));

		btnNewButton_5_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_1.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic

				miControlador.cambiarVentana(3, 1);
			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_1
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));
			}

		});
		btnNewButton_5_1.setForeground(new Color(23, 22, 123));
		btnNewButton_5_1.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_1);

		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.setBounds(0, 198, 55, 55);

		btnNewButton_5_3.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));

		btnNewButton_5_3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_3
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia.gif")));

			}

			public void mouseClicked(MouseEvent e) {// Botón para gestionar los usuarios, accedes a la ventana de
													// gestión de usuarios y se cierra la anterior.
				// cuando haces clic
				miControlador.cambiarVentana(3, 3);// Cerramos hoyos [2] y abrimos gestion de usuarios [3]

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_3
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));
			}

		});
		btnNewButton_5_3.setForeground(new Color(23, 22, 123));
		btnNewButton_5_3.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_3);

		JButton btnNewButton_5_4 = new JButton("");
		btnNewButton_5_4.setBounds(0, 264, 55, 55);
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_4.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));

		btnNewButton_5_4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_4.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
				miControlador.cambiarVentana(3, 5);

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_4
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));
			}

		});
		btnNewButton_5_4.setForeground(new Color(23, 22, 123));
		btnNewButton_5_4.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_4);
		// PANEL DERECHA
		content = new JPanel();
		content.setBackground(new Color(53, 132, 228));
		content.setBounds(255, 0, 568, 488);
		getContentPane().add(content);
		content.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(45, 33, 478, 395);
		content.add(scrollPane_1);

		// tabla de users
		table = new JTable();
		scrollPane_1.setViewportView(table);

		JButton btnDelete = new JButton("Eliminar");
		btnDelete.setForeground(new Color(156, 246, 255));
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 13));
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(53, 132, 228));
		btnDelete.setBounds(45, 439, 105, 28);
		content.add(btnDelete);

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSel = table.getSelectedRow();
				String regSel = (String) table.getValueAt(filaSel, 0);
				miControlador.OperacionesDelete(regSel);
				miControlador.cambiarVentana(3, 3);
			}
		});

		// tabla de base de datos
		JTable miTabla2 = new JTable();
		miTabla2.setBackground(new Color(30, 39, 89));
		miTabla2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(miTabla2);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {

				table.setModel(miModelo.getTabla2());

			}
		});

		// BOTÓN AÑADIR USUARIOS.
		 		btnAñadir.addActionListener(new ActionListener() {
		 			public void actionPerformed(ActionEvent e) {
		 				miControlador.registro(textFieldNombre.getText(), String.valueOf(passwordField.getPassword()),
		 						textFieldrol.getText());
		 				miControlador.cambiarVentana(3, 3);
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
