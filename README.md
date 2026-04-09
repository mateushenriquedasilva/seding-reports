# Seding Reports

Spring Boot application for sending email reports using Oracle Cloud Infrastructure (OCI) services.

## Overview

This project demonstrates backend report delivery workflows integrated with OCI resources. It focuses on practical cloud service integration using Java and Spring Boot.

## Features

- Report generation/sending workflow
- Email dispatch integration
- OCI-oriented configuration and service usage
- Maven wrapper for reproducible builds

## Tech Stack

- Java
- Spring Boot
- Maven
- Oracle Cloud Infrastructure (OCI)

## Project Structure

- `src/`: source code
- `pom.xml`: build and dependencies
- `.mvn/`, `mvnw`, `mvnw.cmd`: Maven wrapper

## Prerequisites

- Java 17+ (or required project version)
- OCI credentials and configured services
- Email sender configuration values

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/mateushenriquedasilva/seding-reports.git
cd seding-reports
```

2. Configure OCI and email properties via environment variables or `application.properties`.

3. Run the service:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

## Security Notes

- Never commit cloud credentials to the repository
- Use secrets managers or CI/CD secret stores in production

## Roadmap

- Add retry and dead-letter handling for failed sends
- Add dashboard/metrics for report dispatch status
- Add integration tests with mocked cloud services

## License

This project is available under the repository license terms.
