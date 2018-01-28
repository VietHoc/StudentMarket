package com.example.viethoc.studentmaket.models;

/**
 * Created by viethoc on 28/01/2018.
 */

public class TypeProduct {
    private int typeId;
    private String typeName;
    public TypeProduct(int typeId, String typeName) {
        super();
        this.typeId = typeId;
        this.typeName = typeName;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    @Override
    public String toString() {
        return "TypeProduct [typeId=" + typeId + ", typeName=" + typeName + "]";
    }

}