package EjerciciosVentanas;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import PracticoIV.Persona;
public class miVentana extends JFrame {
	public miVentana() {
		this.setTitle("Registrar usuario"); //Establece el titulo de la ventana
		this.setSize(400, 400); // Tama;o en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion default al cerrar
		this.setLocationRelativeTo(null); //Posicion en la que inicia la ventana
	//	setResizable(false);
		this.setLayout(new GridLayout(1,1));
		
	
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setLayout(new GridLayout(5,2));
		
		Font fuente = new Font("Verdena", Font.CENTER_BASELINE, 16);
		
		Color Fondo = new Color(70, 185, 235);
		
		JLabel etiqueta4 = new JLabel("Edad:"); 
		etiqueta4.setForeground(Color.WHITE);
		etiqueta4.setFont(fuente);

		
		JLabel etiqueta1 = new JLabel("Nombre:"); 
		//etiqueta2.setBounds(50, 40, 100, 60);
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setFont(fuente);

		JLabel etiqueta2 = new JLabel("Apellido:"); 
		//etiqueta2.setBounds(50, 40, 100, 60);
		etiqueta2.setForeground(Color.WHITE);
		etiqueta2.setFont(fuente);
		
		JLabel etiqueta3 = new JLabel(); 
		etiqueta3.setForeground(Color.WHITE);
		etiqueta3.setFont(fuente);

		
		JTextField caja1 = new JTextField();
		//caja1.setBounds(121, 62, 110, 20);
		
		
		JTextField caja2 = new JTextField();
		//caja2.setBounds(121, 102, 110, 20);
		
		JTextField caja3 = new JTextField();
		
		Persona[] hola = new Persona[10];
		
		JButton boton = new JButton("Aceptar");
		JButton boton2 = new JButton("Mostrar");
		
		panel1.setBackground(Fondo);
		
		this.add(panel1);
		
		panel1.add(etiqueta1);
		panel1.add(caja1);
		panel1.add(etiqueta2);
		panel1.add(caja2);
		panel1.add(etiqueta4);
		panel1.add(caja3);
		panel1.add(boton);
		panel1.add(boton2);
		panel1.add(etiqueta3);

		
		
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta3.setText(hola[0].getNombre()+" "+hola[0].getApellido()+ " "+hola[0].getEdad()+ " años");
			}
		});
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//String nombre = caja1.getText();
				//String apellido = caja2.getText();
			//	int edad = (int)caja3.getText();
				
					
					String nombre = caja1.getText();
					String apellido = caja2.getText();
					int edad = Integer.parseInt(caja3.getText());
					
					registra(hola, nombre, apellido, edad);
					
				//	System.out.println(hola[0].getNombre()+" "+hola[0].getApellido());
				
			//System.out.println("Informacion ingresada: " + caja1.getText() + " " + caja2.getText());
			//etiqueta3.setText( caja1.getText() + " " + caja2.getText());
			}
		});

	
		    



		
		
		
		

	}

	
	public static void registra(Persona[] hola, String nombre, String apellido, int edad) {
		
		for(int i = 0; i < hola.length;i++) {
			
			if (hola[i] == null) {
				hola[i] = new Persona(nombre, apellido, edad);
				break;
			}
		
	    }
	}
}