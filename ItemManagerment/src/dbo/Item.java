/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

/**
 *
 * @author PhongNTSE1997
 */
public class Item {
    String itemcode="", itemName=""; Supplier supplier=null;
    String unit=""; int price=0; boolean supplying=false;

    public Item() {
    }

    public Item(String itemcode, String itemName, Supplier supplier, String unit, int price, boolean supplying) {
        this.itemcode = itemcode;
        this.itemName = itemName;
        this.supplier = supplier;
        this.unit = unit;
        this.price = price;
        this.supplying = supplying;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSupplying() {
        return supplying;
    }

    public void setSupplying(boolean supplying) {
        this.supplying = supplying;
    }
    
    
}
