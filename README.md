# twelve-factors
An example microservice for education purposes.

# Execution
Build and run the Dockerfile. The published image can be found [here](https://hub.docker.com/r/leonkattendick/twelve-factors). The database is configured to use H2 for testing. This way no setup is needed.

# Application Domain
Here a very simple minimum required article amount system for stores is implemented. The model is designed as follows:
* There exist multiple sizes (S, M, L, ...)
* Each store is assigned one size
* Each size has an articles with an exact amount defined
* Therefor each article can have multiple sizes with different quantities

# Endpoints
Below are listed all the endpoints of the microservice.

## Size Endpoints
All endpoints for sizes.

### Creating a size
Location: ``POST http://localhost:8080/size``

Body: 
```json
{
"name": "S"
}
```

## Article Endpoints
All endpoints for articles.

### Creating an article
Location: ``POST http://localhost:8080/article``

Body: 
```json
{
"name": "IPhone 12",
"manufacturer": "Apple"
}
```

### Getting an article by its id
Location (for article #1): ``GET http://localhost:8080/article/1``

## Article size Endpoints
All endpoints for article sizes.

### Creating an article size
Location: ``POST http://localhost:8080/article-size``

Body:
```json
{
  "article_id": 1,
  "size_id": 1,
  "amount": 5
}
```

## Store Endpoints
All endpoints for stores.

### Creating a store
Location: ``POST http://localhost:8080/store``

Body:
```json
{
  "name": "Laden #1",
  "address": "Mustergasse 1",
  "size_id": 1
}
```

### Getting all stores
Location: ``GET http://localhost:8080/store``

# Commands
Building: `docker build -t leonkattendick/twelve-factors .`