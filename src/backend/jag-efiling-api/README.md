# Jag-efiling-api

### Configuration

You should use environment variables to configure the jag efiling api

| Environment Variable | Type | Description   | Notes  |
|---|---|---|---|
| SERVER_PORT | Integer | web application server port | defaulted to `8080` |
| REDIS_HOST | String | Redis storage host | defaulted to `localhost` |
| REDIS_PORT | Integer |Redis storage port | defaulted to `6379` |
| REDIS_PASSWORD | String | Redis storage password | Defaulted to `admin` |
| NAVIGATION_BASE_URL | String | The base path of the secure file upload  |  not set by default |