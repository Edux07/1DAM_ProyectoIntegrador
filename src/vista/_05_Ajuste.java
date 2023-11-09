package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import controlador.Controlador;
import modelo.Modelo;

public class _05_Ajuste extends JFrame implements Vistas {

	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel content;

	public _05_Ajuste() {
		setSize(839, 518);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(new Color(26, 95, 180));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		content = new JPanel();
		content.setBackground(new Color(98, 160, 234));
		content.setBounds(225, 0, 613, 488);
		getContentPane().add(content);
		content.setLayout(null);

		// Crear un modelo de datos para el JList
		DefaultListModel<String> listModel = new DefaultListModel<>();

		JPanel panel_menu_1 = new JPanel();
		panel_menu_1.setForeground(new Color(255, 255, 255));
		panel_menu_1.setBackground(new Color(0, 51, 102));
		panel_menu_1.setBounds(0, 0, 55, 488);
		getContentPane().add(panel_menu_1);

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
				miControlador.cambiarVentana(5,2);

				
				
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
				
				miControlador.cambiarVentana(5,1);
			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_1.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));
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

				btnNewButton_5_3.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia.gif")));

			}

			public void mouseClicked(MouseEvent e) {//Botón para gestionar los usuarios, accedes a la ventana de gestión de usuarios y se cierra la anterior.
				// cuando haces clic
				miControlador.cambiarVentana(5,3);//Cerramos hoyos [2] y abrimos gestion de usuarios [3]

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_3.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));
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
				miControlador.cambiarVentana(5,5);
				
			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_4.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));
			}

		});
		btnNewButton_5_4.setForeground(new Color(23, 22, 123));
		btnNewButton_5_4.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_4);

		JLabel lblNewLabel = new JLabel("AJUSTES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(153, 193, 241));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(65, 96, 150, 17);
		getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 193, 241));
		separator.setBounds(65, 111, 148, 2);
		getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(153, 193, 241));
		separator_1.setBounds(65, 92, 148, 9);
		getContentPane().add(separator_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(_05_Ajuste.class.getResource("/IMAGENES/icons8-ayuda-50.png")));
		lblNewLabel_2.setBounds(97, 0, 85, 85);
		getContentPane().add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(26, 95, 180));
		panel_1.setBounds(65, 122, 150, 366);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnPreguntas = new JButton("PREGUNTAS ");
		btnPreguntas.setForeground(new Color(153, 193, 241));
		btnPreguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPreguntas.setBounds(0, 31, 150, 45);
		btnPreguntas.setFont(new Font("Open Sans ExtraBold", Font.PLAIN, 12));
		btnPreguntas.setBorderPainted(false);
		btnPreguntas.setBackground(new Color(26, 95, 180));
		btnPreguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				_07_Preguntas_Panel p2 = new _07_Preguntas_Panel();
				p2.setSize(504, 425);
				p2.setLocation(0, 0);
				content.removeAll();
				content.add(p2, BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		panel_1.add(btnPreguntas);

		JButton btnContactanos = new JButton("CONTACTANOS");
		btnContactanos.setForeground(new Color(153, 193, 241));
		btnContactanos.setFont(new Font("Open Sans ExtraBold", Font.PLAIN, 12));
		btnContactanos.setBorderPainted(false);
		btnContactanos.setBackground(new Color(26, 95, 180));
		btnContactanos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				_06_Contactanos_Panel p1 = new _06_Contactanos_Panel();
				p1.setSize(613, 488);
				p1.setLocation(0, 0);
				content.removeAll();
				content.add(p1, BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		btnContactanos.setBounds(0, 111, 150, 45);
		panel_1.add(btnContactanos);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
