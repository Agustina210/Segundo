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
		panel1.setLayout(new GridLayout(6,2));
		
		Font fuente = new Font("Verdena", Font.CENTER_BASELINE, 16);
		
		Color Fondo = new Color(70, 185, 235);
		
		JLabel etiqueta4 = new JLabel("Edad:"); 
		etiqueta4.setForeground(Color.WHITE);
		etiqueta4.setFont(fuente);

		
		JLabel etiqueta1 = new JLabel("Nombre:"); 
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setFont(fuente);

		JLabel etiqueta2 = new JLabel("Apellido:"); 
		etiqueta2.setForeground(Color.WHITE);
		etiqueta2.setFont(fuente);
		
		JLabel etiqueta3 = new JLabel(); 
		etiqueta3.setForeground(Color.WHITE);
		etiqueta3.setFont(fuente);

		
		JTextField caja1 = new JTextField();		
		
		JTextField caja2 = new JTextField();
		
		JTextField caja3 = new JTextField();
		
		Persona[] hola = new Persona[10];
		
		JButton boton = new JButton("Aceptar");
		JButton boton2 = new JButton("Mostrar");
		JButton boton3 = new JButton("Mostrar en consola");
		
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
		panel1.add(boton3);
		panel1.add(etiqueta3);

		boton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < hola.length; i++) {
					if (hola[i] != null) {

		System.out.println(i+" -Nombre: " + hola[i].getNombre() + " " + hola[i].getApellido() + " Edad: " + hola[i].getEdad());
						
					} else {
						
					}

				}
				
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta3.setText(hola[0].getNombre()+" "+hola[0].getApellido()+ " "+hola[0].getEdad()+ " años");
			}
		});
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
					String nombre = caja1.getText();
					String apellido = caja2.getText();
					int edad = Integer.parseInt(caja3.getText());
					
					registra(hola, nombre, apellido, edad);

					
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