# config-client-profile-issue

# Test setup

## Method 1

### 1. Start the config server
`./gradlew clean :server:bootRun`

### 2. Start the config client
`/gradlew clean :client:bootRun`

## Method 2
`./gradlew clean bootRun --parallel`