# configurações feitas no applicattion.properties para rodar com mysql


spring.application.name=jrsoftwork.com.pass.in
#spring.datasource.driver-class-name=org.hsqldb.jdbc.JDBCDriver
#spring.datasource.driver-class-name=org.hsqldb.jdbc.JDBCDriver
#spring.datasource.url=jdbc:hsqldb:file:src/main/resources/database/myDb;shutdown=true

spring.datasource.username=root
spring.datasource.password=
#url de conexão do banco de dados
spring.datasource.url=jdbc:mysql://localhost:3306/nlw?allowPublicKeyRetrieval=true&rewriteBatchedStatements=true&useSSL=false&useUnicode=yes&characterEncoding=UTF-8&useLegacyDatetimeCode=true&createDatabaseIfNotExist=true&useTimezone=true&serverTimezone=UTC

#apontamos para o JPA e Hibernate qual é o Dialeto do banco de dados
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

#deixamos o hibernate responsável por ler nossas entidades e criar as tabelas do nosso banco de dados automaticamente
spring.jpa.hibernate.ddl-auto=create
#configuração do Hibernate para reconhecer o nome de tabelas em caixa alta
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
#configurações de log
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
###################################################################################################################
#  dependencias do mysql e flyway migrations para rodar com mysql
<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.flywaydb</groupId>
			<artifactId>flyway-core</artifactId>
		</dependency>
		<dependency>
			<groupId>org.flywaydb</groupId>
			<artifactId>flyway-mysql</artifactId>
		</dependency>
