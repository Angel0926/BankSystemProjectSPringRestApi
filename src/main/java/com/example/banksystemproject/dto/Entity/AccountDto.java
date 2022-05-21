package com.example.banksystemproject.dto.Entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class AccountDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "IBAN", nullable = false, unique = true, length = 30)
    private String IBAN;
    @Column(name = "account_balance", nullable = false, length = 30)
    private String accountBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_issuer_branch", nullable = false,
            foreignKey = @ForeignKey(name = "issuer_branch_account_fk"))
    public IssuerBranchDto issuerBranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_card_holder", nullable = false,
            foreignKey = @ForeignKey(name = "card_holder_account_fk"))
    private CardHolderDto cardHolder;


    public AccountDto() {
    }
}