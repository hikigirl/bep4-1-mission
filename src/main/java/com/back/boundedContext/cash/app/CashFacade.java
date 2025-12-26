package com.back.boundedContext.cash.app;

import com.back.boundedContext.cash.domain.CashMember;
import com.back.boundedContext.cash.domain.Wallet;
import com.back.boundedContext.cash.out.CashMemberRepository;
import com.back.boundedContext.cash.out.WalletRepository;
import com.back.shared.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CashFacade {
    //Facade는 usecase를 호출하는 역할..
    private final CashMemberRepository cashMemberRepository;
    private final WalletRepository walletRepository;

    @Transactional
    public CashMember syncMember(MemberDto memberDto) {
        CashMember member = new CashMember(
                memberDto.getId(),
                memberDto.getCreateDate(),
                memberDto.getModifyDate(),
                memberDto.getUsername(),
                "",
                memberDto.getNickname(),
                memberDto.getActivityScore()
        );
        return cashMemberRepository.save(member);
    }

    @Transactional
    public Wallet createWallet(CashMember holder) {
        Wallet wallet = new Wallet(holder);
        return walletRepository.save(wallet);
    }

    @Transactional(readOnly = true)
    public Optional<CashMember> findMemberByUsername(String username) {
        return cashMemberRepository.findByUsername(username);
    }

    @Transactional(readOnly = true)
    public Optional<Wallet> findWalletByHolder(CashMember holder) {
        return walletRepository.findByHolder(holder);
    }

}
