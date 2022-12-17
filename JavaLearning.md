# Learning Notebooks

- [Learning Notebooks](#learning-notebooks)
  - [Lesson Learnt for Interview Experiences](#lesson-learnt-for-interview-experiences)
  - [Raod Map](#raod-map)
  - [JAVA JVM](#java-jvm)
  - [Java Garbage Collections](#java-garbage-collections)
    - [G!GC](#ggc)
    - [Enable GC logger](#enable-gc-logger)
    - [Reading GC Logs](#reading-gc-logs)
  - [Java in High Concurrency Environment](#java-in-high-concurrency-environment)
    - [Visibility and Mutual Exclusions](#visibility-and-mutual-exclusions)
    - [Use Lazy Initailization Judiciously](#use-lazy-initailization-judiciously)
  - [Design Patterns](#design-patterns)
  - [Behaviour Interviews](#behaviour-interviews)
    - [Customer Obsession](#customer-obsession)

Page 23
## Lesson Learnt for Interview Experiences
 1. keep calm
 2. it is going to be exausting, prepare snacks in between take
 3. keep calm, do not panick. 
 4. how to deal with heavy reads and heavy writes?
 5. Keep practicing / keep practicing

## Raod Map

[Java Microservice RoadMap](https://github.com/in28minutes/roadmaps/blob/main/README.md#java-microservices-roadmap)
[Java Fullstack](https://github.com/in28minutes/roadmaps/blob/main/README.md#java-full-stack-roadmap)

## JAVA JVM

**Class loading**
only loads claes
BootStrap -> Extension -> Application

## Java Garbage Collections

[Reference 1](https://sematext.com/blog/java-garbage-collection-tuning/#toc-what-is-garbage-collection-tuning-0)
[Oracle Docs](https://docs.oracle.com/en/java/javase/12/gctuning/introduction-garbage-collection-tuning.html)

set fixed size heap to avoid heap resizing; load memory pages into memory at the start of the application
e.g. -Xms2g -Xmx2g -XX:+AlwaysPreTouch

### G!GC
[G1GC tuning tips](https://blog.gceasy.io/2020/06/02/simple-effective-g1-gc-tuning-tips/)

- Avoid limiting the young generation size to particular values by using options like -Xmn, -XX:NewRatio and others because the young generation size is the main means for G1 to allow it to meet the pause-time. 
- Only set -XX:MaxGCPauseMillis
- For managing humongous object **Concurrent Mark Sweep** might be a better options

### Enable GC logger

For java 9 and newer:
```bat
java -Xlog:gc*:file=/var/log/myapp/gc.log -jar my_awesome_app.jar
JAVA_OPTS=-Xms512m -Xmx4096m -XX:+UseG1GC"
```
### Reading GC Logs

Pay attention to places where GC takes more than 1 sec. 

## Java in High Concurrency Environment

### Visibility and Mutual Exclusions
[Howe does volatile work](https://stackabuse.com/concurrency-in-java-the-volatile-keyword/)

whenever a variable is marked volatile, its write operations will be commited to its real address (main memory) right away
instead of local cache first. 

All variables **updated** before volatile variable will be committed to main memory right away, including non-volatile ones. 
however it does not gurantee mutual exclusion

### Use Lazy Initailization Judiciously

**static field**
```java
// For static field, use lazy initialization holders idiom
private static class FieldHolder {
  static final FieldType field = computeFieldValue();
}

private static FieldType getField() {
  /* A typical VM will synchronize field access only to initialize the class. Once the class
is initialized, the VM patches the code so that subsequent access to the field does
not involve any testing or synchronization. */
  return FieldHolder.field; 
}
```

**instance field**
```java

/* we need volatile modifier to make sure field always make its latest value visible to all other threads
otherewise there is a geniune chance that two thread enters the last if clause
to initialize field sequentially, although in theroy the field is already initialized by first thread*/
private volatile FiledType field;

private FieldType getField() {
  FieldType res = field;

  if (res == null) {
    synchronized(this) {
      if (field ==  null) {
        return field = result = computeFieldValue();
      }
    }
  }
  return res;
}

```

## Design Patterns

**Singleton**: Manage global states, cache, threadpools, registries
**Factory Pattern**: pass types to get a class. so I have decoupled myself from the actual constuctor methods. E.g. Hiring Process
**Observer Pattern**: one to many relationship between objects..whenever you are interested in the state, and want to be notified when there is change.
**Strategy**: Different implementation of the same method. 
**Builder pattern**
```java
public class Pizza {
  private int size;
  private boolean cheese;
  private boolean pepperoni;
  private boolean bacon;

  public static class Builder {
    //required
    private final int size;

    //optional
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean bacon = false;

    public Builder(int size) {
      this.size = size;
    }

    public Builder cheese(boolean value) {
      cheese = value;
      return this;
    }

    public Builder pepperoni(boolean value) {
      pepperoni = value;
      return this;
    }

    public Builder bacon(boolean value) {
      bacon = value;
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }
  }

  private Pizza(Builder builder) {
    size = builder.size;
    cheese = builder.cheese;
    pepperoni = builder.pepperoni;
    bacon = builder.bacon;
  }
}
```
## Behaviour Interviews

### Customer Obsession

Story:
How to make customer happy? Understanding -> Planning -> Executing -> Assessing
*Context*: 