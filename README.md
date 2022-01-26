#Spring Boot Book Seller


### Endpoints


#### Sign-up


```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
	"name":"user",
	"username":"user",
	"password":"user"
}

```

#### Sign-in

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
	"username":"user",
	"password":"user"
}

```
