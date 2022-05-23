# 데이터 아키텍처 설계 - 시험

### 순서
- 스프링부트 프로젝트 세팅
- 테이블 생성 boardTbl(id, title, content, createDate)
- 더미데이터 만들기 10건!!
```sql
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트1강', '프로젝트 세팅하기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트2강', 'yml 만들기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트3강', '뷰 만들기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트4강', '엔티티 만들기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트5강', '컨트롤러 만들기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트6강', '서비스 만들기기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트7강', '검색 쿼리 만들기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트8강', '검색 화면 완성하기', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트9강', '프로젝트 테스트 검증', NOW());
INSERT INTO boardtbl(title,content,createDate) 
VALUES('스프링부트10강', '프로젝트 완료', NOW());

COMMIT;
```
- mustache 메인 페이지 (부트스트랩 테이블, 검색바)
- JPA에 제공하지 않기 때문에 네이티브 쿼리 생성
```sql
SELECT * FROM boardTbl WHERE title like '%:keyword%';
```
- mustache에서 form 태그로 요청  or fetch 요청

### 팁
- Get요청은 a태그, form태그
- Get요청을 fetch로 하는 경우 - 어떤 경우일지?