# Smarket
> 미니 프로젝트 1조

## 1. 프로젝트 주제
- Spring boot를 활용한 신발 온라인 쇼핑 서비스 및 CRUD 기능 구현

## 2. 프로젝트 목적
- MySQL을 이용하여 쇼핑몰 데이터 베이스를 구축하고 Spring Container와 연결하는 미니프로젝트

- 자바 개발도구와 통합개발환경(IDE : Intergarated Development Environment) 사용

- ERD Cloud와 Github을 사용한 협업 경험

## 3. 프로젝트 구성원 및 역할
|이름|역할|
|:---:|---|
|김희연|CustDTO, ReviewDTO 및 CRUD 구현|
|박성훈|ProductDTO, Cart DTO 및 CRUD 구현|
|이현지|OrderlistDTO, OrderdetailDTO 및 CRUD 구현|
|공동|WishDTO 및 CRUD 구현, ERD 설계 및 CRUD 구현|

## 4. 프로젝트 기능 구현
- 고객정보 조회 기능
- 상품 내역 조회 기능
- 주문 내역 조회 기능
- 주문상세 페이지 구현
- 장바구니 페이지 구현
- 리뷰내용 조회 기능
- 위시리스트 조회 기능

## 5. 프로젝트 개발 환경 및 수행 도구
<img width="801" alt="스크린샷 2022-09-23 오후 5 18 28" src="https://user-images.githubusercontent.com/86956783/191921270-7fc4fd93-8c68-4aaf-a6ed-cbf87f3ab95b.png">

## 6. 데이터베이스 설계
![smarket_db](https://user-images.githubusercontent.com/86956783/191921388-e9115169-476f-44cc-b112-14349a20377b.png)

## 7. 💥 트러블슈팅
|이름|발생 오류|해결 방법|
|---|---|--|
|김희연|@Repository, @Service, @Autowired 등의 어노테이션이 추가되지 않아 Bean이 생성되지 않는 오류|오류메세지를 확인하여 어노테이션을 추가하여 해결하였습니다.|
|박성훈|UnsatisfiedDependencyException 발생|mapper.xml 파일의 mapper namespace 경로를 수정하여 해결하였습니다.|
|이현지|query문 작성시 Database의 column명과 DTO의 column명 일치하지 않음|DTO의 column명과 일치하는 alias를 적용하여 해결하였습니다.|

