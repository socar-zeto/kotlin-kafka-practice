## spirng boot + kotlin + kafka 연동 practice


1. brew를 이용해 zookeeper, kafka 설치
```
brew install zookeeper
brew install kafka
```

2. brew를 이용해 zookeeper, kafka 서비스 start
```
brew services start zookeeper
brew services start kafka
```

3. test topic 등록
```
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 partitions 1 --topic test
```

4. Spring Boot App Run

5. test topic으로 메세지를 produce하는 CLI
```
kafka-console-producer --bootstrap-server localhost:9092 --topic test
> hello kafka~!
```
