# 서비스 디스커버리 (클라이언트)

## 의존성 추가
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
* 디스커버리 클라이언트는 어플리케이션 시작 후 등록 과 종료 전 등록/해제를 담당
* 유레카 서버로부터 주기적을 최신 서비스 목록을 받아옴
* 서버로부터 데이터를 가져와서 캐싱하고 주기적으로 변경사항을 점검  
---   
* 어플리케이션을 중지하기 위해서는 스프링 액추에이터의 /shutdown api를 사용하는 것이다.  
* actuator 의존성 추가
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```