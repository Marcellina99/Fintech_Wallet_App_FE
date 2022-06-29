package com.example.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "Ecommerce_db", catalog = "")
public class CategoryEntity {
    private int id;
    private String categoryName;
    private String categoryDescription;
    private ProductsEntity productsById;

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
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_description")
    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != that.id) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryDescription != null ? !categoryDescription.equals(that.categoryDescription) : that.categoryDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryDescription != null ? categoryDescription.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "categoryById")
    public ProductsEntity getProductsById() {
        return productsById;
    }

    public void setProductsById(ProductsEntity productsById) {
        this.productsById = productsById;
    }
}
