package com.decagon.fintechpaymentapisqd11a.services;

<<<<<<< HEAD
import com.decagon.fintechpaymentapisqd11a.dto.WalletDto;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Service
public interface WalletService {
    WalletDto viewWalletDetails(Long UserId) throws UserPrincipalNotFoundException;
=======
import com.decagon.fintechpaymentapisqd11a.models.Wallet;
import com.decagon.fintechpaymentapisqd11a.request.FlwWalletRequest;
import org.springframework.boot.configurationprocessor.json.JSONException;

public interface WalletService {

    Wallet createWallet(FlwWalletRequest walletRequest) throws JSONException;
>>>>>>> origin/develop
}
