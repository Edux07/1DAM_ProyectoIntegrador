package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JDateChooser;

import controlador.Controlador;
import modelo.Modelo;

public class _02_Hoyos extends JFrame implements Vistas {
	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel panel;
	private JSpinner spinnerHoyo;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnHoyos;
	private JFormattedTextField formattedTextFieldAltura;
	private JFormattedTextField formattedTextFieldFirmeza;
	private JFormattedTextField formattedTextFieldHumedad;
	private JFormattedTextField formattedTextFieldColor;
	private JFormattedTextField formattedTextFieldBote;
	private JFormattedTextField formattedTextFieldTemperatura;
	private JFormattedTextField formattedTextFieldVolumen;
	private JFormattedTextField formattedTextFieldVelocidad;
	private JDateChooser dateChooser;

	private Object[] imgHoyos = new Object[18];

	public _02_Hoyos() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(_02_Hoyos.class.getResource("/IMAGENES/laFinca.png")));
		setTitle("Gestión de hoyos");
		getContentPane().setBackground(new Color(0, 51, 102));
		setBounds(100, 100, 839, 518);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(55, 0, 247, 488);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Gestión de hoyos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(61, 9, 135, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Hoyo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 70, 51, 16);
		panel.add(lblNewLabel_1);

		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setBounds(20, 113, 51, 16);
		panel.add(lblFecha);

//el cambio de imagenes cuando cambia el valor de JSpinner
		// usar un array para todas las imagenes (cada imagen está como un objeto,
		// aplicando un método para ajustar el tamaño)

		spinnerHoyo = new JSpinner();
		spinnerHoyo.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				if (e.getWheelRotation() < 0) {
					int currentValue = (int) spinnerHoyo.getValue();
					if (currentValue < 18) {
						spinnerHoyo.setValue(currentValue + 1);
					}
				}
				if (e.getWheelRotation() >= 0) {
					int currentValue = (int) spinnerHoyo.getValue();
					if (currentValue > 1) {
						spinnerHoyo.setValue(currentValue - 1);
					}
				}
			}
		});
		spinnerHoyo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// Manejar el evento cuando cambia el valor en el JSpinner
				JSpinner spinner = (JSpinner) e.getSource();
				Object value = spinner.getValue();

				for (int k = 1; k <= 18; k++) {
					if ((int) value == k) {
						cambiarImagen((k - 1));
					}
				}

			}
		});

		spinnerHoyo.setModel(new SpinnerNumberModel(1, 1, 18, 1));
		spinnerHoyo.setBounds(79, 66, 135, 26);
		panel.add(spinnerHoyo);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(6, 36, 235, 12);
		panel.add(separator);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 204));
		panel_1.setBounds(10, 158, 227, 269);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblGest1 = new JLabel("Altura de siega:");
		lblGest1.setBounds(30, 33, 105, 16);
		panel_1.add(lblGest1);

		JLabel lblFirmeza = new JLabel("Firmeza:");
		lblFirmeza.setBounds(30, 61, 105, 16);
		panel_1.add(lblFirmeza);

		JLabel lblGest1_2 = new JLabel("Velocidad:");
		lblGest1_2.setBounds(30, 89, 105, 16);
		panel_1.add(lblGest1_2);

		JLabel lblGest1_3 = new JLabel("Bote:");
		lblGest1_3.setBounds(30, 117, 105, 16);
		panel_1.add(lblGest1_3);

		JLabel lblGest1_3_1 = new JLabel("Color:");
		lblGest1_3_1.setBounds(30, 145, 105, 16);
		panel_1.add(lblGest1_3_1);

		JLabel lblGest1_3_2 = new JLabel("Humedad:");
		lblGest1_3_2.setBounds(30, 173, 105, 16);
		panel_1.add(lblGest1_3_2);

		JLabel lblGest1_3_3 = new JLabel("Temperatura:");
		lblGest1_3_3.setBounds(30, 201, 105, 16);
		panel_1.add(lblGest1_3_3);

		JLabel lblGest1_3_4 = new JLabel("Volumen:");
		lblGest1_3_4.setBounds(30, 229, 105, 16);
		panel_1.add(lblGest1_3_4);

//TODO limitar el formato de datos (int sí, letras no)

		formattedTextFieldAltura = new JFormattedTextField();
		formattedTextFieldAltura.setBounds(132, 28, 49, 26);
		panel_1.add(formattedTextFieldAltura);

		formattedTextFieldFirmeza = new JFormattedTextField();
		formattedTextFieldFirmeza.setBounds(132, 56, 49, 26);
		panel_1.add(formattedTextFieldFirmeza);

		formattedTextFieldVelocidad = new JFormattedTextField();
		formattedTextFieldVelocidad.setBounds(132, 84, 49, 26);
		panel_1.add(formattedTextFieldVelocidad);

		formattedTextFieldBote = new JFormattedTextField();
		formattedTextFieldBote.setBounds(132, 112, 49, 26);
		panel_1.add(formattedTextFieldBote);

		formattedTextFieldColor = new JFormattedTextField();
		formattedTextFieldColor.setBounds(132, 140, 49, 26);
		panel_1.add(formattedTextFieldColor);

		formattedTextFieldHumedad = new JFormattedTextField();
		formattedTextFieldHumedad.setBounds(132, 168, 49, 26);
		panel_1.add(formattedTextFieldHumedad);

		formattedTextFieldTemperatura = new JFormattedTextField();
		formattedTextFieldTemperatura.setBounds(132, 196, 49, 26);
		panel_1.add(formattedTextFieldTemperatura);

		formattedTextFieldVolumen = new JFormattedTextField();
		formattedTextFieldVolumen.setBounds(132, 224, 49, 26);
		panel_1.add(formattedTextFieldVolumen);

// botón guardar con opcion de confirmación 
		btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
				// confirmacion
//TODO POP-UP de confirmación, pendiente poner yes en sí 
				int result = JOptionPane.showConfirmDialog(jFrame, "¿Estás seguro en guardar los datos?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				//generosidad de quique 
				UIManager.put("OptionPane.yesButtonText","Sí"); 

				if (result == 0) {
					setControlador(miControlador);
					try {
//insertado al base de datos todos los datos de hoyo
						//TODO MODIFICAR DATE PARA LA BASE DE DATOS
						System.out.println(getDate()); //prueba de syso
						miControlador.insertarHoyos(getFirmeza(), getHumedad(), getAltura(), getBote(), getVelocidad(),
								getColor(), getDate(), getTemperatura(), getVolumen(), (int) getHoyo());
						// eliminar los datos ya introducidos con setText("")
						formattedTextFieldAltura.setText("");
						formattedTextFieldFirmeza.setText("");
						formattedTextFieldHumedad.setText("");
						formattedTextFieldBote.setText("");
						formattedTextFieldVelocidad.setText("");
						formattedTextFieldColor.setText("");
						formattedTextFieldTemperatura.setText("");
						formattedTextFieldVolumen.setText("");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}

//					miControlador.guardar();
				else if (result == 1) {
					System.out.println("You pressed NO");
				}
			}
		});
		btnNewButton.setBounds(79, 445, 89, 23);
		panel.add(btnNewButton);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(81, 113, 133, 23);
		panel.add(dateChooser);

		JPanel panel_menu_1 = new JPanel();
		panel_menu_1.setForeground(new Color(255, 255, 255));
		panel_menu_1.setBackground(new Color(0, 51, 102));
		panel_menu_1.setBounds(0, 0, 55, 488);
		getContentPane().add(panel_menu_1);

		JButton btnPerfil = new JButton("");
		btnPerfil.setBounds(0, 0, 55, 55);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		//
		btnPerfil.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user-50.png")));

		btnPerfil.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnPerfil.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
			}

			public void mouseExited(MouseEvent e) {
				btnPerfil.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user-50.png")));
			}

		});
		panel_menu_1.setLayout(null);
		panel_menu_1.add(btnPerfil);
		btnPerfil.setForeground(new Color(23, 22, 123));
		btnPerfil.setBackground(new Color(255, 255, 255));

		btnHoyos = new JButton("");
		btnHoyos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHoyos.setBounds(0, 66, 55, 55);
		btnHoyos.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));

		btnHoyos.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnHoyos.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-edit.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
				miControlador.cambiarVentana(2, 2);

			}

			public void mouseExited(MouseEvent e) {
				btnHoyos.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));
			}
		});
		btnHoyos.setForeground(new Color(23, 22, 123));
		btnHoyos.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnHoyos);

		JButton btnRegistros = new JButton("");
		btnRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistros.setBounds(0, 132, 55, 55);

		//
		btnRegistros.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));

		btnRegistros.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnRegistros.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic

				miControlador.cambiarVentana(2, 1);
			}

			public void mouseExited(MouseEvent e) {
				btnRegistros.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));
			}

		});
		btnRegistros.setForeground(new Color(23, 22, 123));
		btnRegistros.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnRegistros);

		JButton btnAdministracion = new JButton("");
		btnAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdministracion.setBounds(0, 198, 55, 55);

		btnAdministracion.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));

		btnAdministracion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnAdministracion
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia.gif")));

			}

			public void mouseClicked(MouseEvent e) {// Botón para gestionar los usuarios, accedes a la ventana de
													// gestión de usuarios y se cierra la anterior.
				// cuando haces clic
				miControlador.cambiarVentana(2, 3);// Cerramos hoyos [2] y abrimos gestion de usuarios [3]

			}

			public void mouseExited(MouseEvent e) {
				btnAdministracion
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));
			}

		});
		btnAdministracion.setForeground(new Color(23, 22, 123));
		btnAdministracion.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnAdministracion);

		JButton btnAjustes = new JButton("");
		btnAjustes.setBounds(0, 264, 55, 55);
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjustes.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));

		btnAjustes.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnAjustes.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
				miControlador.cambiarVentana(2, 5);

			}

			public void mouseExited(MouseEvent e) {
				btnAjustes.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));
			}

		});
		btnAjustes.setForeground(new Color(23, 22, 123));
		btnAjustes.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnAjustes);

// JLabel de imagen de hoyos:
		// bucle para evitar repeticiones

		String[] imgPaths = { "/IMAGENES/hoyo1.png", "/IMAGENES/hoyo2.png", "/IMAGENES/hoyo3.png",
				"/IMAGENES/hoyo4.png", "/IMAGENES/hoyo5.png", "/IMAGENES/hoyo6.png", "/IMAGENES/hoyo7.png",
				"/IMAGENES/hoyo8.png", "/IMAGENES/hoyo9.png", "/IMAGENES/hoyo10.png", "/IMAGENES/hoyo11.png",
				"/IMAGENES/hoyo12.png", "/IMAGENES/hoyo13.png", "/IMAGENES/hoyo14.png", "/IMAGENES/hoyo15.png",
				"/IMAGENES/hoyo16.png", "/IMAGENES/hoyo17.png", "/IMAGENES/hoyo18.png" };

		for (int i = 0; i < imgPaths.length; i++) {
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBackground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(302, 0, 536, 488);

			ImageIcon ico = new ImageIcon(_02_Hoyos.class.getResource(imgPaths[i]));
			// Ajustar el tamaño de la imagen de forma automática
			ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_3.getWidth(),
					lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));

			lblNewLabel_3.setIcon(img);
			getContentPane().add(lblNewLabel_3);

			imgHoyos[i] = lblNewLabel_3;
		}

	}

//método para cambiar imagenes de hoyos

	public void cambiarImagen(int i) {
		for (int j = 0; j <= 17; j++) {
			((JLabel) imgHoyos[j]).setVisible(false);
		}
		((JLabel) imgHoyos[i]).setVisible(true);
	}

	public Object getHoyo() {
		return spinnerHoyo.getValue();
	}

	public Date getDate() {
//TODO retornar un Date -> String

		return dateChooser.getDate();

	}

	public String getAltura() {
		return formattedTextFieldAltura.getText();
	}

	public String getFirmeza() {
		return formattedTextFieldFirmeza.getText();
	}

	public String getVelocidad() {
		return formattedTextFieldVelocidad.getText();
	}

	public String getBote() {
		return formattedTextFieldBote.getText();
	}

	public String getColor() {
		return formattedTextFieldColor.getText();
	}

	public String getHumedad() {
		return formattedTextFieldHumedad.getText();
	}

	public String getTemperatura() {
		return formattedTextFieldTemperatura.getText();
	}

	public String getVolumen() {
		return formattedTextFieldVolumen.getText();
	}

	// actualizar una vez introducido los datos:
	public void actualizar() {
		// cambiar a introduccion de datos de inicio
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public String getUsr() {

		return null;
	}

	public String getPwd() {

		return null;
	}

	public String getSGBD() {

		return null;
	}

	public void actualizar(String prueba) {

	}

	public String getRol() {

		return null;
	}
}
