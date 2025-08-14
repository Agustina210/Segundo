package implementacion2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class miVentana extends JFrame {
	public miVentana() {
		this.setTitle("Calculadora");
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());{
			
			
			
			JPanel panel1 = new JPanel();
			panel1.setLayout(null);
			panel1.setLayout(new GridLayout(2,2));

			
			JPanel panel2 = new JPanel();
			panel2.setLayout(null);
			panel2.setLayout(new FlowLayout(FlowLayout.LEADING));
			
			
			Font fuente = new Font("Verdena", Font.CENTER_BASELINE, 16);
			


			JLabel e1 = new JLabel("Numero: "); 
			e1.setForeground(Color.BLACK);
			e1.setFont(fuente);

			JLabel e2 = new JLabel("Numero: "); 
			e2.setForeground(Color.BLACK);
			e2.setFont(fuente);
			
			JLabel e3 = new JLabel();
			e3.setForeground(Color.BLACK);
			e3.setFont(fuente);
			
			JTextField c1 = new JTextField();		
			
			JTextField c2 = new JTextField();
			
			JButton b1 = new JButton("+");
			JButton b2 = new JButton("-");
			JButton b3 = new JButton("x");
			JButton b4 = new JButton("/");	
			
			
			
			this.add(panel1);		
			panel1.add(e1);
			panel1.add(c1);
			panel1.add(e2);
			panel1.add(c2);
			this.add(panel2);
			panel2.add(b1);
			panel2.add(b2);
			panel2.add(b3);
			panel2.add(b4);
			this.add(e3);
			
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(c1.getText());
					int n2 = Integer.parseInt(c2.getText());
					System.out.println("Resultado: "+ (n1+n2));
					e3.setText("Resultado: "+ (n1+n2));
				/*	suma = n1+n2;
					resta = n1-n2;
					mult = n1 * n2;
					div = n1/n2;
					resto = n1%n2;*/
				}
			});
			
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(c1.getText());
					int n2 = Integer.parseInt(c2.getText());
					System.out.println("Resultado: "+ (n1-n2));
					e3.setText("Resultado: "+ (n1-n2));
				}
			});
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(c1.getText());
					int n2 = Integer.parseInt(c2.getText());
					System.out.println("Resultado: "+ (n1*n2));
					e3.setText("Resultado: "+ (n1*n2));
					
				}
			});
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int n1 = Integer.parseInt(c1.getText());
					int n2 = Integer.parseInt(c2.getText());
					System.out.println("Resultado: "+ (n1/n2));
					e3.setText("Resultado: "+ (n1/n2));
					
				}
			});
		
}
	}
}
