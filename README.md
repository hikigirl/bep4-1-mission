# 도메인 주도 설계(DDD)

### 쿼리

``` sql
SELECT * FROM BATCH_JOB_EXECUTION;
SELECT * FROM BATCH_JOB_EXECUTION_CONTEXT;
SELECT * FROM BATCH_JOB_EXECUTION_PARAMS;
SELECT * FROM BATCH_JOB_INSTANCE;
SELECT * FROM BATCH_STEP_EXECUTION;
SELECT * FROM BATCH_STEP_EXECUTION_CONTEXT;
```

``` sql
SELECT * FROM CASH_CASH_LOG;
SELECT * FROM CASH_MEMBER;
SELECT * FROM CASH_WALLET;
```

``` sql
SELECT * FROM MARKET_CART;
SELECT * FROM MARKET_CART_ITEM;
SELECT * FROM MARKET_MEMBER;
SELECT * FROM MARKET_ORDER;
SELECT * FROM MARKET_ORDER_ITEM;
SELECT * FROM MARKET_PRODUCT;
```

``` sql
SELECT * FROM MEMBER_MEMBER;
```

``` sql
SELECT * FROM PAYOUT_MEMBER;
SELECT * FROM PAYOUT_PAYOUT;
SELECT * FROM PAYOUT_PAYOUT_CANDIDATE_ITEM;
SELECT * FROM PAYOUT_PAYOUT_ITEM;
```

``` sql
SELECT * FROM POST_MEMBER;
SELECT * FROM POST_POST;
SELECT * FROM POST_POST_COMMENT;
```

---

### 토스 페이먼츠

- [토스 페이먼츠, 내 개발정보](https://developers.tosspayments.com/my/api-logs)
  - API 개별 연동 키
  - 테스트 클라이언트 키
  - 시크릿 키
  - API 로그
  - 테스트 결제내역

### 토스 페이먼츠 테스트

- [결제시도](https://codepen.io/jangka44/debug/yyJBXaM)
  - [소스코드](https://codepen.io/jangka44/pen/yyJBXaM?editors=1000)
- [최종승인](https://codepen.io/jangka44/debug/GgqKEWV)
  - 직접 접근 금지
  - [소스코드](https://codepen.io/jangka44/pen/GgqKEWV?editors=1000)
- [결제실패](https://codepen.io/jangka44/debug/xbOKrdJ)
  - 직접 접근 금지
  - [소스코드](https://codepen.io/jangka44/pen/xbOKrdJ?editors=1000)