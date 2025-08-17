package Labiblioteca;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vtn extends JFrame {
	public Vtn() {
		this.setTitle("Registrar libro");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
this.setLayout(new GridLayout(1,1));
		
	
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setLayout(new GridLayout(4,2));
		
		Font fuente = new Font("Verdena", Font.CENTER_BASELINE, 16);
		
		Color Fondo = new Color(230, 166, 112);

		
		JLabel et1 = new JLabel("Titulo:"); 
		et1.setForeground(Color.WHITE);
		et1.setFont(fuente);

		JLabel et2 = new JLabel("Autor:"); 
		et2.setForeground(Color.WHITE);
		et2.setFont(fuente);
		
		JLabel et3 = new JLabel("ISBN:"); 
		et3.setForeground(Color.WHITE);
		et3.setFont(fuente);
		
		JTextField caja1 = new JTextField();		
		
		JTextField caja2 = new JTextField();
		
		JTextField caja3 = new JTextField();
		
		JButton btn1 = new JButton("Registrar libro");
		JButton btn2 = new JButton("Listar libros");
		
		Libros[] array = new Libros[10];
		
panel1.setBackground(Fondo);
		
		this.add(panel1);
		
		panel1.add(et1);
		panel1.add(caja1);
		panel1.add(et2);
		panel1.add(caja2);
		panel1.add(et3);
		panel1.add(caja3);
		panel1.add(btn1);
		panel1.add(btn2);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String titulo = caja1.getText();
				String autor = caja2.getText();
				int ISBN = Integer.parseInt(caja3.getText());
				
				registra(array, titulo, autor, ISBN);
				
			}

			private void registra(Libros[] array, String titulo, String autor, int iSBN) {
				for(int i = 0; i < array.length;i++) {
					if (array[i] == null) {
						array[i] = new Libros(titulo, autor, iSBN);
					System.out.println("Registrado exitosamente");
						break;
					}
				}	
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < array.length; i++) {
					if (array[i] != null) {
				System.out.println(i+ " -Titulo: " + array[i].getTitulo() + " -Autor: " + array[i].getAutor() + " -ISBN: " + array[i].getISBN());
					} else {
				}
				
			}
		}
	});
  }
}
