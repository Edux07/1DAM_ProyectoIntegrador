package vista;

import modelo.*;

import controlador.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class _08_Control_Panel extends JPanel implements Vistas{

	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnHoyos;

	public _08_Control_Panel() {

		JPanel panel_menu_1 = new JPanel();
		panel_menu_1.setForeground(new Color(255, 255, 255));
		panel_menu_1.setBackground(new Color(0, 51, 102));
		panel_menu_1.setBounds(0, 0, 55, 488);

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
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_2.setBounds(0, 66, 55, 55);
		btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));

		btnNewButton_5_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-edit.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
				miControlador.cambiarVentana(2, 2);

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));
			}
		});
		btnNewButton_5_2.setForeground(new Color(23, 22, 123));
		btnNewButton_5_2.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_2);

		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setBounds(0, 132, 55, 55);

		//
		btnNewButton_5_1.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));

		btnNewButton_5_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_1.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic

				miControlador.cambiarVentana(2, 1);
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
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
				miControlador.cambiarVentana(2, 3);// Cerramos hoyos [2] y abrimos gestion de usuarios [3]

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
				miControlador.cambiarVentana(2, 5);

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_4
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));
			}

		});
		btnNewButton_5_4.setForeground(new Color(23, 22, 123));
		btnNewButton_5_4.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_4);

		
	}

	@Override
	public void setModelo(Modelo miModelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(Controlador miControlador) {
		// TODO Auto-generated method stub
		
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
