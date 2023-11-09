package vista;

//Prueba de Dani
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import controlador.Controlador;
import modelo.Modelo;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JMonthChooser;
import com.toedter.plaf.JCalendarTheme;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _01_Registro extends JFrame implements Vistas {

	private Controlador miControlador;
	private Modelo miModelo;

	private JTable miTabla;
	private JButton btnNewButton;
	private JButton btnNewButton_5;
	private JButton btnNewButton_5_1;
	private JButton btnNewButton_5_2;
	private JButton btnNewButton_5_3;
	private JTable table;
	private DefaultTableModel Tabla;
	private JTextField txtHasta;

	public _01_Registro() {
		setSize(839, 518);
		setLocationRelativeTo(null);
		setBackground(new Color(36, 31, 49));
		getContentPane().setBackground(new Color(30, 39, 89));
		JPanel panel_menu_1 = new JPanel();
		panel_menu_1.setForeground(new Color(255, 255, 255));
		panel_menu_1.setBackground(new Color(0, 51, 102));
		panel_menu_1.setSize(55, 488);
		getContentPane().add(panel_menu_1);

		btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 0, 55, 55);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		//
		btnNewButton.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user-50.png")));

		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
			}

			public void mouseExited(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-user-50.png")));
			}

		});
		panel_menu_1.setLayout(null);
		panel_menu_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(23, 22, 123));
		btnNewButton.setBackground(new Color(255, 255, 255));

		btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(0, 66, 55, 55);
		btnNewButton_5.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));

		btnNewButton_5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-edit.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
				miControlador.cambiarVentana(1, 2);

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons82.png")));
			}
		});
		btnNewButton_5.setForeground(new Color(23, 22, 123));
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5);

		btnNewButton_5_1 = new JButton("");
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

				miControlador.cambiarVentana(1, 1);
			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_1
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-document-24.png")));
			}

		});
		btnNewButton_5_1.setForeground(new Color(23, 22, 123));
		btnNewButton_5_1.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_1);

		btnNewButton_5_2 = new JButton("");
		btnNewButton_5_2.setBounds(0, 198, 55, 55);

		btnNewButton_5_2.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));

		btnNewButton_5_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_2
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia.gif")));

			}

			public void mouseClicked(MouseEvent e) {// Botón para gestionar los usuarios, accedes a la ventana de
													// gestión de usuarios y se cierra la anterior.
				// cuando haces clic
				miControlador.cambiarVentana(1, 3);// Cerramos hoyos [2] y abrimos gestion de usuarios [3]

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_2
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-conferencia-30.png")));
			}

		});
		btnNewButton_5_2.setForeground(new Color(23, 22, 123));
		btnNewButton_5_2.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_2);

		btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.setBounds(0, 264, 55, 55);
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_3.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));

		btnNewButton_5_3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {

				btnNewButton_5_3.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios.gif")));

			}

			public void mouseClicked(MouseEvent e) {
				// cuando haces clic
				miControlador.cambiarVentana(1, 5);

			}

			public void mouseExited(MouseEvent e) {
				btnNewButton_5_3
						.setIcon(new ImageIcon(_02_Hoyos.class.getResource("/IMAGENES/icons8-servicios-30.png")));
			}

		});
		btnNewButton_5_3.setForeground(new Color(23, 22, 123));
		btnNewButton_5_3.setBackground(new Color(255, 255, 255));
		panel_menu_1.add(btnNewButton_5_3);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(65, 198, 760, 281);
		panel_menu_1.add(scrollPane_1);

		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		JDateChooser dateChooser_desde = new JDateChooser();
		dateChooser_desde.setBounds(184, 0, 107, 19);
		panel_menu_1.add(dateChooser_desde);
		
		JDateChooser dateChooser_hasta = new JDateChooser();
		dateChooser_hasta.setBounds(433, 0, 114, 19);
		panel_menu_1.add(dateChooser_hasta);
		
		JTextArea txtrDesde = new JTextArea();
		txtrDesde.setText("desde");
		txtrDesde.setBounds(104, -3, 46, 22);
		panel_menu_1.add(txtrDesde);
		
		txtHasta = new JTextField();
		txtHasta.setText("hasta");
		txtHasta.setBounds(352, 0, 46, 19);
		panel_menu_1.add(txtHasta);
		txtHasta.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dia1, mes1, año1, dia2, mes2, año2;
				dia1 = dateChooser_desde.getCalendar().get(Calendar.DAY_OF_MONTH);
				mes1 = dateChooser_desde.getCalendar().get(Calendar.MONTH)+1;
				año1 = dateChooser_desde.getCalendar().get(Calendar.YEAR);
				dia2 = dateChooser_hasta.getCalendar().get(Calendar.DAY_OF_MONTH)+1;
				mes2 = dateChooser_hasta.getCalendar().get(Calendar.MONTH)+1;
				año2 = dateChooser_hasta.getCalendar().get(Calendar.YEAR);
				System.out.println("'"+año1 + "-" + mes1 + "-" + dia1+"'"+ "'"+año2 + "-" + mes2 + "-" +dia2+"'");
				table.setModel(miModelo.getTablaFecha("'"+año1 + "-" + mes1 + "-" + dia1+"'", "'"+año2 + "-" + mes2 + "-" +dia2+"'"));
			}
		});
		btnBuscar.setBounds(280, 70, 85, 21);
		panel_menu_1.add(btnBuscar);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(23, 22, 123));
		panel_1.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("Button.border"));
		panel.setBackground(new Color(53, 132, 228));
		panel.setBounds(12, 134, 206, 355);
		panel_1.add(panel);
		panel.setLayout(null);

		// tabla de base de datos
		miTabla = new JTable();
		miTabla.setBackground(new Color(30, 39, 89));
		miTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(miTabla);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {

				table.setModel(miModelo.getTabla());

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