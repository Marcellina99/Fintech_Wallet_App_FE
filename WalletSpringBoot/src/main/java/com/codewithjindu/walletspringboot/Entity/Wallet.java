package com.codewithjindu.walletspringboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Nullable()
//    @Size(min=2, max=30)
    private String firstName;

    //    @Size(max=11)
    private String accountNumber;

    //    @Size( max=100)
    private String description;

    //    (1=High, 2=Medium, 3=Low)
    //    @Min(1)
    //    @Max(3)
    private Integer priority;
    private Double currentBalance;
    @PrePersist
    public void setBalance(){
          this.currentBalance = new Double(0); 
    }
}
