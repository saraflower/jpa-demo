# Spring Data JPA Demo

### Description

This is just a demo project for experimentation purposes with Spring Data JPA.  

Environment variables config are exposed as, again, it's just a demo application.

This application is in its very early stages and will evolve over time, just as this README.


### Usage

#### Quick setup

1. Run `scripts/setup-localstack.sh` with a docker daemon running to get running locally.
2. Open a db connection and run `scripts/setupdb.sql`
3. Run the Spring Boot app

#### Localstack scripts

- `scripts/setup-localstach.sh`: Creates localstack from docker compose file in detached mode
- `scripts/remove-localstach.sh`: Completely removes docker compose project (and subcontainers)
- `scripts/attach-localstach.sh`: Same as `setup` but attaches terminal to compose `stdout`
- `scripts/reset-localstach.sh`: `remove` + `setup` in same step for convenience