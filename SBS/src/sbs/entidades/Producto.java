package sbs.entidades;

public class Producto {
    public int idProducto;
    public String nameProduct;
    public Double costProduct;
    public String stockProduct;
    public String defectiveProduct;
    public String categoriaProduct;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(Double costProduct) {
        this.costProduct = costProduct;
    }

    public String getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(String stockProduct) {
        this.stockProduct = stockProduct;
    }

    public String getDefectiveProduct() {
        return defectiveProduct;
    }

    public void setDefectiveProduct(String defectiveProduct) {
        this.defectiveProduct = defectiveProduct;
    }

    public String getCategoriaProduct() {
        return categoriaProduct;
    }

    public void setCategoriaProduct(String categoriaProduct) {
        this.categoriaProduct = categoriaProduct;
    }
}
