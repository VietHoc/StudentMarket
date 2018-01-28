package com.example.viethoc.studentmaket.controllers;

/**
 * Created by viethoc on 28/01/2018.
 */

import java.util.ArrayList;

import com.android.studentmarket.models.Product;
import com.android.studentmarket.models.TypeProduct;
import com.android.studentmarket.models.User;

public class Manager {
    private static Manager sInstance = null;
    private ArrayList<Product> mProductList;
    private ArrayList<TypeProduct> mTypeList;
    private ArrayList<User> mUserList;

    private Manager(){
        mProductList = new ArrayList<>();
        mTypeList = new ArrayList<>();
        mUserList = new ArrayList<>();
    }

    public static Manager getInstance(){
        if(sInstance == null) {
            sInstance = new Manager();
        }
        return sInstance;
    }
    public void load() {
        mTypeList.clear();
        mProductList.clear();
        mUserList.clear();

        mTypeList.add(new TypeProduct(1, "Book"));
        mTypeList.add(new TypeProduct(2, "Part time work"));
        mTypeList.add(new TypeProduct(3, "Houseware"));

        mProductList.add(new Product(1,"Math",20000,"Liên Chiểu",1,1));
        mProductList.add(new Product(1,"History",10000,"Hải Châu",2,1));
        mProductList.add(new Product(1,"Physical",20000,"Sơn Trà",3,1));
        mProductList.add(new Product(1,"Staff",20000,"Liên Chiểu",1,2));
        mProductList.add(new Product(1,"Tutor",20000,"Hải Châu",2,2));
        mProductList.add(new Product(1,"salesman",20000,"Sơn Trà",3,2));
        mProductList.add(new Product(1,"Lamp",20000,"Liên Chiểu",1,3));
        mProductList.add(new Product(1,"Fan",20000,"Hải Châu",2,3));
        mProductList.add(new Product(1,"Pot",20000,"Sơn Trà",3,3));

        mUserList.add(new User(1,"Nguyễn Văn Anh","0167245654"));
        mUserList.add(new User(2,"Trần Kim Ngọc","0165364646"));
        mUserList.add(new User(3,"Lê Anh Duy","0169753544"));


    }
}

