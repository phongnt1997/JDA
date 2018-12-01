
import dbo.Item;
import dbo.Items;
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
public class ItemFullModel extends AbstractTableModel{
    Items items = null;

    public ItemFullModel(Items items) {
        this.items = items;
        
    }

    public Items getItems() {
        return items;
    }
    
    
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item item = items.get(rowIndex);
        Object obj = null;
        switch(columnIndex) {
            case 0: obj = item.getItemcode();break;
            case 1: obj = item.getItemName();break;
            case 2: obj = item.getSupplier().getSupCode();break;
            case 3: obj = item.getUnit();break;
            case 4: obj = item.getPrice();break;
            case 5: obj = item.isSupplying();break;
            
        }
        return obj;
    }
    public String getColumnName(int column){
        String colName ="";
        switch(column) {
            case 0: colName = "Code"; break;
            case 1: colName = "Name"; break;
            case 2: colName = "Supplier"; break;
            case 3: colName = "Unit"; break;
            case 4: colName = "Price"; break;
            case 5: colName = "Supply"; break;
        }
        return colName;
    }
    
}
