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
public class ItemDBAccess extends DBAccess{
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String url = "jdbc:sqlserver://localhost:1433; databasename=ItemDB; user=sa;password=phong123";

    public ItemDBAccess() {
        super();
        connectDB(driver, url);
    }
    
}
