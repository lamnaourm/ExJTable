import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModelProd extends AbstractTableModel {
	
	ArrayList<Produit> prods;
	String[] cols;
	
	public ModelProd(ArrayList<Produit> prods, String[] cols) {
		super();
		this.prods = prods;
		this.cols = cols;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return prods.size();
	}

	@Override
	public String getColumnName(int c) {
		return cols[c];
	}
	@Override
	public Object getValueAt(int row, int col) {
		Produit p = prods.get(row);
		
		switch (col) {
		case 0:return p.getId();
		case 1:return p.getLibelle();
		case 2:return p.getPrix();
		}
		return null;
	}

}
