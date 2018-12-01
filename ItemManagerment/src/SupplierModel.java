
import dbo.Supplier;
import dbo.Suppliers;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhongNTSE1997
 */
public class SupplierModel extends AbstractTableModel{
    Suppliers suppliers = null;

    public SupplierModel(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }
    
    

    @Override
    public int getRowCount() {
        return suppliers.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Supplier supplier = suppliers.get(rowIndex);
        Object obj = null;
        switch(columnIndex) {
            case 0: obj = supplier.getSupCode();break;
            case 1: obj = supplier.getSupName();break;
            case 2: obj = supplier.getAddress();break;
            case 3: obj = supplier.isColloborating();break;
            
            
        }
        return obj;
    }
    
    public String getColumnName(int column){
        String colName ="";
        switch(column) {
            case 0: colName = "Code"; break;
            case 1: colName = "Name"; break;
            case 2: colName = "Address"; break;
            case 3: colName = "Colloborating"; break;
           
        }
        return colName;
    }
    
    
}
