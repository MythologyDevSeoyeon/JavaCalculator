# 자바 계산기 프로젝트
내일배움캠프 spring 5기 개인 프로젝트입니다.
<br><br><br>

## 목차
* [프로젝트 설명](#프로젝트-설명)
* [주요 기능](#주요-기능)
* [사용 방법](#사용-방법)
* [프로젝트 구조](#프로젝트-구조)
* [사용된 기술](#사용된-기술)
* [Contact](#contact)
<br><br><br>

## 프로젝트 설명
자바기반의 기본 사칙연산을 제공하는 간단한 계산기를 구현하였습니다.
<br>계산 결과를 저장하고 삭제할 수 있는 기능을 포함하며,
<br>사용자가 효율적으로 계산을 수행할 수 있는 기능을 제공합니다.
- `Calculator1`: 기본 사칙연산과 입력 유효성 검사를 제공하는 간단한 콘솔 애플리케이션.
- `Calculator2`: 계산 결과 저장 및 관리 기능을 추가한 향상된 버전.
<br><br><br>

## 주요 기능

### Calculator 1
- **기본 사칙연산**
  - 덧셈(`+`), 뺄셈(`-`), 곱셈(`*`), 나눗셈(`/`).
- **입력 유효성 검사**
  - 0으로 나누는 오류 방지
  - 유효한 연산 기호만 계산 허용
  - 유효하지 않은 숫자 재입력    
### Calculator 2
- **Calculator1의 모든 기능** 
- **결과 관리**
  - 계산 결과를 리스트에 저장 및 확인
  - 저장된 첫번째 결과를 삭제
<br><br><br>

## 사용 방법
### Calculator1
1. 애플리케이션 실행
2. 첫 번째 숫자, 두 번째 숫자, 연산자를 입력 (유효하지 않은 값 입력 시 재입력)
3. 결과 확인 후 추가 계산 진행을 하거나 종료
#### 사용예시
```
첫 번째 값을 입력하세요.
10
두 번째 값을 입력하세요
30
사칙 연산 기호를 입력하세요
*
계산 결과 : 10 * 30 = 300.0
더 계산하시겠습니까? (exit 입력 시 종료)
exit
```
### Calculator2
1. 애플리케이션 실행
2. 첫 번째 숫자, 두 번째 숫자, 연산자를 입력 (유효하지 않은 값 입력 시 재입력)
3. 계산된 결과는 저장하거나 저장된 결과를 삭제여부 확인
4. 추가 계산을 진행하거나 종료
#### 사용예시
```
첫 번째 값을 입력하세요
10
두 번째 값을 입력하세요
30
연산자를 입력하세요
*
결과: 10 * 30 = 300
저장된 값: [300]
첫번째 값을 삭제 하겠습니까? yes 입력 시 삭제
yes
삭제 후 저장된 값: []
종료하시겠습니까? exit 입력 시 종료
exit
```
<br><br><br>


## 프로젝트 구조
### Calculator1
- `Calculator1.java` 기본 사칙연산 계산 및 유효성 검사
### Calculator2
- `Calculator2.java` 계산 결과 저장 및 관리 로직
- `App.java` 사용자 입력 처리 및 프로그램 실행 로직
<br><br><br>

## 사용된 기술
<div align=center> 
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"> 
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

<br><br><br>

## Contact
질문이나 제한사항은 [@Seoyeon](https://github.com/MythologyDevSeoyeon)으로 연락주세요
<br><br><br>

