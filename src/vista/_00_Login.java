package vista;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import controlador.Controlador;
import modelo.Modelo;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class _00_Login extends JFrame implements Vistas {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblIcono_1;
	private JLabel lblIcono3;
	private JTextField txtUsr;
	private JButton btnLogin;
	private JLabel lblIcono4;
	private JLabel lblIcono4_1;
	private JPasswordField txtPwd;
	private JLabel lblRespuesta;

	public _00_Login() {
		setSize(869, 461);
		setLocationRelativeTo(null);
		setResizable(false);
		setBackground(new Color(30, 39, 89));
		getContentPane().setBackground(new Color(23, 22, 123));
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setBackground(new Color(63, 108, 191));
		panel.setSize(465, 422);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-10, 59, 475, 363);
		lblNewLabel.setIcon(new ImageIcon(_00_Login.class.getResource("/IMAGENES/GolfLaFinca01.jpg")));
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel(" GREEN Gestión de Campo");
		lblNewLabel_1.setBounds(63, 12, 323, 36);
		lblNewLabel_1.setForeground(new Color(138, 177, 236));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(_00_Login.class.getResource("/IMAGENES/java.png")));
		Image img = new ImageIcon(_00_Login.class.getResource("/IMAGENES/java.png")).getImage();
		ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

		JLabel lblNewLabel_3 = new JLabel("TOP");
		lblNewLabel_3.setIcon(new ImageIcon(_00_Login.class.getResource("/IMAGENES/LafincaTOP.png")));
		Image img2 = new ImageIcon(_00_Login.class.getResource("/IMAGENES/LafincaTOP.png")).getImage();
		ImageIcon icon2 = new ImageIcon(img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(63, 108, 191));
		panel_1.setBounds(464, 0, 393, 422);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(_00_Login.class.getResource("/IMAGENES/logogolflogin.png")));
		Image img3 = new ImageIcon(_00_Login.class.getResource("/IMAGENES/logogolflogin.png")).getImage();
		ImageIcon icon3 = new ImageIcon(img3.getScaledInstance(120, 100, Image.SCALE_SMOOTH));

		lblIcono4_1 = new JLabel(new ImageIcon(_00_Login.class.getResource("/IMAGENES/pass.png")));
		lblIcono4_1.setBounds(50, 257, 45, 46);
		panel_1.add(lblIcono4_1);
		lblIcono3 = new JLabel(new ImageIcon(_00_Login.class.getResource("/IMAGENES/LOGO-LAFINCA-GOLF-LAGOS1.jpg")));
		lblIcono3.setBounds(110, 44, 171, 124);
		panel_1.add(lblIcono3);

		txtUsr = new JTextField();
		txtUsr.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsr.setBackground(new Color(153, 193, 241));
		txtUsr.setBounds(104, 217, 177, 29);
		panel_1.add(txtUsr);
		txtUsr.setColumns(10);

		txtPwd = new JPasswordField();
		txtPwd.setBackground(new Color(153, 193, 241));
		txtPwd.setBounds(104, 271, 177, 27);
		panel_1.add(txtPwd);
		txtPwd.addKeyListener(new KeyAdapter() {
			// entrar con enter 
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick();
				}
				
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.login();
			}
		});
		
		
		

		lblRespuesta = new JLabel("");
		lblRespuesta.setForeground(Color.RED);
		lblRespuesta.setBounds(60, 138, 212, 14); // ajustar
		getContentPane().add(lblRespuesta);

		btnLogin.setBackground(new Color(26, 95, 180));
		btnLogin.setForeground(new Color(153, 193, 241));
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 17));
		btnLogin.setBounds(145, 332, 105, 27);
		panel_1.add(btnLogin);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(_00_Login.class.getResource("/IMAGENES/userlogin.png")));
		Image img4 = new ImageIcon(_00_Login.class.getResource("/IMAGENES/userlogin.png")).getImage();
		ImageIcon icon4 = new ImageIcon(img4.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		lblIcono4 = new JLabel(new ImageIcon(_00_Login.class.getResource("/IMAGENES/userlogin.png")));
		lblIcono4.setBounds(50, 210, 45, 46);
		panel_1.add(lblIcono4);
	}

	public String getUsr() {
		return txtUsr.getText();

	}

	public String getPwd() {
		return String.valueOf(txtPwd.getPassword());
	}

	public String getSGBD() {

		String respuesta = "MySQL";

		return respuesta;
	}

	public void actualizar(String nom2) {
		String resultado = nom2;
		if (resultado.equals("Correcto")) {
			lblRespuesta.setText("");
			miControlador.cambiarLogin(); // cambiar a hoyo
		} else if (resultado.equals("Incorrecto")) {
			lblRespuesta.setText("Usuario o contraseña incorrectos");
			System.exit(0);
		}

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
	public String getRol() {
		// TODO Auto-generated method stub
		return null;
	}

}
