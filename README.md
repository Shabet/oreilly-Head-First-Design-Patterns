# Head First Design Patterns

[Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design-patterns-2nd/9781492077992/) (O'Reilly) 책을 읽고 예제 코드를 따라 구현하는 저장소입니다.

저자: Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

공식 예제 코드는 [bethrobson/Head-First-Design-Patterns](https://github.com/bethrobson/Head-First-Design-Patterns)에서 확인할 수 있습니다.

## 참고 자료

- [bethrobson/Head-First-Design-Patterns](https://github.com/bethrobson/Head-First-Design-Patterns) — 공식 예제 저장소 (2020 2nd Edition)
- [IT-Book-Organization/HeadFirst-DesignPattern](https://github.com/IT-Book-Organization/HeadFirst-DesignPattern) — 한국어로 챕터별 개념을 정리한 저장소
- [dhairyagupta2603/Head-First-Design-Patterns](https://github.com/dhairyagupta2603/Head-First-Design-Patterns) — 책의 패턴을 C++ / Python으로 구현한 저장소

## 프로젝트 구조

Java + Gradle 프로젝트이며, 예제는 `src/main/java` 아래 챕터별로 나뉩니다.

```
src/main/java
├── section01/strategy          # 전략 패턴 (오리 시뮬레이터)
├── section02/observer          # 옵저버 패턴 (기상 스테이션, Swing)
├── section03/decorator         # 데코레이터 패턴 (Starbuzz, java.io)
├── section06/command           # 커맨드 패턴 (리모컨)
└── section07
    ├── adapter                 # 어댑터 패턴 (오리/칠면조, Iterator)
    └── facade                  # 퍼사드 패턴 (홈 시어터)
```

## 챕터

| 챕터 | 패턴 | 이 저장소 |
|------|------|-----------|
| 1 | 전략 (Strategy) | `section01` |
| 2 | 옵저버 (Observer) | `section02` |
| 3 | 데코레이터 (Decorator) | `section03` |
| 4 | 팩토리 (Factory) | — |
| 5 | 싱글턴 (Singleton) | — |
| 6 | 커맨드 (Command) | `section06` |
| 7 | 어댑터 (Adapter), 퍼사드 (Facade) | `section07` |
| 8 | 템플릿 메소드 (Template Method) | — |
| 9 | 반복자 (Iterator), 컴포지트 (Composite) | — |
| 10 | 상태 (State) | — |
| 11 | 프록시 (Proxy) | — |
| 12 | 복합 패턴 (Patterns of Patterns) | — |
| 13 | 실전 디자인 패턴 | — |
| 14 | 기타 패턴 | — |

## 실행

JDK 8 이상, Gradle Wrapper가 필요합니다.

예제는 IntelliJ IDEA 등에서 각 패키지의 `*Main` / `*TestDrive` 클래스를 실행하면 됩니다. 예:

- `section01.strategy.MiniDuckSimulator`
- `section02.observer.weather.WeatherStationMain`
- `section03.decorator.starbuzz.StarbuzzCoffeeMain`
- `section06.command.remote.RemoteLoaderMain`
- `section07.facade.hometheater.HomeTheaterTestDrive`
