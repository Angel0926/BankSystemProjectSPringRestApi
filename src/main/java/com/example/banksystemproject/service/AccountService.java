package com.example.banksystemproject.service;

import com.example.banksystemproject.dto.request.AccountRequestDto;
import com.example.banksystemproject.dto.responce.AccountResponseDto;
import com.example.banksystemproject.dto.responce.ClientAddressResponseDto;

import java.nio.file.attribute.UserPrincipalNotFoundException;


public interface AccountService {


    AccountResponseDto save(Long clientId, AccountRequestDto accountRequestDto) throws UserPrincipalNotFoundException;

    AccountResponseDto update(Long id, AccountRequestDto accountRequestDto) throws UserPrincipalNotFoundException;

    void delete(Long id) throws UserPrincipalNotFoundException;

    void transferToCard(double amount,Long fromAccountId,Long toAccountId);


    void transferToAccount(double amount, Long toAccountId);

    AccountResponseDto findById(Long id) throws UserPrincipalNotFoundException;
}
