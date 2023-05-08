# Demo: required flag default value
Demo application reproducing the issue described [here](https://github.com/springdoc/springdoc-openapi/issues/2185).

To run, execute the command below from project's root directory:
```bash
./gradlew clean generateOpenApiDocs
```
Then check generate documentation in [openapi.yaml](build/openapi.yaml):
```yaml
components:
  schemas:
    Resource:
#      required:                   # missing
#        - bar                     # 
#        - baz                     # 
#        - foo                     # 
      type: object
      properties:
        foo:
          type: string
        bar:
          type: boolean
        baz:
          type: object
      description: Resource schema
```