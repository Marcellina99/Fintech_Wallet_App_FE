package com.decagon.fintechpaymentapisqd11a.repositories;

<<<<<<< HEAD
=======

>>>>>>> origin/develop
import com.decagon.fintechpaymentapisqd11a.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Wallet findWalletByUsersId(Long UserId);

}
=======
@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
>>>>>>> origin/develop
