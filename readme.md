# spring-demo

Barbones [Java Spring](https://spring.io/) app using:
* Spring Boot
* Postgresql


## Repository Pattern
```
Controller -> Service -> Implementation -> Repository
```

#### `Controller`
* Creates the REST API endpoints and maps to specific `Service` methods.

#### `ServiceImpl`
* The implmentation of the service interface where all the business logic lives.

#### `Service`
* The interface for the service.

#### `Entity`
* What gets stored in the database. 
* It is a POJO (Plain Old Java Object) with `@Entity` annotations and database-specific annotations (e.g., `@Table`, `@Column`).

#### `Repository`
* What interacts with a database. Uses the `@Repository` annotation. 
* It can be empty by just extending the `JpaRepository<TEntity>` where `TEntity` is entity you want to extend. 

#### `Mapper`
* Creates a mapping between HTTP and Java classes.
  * `Request`: `fromRequestToEntity`
  * `Response`: `fromEntityToResponse`
       
       
