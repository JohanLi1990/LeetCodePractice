# 1. Learning Notebooks

- [1. Learning Notebooks](#1-learning-notebooks)
- [2. Lesson Learnt for Interview Experiences](#2-lesson-learnt-for-interview-experiences)
- [3. Raod Map](#3-raod-map)
- [4. JAVA JVM](#4-java-jvm)
  - [4.1. JVM Memory Structure](#41-jvm-memory-structure)
  - [4.2. Possible cause of Memory Leak](#42-possible-cause-of-memory-leak)
  - [4.3. Class loading#](#43-class-loading)
  - [4.4. Java Garbage Collections](#44-java-garbage-collections)
    - [4.4.1. G!GC](#441-ggc)
    - [4.4.2. Enable GC logger](#442-enable-gc-logger)
    - [4.4.3. Reading GC Logs](#443-reading-gc-logs)
    - [4.4.4. Comparison of different GC techniques](#444-comparison-of-different-gc-techniques)
- [5. Java in High Concurrency Environment](#5-java-in-high-concurrency-environment)
  - [5.1. Race Conditions, with Example](#51-race-conditions-with-example)
  - [5.2. DeadLock, with Eample](#52-deadlock-with-eample)
  - [5.3. Visibility and Mutual Exclusions](#53-visibility-and-mutual-exclusions)
  - [5.4. Use Lazy Initailization Judiciously](#54-use-lazy-initailization-judiciously)
  - [5.5. What is threadLocal](#55-what-is-threadlocal)
  - [5.6. Common threadsafe datastructures](#56-common-threadsafe-datastructures)
  - [5.7. Producer Consumer Pattern](#57-producer-consumer-pattern)
  - [5.8. CompletableFuture for Asynchronous Event handling](#58-completablefuture-for-asynchronous-event-handling)
- [6. Java New Features since Java 11](#6-java-new-features-since-java-11)
- [7. Design Patterns](#7-design-patterns)
  - [7.1. Common Design Patterns](#71-common-design-patterns)
  - [7.2. Inversion of Control](#72-inversion-of-control)
  - [7.3. SOLID Principle:](#73-solid-principle)
  - [7.4. Design Patterns in Spring:](#74-design-patterns-in-spring)
- [8. Spring Framework](#8-spring-framework)
  - [Spring Framework vs J2EE](#spring-framework-vs-j2ee)
  - [Design consideration of using DispatchServlet](#design-consideration-of-using-dispatchservlet)
  - [8.1. IoC and its implementations](#81-ioc-and-its-implementations)
  - [8.2. Bean Life Cycle](#82-bean-life-cycle)
  - [8.3. Bean Scope:](#83-bean-scope)
  - [8.4. How to gurantee thread safety for a Bean?](#84-how-to-gurantee-thread-safety-for-a-bean)
  - [8.5. How does Spring solve Cycle Dependency between two Beans](#85-how-does-spring-solve-cycle-dependency-between-two-beans)
  - [8.6. Autowire Need for Disambiguation](#86-autowire-need-for-disambiguation)
  - [8.7. Spring Transactions Management](#87-spring-transactions-management)
- [9. Behaviour Interviews](#9-behaviour-interviews)
  - [9.1. Customer Obsession](#91-customer-obsession)
- [10. OS Interview Questions](#10-os-interview-questions)
  - [10.1. Process vs Threads](#101-process-vs-threads)
- [11. Network Interview Questions](#11-network-interview-questions)
  - [11.1. TCP/IP Model of Network](#111-tcpip-model-of-network)
  - [11.2. What happens when you enter URL int a web browser](#112-what-happens-when-you-enter-url-int-a-web-browser)
  - [11.3. Idempotency](#113-idempotency)
  - [11.4. GET vs POST](#114-get-vs-post)
  - [11.5. PUT vs PATCH vs POST](#115-put-vs-patch-vs-post)
  - [11.6. HTTP vs HTTPS](#116-http-vs-https)
  - [11.7. How Does HTTPS work](#117-how-does-https-work)
  - [11.8. TCP vs UDP](#118-tcp-vs-udp)
  - [11.9. TCP 4-way HandShake to terminate connection](#119-tcp-4-way-handshake-to-terminate-connection)
  - [11.10. XSS Reflected vs Persistent vs DOM](#1110-xss-reflected-vs-persistent-vs-dom)
- [12. Database Questions](#12-database-questions)
  - [12.1. ACID Compliance](#121-acid-compliance)
  - [12.2. CAP Therom](#122-cap-therom)
  - [12.3. SQL index, what are they, when do you use them?](#123-sql-index-what-are-they-when-do-you-use-them)
  - [12.4. WHy not indexing all columns?](#124-why-not-indexing-all-columns)
  - [12.5. Clustered vs Non-Clustered index](#125-clustered-vs-non-clustered-index)
  - [12.6. Explain keyword MySQL](#126-explain-keyword-mysql)
  - [12.7. MYSQL 回表](#127-mysql-回表)
  - [12.8. MYSQL how to enable Master Slave Replication](#128-mysql-how-to-enable-master-slave-replication)
  - [12.9. MySQL dynamically scalling.](#129-mysql-dynamically-scalling)
- [13. System Design Interview](#13-system-design-interview)
  - [13.1. what kind of questions should I ask???](#131-what-kind-of-questions-should-i-ask)
  - [13.2. Back Of Envelop Calculation](#132-back-of-envelop-calculation)
  - [13.3. Basic Building Blocks](#133-basic-building-blocks)
    - [13.3.1. Domain Name system](#1331-domain-name-system)
    - [13.3.2. Load Balancers](#1332-load-balancers)
    - [13.3.3. Database](#1333-database)
      - [13.3.3.1. SQL vs NoSQL](#13331-sql-vs-nosql)
      - [13.3.3.2. Data Replication](#13332-data-replication)
      - [13.3.3.3. Data Distributions](#13333-data-distributions)
    - [13.3.4. Key-Value Store](#1334-key-value-store)
    - [13.3.5. Distributed Search](#1335-distributed-search)
- [14. Effective Software Engineering](#14-effective-software-engineering)
  - [14.1. Six pillars of Effective Software](#141-six-pillars-of-effective-software)
  - [14.2. From Customer Insights to Internal Requirements](#142-from-customer-insights-to-internal-requirements)
  - [14.3. Implementation and Coding](#143-implementation-and-coding)
  - [14.4. Testing and Quality Assurance](#144-testing-and-quality-assurance)
  - [14.5. Clean Code in Java](#145-clean-code-in-java)
  - [14.6. Best Practices](#146-best-practices)
    - [14.6.1. why is String final in Java](#1461-why-is-string-final-in-java)
    - [14.6.2. JDBC best practices](#1462-jdbc-best-practices)
- [15. How to use OPENAI API in SpringBoot Project](#15-how-to-use-openai-api-in-springboot-project)
- [16. Another way to improve Grammar via GrammarBot API (Not Feasible)](#16-another-way-to-improve-grammar-via-grammarbot-api-not-feasible)
- [17. Use old laptop as a proxy server](#17-use-old-laptop-as-a-proxy-server)

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

last resort
[JVM optimization technique](https://cloud.tencent.com/developer/article/1812722)

## 4.1. JVM Memory Structure

- **Method Areaa**: Method Area is a part of the heap memory which is shared among all the threads. It creates when the JVM starts up. It is used to store class structure, superclass name, interface name, and constructors. The JVM stores the following kinds of information in the method area:

    A Fully qualified name of a type (ex: String)
    The type's modifiers
    Type's direct superclass name
    A structured list of the fully qualified names of super interfaces.

- **Heap Area**: actual objects, young gen, old gen.

- **JVM stack area**:
  - Multiple stackframes each owned by a thread 
  - stack frame: local Variable Array, Operand Stack, and Framde Data
  - stores reference to heap object / also some value (primitive type)

- **Native Method Stack** : similar to stack area but for OS native methods
- **PC register**: Stores the pointer to where the execution is.

## 4.2. Possible cause of Memory Leak

- static collections, same life cycle as JVM
- singleton, holding external references
- Connections needs to close before GC can garbage collect
- A variable with inappropriate scope.
- Hash value changed, object stored in HashSet or HashMap cannot be removed.
- Inappropriate use of threadlocal. ThreadLocal 的弱引用导致内存泄漏也是个老生常谈的话题了，使用完 ThreadLocal 一定要记得使用 remove 方法来进行清除, wekareference of threadlocal is used as Key in threadLocalMap, this key can be GC-ed very easily, however, the value may not be GC-ed. Therefore, in threadlocalMap you can have null key, but valid value. thus leading to memory leak. 

## 4.3. Class loading#
only loads claes
--> BootStrap (contain classes in core java environment, java long object, class, class loader) 
to allow others to load up the rest of the system. 
--> Extension, defines its parent to booststrap, and will default to bootstrap, not widely used, but can supply override and native code for different operating system and platforms. e.g. Nashorn Engine
--> Application, loading user classes from defined classpath. it will load the dependencies first; if cannot find will delegate parent to look up for it. 

## 4.4. Java Garbage Collections

| Eden | S1 | S2 | Old Generation|
| MetaSpace | 

[Reference 1](https://sematext.com/blog/java-garbage-collection-tuning/#toc-what-is-garbage-collection-tuning-0)
[Oracle Docs](https://docs.oracle.com/en/java/javase/12/gctuning/introduction-garbage-collection-tuning.html)

set fixed size heap to avoid heap resizing; load memory pages into memory at the start of the application
e.g. -Xms2g -Xmx2g -XX:+AlwaysPreTouch

### 4.4.1. G!GC
[G1GC tuning tips](https://blog.gceasy.io/2020/06/02/simple-effective-g1-gc-tuning-tips/)

- Avoid limiting the young generation size to particular values by using options like -Xmn, -XX:NewRatio and others because the young generation size is the main means for G1 to allow it to meet the pause-time. 
- Only set -XX:MaxGCPauseMillis
- For managing humongous object **Concurrent Mark Sweep** might be a better options

### 4.4.2. Enable GC logger

For java 9 and newer:
```bat
java -Xlog:gc*:file=/var/log/myapp/gc.log -jar my_awesome_app.jar
JAVA_OPTS=-Xms512m -Xmx4096m -XX:+UseG1GC"
```
### 4.4.3. Reading GC Logs

Pay attention to places where GC takes more than 1 sec. 

### 4.4.4. Comparison of different GC techniques

| Parallel Scavenge + Parallel Old | ParNew + CMS | G1 | ZGC | Shenandoah GC |
|---|---|---|---|---|
| JDK 1.7 to JDK 9; use PS for young gen, and PO for old gen; more focus on throughput, pause time not so good| Concurrent mark Sweep, lower paus time, but there will be large amount of fragmentations, may trigger full gc since big object cannot find continous heap space when it was promoted to old gen | latency first, parallel collector like CMS, can hit GC paustime more precisely, compaction will not lead to long pauses due to full GC, some fragmentation issues, but not as serious as CMS | Very low response time while keeping throughput high, pause time will not increase with heap size | competitor of ZGC, good with huge object, manages framgementations really well, but made no promise on throughput and latency|





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
## 5.8. CompletableFuture for Asynchronous Event handling

We need our code to be non-blocking for most of the time. 
If we need to make use of the result obtained from a execution pool
we can do 
```java
  var futures = executor.invokeAll(tasks);
  for (var f : futures) {
    var result = f.get();
    // perform callback
  }

```
However this code is blocking, because f.get() will block the current thread, and the for loop also is not efficient. We have to wait for all tasks to finish.
CompletableFuture resolve this by allowing the next callback to be triggered, whenever the first is done. 

```java
var cf = CompletableFuture.supplyAsync(this::getSthSlow, executor);
cf.thenAccept(results::add); // also a great way to handle callback
```

[Another Example](https://leetcode.com/problems/web-crawler-multithreaded/solutions/2973071/very-fast-java-completablefuture-solution-5ms/)

# 6. Java New Features since Java 11

**Record Class**
a simplified pojo
[Record class](https://docs.oracle.com/en/java/javase/15/language/records.html)

**Enhanced Switch Pattern**
```java
static record Human (String name, int age, String profession) {}

public String checkObject(Object obj) {
    return switch (obj) {
        case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
        case Circle c -> "This is a circle";
        case Shape s -> "It is just a shape";
        case null -> "It is null";
        default -> "It is an object";
    };
}

public String checkShape(Shape shape) {
    return switch (shape) {
        case Triangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
        case Circle c && (c.getNumberOfSides() != 0) -> "This is a weird circle";
        default -> "Just a normal shape";
    };
}

```

**Java Sealed Class and Interface**
[sealed class/ interface](https://www.baeldung.com/java-sealed-classes-interfaces)
Define super class or interface extendable only to a few subclass
This feature is about enabling more fine-grained inheritance control in Java. Sealing allows classes and interfaces to define their permitted subtypes.

**Java Virtual Threads**
TBD 
[documents](https://www.happycoders.eu/java/virtual-threads/)


# 7. Design Patterns

Best practices evolved over a period of time by experienced software developer

## 7.1. Common Design Patterns

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

## 7.2. Inversion of Control

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

## 7.3. SOLID Principle:

- **Single Responsibility**: Do one thing and one thing only, if too much responsiblity need to refactor. 
- **Open/Closed** : Open for Extension, Closed for Modifications
- **Liskov Substitution** : subtype should be able to replace parenttype anywhere, e.g. Bird (fly) ----> Penguine, but penguine cannot fly, so violation of liskov, instead Bird interface need to be re-defined, (introduce of FlyingBird) 
- **Interface Segregation**: Do not put all methods together.
- **Dependency Inversion**: Classes should depend only on abstractions and not on their concrete implementations

## 7.4. Design Patterns in Spring:
- Factory, Bean Factory, Application Context
- Proxy Pattern, Spring AOP is one example
- Template Pattern (Strategy pattern): JDBCTemplate RestTemplate
- Observer Pattern: ApplicationEvent
- Adapter Pattern: Spring use adapter pattern to adapt to differnet controller

# 8. Spring Framework

## Spring Framework vs J2EE
- J2EE is a set of APIs for developing distributed, multi-tierd web-based applications. 
- Spring is a lightweight open-source framework for builiding enterprise level Java applications
- Spring simplifies the design process, and reduce boiler plate codes.
- Sppring offers several features that J@EE does not provide out-of-the box, such as writing unit test for your code, and support for annotation-based configuration, which can significantly reduce the amount of XML configuration required. 

## Design consideration of using DispatchServlet
- Provide scalable and modular architecture for bulding web applications, direct appropriate request to controllers,
- Ability to handle multiple type of request (including HTTP,SOAP)
- Support for pluggable view technologies, so we can get rid of jsps.

## 8.1. IoC and its implementations
Spring Core Container : BeanFactory + Application Context
how Spring core initialize: load configuration metadata --> BeanDefinitionReader --> Create BeanDefintions --> put in Registry

## 8.2. Bean Life Cycle
- instantiation:
- populate:
- Initialization: Aware(setBeanName, setBeanFactory, setBeanApplicationContext) --- PreInitBeanPostProcessor - -- AfterPropertiesSet()-- Init() --- PostInitBeanPostProcessor ---- destroy
- Destruction:

## 8.3. Bean Scope:
Prototyp - Singleton - Session - Request - Application - WebSocket

## 8.4. How to gurantee thread safety for a Bean?
- Singleton? Bean has to be stateless
- Prototype? Put Bean's state in a ThreadLocal wrapper. 

## 8.5. How does Spring solve Cycle Dependency between two Beans
 only works if both are setter injections, both are attribute injections, or one of them is setter inject (setter should gets instantiated first, then constructor, doesn't work other ways)
 doesn't work if both are constructor injections.
 This is because bean populate phase and instantiation phase are separate.

## 8.6. Autowire Need for Disambiguation
use @Qualifier annotation
use @Primary for default

## 8.7. Spring Transactions Management
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



# 9. Behaviour Interviews

## 9.1. Customer Obsession

Story:
How to make customer happy? Understanding -> Planning -> Executing -> Assessing
*Context*: 

# 10. OS Interview Questions

## 10.1. Process vs Threads
| Process | Threads |
| --------|----------|
| Processes are isolated | Threads share memeory |
| Process takes more time for context switching | Threads take less time for context switching |
| The process is less efficient in terms of communication . | Thread is more efficient in terms of communication.|
| The process takes more time to terminate. | The thread takes less time to terminate. |
| It takes more time for creation. | It takes less time for creation. |


# 11. Network Interview Questions

## 11.1. TCP/IP Model of Network

**Application Layer**: HTTP, DNS, FTP, NFS< Telnet, SNMP, SRC, 
**Transport Layer**: TCP / UDP
**Internet Layer**: IP, ICMP, ARP
**DataLink**: Error prevention and Point to Point Protocol framing
**Physical Layer**: Bit transmission

## 11.2. What happens when you enter URL int a web browser

- broweser check cache for DNS records
  - browsers' own cache
  - OS cache
  - Router Cache
  - ISP cache
- If not in Cache, ISP's DNS Server initiates a DNS query to find the IP Address of the url
- Browser init a TCP connection with the server, (3-way Handshakes, Sync, Sync-Ack, Ack)
- Browser sends an HTTP request to the webserver
- Server sends out an HTTP response
- Browser displays HTML content

## 11.3. Idempotency 

Property of some operations such that no matter how many times you execute them, you achieve the same result

## 11.4. GET vs POST
- Get put request info in url, Post put in request body; Therefore Get can only carry limited amount of request, whereas POST can carry much more; with request in url, the data is exposed, wheres for POST it is more secure. 
- Get is more idempotent and secure from DATABASE perspective, it is not used to change data in database,
- Get request can be cached by browser, because it is idempotent, thereby reducing burden on the web server. 

## 11.5. PUT vs PATCH vs POST

|S.No. |	PUT |	PATCH|
|------|------|------|
|1 	|PUT is a technique of altering resources when the client transmits data that revamps the whole resource. 	|PATCH is a technique for transforming the resources when the client transmits partial data that will be updated without changing the whole data.|
|2 	|The PUT HTTP method is known to be unchanged. That means, if you retry a request numerous times, that will be equal to a single request conversion. 	|The PATCH HTTP method is believed to be non-idempotent. That means, if you retry the request multiple times, you will end up having multiple resources with different URIs.|
|3 	|The PUT method has high bandwidth. |	Whereas, the PATCH method has comparatively low bandwidth.|

Put is idempotent, 
Patch and Post are not 

## 11.6. HTTP vs HTTPS
HTTPS implements TLS (application layer security protocol) in between HTTP / TCP
- HTTP connection relies on TCP (3-way handshakes) , HTTPS requries 3-way handshakes plus TLS handsahkes
- HTTP is clear text transmission, HTTPS is encrypted
- HTTP port is 80, HTTPS is 443
- HTTPS requires Certificate from CA, to ensure Server is reliable

## 11.7. How Does HTTPS work
- Client init request, connect to 443
- Server side has Digital Certificate (Public key, Issuer Org, Expiry Date)
- Server send D.C to Client
- Client receives D.C, verifies its legitimacy. If it is legit, it will generate Symetric key, encrypted by D.C's public key
- Client sends Symmetric Key (encrypted) to Server
- Server decrypt the Symmetric Key with its private key, to gain the real Symmetric key. And then use the real Symmetric Key to encrypt all future transmission. 
- Client recevies transmission, and use Symmetric key to decrypt the transmission to get data. 

## 11.8. TCP vs UDP

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

## 11.9. TCP 4-way HandShake to terminate connection
|Client|Server|
|----|-----|
|FIN |     |
|     | ACK|
|      |FIN + ACK|
|ACK|       |

## 11.10. XSS Reflected vs Persistent vs DOM

- A Persistent XSS attack is possible when a website or web application stores user input and later serves it to other users. 
- Reflected XSS attacks, also known as non-persistent attacks, occur when a malicious script is reflected off of a web application to the victim’s browser. **it is not stored on the web site**. Website use the user input to create part of html without even verify it. 
- DOM-based XSS vulnerabilities usually arise when JavaScript takes data from an attacker-controllable source, such as the URL, and passes it to a sink that supports dynamic code execution, such as eval() or innerHTML. This enables attackers to execute malicious JavaScript, which typically allows them to hijack other users' accounts. 

[XSS Persistent](https://www.acunetix.com/blog/articles/persistent-xss/)



# 12. Database Questions

## 12.1. ACID Compliance
- Atomicity − A transaction should be treated as a single unit of operation, which means either the entire sequence of operations is successful or unsuccessful.
- Consistency − This represents the consistency of the referential integrity of the database, unique primary keys in tables, etc. Not NUl, minimum 10 etc
- Isolation − There may be many transaction processing with the same data set at the same time. Each transaction should be isolated- from others to prevent data corruption.
- Durability − Once a transaction has completed, the results of this transaction have to be made permanent and cannot be erased from the database due to system failure.

## 12.2. CAP Therom
- Consistency : all users should see the same data at the same time
- Availability: minimal downtime, every request received by a node should have a response
- Partition tolerance: if part of the system breaks down it still functions. 

## 12.3. SQL index, what are they, when do you use them?

## 12.4. WHy not indexing all columns?
- Too much memory
- Too many index can hurt performance, especially when query a subset of the columns that are used for indexing.
- [Clustered v.s. NonClustered, Use Cases Etc](https://medium.com/fintechexplained/clustered-vs-non-clustered-index-8efed55ed7b9)

## 12.5. Clustered vs Non-Clustered index
P.K ---> Clustered Index
Unique ---> Non-Clustered Index

|Clustered|NonClustered|
|--- | ----|
|in-place|Collect and copied to another|
|Faster| Slower|
|Less memory to execute| More memory to execut|
|One per table | many per table|
|Natual ability to store data on the disl | not having the natural strength to store data on the disk|

[Clustered v.s. NonClustered, Use Cases Etc](https://medium.com/fintechexplained/clustered-vs-non-clustered-index-8efed55ed7b9)

## 12.6. Explain keyword MySQL
you can use explain keyword to help you optimize your search

## 12.7. MYSQL 回表
search use secondary index, but request for stuff it doesn't have, therefore need to traverse the table again for stuff. 

## 12.8. MYSQL how to enable Master Slave Replication
- New Data written into  Master, master will update binlog
- Master create a dump thread, and push binlog to slave
- Slave when connected to master, will create an IO thread to take ino the binlog, and write to relaylog.
- Slave will open another sql thread to read the relay log and execute in slave. thus synchronize
- slave updates its own bin log. 

## 12.9. MySQL dynamically scalling.

# 13. System Design Interview

[系统设计面试题整理](https://juejin.cn/post/6995797668190486535)
[System Design Primer](https://github.com/donnemartin/system-design-primer/blob/master/README-zh-Hans.md#%E5%BC%B1%E4%B8%80%E8%87%B4%E6%80%A7)

## 13.1. what kind of questions should I ask???
[how to solve system design](https://www-zhihu-com.translate.goog/question/26312148?_x_tr_sl=zh-CN&_x_tr_tl=en&_x_tr_hl=en&_x_tr_pto=sc)

- 这个系统的核心功能是什么？
- 有多少用户使用我们的产品？
- 公司的业务发展速度怎么样，3 个月、半年、一年后，规模会变成多大？
- 公司的技术栈是什么？有什么现存的服务可以简化我们的设计。
- Who is going to use it?
- How are they going to use it?
- How many users are there?
- What does the system do?
- What are the inputs and outputs of the system?
- How much data do we expect to handle?
- How many requests per second do we expect?
- What is the expected read to write ratio?


## 13.2. Back Of Envelop Calculation

Objectives
- number of concurrent TCP connections a a server can support
- The number of requests per second a web database or cache server can handle.
- The storage requirements of a service. 

**Componenents**: 
- **WebServer**(High number of processors, low ram and low hardDisk, for Handling API Calls)
  - Usually serve static content 
  - e.g. Facebook 32G Ram + 500GB Storage + 16-Core

- **Application Server** (Medium Processor, high ram, medium Disk), requires extensive computational and storage resources
  - usually serves dynamic content
  - e.g. Facebook 256G ram + 6.5TB storage + quad core

- **Storage Server** (low ram + medium processor + High disk)
  - SQL or NoSQL
  - e.g. Facebook 32G ram + 120TB harddisk

**Typical Example**

**Given** 500M active user, 20 Requester per Day
A server that can handle 8000 RPS

**Calculate** number of servers needed? Storage Requirements? Bnadwidth

**Answer 1** 
500M * 20 / 86400 = 115K RPS (System)
Number of server = 115K / 8000 = **-15 Servers-** Not right
Peak load: 500M RPS (all customer sending at once)
Number of servers : 500 M / 8000  = **62.5 K servers**

**Answer 2**
500M * 2 * 200 B = 200GB normal msg tweets
50M * 2 * 200 KB = 20TB
50M * 3MB = 150TB

170TB/day * 10 * 365 = 1700 * 365 TB = 1600 * 400 = 640 K * TB = **640 PB**

**Answer 3**

- Estimate the daily amount of incoming data to the service.
- Estimate the daily amount of outgoing data from the service.
- Estimate the bandwidth in Gbps (gigabits per second) by dividing the incoming and outgoing data by the number of seconds in a day.

For write bandwidth : 170TB / 86400 * 8 = 16Gb/s

For read bandwidth: Assume a user views 50 tweets/a day
Normal Tweets: 50 * 500M / (86400) * 200 B = 25 * M / 86.4 * 200  = 5000 / 86.4 MB * 8 = 480Mb/s
Image Tweets : 5 * 500M / (86400) * 200KB = 500  * M / 86.4 * 8 = 45 Gb/s
Video: 5 * 25M / (86400) * 3MB = 375TB * 8 / 86400  = 3000TB / 86400 = 3 TB / 8.64 = 0.35 TB = 350Gb/s

400Gb/s read, 16Gb/s write

## 13.3. Basic Building Blocks

### 13.3.1. Domain Name system
### 13.3.2. Load Balancers
Health Cehcking(heart beat protocol)
TLS terminations
### 13.3.3. Database

#### 13.3.3.1. SQL vs NoSQL
| SQL | NoSQL|
|-----|------|
| Impedence Mismatch | Simple Design |
| hard to scale | Horizontal Scaling |
| ACID Compliance | Highly available |

Type of NoSQL (key value pair DynamoDB / Redis, Columnar / BigTable, HBase, Cassandra, Graph Neo4j, Document / MangoDB, CouchDB)
#### 13.3.3.2. Data Replication
Single leader / Multileader / peer to peer 
Single Lead is most effective for high read.

#### 13.3.3.3. Data Distributions
pros and cons

### 13.3.4. Key-Value Store


### 13.3.5. Distributed Search
crawling - indexing - searching




# 14. Effective Software Engineering

Sometimes people will ask this. 

## 14.1. Six pillars of Effective Software
- Meet users’ expectations
- No defects
- Scale out horizontally
- No dedicated production support team
- Accelerate development pace
- Double ROI per developer, team, and software

## 14.2. From Customer Insights to Internal Requirements
talk to customers asap.
Do white-board modelling, visualize entities and their relationships, 
UML diagram or sequence diagram (Confluence)

Write Requirements and Stories in Ubiquitious language. Gherkin

Backlog refinement / sprint planning to refine work. 


## 14.3. Implementation and Coding

- continuous Improving / refactoring
- Quality over quantity
- Use OOP Design patterns, SOLID Principles
- **Law of Demeter**, handle the exception thrown by your method
- Practice test driven developmnet
  - maximize coverage for business logic
  - Make sure to write unit tests for both back-end and front-end code
  - TDD, BDD

## 14.4. Testing and Quality Assurance
- Test everything and automate everything
- Test Design Per Case, Don't overload a test
- Apply Test automatiion design patterns, Gherkin test pattern
- Test Data Management, centralized / decentralized

## 14.5. Clean Code in Java
- Code should be Focused
- Code should be Simple
- Code should be Testable

- Naming Conventions (camelCase)
- Class structure, exactly one top level clases
- Indentations and white space
- Restrict Method Paramters (bundle some of the parameters together into type)
- Avoid Hardcoding, use values define in .properties or .config files...in environment
- Code comments, used to explain a decision.
- Logging, log meaningful error messages
- Follow SOLID principles
- DRY, Don't repeat yourself, KISS, Keep it Simple Stupid
- TDD, write test first before any code.
- use linting tools, SonarQube SonarLint

## 14.6. Best Practices

### 14.6.1. why is String final in Java
内存(memory)
同步(synchronization)
数据结构(data structure)

1. Memory, we use String pool, multiple clients to access same String, this saves memory
2. hashcode of String will not change, doesn't have to recompute everytime, so it helps with operations involving hash such as Set.contains, Map.contains etc
3. It is widely used in class loading, so if it is mutable we might load something dangerous, and destroy our security
4. Immutable objects are threadsafe  by nature

### 14.6.2. JDBC best practices

- Connection Pool is expensive, use HiKariCP. (default ConPool for Sprintboot 2)
- Try to exectute batch request, 
```java
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      ManageEmployee ME = new ManageEmployee();

      /* Add employee records in batches */
      ME.addEmployees( );
   }
   
   /* Method to create employee records in batches */
   public void addEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         for ( int i=0; i<100000; i++ ) {
            String fname = "First Name " + i;
            String lname = "Last Name " + i;
            Integer salary = i;
            Employee employee = new Employee(fname, lname, salary);
            session.save(employee);
         	if( i % 50 == 0 ) {
               session.flush();
               session.clear();
            }
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return ;
```

```xml
<property name = "hibernate.jdbc.batch_size">50</property>
```
- Replication and Sharding


# 15. How to use OPENAI API in SpringBoot Project

```xml
<dependency>
    <groupId>com.openai</groupId>
    <artifactId>openai-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

Create a OpenAIService class that will interact with the OpenAI API. 
This class should use the OpenAI class from the OpenAI Java client library to make API requests.
```java
import com.openai.OpenAI;
import com.openai.exception.AuthenticationException;
import com.openai.exception.OpenAIException;
import com.openai.model.CompletionRequest;
import com.openai.model.CompletionResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAIService {
    // in application.properties, put
    // openai.apiKey=MY_API_KEY

    @Value("${openai.apiKey}")
    private String apiKey;

    private OpenAI openAI;

    public OpenAIService() {
        this.openAI = new OpenAI(apiKey);
    }

    public String generateText(String prompt, String model, int maxTokens, double temperature) throws AuthenticationException, OpenAIException {
        CompletionRequest request = new CompletionRequest.Builder()
                .prompt(prompt)
                .model(model)
                .maxTokens(maxTokens)
                .temperature(temperature)
                .build();

        CompletionResponse response = openAI.complete(request);
        return response.getChoices().get(0).getText();
    }
}

```

In your controller class, inject the OpenAIService and call the generateText() method to generate text using the OpenAI API.
```java
import com.openai.exception.AuthenticationException;
import com.openai.exception.OpenAIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextGenerationController {

    @Autowired
    private OpenAIService openAIService;

    @GetMapping("/generateText")
    public String generateText(@RequestParam String prompt,
                               @RequestParam String model,
                               @RequestParam int maxTokens,
                               @RequestParam double temperature) throws AuthenticationException, OpenAIException {
        return openAIService.generateText(prompt, model, maxTokens, temperature);
    }
}

```

```java
// an exmaple of usage

@RestController
public class EssayImprovementController {
    
    @PostMapping("/improve-essay")
    public String improveEssay(@RequestBody String essay) throws Exception {
        String prompt = "Please provide suggestions to improve the following essay:\n\n" + essay + "\n\nSuggested improvements:";
        
        CompletionRequest request = new CompletionRequest.Builder()
            .setEngine("text-davinci-002")
            .setPrompt(prompt)
            .setMaxTokens(100)
            .setN(1)
            .setTemperature(0.5)
            .build();
            
        CompletionResponse response = Completion.create(request);
        
        return response.getChoices().get(0).getText().trim();
    }
}

```

# 16. Another way to improve Grammar via GrammarBot API (Not Feasible)

**From ChatGPT**

```xml
<dependency>
    <groupId>com.github.kevinstl</groupId>
    <artifactId>grammar-bot-client</artifactId>
    <version>1.0.0</version>
</dependency>

```

This controller has a single endpoint, /check-grammar, which accepts a POST request with a JSON payload containing a single field, "text". The controller passes the text to GrammarBot API using the GrammarBotAPI instance created in the constructor, and returns a list of Correction objects in the response.

```java
import com.github.kevinstl.grammarbotapi.GrammarBotAPI;
import com.github.kevinstl.grammarbotapi.GrammarBotAPIImpl;
import com.github.kevinstl.grammarbotapi.models.Correction;
import com.github.kevinstl.grammarbotapi.models.GrammarBotResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GrammarBotController {

    private final GrammarBotAPI grammarBotAPI;

    public GrammarBotController() {
        grammarBotAPI = new GrammarBotAPIImpl();
    }

    @PostMapping("/check-grammar")
    public ResponseEntity<List<Correction>> checkGrammar(@RequestBody String text) {
        GrammarBotResponse response = grammarBotAPI.check(text);
        List<Correction> corrections = response.getCorrections();
        return ResponseEntity.ok(corrections);
    }
}

```

Run your Spring Boot application and make a request to the /check-grammar endpoint with some text to test the integration with GrammarBot API. Here's an example using the curl command:

```bash
curl -X POST \
  http://localhost:8080/check-grammar \
  -H 'Content-Type: application/json' \
  -d '{
    "text": "I is very happy."
}'


```

# 17. Use old laptop as a proxy server 

Yes, you can use your old Windows laptop in Singapore as a proxy or VPN server to bypass internet censorship in China and access Gmail. Here's how you can do it:

    Choose a proxy or VPN server software: There are several free and paid proxy or VPN server software available online that you can use to set up your server. Some popular options include OpenVPN, SoftEther VPN, and Squid Proxy.

    Install and configure the proxy or VPN server software on your Windows laptop: Once you've chosen your software, you'll need to download and install it on your old Windows laptop. Follow the instructions provided by the software to configure the server settings, such as the IP address, port number, and authentication settings.

    Open the necessary ports on your router and firewall: To enable access to your proxy or VPN server from outside your local network, you'll need to configure your router and firewall to allow incoming connections on the necessary ports. You'll need to open the port that you have chosen to use for your proxy or VPN server, as specified in your software settings.

    Connect to your proxy or VPN server from China: Once you've set up your server and opened the necessary ports, you can connect to your proxy or VPN server from China using your laptop's public IP address and the port number you've configured. You can then use your proxy or VPN connection to access Gmail or other blocked websites.

It's important to note that using a proxy or VPN server to bypass internet censorship in China may not always work, as the Great Firewall is constantly evolving and developing new techniques to block internet traffic. Additionally, using a proxy or VPN server may be illegal or against the terms of service of your internet service provider in some countries. Be sure to check local laws and regulations before using a proxy or VPN server to bypass internet censorship.