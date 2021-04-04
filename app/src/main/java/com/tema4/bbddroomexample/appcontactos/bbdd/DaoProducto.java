package com.tema4.bbddroomexample.appcontactos.bbdd;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

/**
 * Created by Sergio on 04/04/2021.
 * Copyright (c) 2021 Qastusoft. All rights reserved.
 */

@Dao
public interface DaoProducto {
    
    //INSERTAR

    @Insert
    void insertTwoProducts (Producto prod1, Producto prod2);

    //ACTUALIZAR


    @Update
    void updateSomeProducts(Producto... productos);

    //ELIMINAR


    @Delete
    void deleteSomeProducts(Producto... productos);
    
    //CONSULTAS


    @Query("SELECT * FROM producto WHERE quantity BETWEEN :min AND :max")
    LiveData<List<Producto>> loadProductsBetweenQuantities(int min, int max);

    @Query("SELECT * FROM producto WHERE quantity > :number")
    LiveData<List<Producto>> loadProductsOverNumber(int number);

    @Query("SELECT COUNT(*) FROM producto")
    LiveData<Integer> countList();

    @Query("SELECT * FROM producto WHERE priority = 1")
    LiveData<List<Producto>> loadImportantProducts();


    @Query("UPDATE producto SET quantity = :quantity WHERE id = :id")
    void updateQuantity(int id, int quantity);


    @Query("DELETE FROM producto WHERE id = :id")
    void deleteById(int id);

    /*
    @Query("SELECT * FROM book " +
            "INNER JOIN loan ON loan.book_id = book.id " +
            "INNER JOIN user ON user.id = loan.user_id " +
            "WHERE user.name LIKE :userName")
    public List<Book> findBooksBorrowedByNameSync(String userName);
    */
}
