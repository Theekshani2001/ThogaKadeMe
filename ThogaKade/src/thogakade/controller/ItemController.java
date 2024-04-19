/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import thogakade.Model.Item;
import thogakade.Model.OrderDetail;
import thogakade.db.DBConnection;

/**
 *
 * @author niroth
 */
public class ItemController {
    
    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Item VALUES (?,?,?,?)");
        
        pstm.setObject(1, item.getCode());
        pstm.setObject(2, item.getDescription());
        pstm.setObject(3, item.getUnitPrice());
        pstm.setObject(4, item.getQtyOnHand());
        
        int affectedRows = pstm.executeUpdate();
        
        return affectedRows > 0;
        
    }
    
    public static ArrayList<Item> loadAllItems() throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Item");
        
        ArrayList<Item> alItems = new ArrayList<>();
        
        while(rst.next()){
            
            Item item = new Item();
            item.setCode(rst.getString(1));
            item.setDescription(rst.getString(2));
            item.setUnitPrice(rst.getDouble(3));
            item.setQtyOnHand(rst.getInt(4));
            
            alItems.add(item);
        }
        
        return alItems;
        
    }
    
    public static Item searchItem(String itemCode) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Item WHERE code='" + itemCode + "'");
        
        if (rst.next()){
            Item item = new Item();
            item.setCode(rst.getString(1));
            item.setDescription(rst.getString(2));
            item.setUnitPrice(rst.getDouble(3));
            item.setQtyOnHand(rst.getInt(4));
            
            return item;
        }else{
            return null;
        }
        
    }

    public static boolean updateStockDec(ArrayList<OrderDetail> itemDetailList) throws ClassNotFoundException, SQLException {
        for (OrderDetail itemDetail : itemDetailList) {
            boolean isUpdate = ItemController.updateStockDec(itemDetail);
            if(!isUpdate){
                return false;
            }
        }
        return true;
    }
    public static boolean updateStockDec(OrderDetail itemDetail) throws ClassNotFoundException, SQLException{
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Item set qtyOnHand=qtyOnHand-? where code=?");
        stm.setObject(1, itemDetail.getQty());
        stm.setObject(2, itemDetail.getItemCode());
        return stm.executeUpdate()>0;
    }
}
