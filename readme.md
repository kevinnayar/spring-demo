# spring-demo

Barbones [Java Spring](https://spring.io/) app using:
* Spring Boot
* Postgresql


## Repository Pattern
```
Controller -> Service -> Implementation -> Repository
```

* `Controller`: creates the REST API endpoints and maps to specific `Service` methods.
* `ServiceImpl`: the implmentation of the service interface where all the business logic lives.
* `Service`: the interface for the service.
* `Entity`: what gets stored in the database. It is a POJO (Plain Old Java Object) with `@Entity` annotations and database-specific annotations (e.g., `@Table`, `@Column`).
* `Repository`: what interacts with a database. Uses the `@Repository` annotation. Also, can be empty by just extending the `JpaRepository<TEntity>` where TEntity is entity we want to extend. 
* `Mapper`: creates a mapping between HTTP and Java classes.
  * `Request`: `fromRequestToEntity`
  * `Response`: `fromEntityToResponse`
       
       
