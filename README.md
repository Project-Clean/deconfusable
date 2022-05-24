# DeConfuse
![logo](images/logo.png)

<!-- Placeholder for badges https://shields.io -->
![Java 11](https://img.shields.io/badge/DeConfuse-0.1.1-ffffff?style=flat-square) ![Java 11](https://img.shields.io/badge/java-11-007396?style=flat-square&logo=java) ![Java 11](https://img.shields.io/badge/gradle-7.4.2-02303A?style=flat-square&logo=gradle) [![Unit tests](https://github.com/ProjectClean/deconfuse/actions/workflows/java-ci-test-build.yml/badge.svg)](https://github.com/ProjectClean/deconfuse/actions/workflows/java-ci-test-build.yml)

## About
De confuse is a java librabry which convert confusable unicode characters(similar looking character) or string to english alphabets/strings.

## Using
### Adding as dependency
* For gradle: add following to your `build.gradle` file.
```groovy
implementation 'io.github.projectclean:deconfuse-0.1.1'
``` 
* For Maven: add the following to your `pom.xml` file.
```xml
<dependency>
  <groupId>io.github.projectclean</groupId>
  <artifactId>deconfuse</artifactId>
  <version>0.1.1</version>
</dependency>
```

## Example

```java
import io.github.projectclean.deconfuse.core.DeConfuse;
import io.github.projectclean.deconfuse.core.DeConfuseFactory;
import io.github.projectclean.deconfuse.enums.Language;

class Test {
    public static void main(String[] args) {
        String s = "ƉͤĆоɳſŪȘȄ";
        DeConfuse deConfuse = DeConfuseFactory.createDeConfuse(Language.ENGLISH);
        System.out.println(deConfuse.deConfuseString(s));
    }
}

/*
 * Output:
 * deconfuse
 */
```

## Demo
### POST Request
```bash
curl --location --request POST 'https://kumarpushpam.com/api/v1/deconfuse/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "str": "ƉͤĆоɳſŪȘȄ"
}'
```
### Response
```json
{
    "deConfusedString": "deconfuse"
}
```
