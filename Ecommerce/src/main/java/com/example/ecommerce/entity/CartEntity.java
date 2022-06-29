package com.example.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart", schema = "Ecommerce_db", catalog = "")
public class CartEntity {
    private int id;
    private String productId;
    private int quantity;
    private int userId;
    private String cartcol;
    private String cartcol1;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "cartcol")
    public String getCartcol() {
        return cartcol;
    }

    public void setCartcol(String cartcol) {
        this.cartcol = cartcol;
    }

    @Basic
    @Column(name = "cartcol1")
    public String getCartcol1() {
        return cartcol1;
    }

    public void setCartcol1(String cartcol1) {
        this.cartcol1 = cartcol1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartEntity that = (CartEntity) o;

        if (id != that.id) return false;
        if (quantity != that.quantity) return false;
        if (userId != that.userId) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (cartcol != null ? !cartcol.equals(that.cartcol) : that.cartcol != null) return false;
        if (cartcol1 != null ? !cartcol1.equals(that.cartcol1) : that.cartcol1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + userId;
        result = 31 * result + (cartcol != null ? cartcol.hashCode() : 0);
        result = 31 * result + (cartcol1 != null ? cartcol1.hashCode() : 0);
        return result;
    }
}
