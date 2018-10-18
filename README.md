# phonenumbersapi

Test API for phone numbers management

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

### Prerequisites

```
GRADLE - https://gradle.org/install/
```

### Run the application

```
./gradle clean
```
```
./gradle build
```
```
./gradle appRun
```
Now you can access sample api by for example Postman
- http://localhost:8080/phonenumbers/api/phones - get all phone numbers
- http://localhost:8080/phonenumbers/api/phones/{phoneId}/activate - activate phone number
- http://localhost:8080/phonenumbers/api/customer/{customerId}/phones- get list of phones owned by customer

## Running the tests

To run the tests simply run gradle task
```
./gradle test
```


## Authors

* **Michał Majewski** - [pocoMiguel](https://github.com/pocoMiguel)


