package com.example.banksystemproject.repository;

import com.example.banksystemproject.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {


}
