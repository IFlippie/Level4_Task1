package com.iflippie.level4_task1.repositories

import android.content.Context
import com.iflippie.level4_task1.Product
import com.iflippie.level4_task1.ShoppingListRoomDatabase
import com.iflippie.level4_task1.dao.ProductDao

class ProductRepository(context: Context) {

    private val productDao: ProductDao

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Product> = productDao.getAllProducts()

    suspend fun insertProduct(product: Product) = productDao.insertProduct(product)

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)

    suspend fun deleteAllProducts() = productDao.deleteAllProducts()

}
