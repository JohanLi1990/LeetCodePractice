# 1. Learning Notebooks

- [1. Learning Notebooks](#1-learning-notebooks)
- [2. Lesson Learnt for Interview Experiences](#2-lesson-learnt-for-interview-experiences)
- [3. Raod Map](#3-raod-map)
- [4. JAVA JVM](#4-java-jvm)
  - [4.1. Class loading#](#41-class-loading)
  - [4.2. Java Garbage Collections](#42-java-garbage-collections)
    - [4.2.1. G!GC](#421-ggc)
    - [4.2.2. Enable GC logger](#422-enable-gc-logger)
    - [4.2.3. Reading GC Logs](#423-reading-gc-logs)
- [5. Java in High Concurrency Environment](#5-java-in-high-concurrency-environment)
  - [5.1. Race Conditions, with Example](#51-race-conditions-with-example)
  - [5.2. DeadLock, with Eample](#52-deadlock-with-eample)
  - [5.3. Visibility and Mutual Exclusions](#53-visibility-and-mutual-exclusions)
  - [5.4. Use Lazy Initailization Judiciously](#54-use-lazy-initailization-judiciously)
  - [5.5. What is threadLocal](#55-what-is-threadlocal)
  - [5.6. Common threadsafe datastructures](#56-common-threadsafe-datastructures)
  - [5.7. Producer Consumer Pattern](#57-producer-consumer-pattern)
- [6. Design Patterns](#6-design-patterns)
  - [Common Design Patterns](#common-design-patterns)
  - [6.1. Inversion of Control](#61-inversion-of-control)
  - [SOLID Principle:](#solid-principle)
- [Spring Framework](#spring-framework)
  - [IoC and its implementations](#ioc-and-its-implementations)
  - [Bean Life Cycle](#bean-life-cycle)
  - [Bean Scope:](#bean-scope)
  - [How to gurantee thread safety for a Bean?](#how-to-gurantee-thread-safety-for-a-bean)
  - [How does Spring solve Cycle Dependency between two Beans](#how-does-spring-solve-cycle-dependency-between-two-beans)
  - [Autowire Need for Disambiguation](#autowire-need-for-disambiguation)
  - [Spring Transactions Management](#spring-transactions-management)
- [7. JAVA Core interview Questions](#7-java-core-interview-questions)
  - [7.1. why is String final in Java](#71-why-is-string-final-in-java)
- [8. Behaviour Interviews](#8-behaviour-interviews)
  - [8.1. Customer Obsession](#81-customer-obsession)
- [9. OS Interview Questions](#9-os-interview-questions)
  - [9.1. Process vs Threads](#91-process-vs-threads)
- [10. Network Interview Questions](#10-network-interview-questions)
  - [10.1. TCP vs UDP](#101-tcp-vs-udp)
  - [10.2. GET vs POST](#102-get-vs-post)
  - [10.3. PUT vs PATCH vs POST](#103-put-vs-patch-vs-post)
  - [10.4. HTTP vs HTTPS](#104-http-vs-https)
  - [10.5. Enter google.com into browser what will happen?](#105-enter-googlecom-into-browser-what-will-happen)
- [11. Database Questions](#11-database-questions)
  - [11.1. ACID Compliance](#111-acid-compliance)
  - [CAP Therom](#cap-therom)
  - [11.2. SQL index, what are they, when do you use them?](#112-sql-index-what-are-they-when-do-you-use-them)
  - [11.3. WHy not indexing all columns?](#113-why-not-indexing-all-columns)

Page 23
# 2. Lesson Learnt for Interview Experiences
 1. keep calm
 2. it is going to be exausting, prepare snacks in between take
 3. keep calm, do not panick. 
 4. how to deal with heavy reads and heavy writes?
 5. Keep practicing / keep practicing
 6. If the role requires java, study java ; Otherwise pay attention to network / OS type of interview questions

# 3. Raod Map

[Java Microservice RoadMap](https://github.com/in28minutes/roadmaps/blob/main/README.md#java-microservices-roadmap)
[Java Fullstack](https://github.com/in28minutes/roadmaps/blob/main/README.md#java-full-stack-roadmap)

# 4. JAVA JVM

## 4.1. Class loading#
only loads claes
--> BootStrap (contain classes in core java environment, java long object, class, class loader) 
to allow others to load up the rest of the system. 
--> Extension, defines its parent to booststrap, and will default to bootstrap, not widely used, but can supply override and native code for different operating system and platforms. e.g. Nashorn Engine
--> Application, loading user classes from defined classpath. it will load the dependencies first; if cannot find will delegate parent to look up for it. 

## 4.2. Java Garbage Collections

| Eden | S1 | S2 | Old Generation|
| MetaSpace | 

[Reference 1](https://sematext.com/blog/java-garbage-collection-tuning/#toc-what-is-garbage-collection-tuning-0)
[Oracle Docs](https://docs.oracle.com/en/java/javase/12/gctuning/introduction-garbage-collection-tuning.html)

set fixed size heap to avoid heap resizing; load memory pages into memory at the start of the application
e.g. -Xms2g -Xmx2g -XX:+AlwaysPreTouch

### 4.2.1. G!GC
[G1GC tuning tips](https://blog.gceasy.io/2020/06/02/simple-effective-g1-gc-tuning-tips/)

- Avoid limiting the young generation size to particular values by using options like -Xmn, -XX:NewRatio and others because the young generation size is the main means for G1 to allow it to meet the pause-time. 
- Only set -XX:MaxGCPauseMillis
- For managing humongous object **Concurrent Mark Sweep** might be a better options

### 4.2.2. Enable GC logger

For java 9 and newer:
```bat
java -Xlog:gc*:file=/var/log/myapp/gc.log -jar my_awesome_app.jar
JAVA_OPTS=-Xms512m -Xmx4096m -XX:+UseG1GC"
```
### 4.2.3. Reading GC Logs

Pay attention to places where GC takes more than 1 sec. 

# 5. Java in High Concurrency Environment

## 5.1. Race Conditions, with Example

## 5.2. DeadLock, with Eample

## 5.3. Visibility and Mutual Exclusions
[Howe does volatile work](https://stackabuse.com/concurrency-in-java-the-volatile-keyword/)

whenever a variable is marked volatile, its write operations will be commited to its real address (main memory) right away
instead of local cache first. 

All variables **updated** before volatile variable will be committed to main memory right away, including non-volatile ones. 
however it does not gurantee mutual exclusion

## 5.4. Use Lazy Initailization Judiciously

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

## 5.5. What is threadLocal

a variable only visible to the thread instance()

## 5.6. Common threadsafe datastructures

ConcurrentHashMap(Synchronization over segments not entire DS), LinkedBlockingDeque (internal queue)

## 5.7. Producer Consumer Pattern
```java
// using blocking queue
public class SimpleProducerConsumerDemonstrator {
    BlockingQueue<Double> blockingQueue = new LinkedBlockingDeque<>(5);

    private void produce() {
        while (true) {
            double value = generateValue();
            try {
                blockingQueue.put(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            System.out.printf("[%s] Value produced: %f\n", Thread.currentThread().getName(), value);
        }
    }

    private void consume() {
        while (true) {
            Double value;
            try {
                value = blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            // Consume value
            System.out.printf("[%s] Value consumed: %f\n", Thread.currentThread().getName(), value);
        }
    }

    private double generateValue() {
        return Math.random();
    }

    private void runProducerConsumer() {
        for (int i = 0; i < 2; i++) {
            Thread producerThread = new Thread(this::produce);
            producerThread.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread consumerThread = new Thread(this::consume);
            consumerThread.start();
        }
    }

    public static void main(String[] args) {
        SimpleProducerConsumerDemonstrator simpleProducerConsumerDemonstrator = new SimpleProducerConsumerDemonstrator();
        simpleProducerConsumerDemonstrator.runProducerConsumer();
        sleep(2000);
        System.exit(0);
    }

```



# 6. Design Patterns

Best practices evolved over a period of time by experienced software developer

## Common Design Patterns

- **Singleton**: Manage global states, cache, threadpools, registries
- **Factory Pattern**: pass types to get a class. so I have decoupled myself from the actual constuctor methods. E.g. Hiring Process
Abstractions, hide implementation from requestor. However this can lead to harder to read code.
Very easy to test, just mock the abstract class or interface. 
- **Observer Pattern**: one to many relationship between objects..whenever you are interested in the state, and want to be notified when there is change.
- **Strategy**: Different implementation of the same method. 

- **Builder pattern**

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

- **Iterator Pattern** : A way to access the elements of a collection in a sequential manner , without need to know its underlying implementations. 

- **Proxy pattern** : Proxy pattern is used when we need to create a wrapper to cover the main object's complexity from the client. 

## 6.1. Inversion of Control

```java
// instaed of doing 
public class TextEditor {

    private SpellChecker checker;

    public TextEditor() {
        this.checker = new SpellChecker();
    }
}

// we do 
public class TextEditor {

    private IocSpellChecker checker;

    public TextEditor(IocSpellChecker checker) {
        this.checker = checker;
    }
}

// handing responsibility to caller instead

```

## SOLID Principle:

- **Single Responsibility**: Do one thing and one thing only, if too much responsiblity need to refactor. 
- **Open/Closed** : Open for Extension, Closed for Modifications
- **Liskov Substitution** : subtype should be able to replace parenttype anywhere, e.g. Electrical car ----> Car, but electrical car does not have enginee, so violation of liskov, instead car interface need to be re-defined. 
- **Interface Segregation**: Do not put all methods together.
- **Dependency Inversion**: Software modules, instead of high level module depending on low level modules, both will depend on abstractions. IoC. 


# Spring Framework

## IoC and its implementations
Spring Core Container : BeanFactory + Application Context
how Spring core initialize: load configuration metadata --> BeanDefinitionReader --> Create BeanDefintions --> put in Registry

## Bean Life Cycle
- instantiation:
- populate:
- Initialization: AutowiredAnnotationBeanPostProcesoor
- Destruction:

## Bean Scope:
Prototyp - Singleton - Session - Request - Application - WebSocket

## How to gurantee thread safety for a Bean?
- Singleton? Bean has to be stateless
- Prototype? Put Bean's state in a ThreadLocal wrapper. 

## How does Spring solve Cycle Dependency between two Beans
 only works if both are setter injections, both are attribute injections, or one of them is setter inject (setter should gets instantiated first, then constructor, doesn't work other ways)
 doesn't work if both are constructor injections.
 This is because bean populate phase and instantiation phase are separate.

## Autowire Need for Disambiguation
use @Qualifier annotation
use @Primary for default

## Spring Transactions Management
Enabled by default in Spring Boot.
When enabled we can use @Transactional to annotate a bean.

We can define 
**Propagation** : Transaction Propagation indicates if any component or service will or will not participate in transaction and how will it behave if the calling component/service already has or does not have a transaction created already

- default is Required (only create new if not existing)
- support, check if an active transaction exist, if it does, then existing will be used, if not, executed in no transactions

**Isolation Level** : for concurrency purpose... how should other process see your changes.. Read_Uncommited is the lowest isolation level
gets all the side effects
Read.Commited prevents dirty read. 
Read.Repeatable read, prevents dirty and non-repeateable reads
Read.serialized, no concurrency atall

**Roll back strategy** : rollback for exceptions




# 7. JAVA Core interview Questions

## 7.1. why is String final in Java
内存(memory)
同步(synchronization)
数据结构(data structure)

1. Memory, we use String pool, multiple clients to access same String, this saves memory
2. hashcode of String will not change, doesn't have to recompute everytime, so it helps with operations involving hash such as Set.contains, Map.contains etc
3. It is widely used in class loading, so if it is mutable we might load something dangerous, and destroy our security
4. Immutable objects are threadsafe  by nature

# 8. Behaviour Interviews

## 8.1. Customer Obsession

Story:
How to make customer happy? Understanding -> Planning -> Executing -> Assessing
*Context*: 

# 9. OS Interview Questions

## 9.1. Process vs Threads
| Process | Threads |
| --------|----------|
| Processes are isolated | Threads share memeory |
| Process takes more time for context switching | Threads take less time for context switching |
| The process is less efficient in terms of communication . | Thread is more efficient in terms of communication.|
| The process takes more time to terminate. | The thread takes less time to terminate. |
| It takes more time for creation. | It takes less time for creation. |


# 10. Network Interview Questions

## 10.1. TCP vs UDP

[TCP](https://www.spiceworks.com/tech/networking/articles/tcp-vs-udp/)
The transmission control protocol (TCP) is defined as a connection-oriented communication protocol that allows computing devices and applications to send data via a network and verify its delivery, forming one of the crucial pillars of the global internet.
**Three Way HandShakes**
Communication programs and computing devices utilize TCP for exchanging messages over a network. The task of this protocol is to carry packets across the Internet and ensure the successful delivery of messages and data across networks
[How TCP works together with UDP](https://stackoverflow.com/questions/46794420/how-do-tcp-ip-and-http-work-together)

[UDP](https://www.techtarget.com/searchnetworking/definition/UDP-User-Datagram-Protocol)

| TCP | UDP |
|-----|-----|
| Guranteed Delivery | Best effort, datagram may get lost |
| Host to Host | Process to Process |
| Handshakes | no Handshakes to ensure order|


## 10.2. GET vs POST

## 10.3. PUT vs PATCH vs POST

## 10.4. HTTP vs HTTPS

## 10.5. Enter google.com into browser what will happen?





# 11. Database Questions

## 11.1. ACID Compliance
- Atomicity − A transaction should be treated as a single unit of operation, which means either the entire sequence of operations is successful or unsuccessful.
- Consistency − This represents the consistency of the referential integrity of the database, unique primary keys in tables, etc. Not NUl, minimum 10 etc
- Isolation − There may be many transaction processing with the same data set at the same time. Each transaction should be isolated- from others to prevent data corruption.
- Durability − Once a transaction has completed, the results of this transaction have to be made permanent and cannot be erased from the database due to system failure.

## CAP Therom
- Consistency : all users should see the same data at the same time
- Availability: minimal downtime, every request received by a node should have a response
- Partition tolerance: if part of the system breaks down it still functions. 

## 11.2. SQL index, what are they, when do you use them?

## 11.3. WHy not indexing all columns?