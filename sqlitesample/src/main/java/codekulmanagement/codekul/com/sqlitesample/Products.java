package codekulmanagement.codekul.com.sqlitesample;

/**
 * Created by Ajinkya Virkud on 4/9/2017.
 */

public class Products {
    private int _id;
    private String productName;

    public Products(){

    }

    public Products(String productName) {
        this.productName = productName;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int get_id() {
        return _id;
    }

    public String getProductName() {
        return productName;
    }
}
