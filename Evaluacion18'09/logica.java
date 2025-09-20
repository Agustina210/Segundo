package evaluacion;
import javax.swing.table.DefaultTableModel;
public class logica {
	MySQL sql = new MySQL();
	public static void main(String[] args) {
		
		
		vtn vtn1 = new vtn();
		vtn1.setVisible(true);
		
		

	}
public void listarProductos(DefaultTableModel modelo) {
		
		sql.listar(modelo);
}
}
