package com.example.ecommerce.entity;

import javax.persistence.*;

@Entity
@Table(name = "wallet", schema = "Ecommerce_db", catalog = "")
public class WalletEntity {
    private int id;
    private int userId;
    private int amount;
    private String walletcol;
    private String walletcol1;
    private String walletcol2;
    private String walletcol3;

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
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "amount")
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "walletcol")
    public String getWalletcol() {
        return walletcol;
    }

    public void setWalletcol(String walletcol) {
        this.walletcol = walletcol;
    }

    @Basic
    @Column(name = "walletcol1")
    public String getWalletcol1() {
        return walletcol1;
    }

    public void setWalletcol1(String walletcol1) {
        this.walletcol1 = walletcol1;
    }

    @Basic
    @Column(name = "walletcol2")
    public String getWalletcol2() {
        return walletcol2;
    }

    public void setWalletcol2(String walletcol2) {
        this.walletcol2 = walletcol2;
    }

    @Basic
    @Column(name = "walletcol3")
    public String getWalletcol3() {
        return walletcol3;
    }

    public void setWalletcol3(String walletcol3) {
        this.walletcol3 = walletcol3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WalletEntity that = (WalletEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (amount != that.amount) return false;
        if (walletcol != null ? !walletcol.equals(that.walletcol) : that.walletcol != null) return false;
        if (walletcol1 != null ? !walletcol1.equals(that.walletcol1) : that.walletcol1 != null) return false;
        if (walletcol2 != null ? !walletcol2.equals(that.walletcol2) : that.walletcol2 != null) return false;
        if (walletcol3 != null ? !walletcol3.equals(that.walletcol3) : that.walletcol3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + amount;
        result = 31 * result + (walletcol != null ? walletcol.hashCode() : 0);
        result = 31 * result + (walletcol1 != null ? walletcol1.hashCode() : 0);
        result = 31 * result + (walletcol2 != null ? walletcol2.hashCode() : 0);
        result = 31 * result + (walletcol3 != null ? walletcol3.hashCode() : 0);
        return result;
    }
}
