package evaluacion;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class vtn extends JFrame {
	
	logica gestor = new logica();
    public vtn(){
	
	this.setTitle("Listar Productos");
	this.setSize(600,400);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

  
    
    String[] productos = {"ID", "PRODUCTO","PRECIO" };
    DefaultTableModel modelo = new DefaultTableModel(null, productos);
    JTable tabla = new JTable(modelo);
    
    JButton bot = new JButton ("Listar Productos");
    
    JScrollPane scroll = new JScrollPane(tabla);

    this.add(bot, BorderLayout.NORTH);
	this.add(scroll, BorderLayout.CENTER);
    
    bot.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			gestor.listarProductos(modelo);
		}
	});

    }
}
